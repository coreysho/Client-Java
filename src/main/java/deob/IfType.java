package deob;

@ObfuscatedName("d")
public final class IfType {

	@ObfuscatedName("d.a")
	public static boolean field66;

	@ObfuscatedName("d.b")
	public static int field67;

	@ObfuscatedName("d.c")
	public static IfType[] list;

	@ObfuscatedName("d.d")
	public int[] field69;

	@ObfuscatedName("d.e")
	public int[] field70;

	@ObfuscatedName("d.f")
	public int field71;

	@ObfuscatedName("d.g")
	public int field72;

	@ObfuscatedName("d.h")
	public int field73;

	@ObfuscatedName("d.i")
	public int field74;

	@ObfuscatedName("d.j")
	public int field75;

	@ObfuscatedName("d.k")
	public int field76;

	@ObfuscatedName("d.l")
	public int field77;

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
	public int[] field90;

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
	public static final LruCache field130 = new LruCache(30, 0);

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
	public boolean field98;

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
	public static void method32(JagFile arg0, JagFile arg1, PixFont[] arg2) {
		field131 = new LruCache(50000, 0);
		Packet var3 = new Packet(arg0.method294("data", null), (byte) 1);
		int var4 = -1;
		int var5 = var3.g2();
		list = new IfType[var5];
		while (true) {
			IfType var7;
			do {
				if (var3.data >= var3.pos.length) {
					field131 = null;
					return;
				}
				int var6 = var3.g2();
				if (var6 == 65535) {
					var4 = var3.g2();
					var6 = var3.g2();
				}
				var7 = list[var6] = new IfType();
				var7.field73 = var6;
				var7.field74 = var4;
				var7.field75 = var3.g1();
				var7.field76 = var3.g1();
				var7.field77 = var3.g2();
				var7.field78 = var3.g2();
				var7.field79 = var3.g2();
				var7.field80 = (byte) var3.g1();
				var7.field86 = var3.g1();
				if (var7.field86 == 0) {
					var7.field86 = -1;
				} else {
					var7.field86 = (var7.field86 - 1 << 8) + var3.g1();
				}
				int var8 = var3.g1();
				if (var8 > 0) {
					var7.field84 = new int[var8];
					var7.field85 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field84[var9] = var3.g1();
						var7.field85[var9] = var3.g2();
					}
				}
				int var10 = var3.g1();
				if (var10 > 0) {
					var7.field83 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.g2();
						var7.field83[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field83[var11][var13] = var3.g2();
						}
					}
				}
				if (var7.field75 == 0) {
					var7.field87 = var3.g2();
					var7.field89 = var3.g1() == 1;
					int var14 = var3.g2();
					var7.field90 = new int[var14];
					var7.field91 = new int[var14];
					var7.field92 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field90[var15] = var3.g2();
						var7.field91[var15] = var3.g2b();
						var7.field92[var15] = var3.g2b();
					}
				}
				if (var7.field75 == 1) {
					var7.field93 = var3.g2();
					var7.field94 = var3.g1() == 1;
				}
				if (var7.field75 == 2) {
					var7.field69 = new int[var7.field78 * var7.field79];
					var7.field70 = new int[var7.field78 * var7.field79];
					var7.field95 = var3.g1() == 1;
					var7.field96 = var3.g1() == 1;
					var7.field97 = var3.g1() == 1;
					var7.field98 = var3.g1() == 1;
					var7.field99 = var3.g1();
					var7.field100 = var3.g1();
					var7.field102 = new int[20];
					var7.field103 = new int[20];
					var7.field101 = new Pix32[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.g1();
						if (var17 == 1) {
							var7.field102[var16] = var3.g2b();
							var7.field103[var16] = var3.g2b();
							String var18 = var3.gjstr();
							if (arg1 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field101[var16] = method37(Integer.parseInt(var18.substring(var19 + 1)), var18.substring(0, var19), arg1);
							}
						}
					}
					var7.field104 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field104[var20] = var3.gjstr();
						if (var7.field104[var20].length() == 0) {
							var7.field104[var20] = null;
						}
					}
				}
				if (var7.field75 == 3) {
					var7.field105 = var3.g1() == 1;
				}
				if (var7.field75 == 4 || var7.field75 == 1) {
					var7.field106 = var3.g1() == 1;
					int var21 = var3.g1();
					if (arg2 != null) {
						var7.field108 = arg2[var21];
					}
					var7.field107 = var3.g1() == 1;
				}
				if (var7.field75 == 4) {
					var7.field109 = var3.gjstr();
					var7.field110 = var3.gjstr();
				}
				if (var7.field75 == 1 || var7.field75 == 3 || var7.field75 == 4) {
					var7.field111 = var3.g4();
				}
				if (var7.field75 == 3 || var7.field75 == 4) {
					var7.field112 = var3.g4();
					var7.field113 = var3.g4();
					var7.field114 = var3.g4();
				}
				if (var7.field75 == 5) {
					String var22 = var3.gjstr();
					if (arg1 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field115 = method37(Integer.parseInt(var22.substring(var23 + 1)), var22.substring(0, var23), arg1);
					}
					String var24 = var3.gjstr();
					if (arg1 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field116 = method37(Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25), arg1);
					}
				}
				if (var7.field75 == 6) {
					int var26 = var3.g1();
					if (var26 != 0) {
						var7.model1Type = 1;
						var7.field118 = (var26 - 1 << 8) + var3.g1();
					}
					int var27 = var3.g1();
					if (var27 != 0) {
						var7.field119 = 1;
						var7.field120 = (var27 - 1 << 8) + var3.g1();
					}
					int var28 = var3.g1();
					if (var28 == 0) {
						var7.modelAnim = -1;
					} else {
						var7.modelAnim = (var28 - 1 << 8) + var3.g1();
					}
					int var29 = var3.g1();
					if (var29 == 0) {
						var7.modelAnim2 = -1;
					} else {
						var7.modelAnim2 = (var29 - 1 << 8) + var3.g1();
					}
					var7.field123 = var3.g2();
					var7.field124 = var3.g2();
					var7.field125 = var3.g2();
				}
				if (var7.field75 == 7) {
					var7.field69 = new int[var7.field78 * var7.field79];
					var7.field70 = new int[var7.field78 * var7.field79];
					var7.field106 = var3.g1() == 1;
					int var30 = var3.g1();
					if (arg2 != null) {
						var7.field108 = arg2[var30];
					}
					var7.field107 = var3.g1() == 1;
					var7.field111 = var3.g4();
					var7.field99 = var3.g2b();
					var7.field100 = var3.g2b();
					var7.field96 = var3.g1() == 1;
					var7.field104 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field104[var31] = var3.gjstr();
						if (var7.field104[var31].length() == 0) {
							var7.field104[var31] = null;
						}
					}
				}
				if (var7.field76 == 2 || var7.field75 == 2) {
					var7.field126 = var3.gjstr();
					var7.field127 = var3.gjstr();
					var7.field128 = var3.g2();
				}
			} while (var7.field76 != 1 && var7.field76 != 4 && var7.field76 != 5 && var7.field76 != 6);
			var7.field129 = var3.gjstr();
			if (var7.field129.length() == 0) {
				if (var7.field76 == 1) {
					var7.field129 = "Ok";
				}
				if (var7.field76 == 4) {
					var7.field129 = "Select";
				}
				if (var7.field76 == 5) {
					var7.field129 = "Select";
				}
				if (var7.field76 == 6) {
					var7.field129 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(IILeb;I)V")
	public static void method36(Model arg0) {
		field130.method103();
		if (arg0 != null) {
			field130.method102((long) 327680, arg0);
		}
	}

	@ObfuscatedName("d.a(IZLjava/lang/String;Lxb;)Lib;")
	public static Pix32 method37(int arg0, String arg1, JagFile arg2) {
		long var3 = (JString.method297(arg1) << 8) + (long) arg0;
		Pix32 var5 = (Pix32) field131.method101(var3);
		if (var5 != null) {
			return var5;
		}
		try {
			Pix32 var6 = new Pix32(arg2, arg1, arg0);
			field131.method102(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void method33(int arg0, int arg1) {
		int var3 = this.field69[arg0];
		this.field69[arg0] = this.field69[arg1];
		this.field69[arg1] = var3;
		int var4 = this.field70[arg0];
		this.field70[arg0] = this.field70[arg1];
		this.field70[arg1] = var4;
	}

	@ObfuscatedName("d.a(IIIZ)Leb;")
	public Model method34(int arg0, int arg1, boolean arg2) {
		Model var4;
		if (arg2) {
			var4 = this.method35(this.field119, this.field120);
		} else {
			var4 = this.method35(this.model1Type, this.field118);
		}
		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field550 == null) {
			return var4;
		} else {
			Model var5 = new Model(true, AnimFrame.method48(arg0) & AnimFrame.method48(arg1), var4, true, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.method132();
			}
			if (arg0 != -1) {
				var5.method133(arg0);
			}
			if (arg1 != -1) {
				var5.method133(arg1);
			}
			var5.method142(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("d.a(II)Leb;")
	public Model method35(int arg0, int arg1) {
		Model var3 = (Model) field130.method101((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.method125(arg1);
		}
		if (arg0 == 2) {
			var3 = NpcType.method335(arg1).method338();
		}
		if (arg0 == 3) {
			var3 = Client.field1668.method118();
		}
		if (arg0 == 4) {
			var3 = ObjType.method341(arg1).method346(50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			field130.method102((long) ((arg0 << 16) + arg1), var3);
		}
		return var3;
	}
}
