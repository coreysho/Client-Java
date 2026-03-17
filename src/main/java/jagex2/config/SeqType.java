package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;

@ObfuscatedName("nc")
public final class SeqType {

	@ObfuscatedName("nc.a")
	public static int numDefinitions;

	@ObfuscatedName("nc.b")
	public static SeqType[] list;

	@ObfuscatedName("nc.c")
	public int numFrames;

	@ObfuscatedName("nc.d")
	public int[] frames;

	@ObfuscatedName("nc.e")
	public int[] iframes;

	@ObfuscatedName("nc.f")
	public int[] delay;

	@ObfuscatedName("nc.g")
	public int loops = -1;

	@ObfuscatedName("nc.h")
	public int[] walkmerge;

	@ObfuscatedName("nc.i")
	public boolean reachforward = false;

	@ObfuscatedName("nc.j")
	public int priority = 5;

	@ObfuscatedName("nc.k")
	public int replaceheldleft = -1;

	@ObfuscatedName("nc.l")
	public int replaceheldright = -1;

	@ObfuscatedName("nc.m")
	public int maxloops = 99;

	@ObfuscatedName("nc.n")
	public int preanim_move = -1;

	@ObfuscatedName("nc.o")
	public int postanim_move = -1;

	@ObfuscatedName("nc.p")
	public int duplicatebehaviour;

	@ObfuscatedName("nc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("seq.dat", null), (byte) 1);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SeqType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SeqType();
			}
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int getDelay(int arg0) {
		int var2 = this.delay[arg0];
		if (var2 == 0) {
			AnimFrame var3 = AnimFrame.get(this.frames[arg0]);
			if (var3 != null) {
				var2 = this.delay[arg0] = var3.delay;
			}
		}
		if (var2 == 0) {
			var2 = 1;
		}
		return var2;
	}

	@ObfuscatedName("nc.a(BLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				if (this.numFrames == 0) {
					this.numFrames = 1;
					this.frames = new int[1];
					this.frames[0] = -1;
					this.iframes = new int[1];
					this.iframes[0] = -1;
					this.delay = new int[1];
					this.delay[0] = -1;
				}
				if (this.preanim_move == -1) {
					if (this.walkmerge == null) {
						this.preanim_move = 0;
					} else {
						this.preanim_move = 2;
					}
				}
				if (this.postanim_move == -1) {
					if (this.walkmerge == null) {
						this.postanim_move = 0;
					} else {
						this.postanim_move = 2;
					}
				}
				return;
			}
			if (var2 == 1) {
				this.numFrames = arg0.g1();
				this.frames = new int[this.numFrames];
				this.iframes = new int[this.numFrames];
				this.delay = new int[this.numFrames];
				for (int var3 = 0; var3 < this.numFrames; var3++) {
					this.frames[var3] = arg0.g2();
					this.iframes[var3] = arg0.g2();
					if (this.iframes[var3] == 65535) {
						this.iframes[var3] = -1;
					}
					this.delay[var3] = arg0.g2();
				}
			} else if (var2 == 2) {
				this.loops = arg0.g2();
			} else if (var2 == 3) {
				int var4 = arg0.g1();
				this.walkmerge = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					this.walkmerge[var5] = arg0.g1();
				}
				this.walkmerge[var4] = 9999999;
			} else if (var2 == 4) {
				this.reachforward = true;
			} else if (var2 == 5) {
				this.priority = arg0.g1();
			} else if (var2 == 6) {
				this.replaceheldleft = arg0.g2();
			} else if (var2 == 7) {
				this.replaceheldright = arg0.g2();
			} else if (var2 == 8) {
				this.maxloops = arg0.g1();
			} else if (var2 == 9) {
				this.preanim_move = arg0.g1();
			} else if (var2 == 10) {
				this.postanim_move = arg0.g1();
			} else if (var2 == 11) {
				this.duplicatebehaviour = arg0.g1();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
