package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("d")
public final class IfType {

	@ObfuscatedName("d.c")
	public static IfType[] list;

	@ObfuscatedName("d.d")
	public int[] linkObjType;

	@ObfuscatedName("d.e")
	public int[] linkObjNumber;

	@ObfuscatedName("d.f")
	public int animFrame;

	@ObfuscatedName("d.g")
	public int animCycle;

	@ObfuscatedName("d.h")
	public int id;

	@ObfuscatedName("d.i")
	public int field74;

	@ObfuscatedName("d.j")
	public int type;

	@ObfuscatedName("d.k")
	public int field76;

	@ObfuscatedName("d.l")
	public int clientCode;

	@ObfuscatedName("d.m")
	public int field78;

	@ObfuscatedName("d.n")
	public int field79;

	@ObfuscatedName("d.o")
	public byte field80;

	@ObfuscatedName("d.p")
	public int field81;

	@ObfuscatedName("d.q")
	public int field82;

	@ObfuscatedName("d.r")
	public int[][] field83;

	@ObfuscatedName("d.s")
	public int[] field84;

	@ObfuscatedName("d.t")
	public int[] field85;

	@ObfuscatedName("d.u")
	public int field86;

	@ObfuscatedName("d.v")
	public int field87;

	@ObfuscatedName("d.w")
	public int field88;

	@ObfuscatedName("d.x")
	public boolean field89;

	@ObfuscatedName("d.y")
	public int[] children;

	@ObfuscatedName("d.z")
	public int[] field91;

	@ObfuscatedName("d.ab")
	public int field118;

	@ObfuscatedName("d.bb")
	public int field119;

	@ObfuscatedName("d.cb")
	public int field120;

	@ObfuscatedName("d.db")
	public int modelAnim;

	@ObfuscatedName("d.eb")
	public int modelAnim2;

	@ObfuscatedName("d.fb")
	public int field123;

	@ObfuscatedName("d.gb")
	public int field124;

	@ObfuscatedName("d.hb")
	public int field125;

	@ObfuscatedName("d.ib")
	public String field126;

	@ObfuscatedName("d.jb")
	public String field127;

	@ObfuscatedName("d.kb")
	public int field128;

	@ObfuscatedName("d.lb")
	public String field129;

	@ObfuscatedName("d.mb")
	public static final LruCache field130 = new LruCache(30);

	@ObfuscatedName("d.nb")
	public static LruCache field131;

	@ObfuscatedName("d.I")
	public int field100;

	@ObfuscatedName("d.T")
	public int field111;

	@ObfuscatedName("d.U")
	public int field112;

	@ObfuscatedName("d.V")
	public int field113;

	@ObfuscatedName("d.W")
	public int field114;

	@ObfuscatedName("d.Z")
	public int model1Type;

	@ObfuscatedName("d.B")
	public int field93;

	@ObfuscatedName("d.H")
	public int field99;

	@ObfuscatedName("d.X")
	public Pix32 field115;

	@ObfuscatedName("d.Y")
	public Pix32 field116;

	@ObfuscatedName("d.Q")
	public PixFont field108;

	@ObfuscatedName("d.R")
	public String field109;

	@ObfuscatedName("d.S")
	public String field110;

	@ObfuscatedName("d.N")
	public boolean field105;

	@ObfuscatedName("d.O")
	public boolean field106;

	@ObfuscatedName("d.P")
	public boolean field107;

	@ObfuscatedName("d.C")
	public boolean field94;

	@ObfuscatedName("d.D")
	public boolean field95;

	@ObfuscatedName("d.E")
	public boolean field96;

	@ObfuscatedName("d.F")
	public boolean field97;

	@ObfuscatedName("d.G")
	public boolean objReplace;

	@ObfuscatedName("d.K")
	public int[] field102;

	@ObfuscatedName("d.L")
	public int[] field103;

	@ObfuscatedName("d.A")
	public int[] field92;

	@ObfuscatedName("d.J")
	public Pix32[] field101;

	@ObfuscatedName("d.M")
	public String[] field104;

	@ObfuscatedName("d.a(Lxb;Lxb;[Lkb;I)V")
	public static void init(JagFile arg0, JagFile arg1, PixFont[] arg2) {
		field131 = new LruCache(50000);
		Packet var4 = new Packet(arg0.read("data", null));
		int var5 = -1;
		int var6 = var4.g2();
		list = new IfType[var6];
		while (true) {
			IfType var8;
			do {
				if (var4.data >= var4.pos.length) {
					field131 = null;
					return;
				}
				int var7 = var4.g2();
				if (var7 == 65535) {
					var5 = var4.g2();
					var7 = var4.g2();
				}
				var8 = list[var7] = new IfType();
				var8.id = var7;
				var8.field74 = var5;
				var8.type = var4.g1();
				var8.field76 = var4.g1();
				var8.clientCode = var4.g2();
				var8.field78 = var4.g2();
				var8.field79 = var4.g2();
				var8.field80 = (byte) var4.g1();
				var8.field86 = var4.g1();
				if (var8.field86 == 0) {
					var8.field86 = -1;
				} else {
					var8.field86 = (var8.field86 - 1 << 8) + var4.g1();
				}
				int var9 = var4.g1();
				if (var9 > 0) {
					var8.field84 = new int[var9];
					var8.field85 = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						var8.field84[var10] = var4.g1();
						var8.field85[var10] = var4.g2();
					}
				}
				int var11 = var4.g1();
				if (var11 > 0) {
					var8.field83 = new int[var11][];
					for (int var12 = 0; var12 < var11; var12++) {
						int var13 = var4.g2();
						var8.field83[var12] = new int[var13];
						for (int var14 = 0; var14 < var13; var14++) {
							var8.field83[var12][var14] = var4.g2();
						}
					}
				}
				if (var8.type == 0) {
					var8.field87 = var4.g2();
					var8.field89 = var4.g1() == 1;
					int var15 = var4.g2();
					var8.children = new int[var15];
					var8.field91 = new int[var15];
					var8.field92 = new int[var15];
					for (int var16 = 0; var16 < var15; var16++) {
						var8.children[var16] = var4.g2();
						var8.field91[var16] = var4.g2b();
						var8.field92[var16] = var4.g2b();
					}
				}
				if (var8.type == 1) {
					var8.field93 = var4.g2();
					var8.field94 = var4.g1() == 1;
				}
				if (var8.type == 2) {
					var8.linkObjType = new int[var8.field78 * var8.field79];
					var8.linkObjNumber = new int[var8.field78 * var8.field79];
					var8.field95 = var4.g1() == 1;
					var8.field96 = var4.g1() == 1;
					var8.field97 = var4.g1() == 1;
					var8.objReplace = var4.g1() == 1;
					var8.field99 = var4.g1();
					var8.field100 = var4.g1();
					var8.field102 = new int[20];
					var8.field103 = new int[20];
					var8.field101 = new Pix32[20];
					for (int var17 = 0; var17 < 20; var17++) {
						int var18 = var4.g1();
						if (var18 == 1) {
							var8.field102[var17] = var4.g2b();
							var8.field103[var17] = var4.g2b();
							String var19 = var4.gjstr();
							if (arg1 != null && var19.length() > 0) {
								int var20 = var19.lastIndexOf(",");
								var8.field101[var17] = method37(Integer.parseInt(var19.substring(var20 + 1)), var19.substring(0, var20), arg1);
							}
						}
					}
					var8.field104 = new String[5];
					for (int var21 = 0; var21 < 5; var21++) {
						var8.field104[var21] = var4.gjstr();
						if (var8.field104[var21].length() == 0) {
							var8.field104[var21] = null;
						}
					}
				}
				if (var8.type == 3) {
					var8.field105 = var4.g1() == 1;
				}
				if (var8.type == 4 || var8.type == 1) {
					var8.field106 = var4.g1() == 1;
					int var22 = var4.g1();
					if (arg2 != null) {
						var8.field108 = arg2[var22];
					}
					var8.field107 = var4.g1() == 1;
				}
				if (var8.type == 4) {
					var8.field109 = var4.gjstr();
					var8.field110 = var4.gjstr();
				}
				if (var8.type == 1 || var8.type == 3 || var8.type == 4) {
					var8.field111 = var4.g4();
				}
				if (var8.type == 3 || var8.type == 4) {
					var8.field112 = var4.g4();
					var8.field113 = var4.g4();
					var8.field114 = var4.g4();
				}
				if (var8.type == 5) {
					String var23 = var4.gjstr();
					if (arg1 != null && var23.length() > 0) {
						int var24 = var23.lastIndexOf(",");
						var8.field115 = method37(Integer.parseInt(var23.substring(var24 + 1)), var23.substring(0, var24), arg1);
					}
					String var25 = var4.gjstr();
					if (arg1 != null && var25.length() > 0) {
						int var26 = var25.lastIndexOf(",");
						var8.field116 = method37(Integer.parseInt(var25.substring(var26 + 1)), var25.substring(0, var26), arg1);
					}
				}
				if (var8.type == 6) {
					int var27 = var4.g1();
					if (var27 != 0) {
						var8.model1Type = 1;
						var8.field118 = (var27 - 1 << 8) + var4.g1();
					}
					int var28 = var4.g1();
					if (var28 != 0) {
						var8.field119 = 1;
						var8.field120 = (var28 - 1 << 8) + var4.g1();
					}
					int var29 = var4.g1();
					if (var29 == 0) {
						var8.modelAnim = -1;
					} else {
						var8.modelAnim = (var29 - 1 << 8) + var4.g1();
					}
					int var30 = var4.g1();
					if (var30 == 0) {
						var8.modelAnim2 = -1;
					} else {
						var8.modelAnim2 = (var30 - 1 << 8) + var4.g1();
					}
					var8.field123 = var4.g2();
					var8.field124 = var4.g2();
					var8.field125 = var4.g2();
				}
				if (var8.type == 7) {
					var8.linkObjType = new int[var8.field78 * var8.field79];
					var8.linkObjNumber = new int[var8.field78 * var8.field79];
					var8.field106 = var4.g1() == 1;
					int var31 = var4.g1();
					if (arg2 != null) {
						var8.field108 = arg2[var31];
					}
					var8.field107 = var4.g1() == 1;
					var8.field111 = var4.g4();
					var8.field99 = var4.g2b();
					var8.field100 = var4.g2b();
					var8.field96 = var4.g1() == 1;
					var8.field104 = new String[5];
					for (int var32 = 0; var32 < 5; var32++) {
						var8.field104[var32] = var4.gjstr();
						if (var8.field104[var32].length() == 0) {
							var8.field104[var32] = null;
						}
					}
				}
				if (var8.field76 == 2 || var8.type == 2) {
					var8.field126 = var4.gjstr();
					var8.field127 = var4.gjstr();
					var8.field128 = var4.g2();
				}
			} while (var8.field76 != 1 && var8.field76 != 4 && var8.field76 != 5 && var8.field76 != 6);
			var8.field129 = var4.gjstr();
			if (var8.field129.length() == 0) {
				if (var8.field76 == 1) {
					var8.field129 = "Ok";
				}
				if (var8.field76 == 4) {
					var8.field129 = "Select";
				}
				if (var8.field76 == 5) {
					var8.field129 = "Select";
				}
				if (var8.field76 == 6) {
					var8.field129 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(IILeb;I)V")
	public static void method36(int arg1, Model arg2, int arg3) {
		field130.clear();
		if (arg2 != null && arg3 != 4) {
			field130.put((long) ((arg3 << 16) + arg1), arg2);
		}
	}

	@ObfuscatedName("d.a(IZLjava/lang/String;Lxb;)Lib;")
	public static Pix32 method37(int arg0, String arg2, JagFile arg3) {
		long var4 = (JString.hashCode(arg2) << 8) + (long) arg0;
		Pix32 var6 = (Pix32) field131.find(var4);
		if (var6 != null) {
			return var6;
		}
		try {
			Pix32 var7 = new Pix32(arg3, arg2, arg0);
			field131.put(var4, var7);
			return var7;
		} catch (Exception var8) {
			return null;
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = linkObjType[arg0];
		linkObjType[arg0] = linkObjType[arg1];
		linkObjType[arg1] = var3;
		int var4 = linkObjNumber[arg0];
		linkObjNumber[arg0] = linkObjNumber[arg1];
		linkObjNumber[arg1] = var4;
	}

	@ObfuscatedName("d.a(IIIZ)Leb;")
	public Model method34(int arg0, int arg1, boolean arg3) {
		Model var5;
		if (arg3) {
			var5 = method35(field119, field120);
		} else {
			var5 = method35(model1Type, field118);
		}
		if (var5 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var5.faceColour == null) {
			return var5;
		} else {
			Model var6 = new Model(true, AnimFrame.animateTransparencies(arg0) & AnimFrame.animateTransparencies(arg1), var5, false);
			if (arg0 != -1 || arg1 != -1) {
				var6.prepareAnim();
			}
			if (arg0 != -1) {
				var6.animate(arg0);
			}
			if (arg1 != -1) {
				var6.animate(arg1);
			}
			var6.calculateNormals(64, 768, -50, -10, -50, true);
			return var6;
		}
	}

	@ObfuscatedName("d.a(II)Leb;")
	public Model method35(int arg0, int arg1) {
		Model var3 = (Model) field130.find((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.load(arg1);
		}
		if (arg0 == 2) {
			var3 = NpcType.list(arg1).getHead();
		}
		if (arg0 == 3) {
			var3 = Client.localPlayer.method118();
		}
		if (arg0 == 4) {
			var3 = ObjType.list(arg1).getModelUnlit(50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			field130.put((long) ((arg0 << 16) + arg1), var3);
		}
		return var3;
	}
}
