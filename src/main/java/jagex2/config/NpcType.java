package jagex2.config;

import jagex2.datastruct.LruCache;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.io.JagFile;

@ObfuscatedName("gc")
public final class NpcType {

	@ObfuscatedName("gc.a")
	public final int field996 = -32952;

	@ObfuscatedName("gc.b")
	public static final boolean field997 = true;

	@ObfuscatedName("gc.c")
	public static int numDefinitions;

	@ObfuscatedName("gc.d")
	public static int[] idx;

	@ObfuscatedName("gc.e")
	public static Packet dat;

	@ObfuscatedName("gc.f")
	public static NpcType[] recent;

	@ObfuscatedName("gc.g")
	public static int recentPos;

	@ObfuscatedName("gc.h")
	public long id = -1L;

	@ObfuscatedName("gc.i")
	public String name;

	@ObfuscatedName("gc.j")
	public byte[] desc;

	@ObfuscatedName("gc.k")
	public byte size = 1;

	@ObfuscatedName("gc.l")
	public int[] model;

	@ObfuscatedName("gc.m")
	public int[] head;

	@ObfuscatedName("gc.n")
	public int readyanim = -1;

	@ObfuscatedName("gc.o")
	public int walkanim = -1;

	@ObfuscatedName("gc.p")
	public int walkanim_b = -1;

	@ObfuscatedName("gc.q")
	public int walkanim_r = -1;

	@ObfuscatedName("gc.r")
	public int walkanim_l = -1;

	@ObfuscatedName("gc.s")
	public int[] recol_s;

	@ObfuscatedName("gc.t")
	public int[] recol_d;

	@ObfuscatedName("gc.u")
	public String[] op;

	@ObfuscatedName("gc.v")
	public int field1017 = -1;

	@ObfuscatedName("gc.w")
	public int field1018 = -1;

	@ObfuscatedName("gc.x")
	public int field1019 = -1;

	@ObfuscatedName("gc.y")
	public boolean minimap = true;

	@ObfuscatedName("gc.z")
	public int vislevel = -1;

	@ObfuscatedName("gc.H")
	public static LruCache modelCache = new LruCache(30, 0);

	@ObfuscatedName("gc.A")
	public int resizeh = 128;

	@ObfuscatedName("gc.B")
	public int resizev = 128;

	@ObfuscatedName("gc.C")
	public boolean alwaysontop = false;

	@ObfuscatedName("gc.F")
	public int headicon = -1;

	@ObfuscatedName("gc.G")
	public int turnspeed = 32;

	@ObfuscatedName("gc.D")
	public int ambient;

	@ObfuscatedName("gc.E")
	public int contrast;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("npc.dat", null), (byte) 1);
		Packet var1 = new Packet(arg0.read("npc.idx", null), (byte) 1);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static void unload() {
		modelCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static NpcType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (recent[var1].id == (long) arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 20;
		NpcType var2 = recent[recentPos] = new NpcType();
		dat.data = idx[arg0];
		var2.id = arg0;
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("gc.a(BLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.g1();
				this.model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.model[var4] = arg0.g2();
				}
			} else if (var2 == 2) {
				this.name = arg0.gjstr();
			} else if (var2 == 3) {
				this.desc = arg0.gjstrraw(this.field996);
			} else if (var2 == 12) {
				this.size = arg0.g1b();
			} else if (var2 == 13) {
				this.readyanim = arg0.g2();
			} else if (var2 == 14) {
				this.walkanim = arg0.g2();
			} else if (var2 == 17) {
				this.walkanim = arg0.g2();
				this.walkanim_b = arg0.g2();
				this.walkanim_r = arg0.g2();
				this.walkanim_l = arg0.g2();
			} else if (var2 >= 30 && var2 < 40) {
				if (this.op == null) {
					this.op = new String[5];
				}
				this.op[var2 - 30] = arg0.gjstr();
				if (this.op[var2 - 30].equalsIgnoreCase("hidden")) {
					this.op[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.g1();
				this.recol_s = new int[var5];
				this.recol_d = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.recol_s[var6] = arg0.g2();
					this.recol_d[var6] = arg0.g2();
				}
			} else if (var2 == 60) {
				int var7 = arg0.g1();
				this.head = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					this.head[var8] = arg0.g2();
				}
			} else if (var2 == 90) {
				this.field1017 = arg0.g2();
			} else if (var2 == 91) {
				this.field1018 = arg0.g2();
			} else if (var2 == 92) {
				this.field1019 = arg0.g2();
			} else if (var2 == 93) {
				this.minimap = false;
			} else if (var2 == 95) {
				this.vislevel = arg0.g2();
			} else if (var2 == 97) {
				this.resizeh = arg0.g2();
			} else if (var2 == 98) {
				this.resizev = arg0.g2();
			} else if (var2 == 99) {
				this.alwaysontop = true;
			} else if (var2 == 100) {
				this.ambient = arg0.g1b();
			} else if (var2 == 101) {
				this.contrast = arg0.g1b() * 5;
			} else if (var2 == 102) {
				this.headicon = arg0.g2();
			} else if (var2 == 103) {
				this.turnspeed = arg0.g2();
			}
		}
	}

	@ObfuscatedName("gc.a(III[I)Leb;")
	public Model getTempModel(int arg0, int arg1, int[] arg2) {
		Model var4 = (Model) modelCache.find(this.id);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < this.model.length; var6++) {
				if (!Model.requestDownload(this.model[var6])) {
					var5 = true;
				}
			}
			if (var5) {
				return null;
			}
			Model[] var7 = new Model[this.model.length];
			for (int var8 = 0; var8 < this.model.length; var8++) {
				var7[var8] = Model.load(this.model[var8]);
			}
			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new Model(var7.length, -643, var7);
			}
			if (this.recol_s != null) {
				for (int var9 = 0; var9 < this.recol_s.length; var9++) {
					var4.recolour(this.recol_s[var9], this.recol_d[var9]);
				}
			}
			var4.prepareAnim();
			var4.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCache.put(this.id, var4);
		}
		Model var10 = Model.field531;
		var10.set(var4, AnimFrame.animateTransparencies(arg0) & AnimFrame.animateTransparencies(arg1));
		if (arg0 != -1 && arg1 != -1) {
			var10.maskAnimate(arg2, arg0, arg1);
		} else if (arg0 != -1) {
			var10.animate(arg0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var10.resize(this.resizeh, this.resizeh, this.resizev);
		}
		var10.calcBoundingCylinder();
		var10.labelFaces = null;
		var10.labelVertices = null;
		if (this.size == 1) {
			var10.useAABBMouseCheck = true;
		}
		return var10;
	}

	@ObfuscatedName("gc.b(B)Leb;")
	public Model getHead() {
		if (this.head == null) {
			return null;
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < this.head.length; var2++) {
			if (!Model.requestDownload(this.head[var2])) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		Model[] var3 = new Model[this.head.length];
		for (int var4 = 0; var4 < this.head.length; var4++) {
			var3[var4] = Model.load(this.head[var4]);
		}
		Model var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new Model(var3.length, -643, var3);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		return var5;
	}
}
