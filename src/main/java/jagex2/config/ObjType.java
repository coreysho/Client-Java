package jagex2.config;

import deob.*;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public final class ObjType {

	@ObfuscatedName("hc.a")
	public final int field1030 = -32952;

	@ObfuscatedName("hc.b")
	public static final byte field1031 = 7;

	@ObfuscatedName("hc.c")
	public static final int field1032 = 5;

	@ObfuscatedName("hc.d")
	public final boolean field1033 = true;

	@ObfuscatedName("hc.e")
	public static int numDefinitions;

	@ObfuscatedName("hc.f")
	public static int[] idx;

	@ObfuscatedName("hc.g")
	public static Packet dat;

	@ObfuscatedName("hc.h")
	public static ObjType[] recent;

	@ObfuscatedName("hc.i")
	public static int recentPos;

	@ObfuscatedName("hc.j")
	public static boolean memServer = true;

	@ObfuscatedName("hc.k")
	public int id = -1;

	@ObfuscatedName("hc.l")
	public int model;

	@ObfuscatedName("hc.m")
	public String name;

	@ObfuscatedName("hc.n")
	public byte[] desc;

	@ObfuscatedName("hc.o")
	public int[] recol_s;

	@ObfuscatedName("hc.p")
	public int[] recol_d;

	@ObfuscatedName("hc.q")
	public int zoom2d;

	@ObfuscatedName("hc.r")
	public int xan2d;

	@ObfuscatedName("hc.s")
	public int yan2d;

	@ObfuscatedName("hc.t")
	public int zan2d;

	@ObfuscatedName("hc.u")
	public int xof2d;

	@ObfuscatedName("hc.v")
	public int yof2d;

	@ObfuscatedName("hc.w")
	public int field1052;

	@ObfuscatedName("hc.x")
	public boolean stackable;

	@ObfuscatedName("hc.y")
	public int cost;

	@ObfuscatedName("hc.z")
	public boolean members;

	@ObfuscatedName("hc.X")
	public static LruCache modelcache = new LruCache(50, 0);

	@ObfuscatedName("hc.Y")
	public static LruCache spriteCache = new LruCache(100, 0);

	@ObfuscatedName("hc.E")
	public byte manwearOffset;

	@ObfuscatedName("hc.H")
	public byte womanwearOffset;

	@ObfuscatedName("hc.C")
	public int manwear;

	@ObfuscatedName("hc.D")
	public int manwear2;

	@ObfuscatedName("hc.F")
	public int womanwear;

	@ObfuscatedName("hc.G")
	public int womanwear2;

	@ObfuscatedName("hc.I")
	public int manwear3;

	@ObfuscatedName("hc.J")
	public int womanwear3;

	@ObfuscatedName("hc.K")
	public int manhead;

	@ObfuscatedName("hc.L")
	public int manhead2;

	@ObfuscatedName("hc.M")
	public int womanhead;

	@ObfuscatedName("hc.N")
	public int womanhead2;

	@ObfuscatedName("hc.Q")
	public int certlink;

	@ObfuscatedName("hc.R")
	public int certtemplate;

	@ObfuscatedName("hc.S")
	public int resizex;

	@ObfuscatedName("hc.T")
	public int resizey;

	@ObfuscatedName("hc.U")
	public int resizez;

	@ObfuscatedName("hc.V")
	public int ambient;

	@ObfuscatedName("hc.W")
	public int contrast;

	@ObfuscatedName("hc.O")
	public int[] countobj;

	@ObfuscatedName("hc.P")
	public int[] countco;

	@ObfuscatedName("hc.A")
	public String[] op;

	@ObfuscatedName("hc.B")
	public String[] iop;

	@ObfuscatedName("hc.a(Lxb;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("obj.dat", null), (byte) 1);
		Packet var1 = new Packet(arg0.read("obj.idx", null), (byte) 1);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			recent[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static void unload() {
		modelcache = null;
		spriteCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static ObjType list(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 10;
		ObjType var2 = recent[recentPos];
		dat.data = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		if (var2.certtemplate != -1) {
			var2.genCert();
		}
		if (!memServer && var2.members) {
			var2.name = "Members Object";
			var2.desc = "Login to a members' server to use this object.".getBytes();
			var2.op = null;
			var2.iop = null;
		}
		return var2;
	}

	@ObfuscatedName("hc.a(IIII)Lib;")
	public static Pix32 getSprite(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			Pix32 var3 = (Pix32) spriteCache.find((long) arg0);
			if (var3 != null && var3.ohi != arg2 && var3.ohi != -1) {
				var3.unlink();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		ObjType var4 = list(arg0);
		if (var4.countobj == null) {
			arg2 = -1;
		}
		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.countco[var6] && var4.countco[var6] != 0) {
					var5 = var4.countobj[var6];
				}
			}
			if (var5 != -1) {
				var4 = list(var5);
			}
		}
		Model var7 = var4.getModelLit(1);
		if (var7 == null) {
			return null;
		}
		Pix32 var8 = null;
		if (var4.certtemplate != -1) {
			var8 = getSprite(var4.certlink, -1, 10);
			if (var8 == null) {
				return null;
			}
		}
		Pix32 var9 = new Pix32(32, 32);
		int var10 = Pix3D.originX;
		int var11 = Pix3D.originY;
		int[] var12 = Pix3D.scanline;
		int[] var13 = Pix2D.pixels;
		int var14 = Pix2D.width;
		int var15 = Pix2D.height;
		int var16 = Pix2D.clipMinX;
		int var17 = Pix2D.clipMaxX;
		int var18 = Pix2D.clipMinY;
		int var19 = Pix2D.clipMaxY;
		Pix3D.lowDetail = false;
		Pix2D.setPixels(32, 32, var9.data);
		Pix2D.fillRect(32, 0, 32, 0, 0);
		Pix3D.setRenderClipping();
		int var20 = var4.zoom2d;
		if (arg1 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg1 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		int var21 = Pix3D.sinTable[var4.xan2d] * var20 >> 16;
		int var22 = Pix3D.cosTable[var4.xan2d] * var20 >> 16;
		var7.objRender(var4.yan2d, var4.zan2d, var4.xan2d, var4.xof2d, var21 + var7.minY / 2 + var4.yof2d, var22 + var4.yof2d);
		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.data[var23 + var24 * 32] == 0) {
					if (var23 > 0 && var9.data[var23 + var24 * 32 - 1] > 1) {
						var9.data[var23 + var24 * 32] = 1;
					} else if (var24 > 0 && var9.data[var23 + (var24 - 1) * 32] > 1) {
						var9.data[var23 + var24 * 32] = 1;
					} else if (var23 < 31 && var9.data[var23 + var24 * 32 + 1] > 1) {
						var9.data[var23 + var24 * 32] = 1;
					} else if (var24 < 31 && var9.data[var23 + (var24 + 1) * 32] > 1) {
						var9.data[var23 + var24 * 32] = 1;
					}
				}
			}
		}
		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.data[var25 + var26 * 32] == 0) {
						if (var25 > 0 && var9.data[var25 + var26 * 32 - 1] == 1) {
							var9.data[var25 + var26 * 32] = arg1;
						} else if (var26 > 0 && var9.data[var25 + (var26 - 1) * 32] == 1) {
							var9.data[var25 + var26 * 32] = arg1;
						} else if (var25 < 31 && var9.data[var25 + var26 * 32 + 1] == 1) {
							var9.data[var25 + var26 * 32] = arg1;
						} else if (var26 < 31 && var9.data[var25 + (var26 + 1) * 32] == 1) {
							var9.data[var25 + var26 * 32] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.data[var27 + var28 * 32] == 0 && var27 > 0 && var28 > 0 && var9.data[var27 + (var28 - 1) * 32 - 1] > 0) {
						var9.data[var27 + var28 * 32] = 3153952;
					}
				}
			}
		}
		if (var4.certtemplate != -1) {
			int var29 = var8.owi;
			int var30 = var8.ohi;
			var8.owi = 32;
			var8.ohi = 32;
			var8.plotSprite(field1031, 0, 0);
			var8.owi = var29;
			var8.ohi = var30;
		}
		if (arg1 == 0) {
			spriteCache.put((long) arg0, var9);
		}
		Pix2D.setPixels(var14, var15, var13);
		Pix2D.setClipping(var19, var17, var16, var18);
		Pix3D.originX = var10;
		Pix3D.originY = var11;
		Pix3D.scanline = var12;
		Pix3D.lowDetail = true;
		if (var4.stackable) {
			var9.owi = 33;
		} else {
			var9.owi = 32;
		}
		var9.ohi = arg2;
		return var9;
	}

	@ObfuscatedName("hc.a()V")
	public void reset() {
		this.model = 0;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.xof2d = 0;
		this.yof2d = 0;
		this.field1052 = -1;
		this.stackable = false;
		this.cost = 1;
		this.members = false;
		this.op = null;
		this.iop = null;
		this.manwear = -1;
		this.manwear2 = -1;
		this.manwearOffset = 0;
		this.womanwear = -1;
		this.womanwear2 = -1;
		this.womanwearOffset = 0;
		this.manwear3 = -1;
		this.womanwear3 = -1;
		this.manhead = -1;
		this.manhead2 = -1;
		this.womanhead = -1;
		this.womanhead2 = -1;
		this.countobj = null;
		this.countco = null;
		this.certlink = -1;
		this.certtemplate = -1;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("hc.a(BLlb;)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.model = buf.g2();
			} else if (var2 == 2) {
				this.name = buf.gjstr();
			} else if (var2 == 3) {
				this.desc = buf.gjstrraw(this.field1030);
			} else if (var2 == 4) {
				this.zoom2d = buf.g2();
			} else if (var2 == 5) {
				this.xan2d = buf.g2();
			} else if (var2 == 6) {
				this.yan2d = buf.g2();
			} else if (var2 == 7) {
				this.xof2d = buf.g2();
				if (this.xof2d > 32767) {
					this.xof2d -= 65536;
				}
			} else if (var2 == 8) {
				this.yof2d = buf.g2();
				if (this.yof2d > 32767) {
					this.yof2d -= 65536;
				}
			} else if (var2 == 10) {
				this.field1052 = buf.g2();
			} else if (var2 == 11) {
				this.stackable = true;
			} else if (var2 == 12) {
				this.cost = buf.g4();
			} else if (var2 == 16) {
				this.members = true;
			} else if (var2 == 23) {
				this.manwear = buf.g2();
				this.manwearOffset = buf.g1b();
			} else if (var2 == 24) {
				this.manwear2 = buf.g2();
			} else if (var2 == 25) {
				this.womanwear = buf.g2();
				this.womanwearOffset = buf.g1b();
			} else if (var2 == 26) {
				this.womanwear2 = buf.g2();
			} else if (var2 >= 30 && var2 < 35) {
				if (this.op == null) {
					this.op = new String[5];
				}
				this.op[var2 - 30] = buf.gjstr();
				if (this.op[var2 - 30].equalsIgnoreCase("hidden")) {
					this.op[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (this.iop == null) {
					this.iop = new String[5];
				}
				this.iop[var2 - 35] = buf.gjstr();
			} else if (var2 == 40) {
				int var3 = buf.g1();
				this.recol_s = new int[var3];
				this.recol_d = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.recol_s[var4] = buf.g2();
					this.recol_d[var4] = buf.g2();
				}
			} else if (var2 == 78) {
				this.manwear3 = buf.g2();
			} else if (var2 == 79) {
				this.womanwear3 = buf.g2();
			} else if (var2 == 90) {
				this.manhead = buf.g2();
			} else if (var2 == 91) {
				this.womanhead = buf.g2();
			} else if (var2 == 92) {
				this.manhead2 = buf.g2();
			} else if (var2 == 93) {
				this.womanhead2 = buf.g2();
			} else if (var2 == 95) {
				this.zan2d = buf.g2();
			} else if (var2 == 97) {
				this.certlink = buf.g2();
			} else if (var2 == 98) {
				this.certtemplate = buf.g2();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}
				this.countobj[var2 - 100] = buf.g2();
				this.countco[var2 - 100] = buf.g2();
			} else if (var2 == 110) {
				this.resizex = buf.g2();
			} else if (var2 == 111) {
				this.resizey = buf.g2();
			} else if (var2 == 112) {
				this.resizez = buf.g2();
			} else if (var2 == 113) {
				this.ambient = buf.g1b();
			} else if (var2 == 114) {
				this.contrast = buf.g1b() * 5;
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void genCert() {
		ObjType var1 = list(this.certtemplate);
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.xof2d = var1.xof2d;
		this.yof2d = var1.yof2d;
		this.recol_s = var1.recol_s;
		this.recol_d = var1.recol_d;
		ObjType var2 = list(this.certlink);
		this.name = var2.name;
		this.members = var2.members;
		this.cost = var2.cost;
		String var3 = "a";
		char var4 = var2.name.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}
		this.desc = ("Swap this note at any bank for " + var3 + " " + var2.name + ".").getBytes();
		this.stackable = true;
	}

	@ObfuscatedName("hc.b(I)Leb;")
	public Model getModelLit(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).getModelLit(1);
			}
		}
		Model var4 = (Model) modelcache.find((long) this.id);
		if (var4 != null) {
			return var4;
		}
		Model var5 = Model.load(this.model);
		if (var5 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var5.resize(this.resizez, this.resizex, this.resizey);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		var5.calculateNormals(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
		var5.useAABBMouseCheck = true;
		modelcache.put((long) this.id, var5);
		return var5;
	}

	@ObfuscatedName("hc.a(BI)Leb;")
	public Model getModelUnlit(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).getModelUnlit(1);
			}
		}
		Model var4 = Model.load(this.model);
		if (var4 == null) {
			return null;
		}
		if (this.recol_s != null) {
			for (int var5 = 0; var5 < this.recol_s.length; var5++) {
				var4.recolour(this.recol_s[var5], this.recol_d[var5]);
			}
		}
		return var4;
	}

	@ObfuscatedName("hc.a(II)Z")
	public boolean checkWearModel(int arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear2;
		int var4 = this.manwear3;
		if (arg0 == 1) {
			var2 = this.womanwear;
			var3 = this.womanwear2;
			var4 = this.womanwear3;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!Model.requestDownload(var2)) {
			var5 = false;
		}
		if (var3 != -1 && !Model.requestDownload(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.requestDownload(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("hc.b(II)Leb;")
	public Model getWearModelNoCheck(int arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear2;
		int var4 = this.manwear3;
		if (arg0 == 1) {
			var2 = this.womanwear;
			var3 = this.womanwear2;
			var4 = this.womanwear3;
		}
		if (var2 == -1) {
			return null;
		}
		Model var5 = Model.load(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = Model.load(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(2, -643, var10);
			} else {
				Model var6 = Model.load(var3);
				Model var7 = Model.load(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(3, -643, var8);
			}
		}
		if (arg0 == 0 && this.manwearOffset != 0) {
			var5.translate(0, this.manwearOffset, 0);
		}
		if (arg0 == 1 && this.womanwearOffset != 0) {
			var5.translate(0, this.womanwearOffset, 0);
		}
		if (this.recol_s != null) {
			for (int var11 = 0; var11 < this.recol_s.length; var11++) {
				var5.recolour(this.recol_s[var11], this.recol_d[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("hc.a(IB)Z")
	public boolean checkHeadModel(int arg0) {
		int var2 = this.manhead;
		int var3 = this.manhead2;
		if (arg0 == 1) {
			var2 = this.womanhead;
			var3 = this.womanhead2;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!Model.requestDownload(var2)) {
			var4 = false;
		}
		if (var3 != -1 && !Model.requestDownload(var3)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("hc.a(ZI)Leb;")
	public Model getHeadModelNoCheck(int arg0) {
		int var2 = this.manhead;
		int var3 = this.manhead2;
		if (arg0 == 1) {
			var2 = this.womanhead;
			var3 = this.womanhead2;
		}
		if (var2 == -1) {
			return null;
		}
		Model var4 = Model.load(var2);
		if (var3 != -1) {
			Model var5 = Model.load(var3);
			Model[] var6 = new Model[] { var4, var5 };
			var4 = new Model(2, -643, var6);
		}
		if (this.recol_s != null) {
			for (int var7 = 0; var7 < this.recol_s.length; var7++) {
				var4.recolour(this.recol_s[var7], this.recol_d[var7]);
			}
		}
		return var4;
	}
}
