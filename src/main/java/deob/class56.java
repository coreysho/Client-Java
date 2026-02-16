package deob;

@ObfuscatedName("dc")
public final class class56 {

	@ObfuscatedName("dc.a")
	public final byte field915 = 6;

	@ObfuscatedName("dc.b")
	public int field916;

	@ObfuscatedName("dc.c")
	public class53 field917;

	@ObfuscatedName("dc.d")
	public class53 field918;

	@ObfuscatedName("dc.e")
	public class53 field919;

	@ObfuscatedName("dc.f")
	public class53 field920;

	@ObfuscatedName("dc.g")
	public class53 field921;

	@ObfuscatedName("dc.h")
	public class53 field922;

	@ObfuscatedName("dc.i")
	public class53 field923;

	@ObfuscatedName("dc.j")
	public class53 field924;

	@ObfuscatedName("dc.k")
	public final int[] field925 = new int[5];

	@ObfuscatedName("dc.l")
	public final int[] field926 = new int[5];

	@ObfuscatedName("dc.m")
	public final int[] field927 = new int[5];

	@ObfuscatedName("dc.n")
	public int field928;

	@ObfuscatedName("dc.o")
	public int field929 = 100;

	@ObfuscatedName("dc.p")
	public class54 field930;

	@ObfuscatedName("dc.q")
	public class53 field931;

	@ObfuscatedName("dc.r")
	public int field932 = 500;

	@ObfuscatedName("dc.s")
	public int field933;

	@ObfuscatedName("dc.t")
	public static int[] field934;

	@ObfuscatedName("dc.u")
	public static int[] field935;

	@ObfuscatedName("dc.v")
	public static int[] field936;

	@ObfuscatedName("dc.w")
	public static final int[] field937 = new int[5];

	@ObfuscatedName("dc.x")
	public static final int[] field938 = new int[5];

	@ObfuscatedName("dc.y")
	public static final int[] field939 = new int[5];

	@ObfuscatedName("dc.z")
	public static final int[] field940 = new int[5];

	@ObfuscatedName("dc.A")
	public static final int[] field941 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static void method319() {
		field935 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field935[var0] = 1;
			} else {
				field935[var0] = -1;
			}
		}
		field936 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field936[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		field934 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public int[] method320(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field934[var3] = 0;
		}
		if (arg1 < 10) {
			return field934;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field917.method306();
		this.field918.method306();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.field919 != null) {
			this.field919.method306();
			this.field920.method306();
			var6 = (int) ((double) (this.field919.field886 - this.field919.field885) * 32.768D / var4);
			var7 = (int) ((double) this.field919.field885 * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.field921 != null) {
			this.field921.method306();
			this.field922.method306();
			var9 = (int) ((double) (this.field921.field886 - this.field921.field885) * 32.768D / var4);
			var10 = (int) ((double) this.field921.field885 * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field925[var12] != 0) {
				field937[var12] = 0;
				field938[var12] = (int) ((double) this.field927[var12] * var4);
				field939[var12] = (this.field925[var12] << 14) / 100;
				field940[var12] = (int) ((double) (this.field917.field886 - this.field917.field885) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field926[var12]) / var4);
				field941[var12] = (int) ((double) this.field917.field885 * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.field917.method307(arg0);
			int var15 = this.field918.method307(arg0);
			if (this.field919 != null) {
				int var16 = this.field919.method307(arg0);
				int var17 = this.field920.method307(arg0);
				var14 += this.method321(this.field919.field887, var8, var17) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (this.field921 != null) {
				int var18 = this.field921.method307(arg0);
				int var19 = this.field922.method307(arg0);
				var15 = var15 * ((this.method321(this.field921.field887, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field925[var20] != 0) {
					int var21 = var13 + field938[var20];
					if (var21 < arg0) {
						field934[var21] += this.method321(this.field917.field887, field937[var20], var15 * field939[var20] >> 15);
						field937[var20] += (var14 * field940[var20] >> 16) + field941[var20];
					}
				}
			}
		}
		if (this.field923 != null) {
			this.field923.method306();
			this.field924.method306();
			int var22 = 0;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = this.field923.method307(arg0);
				int var26 = this.field924.method307(arg0);
				int var27;
				if (var23) {
					var27 = this.field923.field885 + ((this.field923.field886 - this.field923.field885) * var25 >> 8);
				} else {
					var27 = this.field923.field885 + ((this.field923.field886 - this.field923.field885) * var26 >> 8);
				}
				var22 += 256;
				if (var22 >= var27) {
					var22 = 0;
					var23 = !var23;
				}
				if (var23) {
					field934[var24] = 0;
				}
			}
		}
		if (this.field928 > 0 && this.field929 > 0) {
			int var28 = (int) ((double) this.field928 * var4);
			for (int var29 = var28; var29 < arg0; var29++) {
				field934[var29] += field934[var29 - var28] * this.field929 / 100;
			}
		}
		if (this.field930.field897[0] > 0 || this.field930.field897[1] > 0) {
			this.field931.method306();
			int var30 = this.field931.method307(arg0 + 1);
			int var31 = this.field930.method311(0, (float) var30 / 65536.0F);
			int var32 = this.field930.method311(1, (float) var30 / 65536.0F);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) field934[var33 + var31] * (long) class54.field904 >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) field934[var33 + var31 - var36 - 1] * (long) class54.field902[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) field934[var33 - var37 - 1] * (long) class54.field902[1][var37] >> 16);
					}
					field934[var33] = var35;
					var30 = this.field931.method307(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) field934[var33 + var31] * (long) class54.field904 >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) field934[var33 + var31 - var40 - 1] * (long) class54.field902[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) field934[var33 - var41 - 1] * (long) class54.field902[1][var41] >> 16);
						}
						field934[var33] = var39;
						var30 = this.field931.method307(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var33 + var31 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) field934[var33 + var31 - var43 - 1] * (long) class54.field902[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) field934[var33 - var44 - 1] * (long) class54.field902[1][var44] >> 16);
							}
							field934[var33] = var42;
							this.field931.method307(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = this.field930.method311(0, (float) var30 / 65536.0F);
					var32 = this.field930.method311(1, (float) var30 / 65536.0F);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (field934[var46] < -32768) {
				field934[var46] = -32768;
			}
			if (field934[var46] > 32767) {
				field934[var46] = 32767;
			}
		}
		return field934;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public int method321(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
		} else if (arg0 == 2) {
			return field936[arg1 & 0x7FFF] * arg2 >> 14;
		} else if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		} else if (arg0 == 4) {
			return field935[arg1 / 2607 & 0x7FFF] * arg2;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(BLlb;)V")
	public void method322(class38 arg0) {
		this.field917 = new class53();
		this.field917.method304(arg0);
		this.field918 = new class53();
		this.field918.method304(arg0);
		int var2 = arg0.method224();
		if (var2 != 0) {
			arg0.field709--;
			this.field919 = new class53();
			this.field919.method304(arg0);
			this.field920 = new class53();
			this.field920.method304(arg0);
		}
		int var3 = arg0.method224();
		if (var3 != 0) {
			arg0.field709--;
			this.field921 = new class53();
			this.field921.method304(arg0);
			this.field922 = new class53();
			this.field922.method304(arg0);
		}
		int var4 = arg0.method224();
		if (var4 != 0) {
			arg0.field709--;
			this.field923 = new class53();
			this.field923.method304(arg0);
			this.field924 = new class53();
			this.field924.method304(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method238();
			if (var6 == 0) {
				break;
			}
			this.field925[var5] = var6;
			this.field926[var5] = arg0.method237();
			this.field927[var5] = arg0.method238();
		}
		this.field928 = arg0.method238();
		this.field929 = arg0.method238();
		this.field932 = arg0.method226();
		this.field933 = arg0.method226();
		this.field930 = new class54();
		this.field931 = new class53();
		this.field930.method312(arg0, this.field915, this.field931);
	}
}
