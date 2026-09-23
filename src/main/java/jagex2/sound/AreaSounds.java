package jagex2.sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

import jagex2.config.LocType;
import jagex2.dash3d.Square;
import jagex2.dash3d.World3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

/**
 * Area sounds (474): the sounds locs make around you - a fountain's splash, a range's crackle, a
 * portal's hum - and the ones some make now and then, like a magic tree's chime.
 *
 * 474 kept them in the loc config (opcodes 78 and 79). This client reads them from locsound.dat in
 * the config archive instead, which the server packs from the same loc configs (bgsound= and
 * randomsound=). A client that predates this never opens that file, and a server that predates it
 * never sends one, so either can update first.
 *
 * Every half second the scene is walked for locs that have sounds (multilocs resolved, so a lit
 * fire can sound when an unlit one does not). Each cycle, a loc on the player's level within its
 * range plays, louder the closer you are - 474's falloff, over the loc's whole footprint - and one
 * that goes out of range stops. The loops and one-shots are mixed on a line of their own, so they
 * never wait on, or cut off, the ordinary sound effects, which still play one at a time.
 */
public class AreaSounds {

	private static final int RATE = 22050;

	// per loc id, from locsound.dat
	private static int[] bgSound;
	private static int[] bgRange;
	private static int[][] randomSounds;
	private static int[] randomMin;
	private static int[] randomMax;
	private static int[] randomRange;
	// loc ids that can make a sound, themselves or as a multiloc's child - the scan decodes only these
	private static boolean[] candidate;

	private static final Map<Integer, Pcm> pcm = new HashMap<>();

	private static class Pcm {
		byte[] data;
		int loopStart;
		int loopEnd;
	}

	/** one loc making sound in the scene */
	private static class Emitter {
		int loc;
		int level;
		int minX, minZ, maxX, maxZ; // fine units
		Voice loop;
		Voice once;
		int wait;
		boolean seen;
		int dist;
		int vol;
	}

	private static class Voice {
		final Pcm pcm;
		final boolean looping;
		int pos;
		volatile int volume; // 0..127
		volatile boolean done;

		Voice(Pcm pcm, boolean looping) {
			this.pcm = pcm;
			this.looping = looping;
		}
	}

	private final Map<Long, Emitter> emitters = new HashMap<>();
	private final Map<Integer, Emitter> loudest = new HashMap<>();
	// loops let go this cycle, so the loc that is now nearest can take one over without a restart
	private final Map<Integer, Voice> parked = new HashMap<>();
	private final ArrayList<Voice> voices = new ArrayList<>();
	private final Random random = new Random();
	private int scanWait;
	private Thread mixer;
	private volatile boolean running;

	public static void unpack(Jagfile config) {
		byte[] data = config.read("locsound.dat", null);
		if (data == null) {
			return;
		}
		Packet buf = new Packet(data);
		int count = buf.g2();
		int max = 0;
		int start = buf.pos;
		// the ids are not in any order a size could be read from, so size the tables in a first pass
		for (int i = 0; i < count; i++) {
			max = Math.max(max, buf.g2());
			buf.pos += 3;
			int n = buf.g1();
			if (n > 0) {
				buf.pos += 5 + n * 2;
			}
		}
		bgSound = new int[max + 1];
		bgRange = new int[max + 1];
		randomSounds = new int[max + 1][];
		randomMin = new int[max + 1];
		randomMax = new int[max + 1];
		randomRange = new int[max + 1];
		java.util.Arrays.fill(bgSound, -1);
		buf.pos = start;
		for (int i = 0; i < count; i++) {
			int id = buf.g2();
			int bg = buf.g2();
			bgSound[id] = bg == 65535 ? -1 : bg;
			bgRange[id] = buf.g1();
			int n = buf.g1();
			if (n > 0) {
				randomMin[id] = buf.g2();
				randomMax[id] = buf.g2();
				randomRange[id] = buf.g1();
				randomSounds[id] = new int[n];
				for (int k = 0; k < n; k++) {
					randomSounds[id][k] = buf.g2();
				}
			}
		}
		candidate = new boolean[LocType.field1662];
		for (int id = 0; id < LocType.field1662; id++) {
			if (hasSound(id)) {
				candidate[id] = true;
				continue;
			}
			LocType type = LocType.method561(id);
			if (type.field1659 != null) {
				for (int child : type.field1659) {
					if (hasSound(child)) {
						candidate[id] = true;
						break;
					}
				}
			}
		}
	}

	private static boolean hasSound(int loc) {
		return bgSound != null && loc >= 0 && loc < bgSound.length && (bgSound[loc] != -1 || randomSounds[loc] != null);
	}

	/**
	 * Once a client cycle, on the game thread. volume is 0 (off) to 127; x and z are the player's
	 * fine coordinates in the scene.
	 */
	public void update(World3D scene, int level, int x, int z, int volume, boolean active) {
		if (bgSound == null) {
			return;
		}
		if (!active || scene == null || volume <= 0) {
			this.stopAll();
			return;
		}
		if (--this.scanWait <= 0) {
			this.scanWait = 25;
			this.scan(scene);
		}
		// a loop plays once however many locs make it - a room of fermenting vats is one vat's sound,
		// from the nearest - so first find the loudest loc for each synth
		this.loudest.clear();
		for (Emitter e : this.emitters.values()) {
			e.vol = -1;
			int dx = x > e.maxX ? x - e.maxX : (x < e.minX ? e.minX - x : 0);
			int dz = z > e.maxZ ? z - e.maxZ : (z < e.minZ ? e.minZ - z : 0);
			e.dist = Math.max(0, dx + dz - 64);
			int bg = bgSound[e.loc];
			int range = bgRange[e.loc] * 128;
			if (bg != -1 && e.level == level && range > 0 && e.dist <= range) {
				e.vol = (range - e.dist) * volume / range;
				Emitter best = this.loudest.get(bg);
				if (best == null || e.vol > best.vol) {
					this.loudest.put(bg, e);
				}
			}
		}
		// the locs that are no longer the loudest let go of their loops first, so the one that is
		// can carry on the same loop rather than start it again
		for (Emitter e : this.emitters.values()) {
			if (e.loop != null && (e.vol < 0 || this.loudest.get(bgSound[e.loc]) != e)) {
				this.parkLoop(bgSound[e.loc], e.loop);
				e.loop = null;
			}
		}
		for (Emitter e : this.emitters.values()) {
			int dist = e.dist;

			// the loop
			int bg = bgSound[e.loc];
			if (e.vol >= 0 && this.loudest.get(bg) == e) {
				// another loc of the same sound may have been playing it: carry it over
				if (e.loop == null) {
					e.loop = this.takeLoop(bg);
				}
				if (e.loop == null) {
					Pcm p = this.pcm(bg);
					if (p != null) {
						e.loop = this.play(p, true, e.vol);
					}
				} else {
					e.loop.volume = e.vol;
				}
			}

			// now and then
			int[] ids = randomSounds[e.loc];
			int range = randomRange[e.loc] * 128;
			if (ids != null && e.level == level && range > 0 && dist <= range) {
				int vol = (range - dist) * volume / range;
				if (e.once != null && e.once.done) {
					e.once = null;
				}
				if (e.once == null) {
					if (--e.wait <= 0) {
						Pcm p = this.pcm(ids[this.random.nextInt(ids.length)]);
						if (p != null) {
							e.once = this.play(p, false, vol);
						}
						int lo = randomMin[e.loc];
						int hi = randomMax[e.loc];
						e.wait = lo + (hi > lo ? this.random.nextInt(hi - lo) : 0);
					}
				} else {
					e.once.volume = vol;
				}
			} else if (e.once != null) {
				e.once.done = true;
				e.once = null;
			}
		}
		for (Voice v : this.parked.values()) {
			v.done = true;
		}
		this.parked.clear();
	}

	private void parkLoop(int synth, Voice v) {
		Voice old = this.parked.put(synth, v);
		if (old != null && old != v) {
			old.done = true;
		}
	}

	private Voice takeLoop(int synth) {
		return this.parked.remove(synth);
	}

	public void stopAll() {
		for (Emitter e : this.emitters.values()) {
			if (e.loop != null) {
				e.loop.done = true;
			}
			if (e.once != null) {
				e.once.done = true;
			}
		}
		this.emitters.clear();
		this.scanWait = 0;
	}

	// every loc in the scene that has a sound, keyed by where it is so a rescan keeps what is playing
	private void scan(World3D scene) {
		for (Emitter e : this.emitters.values()) {
			e.seen = false;
		}
		Square[][][] squares = scene.field1018;
		for (int level = 0; level < squares.length; level++) {
			for (int x = 0; x < squares[level].length; x++) {
				for (int z = 0; z < squares[level][x].length; z++) {
					Square sq = squares[level][x][z];
					if (sq == null) {
						continue;
					}
					if (sq.field1386 != null) {
						this.found(level, sq.field1386.field1539);
					}
					if (sq.field1387 != null) {
						this.found(level, sq.field1387.field1412);
					}
					if (sq.field1388 != null) {
						this.found(level, sq.field1388.field1314);
					}
					for (int i = 0; i < sq.field1390; i++) {
						if (sq.field1391[i] != null) {
							this.found(level, sq.field1391[i].field88);
						}
					}
				}
			}
		}
		for (Iterator<Emitter> it = this.emitters.values().iterator(); it.hasNext();) {
			Emitter e = it.next();
			if (!e.seen) {
				if (e.loop != null) {
					e.loop.done = true;
				}
				if (e.once != null) {
					e.once.done = true;
				}
				it.remove();
			}
		}
	}

	private void found(int level, int typecode) {
		if (typecode == 0) {
			return;
		}
		int id = typecode >> 14 & 0x7FFF;
		if (id >= candidate.length || !candidate[id]) {
			return;
		}
		LocType type = LocType.method561(id);
		if (type.field1659 != null) {
			LocType resolved = type.method562();
			id = resolved == null ? -1 : resolved.field1627;
			type = resolved;
		}
		long key = ((long) level << 32) | (typecode & 0xFFFFFFFFL);
		Emitter e = this.emitters.get(key);
		if (!hasSound(id)) {
			if (e != null && e.loc != id) {
				// a multiloc that has gone quiet: the rescan's cleanup stops it
				e.seen = false;
			}
			return;
		}
		if (e != null && e.loc != id) {
			if (e.loop != null) {
				e.loop.done = true;
			}
			if (e.once != null) {
				e.once.done = true;
			}
			this.emitters.remove(key);
			e = null;
		}
		if (e == null) {
			e = new Emitter();
			e.loc = id;
			e.level = level;
			int x = typecode & 0x7F;
			int z = typecode >> 7 & 0x7F;
			e.minX = x * 128;
			e.minZ = z * 128;
			e.maxX = (x + Math.max(1, type.field1655)) * 128;
			e.maxZ = (z + Math.max(1, type.field1629)) * 128;
			e.wait = randomMin[id];
			this.emitters.put(key, e);
		}
		e.seen = true;
	}

	// a synth rendered to 8-bit 22050 Hz samples, once
	private Pcm pcm(int id) {
		if (this.pcm.containsKey(id)) {
			return pcm.get(id);
		}
		Pcm p = null;
		try {
			Wave wave = id >= 0 && id < Wave.field1471.length ? Wave.field1471[id] : null;
			Packet wav = wave == null ? null : Wave.method479(1, (byte) 6, id);
			if (wav != null && wav.pos > 44) {
				p = new Pcm();
				p.data = java.util.Arrays.copyOfRange(wav.data, 44, wav.pos);
				p.loopStart = wave.field1476 * RATE / 1000;
				p.loopEnd = wave.field1477 * RATE / 1000;
				if (p.loopStart < 0 || p.loopEnd > p.data.length || p.loopStart >= p.loopEnd) {
					p.loopStart = 0;
					p.loopEnd = p.data.length;
				}
			}
		} catch (Exception ignored) {
			p = null;
		}
		this.pcm.put(id, p);
		return p;
	}

	private Voice play(Pcm p, boolean looping, int volume) {
		Voice v = new Voice(p, looping);
		v.volume = volume;
		synchronized (this.voices) {
			this.voices.add(v);
			if (!this.running) {
				this.running = true;
				this.mixer = new Thread(this::mix, "area-sounds");
				this.mixer.setDaemon(true);
				this.mixer.start();
			}
		}
		return v;
	}

	// the mixer thread: sums the voices into 16-bit samples, a fortieth of a second at a time
	private void mix() {
		SourceDataLine line;
		try {
			AudioFormat format = new AudioFormat(RATE, 16, 1, true, false);
			line = AudioSystem.getSourceDataLine(format);
			line.open(format, RATE / 5 * 2);
			line.start();
		} catch (Exception e) {
			synchronized (this.voices) {
				this.voices.clear();
				this.running = false;
			}
			return;
		}
		int n = RATE / 40;
		int[] acc = new int[n];
		byte[] out = new byte[n * 2];
		ArrayList<Voice> now = new ArrayList<>();
		int idle = 0;
		while (true) {
			synchronized (this.voices) {
				this.voices.removeIf(v -> v.done);
				// two seconds with nothing to play: let the line go until something plays again
				idle = this.voices.isEmpty() ? idle + 1 : 0;
				if (idle > 80) {
					this.running = false;
					break;
				}
				now.clear();
				now.addAll(this.voices);
			}
			java.util.Arrays.fill(acc, 0);
			for (Voice v : now) {
				byte[] d = v.pcm.data;
				int vol = v.volume;
				for (int i = 0; i < n; i++) {
					if (v.pos >= (v.looping ? v.pcm.loopEnd : d.length)) {
						if (v.looping) {
							v.pos = v.pcm.loopStart;
						} else {
							v.done = true;
							break;
						}
					}
					acc[i] += ((d[v.pos++] & 0xFF) - 128) * vol;
				}
			}
			for (int i = 0; i < n; i++) {
				int s = acc[i];
				if (s > 32767) {
					s = 32767;
				} else if (s < -32768) {
					s = -32768;
				}
				out[i * 2] = (byte) s;
				out[i * 2 + 1] = (byte) (s >> 8);
			}
			line.write(out, 0, out.length);
		}
		line.drain();
		line.stop();
		line.close();
	}
}
