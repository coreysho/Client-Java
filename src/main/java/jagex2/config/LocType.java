package jagex2.config;

import jagex2.datastruct.LruCache;
import deob.ObfuscatedName;
import jagex2.io.OnDemand;
import jagex2.io.Packet;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.io.JagFile;

@ObfuscatedName("ec")
public final class LocType {

	@ObfuscatedName("ec.a")
	public final int field942 = -32952;

	@ObfuscatedName("ec.b")
	public final boolean field943 = false;

	@ObfuscatedName("ec.c")
	public int field944;

	@ObfuscatedName("ec.d")
	public final boolean field945 = false;

	@ObfuscatedName("ec.e")
	public int field946;

	@ObfuscatedName("ec.f")
	public static int numDefinitions;

	@ObfuscatedName("ec.g")
	public static int[] idx;

	@ObfuscatedName("ec.h")
	public static Packet dat;

	@ObfuscatedName("ec.i")
	public static LocType[] recent;

	@ObfuscatedName("ec.j")
	public static int recentPos;

	@ObfuscatedName("ec.k")
	public static final Model[] temp = new Model[4];

	@ObfuscatedName("ec.l")
	public int id = -1;

	@ObfuscatedName("ec.m")
	public int[] model;

	@ObfuscatedName("ec.n")
	public int[] shape;

	@ObfuscatedName("ec.o")
	public String name;

	@ObfuscatedName("ec.p")
	public byte[] desc;

	@ObfuscatedName("ec.q")
	public int[] recol_s;

	@ObfuscatedName("ec.r")
	public int[] recol_d;

	@ObfuscatedName("ec.s")
	public int width;

	@ObfuscatedName("ec.t")
	public int length;

	@ObfuscatedName("ec.u")
	public boolean blockwalk;

	@ObfuscatedName("ec.v")
	public boolean blockrange;

	@ObfuscatedName("ec.w")
	public boolean active;

	@ObfuscatedName("ec.x")
	public boolean hillskew;

	@ObfuscatedName("ec.y")
	public boolean sharelight;

	@ObfuscatedName("ec.z")
	public boolean occlude;

	@ObfuscatedName("ec.T")
	public static LruCache mc1 = new LruCache(500, 0);

	@ObfuscatedName("ec.U")
	public static LruCache mc2 = new LruCache(30, 0);

	@ObfuscatedName("ec.C")
	public byte ambient;

	@ObfuscatedName("ec.D")
	public byte contrast;

	@ObfuscatedName("ec.A")
	public int anim;

	@ObfuscatedName("ec.B")
	public int wallwidth;

	@ObfuscatedName("ec.F")
	public int mapfunction;

	@ObfuscatedName("ec.G")
	public int mapscene;

	@ObfuscatedName("ec.J")
	public int resizex;

	@ObfuscatedName("ec.K")
	public int resizey;

	@ObfuscatedName("ec.L")
	public int resizez;

	@ObfuscatedName("ec.M")
	public int offsetx;

	@ObfuscatedName("ec.N")
	public int offsety;

	@ObfuscatedName("ec.O")
	public int offsetz;

	@ObfuscatedName("ec.P")
	public int forceapproach;

	@ObfuscatedName("ec.S")
	public int raiseobject;

	@ObfuscatedName("ec.H")
	public boolean mirror;

	@ObfuscatedName("ec.I")
	public boolean shadow;

	@ObfuscatedName("ec.Q")
	public boolean forcedecor;

	@ObfuscatedName("ec.R")
	public boolean breakroutefinding;

	@ObfuscatedName("ec.E")
	public String[] op;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static void method323(JagFile arg0) {
		dat = new Packet(arg0.read("loc.dat", null), (byte) 1);
		Packet var1 = new Packet(arg0.read("loc.idx", null), (byte) 1);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			recent[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static void unload() {
		mc1 = null;
		mc2 = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static LocType list(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 10;
		LocType var2 = recent[recentPos];
		dat.data = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public void reset() {
		this.model = null;
		this.shape = null;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.width = 1;
		this.length = 1;
		this.blockwalk = true;
		this.blockrange = true;
		this.active = false;
		this.hillskew = false;
		this.sharelight = false;
		this.occlude = false;
		this.anim = -1;
		this.wallwidth = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.op = null;
		this.mapfunction = -1;
		this.mapscene = -1;
		this.mirror = false;
		this.shadow = true;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.forceapproach = 0;
		this.offsetx = 0;
		this.offsety = 0;
		this.offsetz = 0;
		this.forcedecor = false;
		this.breakroutefinding = false;
		this.raiseobject = -1;
	}

	@ObfuscatedName("ec.a(BLlb;)V")
	public void decode(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.g1();
					if (var3 == 0) {
						if (var2 == -1) {
							this.active = false;
							if (this.model != null && (this.shape == null || this.shape[0] == 10)) {
								this.active = true;
							}
							if (this.op != null) {
								this.active = true;
							}
						}
						if (this.breakroutefinding) {
							this.blockwalk = false;
							this.blockrange = false;
						}
						if (this.raiseobject == -1) {
							this.raiseobject = this.blockwalk ? 1 : 0;
							return;
						}
						return;
					}
					if (var3 == 1) {
						var4 = arg0.g1();
						break;
					}
					if (var3 == 2) {
						this.name = arg0.gjstr();
					} else if (var3 == 3) {
						this.desc = arg0.gjstrraw(this.field942);
					} else if (var3 == 5) {
						int var6 = arg0.g1();
						if (var6 > 0) {
							this.shape = null;
							this.model = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								this.model[var7] = arg0.g2();
							}
						}
					} else if (var3 == 14) {
						this.width = arg0.g1();
					} else if (var3 == 15) {
						this.length = arg0.g1();
					} else if (var3 == 17) {
						this.blockwalk = false;
					} else if (var3 == 18) {
						this.blockrange = false;
					} else if (var3 == 19) {
						var2 = arg0.g1();
						if (var2 == 1) {
							this.active = true;
						}
					} else if (var3 == 21) {
						this.hillskew = true;
					} else if (var3 == 22) {
						this.sharelight = true;
					} else if (var3 == 23) {
						this.occlude = true;
					} else if (var3 == 24) {
						this.anim = arg0.g2();
						if (this.anim == 65535) {
							this.anim = -1;
						}
					} else if (var3 == 28) {
						this.wallwidth = arg0.g1();
					} else if (var3 == 29) {
						this.ambient = arg0.g1b();
					} else if (var3 == 39) {
						this.contrast = arg0.g1b();
					} else if (var3 >= 30 && var3 < 39) {
						if (this.op == null) {
							this.op = new String[5];
						}
						this.op[var3 - 30] = arg0.gjstr();
						if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
							this.op[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.g1();
						this.recol_s = new int[var8];
						this.recol_d = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							this.recol_s[var9] = arg0.g2();
							this.recol_d[var9] = arg0.g2();
						}
					} else if (var3 == 60) {
						this.mapfunction = arg0.g2();
					} else if (var3 == 62) {
						this.mirror = true;
					} else if (var3 == 64) {
						this.shadow = false;
					} else if (var3 == 65) {
						this.resizex = arg0.g2();
					} else if (var3 == 66) {
						this.resizey = arg0.g2();
					} else if (var3 == 67) {
						this.resizez = arg0.g2();
					} else if (var3 == 68) {
						this.mapscene = arg0.g2();
					} else if (var3 == 69) {
						this.forceapproach = arg0.g1();
					} else if (var3 == 70) {
						this.offsetx = arg0.g2b();
					} else if (var3 == 71) {
						this.offsety = arg0.g2b();
					} else if (var3 == 72) {
						this.offsetz = arg0.g2b();
					} else if (var3 == 73) {
						this.forcedecor = true;
					} else if (var3 == 74) {
						this.breakroutefinding = true;
					} else if (var3 == 75) {
						this.raiseobject = arg0.g1();
					}
				}
			} while (var4 <= 0);
			this.shape = new int[var4];
			this.model = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				this.model[var5] = arg0.g2();
				this.shape[var5] = arg0.g1();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public boolean checkModel(int arg0) {
		if (this.shape != null) {
			for (int var4 = 0; var4 < this.shape.length; var4++) {
				if (this.shape[var4] == arg0) {
					return Model.requestDownload(this.model[var4] & 0xFFFF);
				}
			}
			return true;
		} else if (this.model == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.model.length; var3++) {
				var2 &= Model.requestDownload(this.model[var3] & 0xFFFF);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ec.a(Z)Z")
	public boolean checkModelAll() {
		if (this.model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.model.length; var2++) {
			var1 &= Model.requestDownload(this.model[var2] & 0xFFFF);
		}
		return var1;
	}

	@ObfuscatedName("ec.a(BLub;)V")
	public void prefetchModelAll(OnDemand arg0) {
		if (this.model != null) {
			for (int var2 = 0; var2 < this.model.length; var2++) {
				arg0.prefetch(0, this.model[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.buildModel(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}
		if (this.hillskew || this.sharelight) {
			var8 = new Model(this.sharelight, (byte) 72, var8, this.hillskew);
		}
		if (this.hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.numPoints; var10++) {
				int var11 = var8.pointX[var10];
				int var12 = var8.pointZ[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.pointY[var10] += var15 - var9;
			}
			var8.recalcBoundingCylinder();
		}
		return var8;
	}

	@ObfuscatedName("ec.a(IZII)Leb;")
	public Model buildModel(int arg0, int arg1, int arg2) {
		Model var4 = null;
		long var5;
		if (this.shape == null) {
			if (arg2 != 10) {
				return null;
			}
			var5 = (long) ((this.id << 6) + arg0) + ((long) (arg1 + 1) << 32);
			Model var7 = (Model) mc2.find(var5);
			if (var7 != null) {
				return var7;
			}
			if (this.model == null) {
				return null;
			}
			boolean var8 = this.mirror ^ arg0 > 3;
			int var9 = this.model.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = this.model[var10];
				if (var8) {
					var11 += 65536;
				}
				var4 = (Model) mc1.find((long) var11);
				if (var4 == null) {
					var4 = Model.load(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}
					if (var8) {
						var4.mirror();
					}
					mc1.put((long) var11, var4);
				}
				if (var9 > 1) {
					temp[var10] = var4;
				}
			}
			if (var9 > 1) {
				var4 = new Model(var9, -643, temp);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < this.shape.length; var13++) {
				if (this.shape[var13] == arg2) {
					var12 = var13;
					break;
				}
			}
			if (var12 == -1) {
				return null;
			}
			var5 = (long) ((this.id << 6) + (var12 << 3) + arg0) + ((long) (arg1 + 1) << 32);
			Model var14 = (Model) mc2.find(var5);
			if (var14 != null) {
				return var14;
			}
			int var15 = this.model[var12];
			boolean var16 = this.mirror ^ arg0 > 3;
			if (var16) {
				var15 += 65536;
			}
			var4 = (Model) mc1.find((long) var15);
			if (var4 == null) {
				var4 = Model.load(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}
				if (var16) {
					var4.mirror();
				}
				mc1.put((long) var15, var4);
			}
		}
		boolean var17;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var17 = false;
		} else {
			var17 = true;
		}
		boolean var18;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var18 = false;
		} else {
			var18 = true;
		}
		Model var19 = new Model(this.recol_s == null, AnimFrame.animateTransparencies(arg1), var4, true, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.prepareAnim();
			var19.animate(arg1);
			var19.labelFaces = null;
			var19.labelVertices = null;
		}
		while (arg0-- > 0) {
			var19.rotate90();
		}
		if (this.recol_s != null) {
			for (int var20 = 0; var20 < this.recol_s.length; var20++) {
				var19.recolour(this.recol_s[var20], this.recol_d[var20]);
			}
		}
		if (var17) {
			var19.resize(this.resizez, this.resizex, this.resizey);
		}
		if (var18) {
			var19.translate(this.offsetx, this.offsety, this.offsetz);
		}
		var19.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
		if (this.raiseobject == 1) {
			var19.objRaise = var19.minY;
		}
		mc2.put(var5, var19);
		return var19;
	}
}
