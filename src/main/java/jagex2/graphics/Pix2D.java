package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("gb")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("gb.i")
	public static final boolean field612 = true;

	@ObfuscatedName("gb.j")
	public static int field613;

	@ObfuscatedName("gb.k")
	public static final int field614 = 436;

	@ObfuscatedName("gb.l")
	public static int[] pixels;

	@ObfuscatedName("gb.m")
	public static int width;

	@ObfuscatedName("gb.n")
	public static int height;

	@ObfuscatedName("gb.o")
	public static int clipMinY;

	@ObfuscatedName("gb.p")
	public static int clipMaxY;

	@ObfuscatedName("gb.q")
	public static int clipMinX;

	@ObfuscatedName("gb.r")
	public static int clipMaxX;

	@ObfuscatedName("gb.s")
	public static int sizeX;

	@ObfuscatedName("gb.t")
	public static int maxX;

	@ObfuscatedName("gb.u")
	public static int maxY;

	@ObfuscatedName("gb.a(II[II)V")
	public static void setPixels(int arg0, int arg1, int[] arg2) {
		pixels = arg2;
		width = arg0;
		height = arg1;
		setClipping(arg1, arg0, 0, 0);
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg1 > width) {
			arg1 = width;
		}
		if (arg0 > height) {
			arg0 = height;
		}
		clipMinX = arg2;
		clipMinY = arg3;
		clipMaxX = arg1;
		clipMaxY = arg0;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
		maxY = clipMaxY / 2;
	}

	@ObfuscatedName("gb.a(I)V")
	public static void cls() {
		int var0 = width * height;
		for (int var1 = 0; var1 < var0; var1++) {
			pixels[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < clipMinX) {
			arg0 -= clipMinX - arg4;
			arg4 = clipMinX;
		}
		if (arg2 < clipMinY) {
			arg1 -= clipMinY - arg2;
			arg2 = clipMinY;
		}
		if (arg4 + arg0 > clipMaxX) {
			arg0 = clipMaxX - arg4;
		}
		if (arg2 + arg1 > clipMaxY) {
			arg1 = clipMaxY - arg2;
		}
		int var6 = 256 - arg5;
		int var7 = (arg3 >> 16 & 0xFF) * arg5;
		int var8 = (arg3 >> 8 & 0xFF) * arg5;
		int var9 = (arg3 & 0xFF) * arg5;
		int var10 = width - arg0;
		int var11 = arg4 + arg2 * width;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (pixels[var11] >> 16 & 0xFF) * var6;
				int var15 = (pixels[var11] >> 8 & 0xFF) * var6;
				int var16 = (pixels[var11] & 0xFF) * var6;
				int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
				pixels[var11++] = var17;
			}
			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < clipMinX) {
			arg2 -= clipMinX - arg3;
			arg3 = clipMinX;
		}
		if (arg4 < clipMinY) {
			arg0 -= clipMinY - arg4;
			arg4 = clipMinY;
		}
		if (arg3 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg3;
		}
		if (arg4 + arg0 > clipMaxY) {
			arg0 = clipMaxY - arg4;
		}
		int var5 = width - arg2;
		int var6 = arg3 + arg4 * width;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				pixels[var6++] = arg1;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg0, arg1, arg3, arg4);
		hline(arg0, arg1, arg3, arg4 + arg2 - 1);
		vline(arg1, arg2, arg3, arg4);
		vline(arg1, arg2, arg3 + arg0 - 1, arg4);
	}

	@ObfuscatedName("gb.a(IZIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg0, arg1, arg5, arg2, field613, arg3);
		hlineTrans(arg0, arg1 + arg4 - 1, arg5, arg2, field613, arg3);
		if (arg4 >= 3) {
			vlineTrans(arg2, arg4 - 2, arg1 + 1, arg3, arg5);
			vlineTrans(arg2 + arg0 - 1, arg4 - 2, arg1 + 1, arg3, arg5);
		}
	}

	@ObfuscatedName("gb.a(IIIBI)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < clipMinY || arg3 >= clipMaxY) {
			return;
		}
		if (arg2 < clipMinX) {
			arg0 -= clipMinX - arg2;
			arg2 = clipMinX;
		}
		if (arg2 + arg0 > clipMaxX) {
			arg0 = clipMaxX - arg2;
		}
		int var4 = arg2 + arg3 * width;
		for (int var5 = 0; var5 < arg0; var5++) {
			pixels[var4 + var5] = arg1;
		}
	}

	@ObfuscatedName("gb.c(IIIIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < clipMinY || arg1 >= clipMaxY) {
			return;
		}
		if (arg3 < clipMinX) {
			arg0 -= clipMinX - arg3;
			arg3 = clipMinX;
		}
		if (arg3 + arg0 > clipMaxX) {
			arg0 = clipMaxX - arg3;
		}
		int var6 = 256 - arg2;
		int var7 = (arg5 >> 16 & 0xFF) * arg2;
		int var8 = (arg5 >> 8 & 0xFF) * arg2;
		int var9 = (arg5 & 0xFF) * arg2;
		int var10 = arg3 + arg1 * width;
		for (int var11 = 0; var11 < arg0; var11++) {
			int var12 = (pixels[var10] >> 16 & 0xFF) * var6;
			int var13 = (pixels[var10] >> 8 & 0xFF) * var6;
			int var14 = (pixels[var10] & 0xFF) * var6;
			int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
			pixels[var10++] = var15;
		}
		if (arg4 < 0 || arg4 > 0) {
			;
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < clipMinX || arg2 >= clipMaxX) {
			return;
		}
		if (arg3 < clipMinY) {
			arg1 -= clipMinY - arg3;
			arg3 = clipMinY;
		}
		if (arg3 + arg1 > clipMaxY) {
			arg1 = clipMaxY - arg3;
		}
		int var4 = arg2 + arg3 * width;
		for (int var5 = 0; var5 < arg1; var5++) {
			pixels[var4 + var5 * width] = arg0;
		}
	}

	@ObfuscatedName("gb.a(IIIZII)V")
	public static void vlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < clipMinX || arg0 >= clipMaxX) {
			return;
		}
		if (arg2 < clipMinY) {
			arg1 -= clipMinY - arg2;
			arg2 = clipMinY;
		}
		if (arg2 + arg1 > clipMaxY) {
			arg1 = clipMaxY - arg2;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg2 * width;
		for (int var10 = 0; var10 < arg1; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			pixels[var9] = var14;
			var9 += width;
		}
	}
}
