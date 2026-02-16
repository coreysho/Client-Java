package deob;

@ObfuscatedName("g")
public final class AnimFrame {

	@ObfuscatedName("g.a")
	public static AnimFrame[] field148;

	@ObfuscatedName("g.b")
	public int field149;

	@ObfuscatedName("g.c")
	public AnimBase field150;

	@ObfuscatedName("g.d")
	public int field151;

	@ObfuscatedName("g.e")
	public int[] field152;

	@ObfuscatedName("g.f")
	public int[] field153;

	@ObfuscatedName("g.g")
	public int[] field154;

	@ObfuscatedName("g.h")
	public int[] field155;

	@ObfuscatedName("g.i")
	public static boolean[] field156;

	@ObfuscatedName("g.a(I)V")
	public static void method44(int arg0) {
		field148 = new AnimFrame[arg0 + 1];
		field156 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field156[var1] = true;
		}
	}

	@ObfuscatedName("g.a(I[B)V")
	public static void method45(byte[] arg0) {
		Packet var1 = new Packet(arg0, (byte) 1);
		var1.field709 = arg0.length - 8;
		int var2 = var1.method226();
		int var3 = var1.method226();
		int var4 = var1.method226();
		int var5 = var1.method226();
		Packet var6 = new Packet(arg0, (byte) 1);
		var6.field709 = 0;
		int var7 = var2 + 2;
		Packet var8 = new Packet(arg0, (byte) 1);
		var8.field709 = var7;
		int var9 = var7 + var3;
		Packet var10 = new Packet(arg0, (byte) 1);
		var10.field709 = var9;
		int var11 = var9 + var4;
		Packet var12 = new Packet(arg0, (byte) 1);
		var12.field709 = var11;
		int var13 = var11 + var5;
		Packet var14 = new Packet(arg0, (byte) 1);
		var14.field709 = var13;
		AnimBase var15 = new AnimBase(10470, var14);
		int var16 = var6.method226();
		int[] var17 = new int[500];
		int[] var18 = new int[500];
		int[] var19 = new int[500];
		int[] var20 = new int[500];
		for (int var21 = 0; var21 < var16; var21++) {
			int var22 = var6.method226();
			AnimFrame var23 = field148[var22] = new AnimFrame();
			var23.field149 = var12.method224();
			var23.field150 = var15;
			int var24 = var6.method224();
			int var25 = -1;
			int var26 = 0;
			for (int var27 = 0; var27 < var24; var27++) {
				int var28 = var8.method224();
				if (var28 > 0) {
					if (var15.field146[var27] != 0) {
						for (int var29 = var27 - 1; var29 > var25; var29--) {
							if (var15.field146[var29] == 0) {
								var17[var26] = var29;
								var18[var26] = 0;
								var19[var26] = 0;
								var20[var26] = 0;
								var26++;
								break;
							}
						}
					}
					var17[var26] = var27;
					short var30 = 0;
					if (var15.field146[var27] == 3) {
						var30 = 128;
					}
					if ((var28 & 0x1) == 0) {
						var18[var26] = var30;
					} else {
						var18[var26] = var10.method237();
					}
					if ((var28 & 0x2) == 0) {
						var19[var26] = var30;
					} else {
						var19[var26] = var10.method237();
					}
					if ((var28 & 0x4) == 0) {
						var20[var26] = var30;
					} else {
						var20[var26] = var10.method237();
					}
					var25 = var27;
					var26++;
					if (var15.field146[var27] == 5) {
						field156[var22] = false;
					}
				}
			}
			var23.field151 = var26;
			var23.field152 = new int[var26];
			var23.field153 = new int[var26];
			var23.field154 = new int[var26];
			var23.field155 = new int[var26];
			for (int var31 = 0; var31 < var26; var31++) {
				var23.field152[var31] = var17[var31];
				var23.field153[var31] = var18[var31];
				var23.field154[var31] = var19[var31];
				var23.field155[var31] = var20[var31];
			}
		}
	}

	@ObfuscatedName("g.a(B)V")
	public static void method46() {
		field148 = null;
	}

	@ObfuscatedName("g.a(II)Lg;")
	public static AnimFrame method47(int arg0) {
		return field148 == null ? null : field148[arg0];
	}

	@ObfuscatedName("g.b(II)Z")
	public static boolean method48(int arg0) {
		return arg0 == -1;
	}
}
