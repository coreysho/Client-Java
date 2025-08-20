package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("LFYNQWSZ.m")
	public static int width2d;

	@ObfuscatedName("LFYNQWSZ.n")
	public static int height2d;

	@ObfuscatedName("LFYNQWSZ.o")
	public static int top;

	@ObfuscatedName("LFYNQWSZ.p")
	public static int bottom;

	@ObfuscatedName("LFYNQWSZ.q")
	public static int left;

	@ObfuscatedName("LFYNQWSZ.r")
	public static int right;

	@ObfuscatedName("LFYNQWSZ.s")
	public static int safeWidth;

	@ObfuscatedName("LFYNQWSZ.t")
	public static int centerX2d;

	@ObfuscatedName("LFYNQWSZ.u")
	public static int centerY2d;

	@ObfuscatedName("LFYNQWSZ.l")
	public static int[] data;

	@ObfuscatedName("LFYNQWSZ.a(ZII[I)V")
	public static void bind(int width, int height, int[] src) {
		data = src;
		width2d = width;
		height2d = height;
		setClipping(0, 0, height, width);
	}

	@ObfuscatedName("LFYNQWSZ.a(B)V")
	public static void resetClipping() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		safeWidth = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIZ)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 > width2d) {
			arg3 = width2d;
		}

		if (arg2 > height2d) {
			arg2 = height2d;
		}

		left = arg1;
		top = arg0;
		right = arg3;
		bottom = arg2;
		safeWidth = right - 1;
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("LFYNQWSZ.a(I)V")
	public static void cls() {
		int length = height2d * width2d;
		for (int i = 0; i < length; i++) {
			data[i] = 0;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(ZIIIIII)V")
	public static void fillRectTrans(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 < left) {
			arg3 -= left - arg6;
			arg6 = left;
		}
		if (arg2 < top) {
			arg4 -= top - arg2;
			arg2 = top;
		}
		if (arg3 + arg6 > right) {
			arg3 = right - arg6;
		}
		if (arg2 + arg4 > bottom) {
			arg4 = bottom - arg2;
		}
		int var7 = 256 - arg5;
		int var8 = (arg1 >> 16 & 0xFF) * arg5;
		int var9 = (arg1 >> 8 & 0xFF) * arg5;
		int var10 = (arg1 & 0xFF) * arg5;
		int var11 = width2d - arg3;
		int var12 = width2d * arg2 + arg6;
		for (int var13 = 0; var13 < arg4; var13++) {
			for (int var14 = -arg3; var14 < 0; var14++) {
				int var15 = (data[var12] >> 16 & 0xFF) * var7;
				int var16 = (data[var12] >> 8 & 0xFF) * var7;
				int var17 = (data[var12] & 0xFF) * var7;
				int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
				data[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIBII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg4, int arg5) {
		if (arg5 < left) {
			arg4 -= left - arg5;
			arg5 = left;
		}
		if (arg1 < top) {
			arg0 -= top - arg1;
			arg1 = top;
		}
		if (arg4 + arg5 > right) {
			arg4 = right - arg5;
		}
		if (arg0 + arg1 > bottom) {
			arg0 = bottom - arg1;
		}
		int var6 = width2d - arg4;
		int var7 = width2d * arg1 + arg5;
		for (int var8 = -arg0; var8 < 0; var8++) {
			for (int var9 = -arg4; var9 < 0; var9++) {
				data[var7++] = arg2;
			}
			var7 += var6;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIII)V")
	public static void drawRect(int arg1, int arg2, int arg3, int arg4, int arg5) {
		hline(arg4, arg3, arg1, arg5);
		hline(arg4, arg3, arg1 + arg2 - 1, arg5);
		vline(arg4, arg3, arg2, false, arg1);
		vline(arg4 + arg5 - 1, arg3, arg2, false, arg1);
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIIIB)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg4, arg0, arg1, arg5, arg2);
		hlineTrans(arg3 + arg4 - 1, arg0, arg1, arg5, arg2);
		if (arg3 >= 3) {
			vlineTrans(arg4 + 1, arg0, arg2, arg3 - 2, arg5);
			vlineTrans(arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
		}
	}

	@ObfuscatedName("LFYNQWSZ.b(IIIIZ)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < top || arg2 >= bottom) {
			return;
		}
		if (arg0 < left) {
			arg3 -= left - arg0;
			arg0 = left;
		}
		if (arg0 + arg3 > right) {
			arg3 = right - arg0;
		}
		int var5 = width2d * arg2 + arg0;
		for (int var7 = 0; var7 < arg3; var7++) {
			data[var5 + var7] = arg1;
		}
	}

	@ObfuscatedName("LFYNQWSZ.b(IIIIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg4, int arg5) {
		if (arg0 < top || arg0 >= bottom) {
			return;
		}
		if (arg1 < left) {
			arg2 -= left - arg1;
			arg1 = left;
		}
		if (arg1 + arg2 > right) {
			arg2 = right - arg1;
		}
		int var6 = 256 - arg4;
		int var7 = (arg5 >> 16 & 0xFF) * arg4;
		int var8 = (arg5 >> 8 & 0xFF) * arg4;
		int var9 = (arg5 & 0xFF) * arg4;
		int var10 = width2d * arg0 + arg1;
		for (int var11 = 0; var11 < arg2; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
			data[var10++] = var15;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIZI)V")
	public static void vline(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		if (arg3 || (arg0 < left || arg0 >= right)) {
			return;
		}
		if (arg4 < top) {
			arg2 -= top - arg4;
			arg4 = top;
		}
		if (arg2 + arg4 > bottom) {
			arg2 = bottom - arg4;
		}
		int var5 = width2d * arg4 + arg0;
		for (int var6 = 0; var6 < arg2; var6++) {
			data[width2d * var6 + var5] = arg1;
		}
	}

	@ObfuscatedName("LFYNQWSZ.c(IIIIII)V")
	public static void vlineTrans(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < left || arg2 >= right) {
			return;
		}
		if (arg1 < top) {
			arg4 -= top - arg1;
			arg1 = top;
		}
		if (arg1 + arg4 > bottom) {
			arg4 = bottom - arg1;
		}
		int var6 = 256 - arg5;
		int var7 = (arg3 >> 16 & 0xFF) * arg5;
		int var8 = (arg3 >> 8 & 0xFF) * arg5;
		int var9 = (arg3 & 0xFF) * arg5;
		int var11 = width2d * arg1 + arg2;
		for (int var12 = 0; var12 < arg4; var12++) {
			int var13 = (data[var11] >> 16 & 0xFF) * var6;
			int var14 = (data[var11] >> 8 & 0xFF) * var6;
			int var15 = (data[var11] & 0xFF) * var6;
			int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
			data[var11] = var16;
			var11 += width2d;
		}
	}
}
