package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.a")
	public final int field996 = -32952;

	@ObfuscatedName("gc.b")
	public static final boolean field997 = true;

	@ObfuscatedName("gc.c")
	public static int field998;

	@ObfuscatedName("gc.d")
	public static int[] field999;

	@ObfuscatedName("gc.e")
	public static class38 field1000;

	@ObfuscatedName("gc.f")
	public static class59[] field1001;

	@ObfuscatedName("gc.g")
	public static int field1002;

	@ObfuscatedName("gc.h")
	public long field1003 = -1L;

	@ObfuscatedName("gc.i")
	public String field1004;

	@ObfuscatedName("gc.j")
	public byte[] field1005;

	@ObfuscatedName("gc.k")
	public byte field1006 = 1;

	@ObfuscatedName("gc.l")
	public int[] field1007;

	@ObfuscatedName("gc.m")
	public int[] field1008;

	@ObfuscatedName("gc.n")
	public int field1009 = -1;

	@ObfuscatedName("gc.o")
	public int field1010 = -1;

	@ObfuscatedName("gc.p")
	public int field1011 = -1;

	@ObfuscatedName("gc.q")
	public int field1012 = -1;

	@ObfuscatedName("gc.r")
	public int field1013 = -1;

	@ObfuscatedName("gc.s")
	public int[] field1014;

	@ObfuscatedName("gc.t")
	public int[] field1015;

	@ObfuscatedName("gc.u")
	public String[] field1016;

	@ObfuscatedName("gc.v")
	public int field1017 = -1;

	@ObfuscatedName("gc.w")
	public int field1018 = -1;

	@ObfuscatedName("gc.x")
	public int field1019 = -1;

	@ObfuscatedName("gc.y")
	public boolean field1020 = true;

	@ObfuscatedName("gc.z")
	public int field1021 = -1;

	@ObfuscatedName("gc.H")
	public static class19 field1029 = new class19(30, 0);

	@ObfuscatedName("gc.A")
	public int field1022 = 128;

	@ObfuscatedName("gc.B")
	public int field1023 = 128;

	@ObfuscatedName("gc.C")
	public boolean field1024 = false;

	@ObfuscatedName("gc.F")
	public int field1027 = -1;

	@ObfuscatedName("gc.G")
	public int field1028 = 32;

	@ObfuscatedName("gc.D")
	public int field1025;

	@ObfuscatedName("gc.E")
	public int field1026;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static void method333(class50 arg0) {
		field1000 = new class38(arg0.method294("npc.dat", null), (byte) 1);
		class38 var1 = new class38(arg0.method294("npc.idx", null), (byte) 1);
		field998 = var1.method226();
		field999 = new int[field998];
		int var2 = 2;
		for (int var3 = 0; var3 < field998; var3++) {
			field999[var3] = var2;
			var2 += var1.method226();
		}
		field1001 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1001[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static void method334() {
		field1029 = null;
		field999 = null;
		field1001 = null;
		field1000 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static class59 method335(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1001[var1].field1003 == (long) arg0) {
				return field1001[var1];
			}
		}
		field1002 = (field1002 + 1) % 20;
		class59 var2 = field1001[field1002] = new class59();
		field1000.field709 = field999[arg0];
		var2.field1003 = arg0;
		var2.method336(field1000);
		return var2;
	}

	@ObfuscatedName("gc.a(BLlb;)V")
	public void method336(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.method224();
				this.field1007 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.field1007[var4] = arg0.method226();
				}
			} else if (var2 == 2) {
				this.field1004 = arg0.method231();
			} else if (var2 == 3) {
				this.field1005 = arg0.method232(this.field996);
			} else if (var2 == 12) {
				this.field1006 = arg0.method225();
			} else if (var2 == 13) {
				this.field1009 = arg0.method226();
			} else if (var2 == 14) {
				this.field1010 = arg0.method226();
			} else if (var2 == 17) {
				this.field1010 = arg0.method226();
				this.field1011 = arg0.method226();
				this.field1012 = arg0.method226();
				this.field1013 = arg0.method226();
			} else if (var2 >= 30 && var2 < 40) {
				if (this.field1016 == null) {
					this.field1016 = new String[5];
				}
				this.field1016[var2 - 30] = arg0.method231();
				if (this.field1016[var2 - 30].equalsIgnoreCase("hidden")) {
					this.field1016[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method224();
				this.field1014 = new int[var5];
				this.field1015 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1014[var6] = arg0.method226();
					this.field1015[var6] = arg0.method226();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method224();
				this.field1008 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					this.field1008[var8] = arg0.method226();
				}
			} else if (var2 == 90) {
				this.field1017 = arg0.method226();
			} else if (var2 == 91) {
				this.field1018 = arg0.method226();
			} else if (var2 == 92) {
				this.field1019 = arg0.method226();
			} else if (var2 == 93) {
				this.field1020 = false;
			} else if (var2 == 95) {
				this.field1021 = arg0.method226();
			} else if (var2 == 97) {
				this.field1022 = arg0.method226();
			} else if (var2 == 98) {
				this.field1023 = arg0.method226();
			} else if (var2 == 99) {
				this.field1024 = true;
			} else if (var2 == 100) {
				this.field1025 = arg0.method225();
			} else if (var2 == 101) {
				this.field1026 = arg0.method225() * 5;
			} else if (var2 == 102) {
				this.field1027 = arg0.method226();
			} else if (var2 == 103) {
				this.field1028 = arg0.method226();
			}
		}
	}

	@ObfuscatedName("gc.a(III[I)Leb;")
	public class31 method337(int arg0, int arg1, int[] arg2) {
		class31 var4 = (class31) field1029.method101(this.field1003);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < this.field1007.length; var6++) {
				if (!class31.method126(this.field1007[var6])) {
					var5 = true;
				}
			}
			if (var5) {
				return null;
			}
			class31[] var7 = new class31[this.field1007.length];
			for (int var8 = 0; var8 < this.field1007.length; var8++) {
				var7[var8] = class31.method125(this.field1007[var8]);
			}
			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class31(var7.length, -643, var7);
			}
			if (this.field1014 != null) {
				for (int var9 = 0; var9 < this.field1014.length; var9++) {
					var4.method139(this.field1014[var9], this.field1015[var9]);
				}
			}
			var4.method132();
			var4.method142(this.field1025 + 64, this.field1026 + 850, -30, -50, -30, true);
			field1029.method102(this.field1003, var4);
		}
		class31 var10 = class31.field531;
		var10.method127(var4, class7.method48(arg0) & class7.method48(arg1));
		if (arg0 != -1 && arg1 != -1) {
			var10.method134(arg2, arg0, arg1);
		} else if (arg0 != -1) {
			var10.method133(arg0);
		}
		if (this.field1022 != 128 || this.field1023 != 128) {
			var10.method141(this.field1022, this.field1022, this.field1023);
		}
		var10.method129();
		var10.field568 = null;
		var10.field567 = null;
		if (this.field1006 == 1) {
			var10.field569 = true;
		}
		return var10;
	}

	@ObfuscatedName("gc.b(B)Leb;")
	public class31 method338() {
		if (this.field1008 == null) {
			return null;
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < this.field1008.length; var2++) {
			if (!class31.method126(this.field1008[var2])) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		class31[] var3 = new class31[this.field1008.length];
		for (int var4 = 0; var4 < this.field1008.length; var4++) {
			var3[var4] = class31.method125(this.field1008[var4]);
		}
		class31 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class31(var3.length, -643, var3);
		}
		if (this.field1014 != null) {
			for (int var6 = 0; var6 < this.field1014.length; var6++) {
				var5.method139(this.field1014[var6], this.field1015[var6]);
			}
		}
		return var5;
	}
}
