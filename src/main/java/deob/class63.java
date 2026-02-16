package deob;

@ObfuscatedName("kc")
public final class class63 {

	@ObfuscatedName("kc.a")
	public final boolean field1095 = true;

	@ObfuscatedName("kc.b")
	public final int field1096 = -186;

	@ObfuscatedName("kc.c")
	public static int field1097;

	@ObfuscatedName("kc.d")
	public static class63[] field1098;

	@ObfuscatedName("kc.e")
	public int field1099;

	@ObfuscatedName("kc.f")
	public int field1100 = -1;

	@ObfuscatedName("kc.g")
	public boolean field1101 = false;

	@ObfuscatedName("kc.h")
	public boolean field1102 = true;

	@ObfuscatedName("kc.i")
	public String field1103;

	@ObfuscatedName("kc.j")
	public int field1104;

	@ObfuscatedName("kc.k")
	public int field1105;

	@ObfuscatedName("kc.l")
	public int field1106;

	@ObfuscatedName("kc.m")
	public int field1107;

	@ObfuscatedName("kc.n")
	public int field1108;

	@ObfuscatedName("kc.o")
	public int field1109;

	@ObfuscatedName("kc.a(ZLxb;)V")
	public static void method364(class50 arg0) {
		class38 var1 = new class38(arg0.method294("flo.dat", null), (byte) 1);
		field1097 = var1.method226();
		if (field1098 == null) {
			field1098 = new class63[field1097];
		}
		for (int var2 = 0; var2 < field1097; var2++) {
			if (field1098[var2] == null) {
				field1098[var2] = new class63();
			}
			field1098[var2].method365(var1);
		}
	}

	@ObfuscatedName("kc.a(BLlb;)V")
	public void method365(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field1099 = arg0.method228();
				this.method366(this.field1099);
			} else if (var2 == 2) {
				this.field1100 = arg0.method224();
			} else if (var2 == 3) {
				this.field1101 = true;
			} else if (var2 == 5) {
				this.field1102 = false;
			} else if (var2 == 6) {
				this.field1103 = arg0.method231();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method366(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.field1104 = (int) (var18 * 256.0D);
		this.field1105 = (int) (var14 * 256.0D);
		this.field1106 = (int) (var16 * 256.0D);
		if (this.field1105 < 0) {
			this.field1105 = 0;
		} else if (this.field1105 > 255) {
			this.field1105 = 255;
		}
		if (this.field1106 < 0) {
			this.field1106 = 0;
		} else if (this.field1106 > 255) {
			this.field1106 = 255;
		}
		if (var16 > 0.5D) {
			this.field1108 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.field1108 = (int) (var16 * var14 * 512.0D);
		}
		if (this.field1108 < 1) {
			this.field1108 = 1;
		}
		this.field1107 = (int) (var18 * (double) this.field1108);
		int var20 = this.field1104 + (int) (Math.random() * 16.0D) - 8;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}
		int var21 = this.field1105 + (int) (Math.random() * 48.0D) - 24;
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		int var22 = this.field1106 + (int) (Math.random() * 48.0D) - 24;
		if (var22 < 0) {
			var22 = 0;
		} else if (var22 > 255) {
			var22 = 255;
		}
		this.field1109 = this.method367(var20, var21, var22);
	}

	@ObfuscatedName("kc.a(III)I")
	public int method367(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
