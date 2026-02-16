package deob;

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
	public static int field1034;

	@ObfuscatedName("hc.f")
	public static int[] field1035;

	@ObfuscatedName("hc.g")
	public static Packet field1036;

	@ObfuscatedName("hc.h")
	public static ObjType[] field1037;

	@ObfuscatedName("hc.i")
	public static int field1038;

	@ObfuscatedName("hc.j")
	public static boolean field1039 = true;

	@ObfuscatedName("hc.k")
	public int field1040 = -1;

	@ObfuscatedName("hc.l")
	public int field1041;

	@ObfuscatedName("hc.m")
	public String field1042;

	@ObfuscatedName("hc.n")
	public byte[] field1043;

	@ObfuscatedName("hc.o")
	public int[] field1044;

	@ObfuscatedName("hc.p")
	public int[] field1045;

	@ObfuscatedName("hc.q")
	public int field1046;

	@ObfuscatedName("hc.r")
	public int field1047;

	@ObfuscatedName("hc.s")
	public int field1048;

	@ObfuscatedName("hc.t")
	public int field1049;

	@ObfuscatedName("hc.u")
	public int field1050;

	@ObfuscatedName("hc.v")
	public int field1051;

	@ObfuscatedName("hc.w")
	public int field1052;

	@ObfuscatedName("hc.x")
	public boolean field1053;

	@ObfuscatedName("hc.y")
	public int field1054;

	@ObfuscatedName("hc.z")
	public boolean field1055;

	@ObfuscatedName("hc.X")
	public static LruCache field1079 = new LruCache(50, 0);

	@ObfuscatedName("hc.Y")
	public static LruCache field1080 = new LruCache(100, 0);

	@ObfuscatedName("hc.E")
	public byte field1060;

	@ObfuscatedName("hc.H")
	public byte field1063;

	@ObfuscatedName("hc.C")
	public int field1058;

	@ObfuscatedName("hc.D")
	public int field1059;

	@ObfuscatedName("hc.F")
	public int field1061;

	@ObfuscatedName("hc.G")
	public int field1062;

	@ObfuscatedName("hc.I")
	public int field1064;

	@ObfuscatedName("hc.J")
	public int field1065;

	@ObfuscatedName("hc.K")
	public int field1066;

	@ObfuscatedName("hc.L")
	public int field1067;

	@ObfuscatedName("hc.M")
	public int field1068;

	@ObfuscatedName("hc.N")
	public int field1069;

	@ObfuscatedName("hc.Q")
	public int field1072;

	@ObfuscatedName("hc.R")
	public int field1073;

	@ObfuscatedName("hc.S")
	public int field1074;

	@ObfuscatedName("hc.T")
	public int field1075;

	@ObfuscatedName("hc.U")
	public int field1076;

	@ObfuscatedName("hc.V")
	public int field1077;

	@ObfuscatedName("hc.W")
	public int field1078;

	@ObfuscatedName("hc.O")
	public int[] field1070;

	@ObfuscatedName("hc.P")
	public int[] field1071;

	@ObfuscatedName("hc.A")
	public String[] field1056;

	@ObfuscatedName("hc.B")
	public String[] field1057;

	@ObfuscatedName("hc.a(Lxb;)V")
	public static void method339(JagFile arg0) {
		field1036 = new Packet(arg0.method294("obj.dat", null), (byte) 1);
		Packet var1 = new Packet(arg0.method294("obj.idx", null), (byte) 1);
		field1034 = var1.g2();
		field1035 = new int[field1034];
		int var2 = 2;
		for (int var3 = 0; var3 < field1034; var3++) {
			field1035[var3] = var2;
			var2 += var1.g2();
		}
		field1037 = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1037[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static void method340() {
		field1079 = null;
		field1080 = null;
		field1035 = null;
		field1037 = null;
		field1036 = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static ObjType method341(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1037[var1].field1040 == arg0) {
				return field1037[var1];
			}
		}
		field1038 = (field1038 + 1) % 10;
		ObjType var2 = field1037[field1038];
		field1036.data = field1035[arg0];
		var2.field1040 = arg0;
		var2.method342();
		var2.method343(field1036);
		if (var2.field1073 != -1) {
			var2.method344();
		}
		if (!field1039 && var2.field1055) {
			var2.field1042 = "Members Object";
			var2.field1043 = "Login to a members' server to use this object.".getBytes();
			var2.field1056 = null;
			var2.field1057 = null;
		}
		return var2;
	}

	@ObfuscatedName("hc.a(IIII)Lib;")
	public static Pix32 method347(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			Pix32 var3 = (Pix32) field1080.method101((long) arg0);
			if (var3 != null && var3.field667 != arg2 && var3.field667 != -1) {
				var3.method106();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		ObjType var4 = method341(arg0);
		if (var4.field1070 == null) {
			arg2 = -1;
		}
		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field1071[var6] && var4.field1071[var6] != 0) {
					var5 = var4.field1070[var6];
				}
			}
			if (var5 != -1) {
				var4 = method341(var5);
			}
		}
		Model var7 = var4.method345(1);
		if (var7 == null) {
			return null;
		}
		Pix32 var8 = null;
		if (var4.field1073 != -1) {
			var8 = method347(var4.field1072, -1, 10);
			if (var8 == null) {
				return null;
			}
		}
		Pix32 var9 = new Pix32(32, 32);
		int var10 = Pix3D.field633;
		int var11 = Pix3D.field634;
		int[] var12 = Pix3D.field639;
		int[] var13 = Pix2D.field615;
		int var14 = Pix2D.field616;
		int var15 = Pix2D.field617;
		int var16 = Pix2D.field620;
		int var17 = Pix2D.field621;
		int var18 = Pix2D.field618;
		int var19 = Pix2D.field619;
		Pix3D.field631 = false;
		Pix2D.method151(32, 32, var9.field661);
		Pix2D.method156(32, 0, 32, 0, 0);
		Pix3D.method164();
		int var20 = var4.field1046;
		if (arg1 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg1 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		int var21 = Pix3D.field637[var4.field1047] * var20 >> 16;
		int var22 = Pix3D.field638[var4.field1047] * var20 >> 16;
		var7.method145(var4.field1048, var4.field1049, var4.field1047, var4.field1050, var21 + var7.field394 / 2 + var4.field1051, var22 + var4.field1051);
		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field661[var23 + var24 * 32] == 0) {
					if (var23 > 0 && var9.field661[var23 + var24 * 32 - 1] > 1) {
						var9.field661[var23 + var24 * 32] = 1;
					} else if (var24 > 0 && var9.field661[var23 + (var24 - 1) * 32] > 1) {
						var9.field661[var23 + var24 * 32] = 1;
					} else if (var23 < 31 && var9.field661[var23 + var24 * 32 + 1] > 1) {
						var9.field661[var23 + var24 * 32] = 1;
					} else if (var24 < 31 && var9.field661[var23 + (var24 + 1) * 32] > 1) {
						var9.field661[var23 + var24 * 32] = 1;
					}
				}
			}
		}
		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field661[var25 + var26 * 32] == 0) {
						if (var25 > 0 && var9.field661[var25 + var26 * 32 - 1] == 1) {
							var9.field661[var25 + var26 * 32] = arg1;
						} else if (var26 > 0 && var9.field661[var25 + (var26 - 1) * 32] == 1) {
							var9.field661[var25 + var26 * 32] = arg1;
						} else if (var25 < 31 && var9.field661[var25 + var26 * 32 + 1] == 1) {
							var9.field661[var25 + var26 * 32] = arg1;
						} else if (var26 < 31 && var9.field661[var25 + (var26 + 1) * 32] == 1) {
							var9.field661[var25 + var26 * 32] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field661[var27 + var28 * 32] == 0 && var27 > 0 && var28 > 0 && var9.field661[var27 + (var28 - 1) * 32 - 1] > 0) {
						var9.field661[var27 + var28 * 32] = 3153952;
					}
				}
			}
		}
		if (var4.field1073 != -1) {
			int var29 = var8.field666;
			int var30 = var8.field667;
			var8.field666 = 32;
			var8.field667 = 32;
			var8.method185(field1031, 0, 0);
			var8.field666 = var29;
			var8.field667 = var30;
		}
		if (arg1 == 0) {
			field1080.method102((long) arg0, var9);
		}
		Pix2D.method151(var14, var15, var13);
		Pix2D.method153(var19, var17, var16, var18);
		Pix3D.field633 = var10;
		Pix3D.field634 = var11;
		Pix3D.field639 = var12;
		Pix3D.field631 = true;
		if (var4.field1053) {
			var9.field666 = 33;
		} else {
			var9.field666 = 32;
		}
		var9.field667 = arg2;
		return var9;
	}

	@ObfuscatedName("hc.a()V")
	public void method342() {
		this.field1041 = 0;
		this.field1042 = null;
		this.field1043 = null;
		this.field1044 = null;
		this.field1045 = null;
		this.field1046 = 2000;
		this.field1047 = 0;
		this.field1048 = 0;
		this.field1049 = 0;
		this.field1050 = 0;
		this.field1051 = 0;
		this.field1052 = -1;
		this.field1053 = false;
		this.field1054 = 1;
		this.field1055 = false;
		this.field1056 = null;
		this.field1057 = null;
		this.field1058 = -1;
		this.field1059 = -1;
		this.field1060 = 0;
		this.field1061 = -1;
		this.field1062 = -1;
		this.field1063 = 0;
		this.field1064 = -1;
		this.field1065 = -1;
		this.field1066 = -1;
		this.field1067 = -1;
		this.field1068 = -1;
		this.field1069 = -1;
		this.field1070 = null;
		this.field1071 = null;
		this.field1072 = -1;
		this.field1073 = -1;
		this.field1074 = 128;
		this.field1075 = 128;
		this.field1076 = 128;
		this.field1077 = 0;
		this.field1078 = 0;
	}

	@ObfuscatedName("hc.a(BLlb;)V")
	public void method343(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field1041 = arg0.g2();
			} else if (var2 == 2) {
				this.field1042 = arg0.gjstr();
			} else if (var2 == 3) {
				this.field1043 = arg0.gjstrraw(this.field1030);
			} else if (var2 == 4) {
				this.field1046 = arg0.g2();
			} else if (var2 == 5) {
				this.field1047 = arg0.g2();
			} else if (var2 == 6) {
				this.field1048 = arg0.g2();
			} else if (var2 == 7) {
				this.field1050 = arg0.g2();
				if (this.field1050 > 32767) {
					this.field1050 -= 65536;
				}
			} else if (var2 == 8) {
				this.field1051 = arg0.g2();
				if (this.field1051 > 32767) {
					this.field1051 -= 65536;
				}
			} else if (var2 == 10) {
				this.field1052 = arg0.g2();
			} else if (var2 == 11) {
				this.field1053 = true;
			} else if (var2 == 12) {
				this.field1054 = arg0.g4();
			} else if (var2 == 16) {
				this.field1055 = true;
			} else if (var2 == 23) {
				this.field1058 = arg0.g2();
				this.field1060 = arg0.g1b();
			} else if (var2 == 24) {
				this.field1059 = arg0.g2();
			} else if (var2 == 25) {
				this.field1061 = arg0.g2();
				this.field1063 = arg0.g1b();
			} else if (var2 == 26) {
				this.field1062 = arg0.g2();
			} else if (var2 >= 30 && var2 < 35) {
				if (this.field1056 == null) {
					this.field1056 = new String[5];
				}
				this.field1056[var2 - 30] = arg0.gjstr();
				if (this.field1056[var2 - 30].equalsIgnoreCase("hidden")) {
					this.field1056[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (this.field1057 == null) {
					this.field1057 = new String[5];
				}
				this.field1057[var2 - 35] = arg0.gjstr();
			} else if (var2 == 40) {
				int var3 = arg0.g1();
				this.field1044 = new int[var3];
				this.field1045 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.field1044[var4] = arg0.g2();
					this.field1045[var4] = arg0.g2();
				}
			} else if (var2 == 78) {
				this.field1064 = arg0.g2();
			} else if (var2 == 79) {
				this.field1065 = arg0.g2();
			} else if (var2 == 90) {
				this.field1066 = arg0.g2();
			} else if (var2 == 91) {
				this.field1068 = arg0.g2();
			} else if (var2 == 92) {
				this.field1067 = arg0.g2();
			} else if (var2 == 93) {
				this.field1069 = arg0.g2();
			} else if (var2 == 95) {
				this.field1049 = arg0.g2();
			} else if (var2 == 97) {
				this.field1072 = arg0.g2();
			} else if (var2 == 98) {
				this.field1073 = arg0.g2();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field1070 == null) {
					this.field1070 = new int[10];
					this.field1071 = new int[10];
				}
				this.field1070[var2 - 100] = arg0.g2();
				this.field1071[var2 - 100] = arg0.g2();
			} else if (var2 == 110) {
				this.field1074 = arg0.g2();
			} else if (var2 == 111) {
				this.field1075 = arg0.g2();
			} else if (var2 == 112) {
				this.field1076 = arg0.g2();
			} else if (var2 == 113) {
				this.field1077 = arg0.g1b();
			} else if (var2 == 114) {
				this.field1078 = arg0.g1b() * 5;
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void method344() {
		ObjType var1 = method341(this.field1073);
		this.field1041 = var1.field1041;
		this.field1046 = var1.field1046;
		this.field1047 = var1.field1047;
		this.field1048 = var1.field1048;
		this.field1049 = var1.field1049;
		this.field1050 = var1.field1050;
		this.field1051 = var1.field1051;
		this.field1044 = var1.field1044;
		this.field1045 = var1.field1045;
		ObjType var2 = method341(this.field1072);
		this.field1042 = var2.field1042;
		this.field1055 = var2.field1055;
		this.field1054 = var2.field1054;
		String var3 = "a";
		char var4 = var2.field1042.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}
		this.field1043 = ("Swap this note at any bank for " + var3 + " " + var2.field1042 + ".").getBytes();
		this.field1053 = true;
	}

	@ObfuscatedName("hc.b(I)Leb;")
	public Model method345(int arg0) {
		if (this.field1070 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
					var2 = this.field1070[var3];
				}
			}
			if (var2 != -1) {
				return method341(var2).method345(1);
			}
		}
		Model var4 = (Model) field1079.method101((long) this.field1040);
		if (var4 != null) {
			return var4;
		}
		Model var5 = Model.method125(this.field1041);
		if (var5 == null) {
			return null;
		}
		if (this.field1074 != 128 || this.field1075 != 128 || this.field1076 != 128) {
			var5.method141(this.field1076, this.field1074, this.field1075);
		}
		if (this.field1044 != null) {
			for (int var6 = 0; var6 < this.field1044.length; var6++) {
				var5.method139(this.field1044[var6], this.field1045[var6]);
			}
		}
		var5.method142(this.field1077 + 64, this.field1078 + 768, -50, -10, -50, true);
		var5.field569 = true;
		field1079.method102((long) this.field1040, var5);
		return var5;
	}

	@ObfuscatedName("hc.a(BI)Leb;")
	public Model method346(int arg0) {
		if (this.field1070 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
					var2 = this.field1070[var3];
				}
			}
			if (var2 != -1) {
				return method341(var2).method346(1);
			}
		}
		Model var4 = Model.method125(this.field1041);
		if (var4 == null) {
			return null;
		}
		if (this.field1044 != null) {
			for (int var5 = 0; var5 < this.field1044.length; var5++) {
				var4.method139(this.field1044[var5], this.field1045[var5]);
			}
		}
		return var4;
	}

	@ObfuscatedName("hc.a(II)Z")
	public boolean method348(int arg0) {
		int var2 = this.field1058;
		int var3 = this.field1059;
		int var4 = this.field1064;
		if (arg0 == 1) {
			var2 = this.field1061;
			var3 = this.field1062;
			var4 = this.field1065;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!Model.method126(var2)) {
			var5 = false;
		}
		if (var3 != -1 && !Model.method126(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.method126(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("hc.b(II)Leb;")
	public Model method349(int arg0) {
		int var2 = this.field1058;
		int var3 = this.field1059;
		int var4 = this.field1064;
		if (arg0 == 1) {
			var2 = this.field1061;
			var3 = this.field1062;
			var4 = this.field1065;
		}
		if (var2 == -1) {
			return null;
		}
		Model var5 = Model.method125(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = Model.method125(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(2, -643, var10);
			} else {
				Model var6 = Model.method125(var3);
				Model var7 = Model.method125(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(3, -643, var8);
			}
		}
		if (arg0 == 0 && this.field1060 != 0) {
			var5.method138(0, this.field1060, 0);
		}
		if (arg0 == 1 && this.field1063 != 0) {
			var5.method138(0, this.field1063, 0);
		}
		if (this.field1044 != null) {
			for (int var11 = 0; var11 < this.field1044.length; var11++) {
				var5.method139(this.field1044[var11], this.field1045[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("hc.a(IB)Z")
	public boolean method350(int arg0) {
		int var2 = this.field1066;
		int var3 = this.field1067;
		if (arg0 == 1) {
			var2 = this.field1068;
			var3 = this.field1069;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!Model.method126(var2)) {
			var4 = false;
		}
		if (var3 != -1 && !Model.method126(var3)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("hc.a(ZI)Leb;")
	public Model method351(int arg0) {
		int var2 = this.field1066;
		int var3 = this.field1067;
		if (arg0 == 1) {
			var2 = this.field1068;
			var3 = this.field1069;
		}
		if (var2 == -1) {
			return null;
		}
		Model var4 = Model.method125(var2);
		if (var3 != -1) {
			Model var5 = Model.method125(var3);
			Model[] var6 = new Model[] { var4, var5 };
			var4 = new Model(2, -643, var6);
		}
		if (this.field1044 != null) {
			for (int var7 = 0; var7 < this.field1044.length; var7++) {
				var4.method139(this.field1044[var7], this.field1045[var7]);
			}
		}
		return var4;
	}
}
