package jagex2.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.LinkList2;
import sign.signlink;

@ObfuscatedName("ub")
public final class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ub.a")
	public boolean field804 = true;

	@ObfuscatedName("ub.b")
	public int field805;

	@ObfuscatedName("ub.c")
	public final byte field806 = 0;

	@ObfuscatedName("ub.d")
	public final int field807 = 477;

	@ObfuscatedName("ub.e")
	public final int[][] versions = new int[4][];

	@ObfuscatedName("ub.f")
	public final int[][] crcs = new int[4][];

	@ObfuscatedName("ub.g")
	public final byte[][] priorities = new byte[4][];

	@ObfuscatedName("ub.h")
	public int topPriority;

	@ObfuscatedName("ub.i")
	public byte[] modelUse;

	@ObfuscatedName("ub.j")
	public int[] mapIndex;

	@ObfuscatedName("ub.k")
	public int[] mapLand;

	@ObfuscatedName("ub.l")
	public int[] mapLoc;

	@ObfuscatedName("ub.m")
	public int[] mapFree;

	@ObfuscatedName("ub.n")
	public int[] animFrameIndex;

	@ObfuscatedName("ub.o")
	public int[] midiJingle;

	@ObfuscatedName("ub.p")
	public boolean running = true;

	@ObfuscatedName("ub.q")
	public Client app;

	@ObfuscatedName("ub.r")
	public final CRC32 crc32 = new CRC32();

	@ObfuscatedName("ub.s")
	public boolean active = false;

	@ObfuscatedName("ub.t")
	public int urgentCount;

	@ObfuscatedName("ub.u")
	public int requestCount;

	@ObfuscatedName("ub.v")
	public final LinkList2 requests = new LinkList2((byte) 8);

	@ObfuscatedName("ub.w")
	public final LinkList queue = new LinkList(-822);

	@ObfuscatedName("ub.x")
	public final LinkList missing = new LinkList(-822);

	@ObfuscatedName("ub.y")
	public final LinkList pending = new LinkList(-822);

	@ObfuscatedName("ub.z")
	public final LinkList completed = new LinkList(-822);

	@ObfuscatedName("ub.A")
	public final LinkList prefetches = new LinkList(-822);

	@ObfuscatedName("ub.B")
	public String message = "";

	@ObfuscatedName("ub.L")
	public final byte[] buf = new byte[500];

	@ObfuscatedName("ub.M")
	public final byte[] data = new byte[65000];

	@ObfuscatedName("ub.C")
	public int loadedPrefetchFiles;

	@ObfuscatedName("ub.D")
	public int totalPrefetchFiles;

	@ObfuscatedName("ub.H")
	public int failCount;

	@ObfuscatedName("ub.J")
	public int partOffset;

	@ObfuscatedName("ub.K")
	public int partAvailable;

	@ObfuscatedName("ub.N")
	public int packetCycle;

	@ObfuscatedName("ub.O")
	public int noTimeoutCycle;

	@ObfuscatedName("ub.Q")
	public int cycle;

	@ObfuscatedName("ub.P")
	public long socketOpenTime;

	@ObfuscatedName("ub.I")
	public OnDemandRequest current;

	@ObfuscatedName("ub.F")
	public InputStream in;

	@ObfuscatedName("ub.G")
	public OutputStream out;

	@ObfuscatedName("ub.E")
	public Socket socket;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public void method265(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.read(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5, (byte) 1);
			this.versions[var4] = new int[var6];
			this.priorities[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				this.versions[var4][var8] = var7.g2();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.read(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11, (byte) 1);
			this.crcs[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				this.crcs[var10][var14] = var13.g4();
			}
		}
		byte[] var15 = arg0.read("model_index", null);
		int var16 = this.versions[0].length;
		this.modelUse = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				this.modelUse[var17] = var15[var17];
			} else {
				this.modelUse[var17] = 0;
			}
		}
		byte[] var18 = arg0.read("map_index", null);
		Packet var19 = new Packet(var18, (byte) 1);
		int var20 = var18.length / 7;
		this.mapIndex = new int[var20];
		this.mapLand = new int[var20];
		this.mapLoc = new int[var20];
		this.mapFree = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.mapIndex[var21] = var19.g2();
			this.mapLand[var21] = var19.g2();
			this.mapLoc[var21] = var19.g2();
			this.mapFree[var21] = var19.g1();
		}
		byte[] var22 = arg0.read("anim_index", null);
		Packet var23 = new Packet(var22, (byte) 1);
		int var24 = var22.length / 2;
		this.animFrameIndex = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.animFrameIndex[var25] = var23.g2();
		}
		byte[] var26 = arg0.read("midi_index", null);
		Packet var27 = new Packet(var26, (byte) 1);
		int var28 = var26.length;
		this.midiJingle = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.midiJingle[var29] = var27.g1();
		}
		this.app = arg1;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public void stop() {
		this.running = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public int getFileCount(int arg0, int arg1) {
		if (arg0 != 0) {
			this.field804 = !this.field804;
		}
		return this.versions[arg1].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public int getAnimFrameCount() {
		return this.animFrameIndex.length;
	}

	@ObfuscatedName("ub.a(IIZI)I")
	public int getMapFile(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < this.mapIndex.length; var5++) {
			if (this.mapIndex[var5] == var4) {
				if (arg0 == 0) {
					return this.mapLand[var5];
				}
				return this.mapLoc[var5];
			}
		}
		return -1;
	}

	@ObfuscatedName("ub.a(ZI)V")
	public void prefetchMaps(boolean arg0) {
		int var2 = this.mapIndex.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || this.mapFree[var3] != 0) {
				this.prefetchPriority(this.mapLoc[var3], 3, (byte) 2);
				this.prefetchPriority(this.mapLand[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("ub.b(II)Z")
	public boolean hasMapLocFile(int arg0) {
		for (int var2 = 0; var2 < this.mapIndex.length; var2++) {
			if (this.mapLoc[var2] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ub.a(IB)I")
	public int getModelUse(int arg0) {
		return this.modelUse[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.a(IZ)Z")
	public boolean isMidiJingle(int arg0) {
		return this.midiJingle[arg0] == 1;
	}

	@ObfuscatedName("ub.a(I)V")
	@Override
	public void requestModel(int arg0) {
		this.request(0, arg0);
	}

	@ObfuscatedName("ub.c(II)V")
	public void request(int arg0, int arg1) {
		if (arg0 > this.versions.length || arg1 < 0 || arg1 > this.versions[arg0].length || this.versions[arg0][arg1] == 0) {
			return;
		}
		LinkList2 var3 = this.requests;
		synchronized (this.requests) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.requests.head(); var4 != null; var4 = (OnDemandRequest) this.requests.next(this.field806)) {
				if (var4.archive == arg0 && var4.file == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.archive = arg0;
			var5.file = arg1;
			var5.urgent = true;
			LinkList var6 = this.queue;
			synchronized (this.queue) {
				this.queue.push(var5);
			}
			this.requests.push(var5);
		}
	}

	@ObfuscatedName("ub.b()I")
	public int remaining() {
		LinkList2 var1 = this.requests;
		synchronized (this.requests) {
			return this.requests.size();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public OnDemandRequest loop() {
		LinkList var1 = this.completed;
		OnDemandRequest var2;
		synchronized (this.completed) {
			var2 = (OnDemandRequest) this.completed.popFront();
		}
		if (var2 == null) {
			return null;
		}
		LinkList2 var3 = this.requests;
		synchronized (this.requests) {
			var2.unlink2();
		}
		if (var2.data == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
			while (true) {
				if (var4 == this.data.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.data, var4, this.data.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.data = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.data[var7] = this.data[var7];
		}
		return var2;
	}

	@ObfuscatedName("ub.a(BIIB)V")
	public void prefetchPriority(int arg0, int arg1, byte arg2) {
		if (this.app.fileStreams[0] == null || this.versions[arg1][arg0] == 0) {
			return;
		}
		byte[] var4 = this.app.fileStreams[arg1 + 1].readFromFile(arg0);
		if (this.validate(this.crcs[arg1][arg0], this.versions[arg1][arg0], var4)) {
			return;
		}
		this.priorities[arg1][arg0] = arg2;
		if (arg2 > this.topPriority) {
			this.topPriority = arg2;
		}
		this.totalPrefetchFiles++;
	}

	@ObfuscatedName("ub.a(B)V")
	public void clearPrefetches() {
		LinkList var1 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.clear();
		}
	}

	@ObfuscatedName("ub.a(III)V")
	public void prefetch(int arg0, int arg1) {
		if (this.app.fileStreams[0] == null || (this.versions[arg0][arg1] == 0 || (this.priorities[arg0][arg1] == 0 || this.topPriority == 0))) {
			return;
		}
		OnDemandRequest var3 = new OnDemandRequest();
		var3.archive = arg0;
		var3.file = arg1;
		var3.urgent = false;
		LinkList var4 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.push(var3);
		}
	}

	@Override
	public void run() {
		try {
			while (this.running) {
				this.cycle++;
				byte var1 = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.active = true;
				for (int var2 = 0; var2 < 100 && this.active; var2++) {
					this.active = false;
					this.handleQueue();
					this.handlePending();
					if (this.urgentCount == 0 && var2 >= 5) {
						break;
					}
					this.handleExtra();
					if (this.in != null) {
						this.read();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next(this.field806)) {
					if (var4.urgent) {
						var3 = true;
						var4.cycle++;
						if (var4.cycle > 50) {
							var4.cycle = 0;
							this.send(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.pending.head(); var5 != null; var5 = (OnDemandRequest) this.pending.next(this.field806)) {
						var3 = true;
						var5.cycle++;
						if (var5.cycle > 50) {
							var5.cycle = 0;
							this.send(var5);
						}
					}
				}
				if (var3) {
					this.packetCycle++;
					if (this.packetCycle > 750) {
						try {
							this.socket.close();
						} catch (Exception var8) {
						}
						this.socket = null;
						this.in = null;
						this.out = null;
						this.partAvailable = 0;
					}
				} else {
					this.packetCycle = 0;
					this.message = "";
				}
				if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
					this.noTimeoutCycle++;
					if (this.noTimeoutCycle > 500) {
						this.noTimeoutCycle = 0;
						this.buf[0] = 0;
						this.buf[1] = 0;
						this.buf[2] = 0;
						this.buf[3] = 10;
						try {
							this.out.write(this.buf, 0, 4);
						} catch (IOException var7) {
							this.packetCycle = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.b(B)V")
	public void handleQueue() {
		LinkList var1 = this.queue;
		OnDemandRequest var2;
		synchronized (this.queue) {
			var2 = (OnDemandRequest) this.queue.popFront();
		}
		while (var2 != null) {
			this.active = true;
			byte[] var3 = null;
			if (this.app.fileStreams[0] != null) {
				var3 = this.app.fileStreams[var2.archive + 1].readFromFile(var2.file);
			}
			if (!this.validate(this.crcs[var2.archive][var2.file], this.versions[var2.archive][var2.file], var3)) {
				var3 = null;
			}
			LinkList var4 = this.queue;
			synchronized (this.queue) {
				if (var3 == null) {
					this.missing.push(var2);
				} else {
					var2.data = var3;
					LinkList var5 = this.completed;
					synchronized (this.completed) {
						this.completed.push(var2);
					}
				}
				var2 = (OnDemandRequest) this.queue.popFront();
			}
		}
	}

	@ObfuscatedName("ub.a(Z)V")
	public void handlePending() {
		this.urgentCount = 0;
		this.requestCount = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) this.pending.head(); var1 != null; var1 = (OnDemandRequest) this.pending.next(this.field806)) {
			if (var1.urgent) {
				this.urgentCount++;
			} else {
				this.requestCount++;
			}
		}
		while (this.urgentCount < 10) {
			OnDemandRequest var2 = (OnDemandRequest) this.missing.popFront();
			if (var2 == null) {
				break;
			}
			if (this.priorities[var2.archive][var2.file] != 0) {
				this.loadedPrefetchFiles++;
			}
			this.priorities[var2.archive][var2.file] = 0;
			this.pending.push(var2);
			this.urgentCount++;
			this.send(var2);
			this.active = true;
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public void handleExtra() {
		while (this.urgentCount == 0) {
			if (this.requestCount >= 10 || this.topPriority == 0) {
				return;
			}
			LinkList var1 = this.prefetches;
			OnDemandRequest var2;
			synchronized (this.prefetches) {
				var2 = (OnDemandRequest) this.prefetches.popFront();
			}
			while (var2 != null) {
				if (this.priorities[var2.archive][var2.file] != 0) {
					this.priorities[var2.archive][var2.file] = 0;
					this.pending.push(var2);
					this.send(var2);
					this.active = true;
					if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
						this.loadedPrefetchFiles++;
					}
					this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
					this.requestCount++;
					if (this.requestCount == 10) {
						return;
					}
				}
				LinkList var3 = this.prefetches;
				synchronized (this.prefetches) {
					var2 = (OnDemandRequest) this.prefetches.popFront();
				}
			}
			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = this.priorities[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == this.topPriority) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.archive = var4;
						var8.file = var7;
						var8.urgent = false;
						this.pending.push(var8);
						this.send(var8);
						this.active = true;
						if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
							this.loadedPrefetchFiles++;
						}
						this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
						this.requestCount++;
						if (this.requestCount == 10) {
							return;
						}
					}
				}
			}
			this.topPriority--;
		}
	}

	@ObfuscatedName("ub.d(I)V")
	public void read() {
		try {
			int var1 = this.in.available();
			if (this.partAvailable == 0 && var1 >= 6) {
				this.active = true;
				for (int var2 = 0; var2 < 6; var2 += this.in.read(this.buf, var2, 6 - var2)) {
				}
				int var3 = this.buf[0] & 0xFF;
				int var4 = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
				int var5 = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
				int var6 = this.buf[5] & 0xFF;
				this.current = null;
				for (OnDemandRequest var7 = (OnDemandRequest) this.pending.head(); var7 != null; var7 = (OnDemandRequest) this.pending.next(this.field806)) {
					if (var7.archive == var3 && var7.file == var4) {
						this.current = var7;
					}
					if (this.current != null) {
						var7.cycle = 0;
					}
				}
				if (this.current != null) {
					this.packetCycle = 0;
					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						this.current.data = null;
						if (this.current.urgent) {
							LinkList var8 = this.completed;
							synchronized (this.completed) {
								this.completed.push(this.current);
							}
						} else {
							this.current.unlink();
						}
						this.current = null;
					} else {
						if (this.current.data == null && var6 == 0) {
							this.current.data = new byte[var5];
						}
						if (this.current.data == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.partOffset = var6 * 500;
				this.partAvailable = 500;
				if (this.partAvailable > var5 - var6 * 500) {
					this.partAvailable = var5 - var6 * 500;
				}
			}
			if (this.partAvailable > 0 && var1 >= this.partAvailable) {
				this.active = true;
				byte[] var9 = this.buf;
				int var10 = 0;
				if (this.current != null) {
					var9 = this.current.data;
					var10 = this.partOffset;
				}
				for (int var11 = 0; var11 < this.partAvailable; var11 += this.in.read(var9, var11 + var10, this.partAvailable - var11)) {
				}
				if (this.partAvailable + this.partOffset >= var9.length && this.current != null) {
					if (this.app.fileStreams[0] != null) {
						this.app.fileStreams[this.current.archive + 1].writeToFile(var9.length, this.current.file, var9);
					}
					if (!this.current.urgent && this.current.archive == 3) {
						this.current.urgent = true;
						this.current.archive = 93;
					}
					if (this.current.urgent) {
						LinkList var12 = this.completed;
						synchronized (this.completed) {
							this.completed.push(this.current);
						}
					} else {
						this.current.unlink();
					}
				}
				this.partAvailable = 0;
			}
		} catch (IOException var17) {
			try {
				this.socket.close();
			} catch (Exception var14) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}

	@ObfuscatedName("ub.a(BII[B)Z")
	public boolean validate(int arg0, int arg1, byte[] arg2) {
		if (arg2 == null || arg2.length < 2) {
			return false;
		}
		int var4 = arg2.length - 2;
		int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
		this.crc32.reset();
		this.crc32.update(arg2, 0, var4);
		int var6 = (int) this.crc32.getValue();
		if (var5 == arg1) {
			return var6 == arg0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ub.a(Lmb;I)V")
	public void send(OnDemandRequest arg0) {
		try {
			if (this.socket == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - this.socketOpenTime < 4000L) {
					return;
				}
				this.socketOpenTime = var2;
				this.socket = this.app.openSocket(Client.portOff + 43594);
				this.in = this.socket.getInputStream();
				this.out = this.socket.getOutputStream();
				this.out.write(15);
				for (int var4 = 0; var4 < 8; var4++) {
					this.in.read();
				}
				this.packetCycle = 0;
			}
			this.buf[0] = (byte) arg0.archive;
			this.buf[1] = (byte) (arg0.file >> 8);
			this.buf[2] = (byte) arg0.file;
			if (arg0.urgent) {
				this.buf[3] = 2;
			} else if (this.app.ingame) {
				this.buf[3] = 0;
			} else {
				this.buf[3] = 1;
			}
			this.out.write(this.buf, 0, 4);
			this.noTimeoutCycle = 0;
			this.failCount = -10000;
		} catch (IOException var7) {
			try {
				this.socket.close();
			} catch (Exception var6) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
			this.failCount++;
		}
	}
}
