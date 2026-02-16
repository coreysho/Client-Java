package deob;

@ObfuscatedName("gb")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("gb.i")
	public static final boolean field612 = true;

	@ObfuscatedName("gb.j")
	public static int field613;

	@ObfuscatedName("gb.k")
	public static final int field614 = 436;

	@ObfuscatedName("gb.l")
	public static int[] field615;

	@ObfuscatedName("gb.m")
	public static int field616;

	@ObfuscatedName("gb.n")
	public static int field617;

	@ObfuscatedName("gb.o")
	public static int field618;

	@ObfuscatedName("gb.p")
	public static int field619;

	@ObfuscatedName("gb.q")
	public static int field620;

	@ObfuscatedName("gb.r")
	public static int field621;

	@ObfuscatedName("gb.s")
	public static int field622;

	@ObfuscatedName("gb.t")
	public static int field623;

	@ObfuscatedName("gb.u")
	public static int field624;

	@ObfuscatedName("gb.a(II[II)V")
	public static void method151(int arg0, int arg1, int[] arg2) {
		field615 = arg2;
		field616 = arg0;
		field617 = arg1;
		method153(arg1, arg0, 0, 0);
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method152() {
		field620 = 0;
		field618 = 0;
		field621 = field616;
		field619 = field617;
		field622 = field621 - 1;
		field623 = field621 / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method153(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg1 > field616) {
			arg1 = field616;
		}
		if (arg0 > field617) {
			arg0 = field617;
		}
		field620 = arg2;
		field618 = arg3;
		field621 = arg1;
		field619 = arg0;
		field622 = field621 - 1;
		field623 = field621 / 2;
		field624 = field619 / 2;
	}

	@ObfuscatedName("gb.a(I)V")
	public static void method154() {
		int var0 = field616 * field617;
		for (int var1 = 0; var1 < var0; var1++) {
			field615[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field620) {
			arg0 -= field620 - arg4;
			arg4 = field620;
		}
		if (arg2 < field618) {
			arg1 -= field618 - arg2;
			arg2 = field618;
		}
		if (arg4 + arg0 > field621) {
			arg0 = field621 - arg4;
		}
		if (arg2 + arg1 > field619) {
			arg1 = field619 - arg2;
		}
		int var6 = 256 - arg5;
		int var7 = (arg3 >> 16 & 0xFF) * arg5;
		int var8 = (arg3 >> 8 & 0xFF) * arg5;
		int var9 = (arg3 & 0xFF) * arg5;
		int var10 = field616 - arg0;
		int var11 = arg4 + arg2 * field616;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field615[var11] >> 16 & 0xFF) * var6;
				int var15 = (field615[var11] >> 8 & 0xFF) * var6;
				int var16 = (field615[var11] & 0xFF) * var6;
				int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
				field615[var11++] = var17;
			}
			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field620) {
			arg2 -= field620 - arg3;
			arg3 = field620;
		}
		if (arg4 < field618) {
			arg0 -= field618 - arg4;
			arg4 = field618;
		}
		if (arg3 + arg2 > field621) {
			arg2 = field621 - arg3;
		}
		if (arg4 + arg0 > field619) {
			arg0 = field619 - arg4;
		}
		int var5 = field616 - arg2;
		int var6 = arg3 + arg4 * field616;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field615[var6++] = arg1;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method159(arg0, arg1, arg3, arg4);
		method159(arg0, arg1, arg3, arg4 + arg2 - 1);
		method161(arg1, arg2, arg3, arg4);
		method161(arg1, arg2, arg3 + arg0 - 1, arg4);
	}

	@ObfuscatedName("gb.a(IZIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method160(arg0, arg1, arg5, arg2, field613, arg3);
		method160(arg0, arg1 + arg4 - 1, arg5, arg2, field613, arg3);
		if (arg4 >= 3) {
			method162(arg2, arg4 - 2, arg1 + 1, arg3, arg5);
			method162(arg2 + arg0 - 1, arg4 - 2, arg1 + 1, arg3, arg5);
		}
	}

	@ObfuscatedName("gb.a(IIIBI)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < field618 || arg3 >= field619) {
			return;
		}
		if (arg2 < field620) {
			arg0 -= field620 - arg2;
			arg2 = field620;
		}
		if (arg2 + arg0 > field621) {
			arg0 = field621 - arg2;
		}
		int var4 = arg2 + arg3 * field616;
		for (int var5 = 0; var5 < arg0; var5++) {
			field615[var4 + var5] = arg1;
		}
	}

	@ObfuscatedName("gb.c(IIIIII)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field618 || arg1 >= field619) {
			return;
		}
		if (arg3 < field620) {
			arg0 -= field620 - arg3;
			arg3 = field620;
		}
		if (arg3 + arg0 > field621) {
			arg0 = field621 - arg3;
		}
		int var6 = 256 - arg2;
		int var7 = (arg5 >> 16 & 0xFF) * arg2;
		int var8 = (arg5 >> 8 & 0xFF) * arg2;
		int var9 = (arg5 & 0xFF) * arg2;
		int var10 = arg3 + arg1 * field616;
		for (int var11 = 0; var11 < arg0; var11++) {
			int var12 = (field615[var10] >> 16 & 0xFF) * var6;
			int var13 = (field615[var10] >> 8 & 0xFF) * var6;
			int var14 = (field615[var10] & 0xFF) * var6;
			int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
			field615[var10++] = var15;
		}
		if (arg4 < 0 || arg4 > 0) {
			;
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < field620 || arg2 >= field621) {
			return;
		}
		if (arg3 < field618) {
			arg1 -= field618 - arg3;
			arg3 = field618;
		}
		if (arg3 + arg1 > field619) {
			arg1 = field619 - arg3;
		}
		int var4 = arg2 + arg3 * field616;
		for (int var5 = 0; var5 < arg1; var5++) {
			field615[var4 + var5 * field616] = arg0;
		}
	}

	@ObfuscatedName("gb.a(IIIZII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field620 || arg0 >= field621) {
			return;
		}
		if (arg2 < field618) {
			arg1 -= field618 - arg2;
			arg2 = field618;
		}
		if (arg2 + arg1 > field619) {
			arg1 = field619 - arg2;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg2 * field616;
		for (int var10 = 0; var10 < arg1; var10++) {
			int var11 = (field615[var9] >> 16 & 0xFF) * var5;
			int var12 = (field615[var9] >> 8 & 0xFF) * var5;
			int var13 = (field615[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			field615[var9] = var14;
			var9 += field616;
		}
	}
}
