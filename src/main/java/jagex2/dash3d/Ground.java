package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("i")
public final class Ground {

	@ObfuscatedName("i.a")
	public final boolean field165 = true;

	@ObfuscatedName("i.b")
	public final int[] vertexX;

	@ObfuscatedName("i.c")
	public final int[] vertexY;

	@ObfuscatedName("i.d")
	public final int[] vertexZ;

	@ObfuscatedName("i.e")
	public final int[] faceColourA;

	@ObfuscatedName("i.f")
	public final int[] field170;

	@ObfuscatedName("i.g")
	public final int[] field171;

	@ObfuscatedName("i.h")
	public final int[] faceVertexA;

	@ObfuscatedName("i.i")
	public final int[] faceVertexB;

	@ObfuscatedName("i.j")
	public final int[] faceVertexC;

	@ObfuscatedName("i.k")
	public int[] faceTexture;

	@ObfuscatedName("i.l")
	public boolean flat = true;

	@ObfuscatedName("i.m")
	public final int overlayShape;

	@ObfuscatedName("i.n")
	public final int overlayRotation;

	@ObfuscatedName("i.o")
	public final int minimapOverlay;

	@ObfuscatedName("i.p")
	public final int minimapUnderlay;

	@ObfuscatedName("i.q")
	public static final int[] drawVertexX = new int[6];

	@ObfuscatedName("i.r")
	public static final int[] drawVertexY = new int[6];

	@ObfuscatedName("i.s")
	public static final int[] drawTextureVertexX = new int[6];

	@ObfuscatedName("i.t")
	public static final int[] drawTextureVertexY = new int[6];

	@ObfuscatedName("i.u")
	public static final int[] drawTextureVertexZ = new int[6];

	@ObfuscatedName("i.v")
	public static final int[] field186 = new int[] { 1, 0 };

	@ObfuscatedName("i.w")
	public static final int[] field187 = new int[] { 2, 1 };

	@ObfuscatedName("i.x")
	public static final int[] field188 = new int[] { 3, 3 };

	@ObfuscatedName("i.y")
	public static final int[][] field189 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.z")
	public static final int[][] field190 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg1 != arg14 || arg1 != arg2 || arg1 != arg13) {
			this.flat = false;
		}
		this.overlayShape = arg6;
		this.overlayRotation = arg16;
		this.minimapOverlay = arg4;
		this.minimapUnderlay = arg7;
		int[] var21 = field189[arg6];
		int var22 = var21.length;
		this.vertexX = new int[var22];
		this.vertexY = new int[var22];
		this.vertexZ = new int[var22];
		int[] var23 = new int[var22];
		int[] var24 = new int[var22];
		int var25 = arg15 * 128;
		int var26 = arg11 * 128;
		for (int var27 = 0; var27 < var22; var27++) {
			int var28 = var21[var27];
			if ((var28 & 0x1) == 0 && var28 <= 8) {
				var28 = (var28 - arg16 - arg16 - 1 & 0x7) + 1;
			}
			if (var28 > 8 && var28 <= 12) {
				var28 = (var28 - arg16 - 9 & 0x3) + 9;
			}
			if (var28 > 12 && var28 <= 16) {
				var28 = (var28 - arg16 - 13 & 0x3) + 13;
			}
			int var29;
			int var30;
			int var31;
			int var32;
			int var33;
			if (var28 == 1) {
				var29 = var25;
				var30 = var26;
				var31 = arg1;
				var32 = arg8;
				var33 = arg0;
			} else if (var28 == 2) {
				var29 = var25 + 64;
				var30 = var26;
				var31 = arg1 + arg14 >> 1;
				var32 = arg8 + arg9 >> 1;
				var33 = arg0 + arg18 >> 1;
			} else if (var28 == 3) {
				var29 = var25 + 128;
				var30 = var26;
				var31 = arg14;
				var32 = arg9;
				var33 = arg18;
			} else if (var28 == 4) {
				var29 = var25 + 128;
				var30 = var26 + 64;
				var31 = arg14 + arg2 >> 1;
				var32 = arg9 + arg10 >> 1;
				var33 = arg18 + arg19 >> 1;
			} else if (var28 == 5) {
				var29 = var25 + 128;
				var30 = var26 + 128;
				var31 = arg2;
				var32 = arg10;
				var33 = arg19;
			} else if (var28 == 6) {
				var29 = var25 + 64;
				var30 = var26 + 128;
				var31 = arg2 + arg13 >> 1;
				var32 = arg10 + arg12 >> 1;
				var33 = arg19 + arg3 >> 1;
			} else if (var28 == 7) {
				var29 = var25;
				var30 = var26 + 128;
				var31 = arg13;
				var32 = arg12;
				var33 = arg3;
			} else if (var28 == 8) {
				var29 = var25;
				var30 = var26 + 64;
				var31 = arg13 + arg1 >> 1;
				var32 = arg12 + arg8 >> 1;
				var33 = arg3 + arg0 >> 1;
			} else if (var28 == 9) {
				var29 = var25 + 64;
				var30 = var26 + 32;
				var31 = arg1 + arg14 >> 1;
				var32 = arg8 + arg9 >> 1;
				var33 = arg0 + arg18 >> 1;
			} else if (var28 == 10) {
				var29 = var25 + 96;
				var30 = var26 + 64;
				var31 = arg14 + arg2 >> 1;
				var32 = arg9 + arg10 >> 1;
				var33 = arg18 + arg19 >> 1;
			} else if (var28 == 11) {
				var29 = var25 + 64;
				var30 = var26 + 96;
				var31 = arg2 + arg13 >> 1;
				var32 = arg10 + arg12 >> 1;
				var33 = arg19 + arg3 >> 1;
			} else if (var28 == 12) {
				var29 = var25 + 32;
				var30 = var26 + 64;
				var31 = arg13 + arg1 >> 1;
				var32 = arg12 + arg8 >> 1;
				var33 = arg3 + arg0 >> 1;
			} else if (var28 == 13) {
				var29 = var25 + 32;
				var30 = var26 + 32;
				var31 = arg1;
				var32 = arg8;
				var33 = arg0;
			} else if (var28 == 14) {
				var29 = var25 + 96;
				var30 = var26 + 32;
				var31 = arg14;
				var32 = arg9;
				var33 = arg18;
			} else if (var28 == 15) {
				var29 = var25 + 96;
				var30 = var26 + 96;
				var31 = arg2;
				var32 = arg10;
				var33 = arg19;
			} else {
				var29 = var25 + 32;
				var30 = var26 + 96;
				var31 = arg13;
				var32 = arg12;
				var33 = arg3;
			}
			this.vertexX[var27] = var29;
			this.vertexY[var27] = var31;
			this.vertexZ[var27] = var30;
			var23[var27] = var32;
			var24[var27] = var33;
		}
		int[] var34 = field190[arg6];
		int var35 = var34.length / 4;
		this.faceVertexA = new int[var35];
		this.faceVertexB = new int[var35];
		this.faceVertexC = new int[var35];
		this.faceColourA = new int[var35];
		this.field170 = new int[var35];
		this.field171 = new int[var35];
		if (arg5 != -1) {
			this.faceTexture = new int[var35];
		}
		int var36 = 0;
		for (int var37 = 0; var37 < var35; var37++) {
			int var38 = var34[var36];
			int var39 = var34[var36 + 1];
			int var40 = var34[var36 + 2];
			int var41 = var34[var36 + 3];
			var36 += 4;
			if (var39 < 4) {
				var39 = var39 - arg16 & 0x3;
			}
			if (var40 < 4) {
				var40 = var40 - arg16 & 0x3;
			}
			if (var41 < 4) {
				var41 = var41 - arg16 & 0x3;
			}
			this.faceVertexA[var37] = var39;
			this.faceVertexB[var37] = var40;
			this.faceVertexC[var37] = var41;
			if (var38 == 0) {
				this.faceColourA[var37] = var23[var39];
				this.field170[var37] = var23[var40];
				this.field171[var37] = var23[var41];
				if (this.faceTexture != null) {
					this.faceTexture[var37] = -1;
				}
			} else {
				this.faceColourA[var37] = var24[var39];
				this.field170[var37] = var24[var40];
				this.field171[var37] = var24[var41];
				if (this.faceTexture != null) {
					this.faceTexture[var37] = arg5;
				}
			}
		}
		int var42 = arg1;
		int var43 = arg14;
		if (arg14 < arg1) {
			var42 = arg14;
		}
		if (arg14 > arg14) {
			var43 = arg14;
		}
		if (arg2 < var42) {
			var42 = arg2;
		}
		if (arg2 > arg14) {
			var43 = arg2;
		}
		if (arg13 < var42) {
			;
		}
		if (arg13 > var43) {
			;
		}
	}
}
