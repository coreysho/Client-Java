package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.datastruct.LinkList;

@ObfuscatedName("r")
public final class World {

	@ObfuscatedName("r.a")
	public int field274;

	@ObfuscatedName("r.b")
	public final boolean field275 = true;

	@ObfuscatedName("r.c")
	public static byte field276;

	@ObfuscatedName("r.d")
	public final byte field277 = 8;

	@ObfuscatedName("r.e")
	public final boolean field278 = true;

	@ObfuscatedName("r.f")
	public final int field279 = -12792;

	@ObfuscatedName("r.g")
	public final int field280 = 4;

	@ObfuscatedName("r.h")
	public static boolean field281;

	@ObfuscatedName("r.i")
	public static boolean lowMem = true;

	@ObfuscatedName("r.j")
	public final int maxTileLevel = 4;

	@ObfuscatedName("r.k")
	public final int maxTileX = 104;

	@ObfuscatedName("r.l")
	public final int maxTileZ = 104;

	@ObfuscatedName("r.m")
	public final int[][][] groundh;

	@ObfuscatedName("r.n")
	public final Square[][][] squares = new Square[4][104][104];

	@ObfuscatedName("r.o")
	public int minLevel;

	@ObfuscatedName("r.p")
	public int dynamicCount;

	@ObfuscatedName("r.q")
	public final Sprite[] dynamicSprites = new Sprite[5000];

	@ObfuscatedName("r.r")
	public final int[][][] occlusionCycle = new int[4][105][105];

	@ObfuscatedName("r.s")
	public static int fillLeft;

	@ObfuscatedName("r.t")
	public static int maxLevel;

	@ObfuscatedName("r.u")
	public static int cycleNo;

	@ObfuscatedName("r.v")
	public static int minX;

	@ObfuscatedName("r.w")
	public static int maxX;

	@ObfuscatedName("r.x")
	public static int minZ;

	@ObfuscatedName("r.y")
	public static int maxZ;

	@ObfuscatedName("r.z")
	public static int gx;

	@ObfuscatedName("r.ab")
	public static final int[] POSTTAB = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("r.bb")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("r.cb")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("r.db")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("r.eb")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("r.fb")
	public static final int[] TEXTURE_AVERAGE = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("r.gb")
	public final int[] shareMap = new int[10000];

	@ObfuscatedName("r.hb")
	public final int[] shareMap2 = new int[10000];

	@ObfuscatedName("r.ib")
	public int shareTic;

	@ObfuscatedName("r.jb")
	public final int[][] MINIMAP_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("r.kb")
	public final int[][] MINIMAP_ROTATE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("r.lb")
	public static boolean[][][][] visBacking = new boolean[8][32][51][51];

	@ObfuscatedName("r.mb")
	public static boolean[][] visBackingDirty;

	@ObfuscatedName("r.nb")
	public static int xOrig;

	@ObfuscatedName("r.ob")
	public static int yOrig;

	@ObfuscatedName("r.pb")
	public static int xClip;

	@ObfuscatedName("r.qb")
	public static int yClip;

	@ObfuscatedName("r.rb")
	public static int xClip2;

	@ObfuscatedName("r.sb")
	public static int yClip2;

	@ObfuscatedName("r.I")
	public static Sprite[] spriteBuffer = new Sprite[100];

	@ObfuscatedName("r.J")
	public static final int[] DECORXOF = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("r.K")
	public static final int[] DECORYOF = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("r.L")
	public static final int[] DECORXOF2 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("r.M")
	public static final int[] DECORYOF2 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("r.Q")
	public static int groundX = -1;

	@ObfuscatedName("r.R")
	public static int groundZ = -1;

	@ObfuscatedName("r.S")
	public static final int LEVELS = 4;

	@ObfuscatedName("r.T")
	public static int[] numOccluders = new int[LEVELS];

	@ObfuscatedName("r.U")
	public static Occlude[][] occluders = new Occlude[LEVELS][500];

	@ObfuscatedName("r.W")
	public static final Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("r.X")
	public static LinkList fillQueue = new LinkList(-822);

	@ObfuscatedName("r.Y")
	public static final int[] PRETAB = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("r.Z")
	public static final int[] MIDTAB = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("r.A")
	public static int gz;

	@ObfuscatedName("r.B")
	public static int cx;

	@ObfuscatedName("r.C")
	public static int cy;

	@ObfuscatedName("r.D")
	public static int cz;

	@ObfuscatedName("r.E")
	public static int cameraSinX;

	@ObfuscatedName("r.F")
	public static int cameraCosX;

	@ObfuscatedName("r.G")
	public static int cameraSinY;

	@ObfuscatedName("r.H")
	public static int cameraCosY;

	@ObfuscatedName("r.O")
	public static int clickX;

	@ObfuscatedName("r.P")
	public static int clickY;

	@ObfuscatedName("r.V")
	public static int numActiveOccluders;

	@ObfuscatedName("r.N")
	public static boolean click;

	@ObfuscatedName("r.a(B)V")
	public static void unload() {
		spriteBuffer = null;
		numOccluders = null;
		occluders = null;
		fillQueue = null;
		visBacking = null;
		visBackingDirty = null;
	}

	@ObfuscatedName("r.a(IIIBIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.minTileX = arg3 / 128;
		if (field276 != 0) {
			return;
		}
		var8.maxTileX = arg4 / 128;
		var8.minTileZ = arg5 / 128;
		var8.maxTileZ = arg2 / 128;
		var8.type = arg7;
		var8.minX = arg3;
		var8.maxX = arg4;
		var8.minZ = arg5;
		var8.maxZ = arg2;
		var8.minY = arg1;
		var8.maxY = arg6;
		occluders[arg0][numOccluders[arg0]++] = var8;
	}

	@ObfuscatedName("r.a(IZIII[I)V")
	public static void resetVisCalc(int[] arg0) {
		xClip = 0;
		yClip = 0;
		xClip2 = 512;
		yClip2 = 334;
		xOrig = 256;
		yOrig = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				cameraSinX = Model.sinTable[var2];
				cameraCosX = Model.cosTable[var2];
				cameraSinY = Model.sinTable[var3];
				cameraCosY = Model.cosTable[var3];
				int var4 = (var2 - 128) / 32;
				int var5 = var3 / 64;
				for (int var6 = -26; var6 <= 26; var6++) {
					for (int var7 = -26; var7 <= 26; var7++) {
						int var8 = var6 * 128;
						int var9 = var7 * 128;
						boolean var10 = false;
						for (int var11 = -500; var11 <= 800; var11 += 128) {
							if (testPoint(var9, var8, arg0[var4] + var11)) {
								var10 = true;
								break;
							}
						}
						var1[var4][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
					}
				}
			}
		}
		for (int var12 = 0; var12 < 8; var12++) {
			for (int var13 = 0; var13 < 32; var13++) {
				for (int var14 = -25; var14 < 25; var14++) {
					for (int var15 = -25; var15 < 25; var15++) {
						boolean var16 = false;
						label76: for (int var17 = -1; var17 <= 1; var17++) {
							for (int var18 = -1; var18 <= 1; var18++) {
								if (var1[var12][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12 + 1][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12 + 1][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}
						visBacking[var12][var13][var14 + 25][var15 + 25] = var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IZII)Z")
	public static boolean testPoint(int arg0, int arg1, int arg2) {
		int var3 = arg0 * cameraSinY + arg1 * cameraCosY >> 16;
		int var4 = arg0 * cameraCosY - arg1 * cameraSinY >> 16;
		int var5 = arg2 * cameraSinX + var4 * cameraCosX >> 16;
		int var6 = arg2 * cameraCosX - var4 * cameraSinX >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = xOrig + (var3 << 9) / var5;
			int var8 = yOrig + (var6 << 9) / var5;
			return var7 >= xClip && var7 <= xClip2 && var8 >= yClip && var8 <= yClip2;
		} else {
			return false;
		}
	}

	public World(int arg0, int arg1, int arg2, int[][][] arg3, byte arg4) {
		this.groundh = arg3;
		this.resetMap();
	}

	@ObfuscatedName("r.b(B)V")
	public void resetMap() {
		for (int var1 = 0; var1 < this.maxTileLevel; var1++) {
			for (int var2 = 0; var2 < this.maxTileX; var2++) {
				for (int var3 = 0; var3 < this.maxTileZ; var3++) {
					this.squares[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < LEVELS; var4++) {
			for (int var5 = 0; var5 < numOccluders[var4]; var5++) {
				occluders[var4][var5] = null;
			}
			numOccluders[var4] = 0;
		}
		for (int var6 = 0; var6 < this.dynamicCount; var6++) {
			this.dynamicSprites[var6] = null;
		}
		this.dynamicCount = 0;
		for (int var7 = 0; var7 < spriteBuffer.length; var7++) {
			spriteBuffer[var7] = null;
		}
	}

	@ObfuscatedName("r.a(BI)V")
	public void fillBaseLevel(int arg0) {
		this.minLevel = arg0;
		for (int var2 = 0; var2 < this.maxTileX; var2++) {
			for (int var3 = 0; var3 < this.maxTileZ; var3++) {
				this.squares[arg0][var2][var3] = new Square(arg0, var2, var3);
			}
		}
	}

	@ObfuscatedName("r.a(BII)V")
	public void pushDown(int arg0, int arg1) {
		Square var3 = this.squares[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = this.squares[var4][arg0][arg1] = this.squares[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.level--;
				for (int var6 = 0; var6 < var5.spriteCount; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.typecode >> 29 & 0x3) == 2 && var7.minTileX == arg0 && var7.minTileZ == arg1) {
						var7.level--;
					}
				}
			}
		}
		if (this.squares[0][arg0][arg1] == null) {
			this.squares[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		this.squares[0][arg0][arg1].linkedSquare = var3;
		this.squares[3][arg0][arg1] = null;
	}

	@ObfuscatedName("r.a(IIII)V")
	public void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 != null) {
			this.squares[arg0][arg1][arg2].field380 = arg3;
		}
	}

	@ObfuscatedName("r.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.squares[var22][arg1][arg2] == null) {
					this.squares[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.squares[var24][arg1][arg2] == null) {
					this.squares[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg14, arg6, arg8, arg17, arg18, arg5, arg3, arg19, arg10, arg11, arg12, arg2, arg13, arg9, arg7, arg1, arg4, -196, arg15, arg16);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.squares[var26][arg1][arg2] == null) {
					this.squares[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("r.a(ILx;IIIZBI)V")
	public void setGroundDecor(int arg0, ModelSource arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
		if (arg1 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.model = arg1;
		var8.field192 = arg2 * 128 + 64;
		var8.field193 = arg6 * 128 + 64;
		var8.field191 = arg0;
		var8.typecode = arg4;
		var8.typecode2 = arg5;
		if (this.squares[arg3][arg2][arg6] == null) {
			this.squares[arg3][arg2][arg6] = new Square(arg3, arg2, arg6);
		}
		this.squares[arg3][arg2][arg6].groundDecor = var8;
	}

	@ObfuscatedName("r.a(IIILx;Lx;BIILx;)V")
	public void setObj(int arg0, int arg1, int arg2, ModelSource arg3, ModelSource arg4, int arg5, int arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.topObj = arg4;
		var9.field198 = arg5 * 128 + 64;
		var9.field199 = arg0 * 128 + 64;
		var9.field197 = arg6;
		var9.field203 = arg1;
		var9.bottomObj = arg3;
		var9.middleObj = arg7;
		int var10 = 0;
		Square var11 = this.squares[arg2][arg5][arg0];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.spriteCount; var12++) {
				if (var11.sprites[var12].model instanceof Model) {
					int var13 = ((Model) var11.sprites[var12].model).objRaise;
					if (var13 > var10) {
						var10 = var13;
					}
				}
			}
		}
		var9.height = var10;
		if (this.squares[arg2][arg5][arg0] == null) {
			this.squares[arg2][arg5][arg0] = new Square(arg2, arg5, arg0);
		}
		this.squares[arg2][arg5][arg0].groundObject = var9;
	}

	@ObfuscatedName("r.a(ILx;IIIBIIILx;I)V")
	public void setWall(int arg0, ModelSource arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, ModelSource arg8, int arg9) {
		if (arg8 == null && arg1 == null) {
			return;
		}
		Wall var11 = new Wall();
		var11.typecode = arg7;
		var11.typecode2 = arg5;
		var11.field266 = arg3 * 128 + 64;
		var11.field267 = arg9 * 128 + 64;
		var11.field265 = arg2;
		var11.model1 = arg8;
		var11.model2 = arg1;
		var11.angle1 = arg0;
		var11.angle2 = arg6;
		for (int var12 = arg4; var12 >= 0; var12--) {
			if (this.squares[var12][arg3][arg9] == null) {
				this.squares[var12][arg3][arg9] = new Square(var12, arg3, arg9);
			}
		}
		this.squares[arg4][arg3][arg9].wall = var11;
	}

	@ObfuscatedName("r.a(ILx;BIIIBIIIII)V")
	public void setDecor(int arg0, ModelSource arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg1 == null) {
			return;
		}
		Decor var12 = new Decor();
		var12.typecode = arg10;
		var12.typecode2 = arg2;
		var12.x = arg8 * 128 + arg5 + 64;
		var12.z = arg3 * 128 + arg9 + 64;
		var12.y = arg4;
		var12.model = arg1;
		var12.wshape = arg0;
		var12.angle = arg6;
		for (int var13 = arg7; var13 >= 0; var13--) {
			if (this.squares[var13][arg8][arg3] == null) {
				this.squares[var13][arg8][arg3] = new Square(var13, arg8, arg3);
			}
		}
		this.squares[arg7][arg8][arg3].decor = var12;
	}

	@ObfuscatedName("r.a(IIIIIILx;BIII)Z")
	public boolean addScenery(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, byte arg6, int arg7, int arg8, int arg9) {
		if (arg5 == null) {
			return true;
		} else {
			int var11 = arg0 * 128 + arg7 * 64;
			int var12 = arg1 * 128 + arg2 * 64;
			return this.setSprite(arg3, arg0, arg1, arg7, arg2, var11, var12, arg4, arg5, arg8, false, arg9, arg6);
		}
	}

	@ObfuscatedName("r.a(ILx;IIIBIIIZ)Z")
	public boolean addDynamic(int arg0, ModelSource arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		if (arg1 == null) {
			return true;
		}
		int var10 = arg2 - arg5;
		int var11 = arg4 - arg5;
		int var12 = arg2 + arg5;
		int var13 = arg4 + arg5;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				var13 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				var12 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				var11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				var10 -= 128;
			}
		}
		int var14 = var10 / 128;
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		return this.setSprite(arg7, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg2, arg4, arg0, arg1, arg6, true, arg3, (byte) 0);
	}

	@ObfuscatedName("r.a(IIIIIIIIILx;III)Z")
	public boolean addDynamic2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ModelSource arg7, int arg8, int arg9, int arg10) {
		return arg7 == null ? true : this.setSprite(arg6, arg4, arg9, arg2 + 1 - arg4, arg0 - arg9 + 1, arg5, arg8, arg3, arg7, arg1, true, arg10, (byte) 0);
	}

	@ObfuscatedName("r.a(IIIIIIIILx;IZIB)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
					return false;
				}
				Square var16 = this.squares[arg0][var14][var15];
				if (var16 != null && var16.spriteCount >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.typecode = arg11;
		var17.typecode2 = arg12;
		var17.level = arg0;
		var17.x = arg5;
		var17.z = arg6;
		var17.field252 = arg7;
		var17.model = arg8;
		var17.field256 = arg9;
		var17.minTileX = arg1;
		var17.minTileZ = arg2;
		var17.maxTileX = arg1 + arg3 - 1;
		var17.maxTileZ = arg2 + arg4 - 1;
		for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
			for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
				int var20 = 0;
				if (var18 > arg1) {
					var20++;
				}
				if (var18 < arg1 + arg3 - 1) {
					var20 += 4;
				}
				if (var19 > arg2) {
					var20 += 8;
				}
				if (var19 < arg2 + arg4 - 1) {
					var20 += 2;
				}
				for (int var21 = arg0; var21 >= 0; var21--) {
					if (this.squares[var21][var18][var19] == null) {
						this.squares[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.squares[arg0][var18][var19];
				var22.sprites[var22.spriteCount] = var17;
				var22.spriteSpan[var22.spriteCount] = var20;
				var22.spriteSpans |= var20;
				var22.spriteCount++;
			}
		}
		if (arg10) {
			this.dynamicSprites[this.dynamicCount++] = var17;
		}
		return true;
	}

	@ObfuscatedName("r.a(I)V")
	public void removeSprites() {
		for (int var1 = 0; var1 < this.dynamicCount; var1++) {
			Sprite var2 = this.dynamicSprites[var1];
			this.delSprite(var2);
			this.dynamicSprites[var1] = null;
		}
		this.dynamicCount = 0;
	}

	@ObfuscatedName("r.a(Lp;I)V")
	public void delSprite(Sprite arg0) {
		for (int var2 = arg0.minTileX; var2 <= arg0.maxTileX; var2++) {
			for (int var3 = arg0.minTileZ; var3 <= arg0.maxTileZ; var3++) {
				Square var4 = this.squares[arg0.level][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.spriteCount; var5++) {
						if (var4.sprites[var5] == arg0) {
							var4.spriteCount--;
							for (int var6 = var5; var6 < var4.spriteCount; var6++) {
								var4.sprites[var6] = var4.sprites[var6 + 1];
								var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
							}
							var4.sprites[var4.spriteCount] = null;
							break;
						}
					}
					var4.spriteSpans = 0;
					for (int var7 = 0; var7 < var4.spriteCount; var7++) {
						var4.spriteSpans |= var4.spriteSpan[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(ZIIII)V")
	public void setDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg2][arg0][arg1];
		if (var5 == null) {
			return;
		}
		Decor var6 = var5.decor;
		if (var6 != null) {
			int var7 = arg0 * 128 + 64;
			int var8 = arg1 * 128 + 64;
			var6.x = var7 + (var6.x - var7) * arg3 / 16;
			var6.z = var8 + (var6.z - var8) * arg3 / 16;
		}
	}

	@ObfuscatedName("r.b(IIII)V")
	public void delWall(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg2][arg1];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("r.a(IIIB)V")
	public void delDecor(int arg0, int arg1, int arg2, byte arg3) {
		Square var5 = this.squares[arg1][arg2][arg0];
		if (arg3 == -120 && var5 != null) {
			var5.decor = null;
		}
	}

	@ObfuscatedName("r.c(IIII)V")
	public void delLoc(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg1][arg2][arg0];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg2 && var6.minTileZ == arg0) {
				this.delSprite(var6);
				return;
			}
		}
	}

	@ObfuscatedName("r.a(IBII)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg1][arg0][arg2];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("r.a(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("r.a(BIII)Lq;")
	public Wall wallType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg1][arg2][arg0];
		return var4 == null ? null : var4.wall;
	}

	@ObfuscatedName("r.b(IBII)Lh;")
	public Decor decorType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg1][arg0][arg2];
		return var4 == null ? null : var4.decor;
	}

	@ObfuscatedName("r.a(IIZI)Lp;")
	public Sprite sceneType(int arg0, int arg1, boolean arg2, int arg3) {
		if (!arg2) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		Square var6 = this.squares[arg1][arg0][arg3];
		if (var6 == null) {
			return null;
		}
		for (int var7 = 0; var7 < var6.spriteCount; var7++) {
			Sprite var8 = var6.sprites[var7];
			if ((var8.typecode >> 29 & 0x3) == 2 && var8.minTileX == arg0 && var8.minTileZ == arg3) {
				return var8;
			}
		}
		return null;
	}

	@ObfuscatedName("r.b(IIIB)Lj;")
	public GroundDecor gdType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg1][arg0][arg2];
		return var4 == null || var4.groundDecor == null ? null : var4.groundDecor;
	}

	@ObfuscatedName("r.b(III)I")
	public int getWall(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode;
	}

	@ObfuscatedName("r.d(IIII)I")
	public int getDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg2][arg1][arg0];
		return var5 == null || var5.decor == null ? 0 : var5.decor.typecode;
	}

	@ObfuscatedName("r.c(III)I")
	public int getScene(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("r.d(III)I")
	public int getGd(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("r.e(IIII)I")
	public int typeCode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return var5.wall.typecode2 & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.typecode2 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.typecode2 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.spriteCount; var6++) {
				if (var5.sprites[var6].typecode == arg3) {
					return var5.sprites[var6].typecode2 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("r.a(IIIIII)V")
	public void shareLight() {
		int var1 = (int) Math.sqrt((double) 5100);
		int var2 = var1 * 768 >> 8;
		for (int var3 = 0; var3 < this.maxTileLevel; var3++) {
			for (int var4 = 0; var4 < this.maxTileX; var4++) {
				for (int var5 = 0; var5 < this.maxTileZ; var5++) {
					Square var6 = this.squares[var3][var4][var5];
					if (var6 != null) {
						Wall var7 = var6.wall;
						if (var7 != null && var7.model1 != null && var7.model1.pointNormal != null) {
							this.shareLightLoc(1, var5, var4, 1, var3, (Model) var7.model1);
							if (var7.model2 != null && var7.model2.pointNormal != null) {
								this.shareLightLoc(1, var5, var4, 1, var3, (Model) var7.model2);
								this.modelShareLight((Model) var7.model1, (Model) var7.model2, 0, 0, 0, false);
								((Model) var7.model2).light(64, var2, -50, -10, -50);
							}
							((Model) var7.model1).light(64, var2, -50, -10, -50);
						}
						for (int var8 = 0; var8 < var6.spriteCount; var8++) {
							Sprite var9 = var6.sprites[var8];
							if (var9 != null && var9.model != null && var9.model.pointNormal != null) {
								this.shareLightLoc(var9.maxTileZ + 1 - var9.minTileZ, var5, var4, var9.maxTileX + 1 - var9.minTileX, var3, (Model) var9.model);
								((Model) var9.model).light(64, var2, -50, -10, -50);
							}
						}
						GroundDecor var10 = var6.groundDecor;
						if (var10 != null && var10.model.pointNormal != null) {
							this.shareLightGd((Model) var10.model, var4, var3, var5);
							((Model) var10.model).light(64, var2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(Leb;IIZI)V")
	public void shareLightGd(Model arg0, int arg1, int arg2, int arg3) {
		if (arg1 < this.maxTileX) {
			Square var5 = this.squares[arg2][arg1 + 1][arg3];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model.pointNormal != null) {
				this.modelShareLight(arg0, (Model) var5.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg3 < this.maxTileX) {
			Square var6 = this.squares[arg2][arg1][arg3 + 1];
			if (var6 != null && var6.groundDecor != null && var6.groundDecor.model.pointNormal != null) {
				this.modelShareLight(arg0, (Model) var6.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg1 < this.maxTileX && arg3 < this.maxTileZ) {
			Square var7 = this.squares[arg2][arg1 + 1][arg3 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.pointNormal != null) {
				this.modelShareLight(arg0, (Model) var7.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg1 >= this.maxTileX || arg3 <= 0) {
			return;
		}
		Square var8 = this.squares[arg2][arg1 + 1][arg3 - 1];
		if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.pointNormal != null) {
			this.modelShareLight(arg0, (Model) var8.groundDecor.model, 128, 0, -128, true);
			return;
		}
	}

	@ObfuscatedName("r.a(IIIIIILeb;)V")
	public void shareLightLoc(int arg0, int arg1, int arg2, int arg3, int arg4, Model arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg3;
		int var10 = arg1 - 1;
		int var11 = arg1 + arg0;
		for (int var12 = arg4; var12 <= arg4 + 1; var12++) {
			if (var12 != this.maxTileLevel) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.maxTileX) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.maxTileZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg1 && var13 != arg2)) {
								Square var15 = this.squares[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.groundh[var12][var13][var14] + this.groundh[var12][var13 + 1][var14] + this.groundh[var12][var13][var14 + 1] + this.groundh[var12][var13 + 1][var14 + 1]) / 4 - (this.groundh[arg4][arg2][arg1] + this.groundh[arg4][arg2 + 1][arg1] + this.groundh[arg4][arg2][arg1 + 1] + this.groundh[arg4][arg2 + 1][arg1 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null && var17.model1 != null && var17.model1.pointNormal != null) {
										this.modelShareLight(arg5, (Model) var17.model1, (var13 - arg2) * 128 + (1 - arg3) * 64, var16, (var14 - arg1) * 128 + (1 - arg0) * 64, var7);
									}
									if (var17 != null && var17.model2 != null && var17.model2.pointNormal != null) {
										this.modelShareLight(arg5, (Model) var17.model2, (var13 - arg2) * 128 + (1 - arg3) * 64, var16, (var14 - arg1) * 128 + (1 - arg0) * 64, var7);
									}
									for (int var18 = 0; var18 < var15.spriteCount; var18++) {
										Sprite var19 = var15.sprites[var18];
										if (var19 != null && var19.model != null && var19.model.pointNormal != null) {
											int var20 = var19.maxTileX + 1 - var19.minTileX;
											int var21 = var19.maxTileZ + 1 - var19.minTileZ;
											this.modelShareLight(arg5, (Model) var19.model, (var19.minTileX - arg2) * 128 + (var20 - arg3) * 64, var16, (var19.minTileZ - arg1) * 128 + (var21 - arg0) * 64, var7);
										}
									}
								}
							}
						}
					}
				}
				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("r.a(Leb;Leb;IIIZ)V")
	public void modelShareLight(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.shareTic++;
		int var7 = 0;
		int[] var8 = arg1.pointX;
		int var9 = arg1.numPoints;
		for (int var10 = 0; var10 < arg0.numPoints; var10++) {
			PointNormal var11 = arg0.pointNormal[var10];
			PointNormal var12 = arg0.sharedPointNormal[var10];
			if (var12.w != 0) {
				int var13 = arg0.pointY[var10] - arg3;
				if (var13 <= arg1.maxY) {
					int var14 = arg0.pointX[var10] - arg2;
					if (var14 >= arg1.minX && var14 <= arg1.maxX) {
						int var15 = arg0.pointZ[var10] - arg4;
						if (var15 >= arg1.minZ && var15 <= arg1.maxZ) {
							for (int var16 = 0; var16 < var9; var16++) {
								PointNormal var17 = arg1.pointNormal[var16];
								PointNormal var18 = arg1.sharedPointNormal[var16];
								if (var14 == var8[var16] && var15 == arg1.pointZ[var16] && var13 == arg1.pointY[var16] && var18.w != 0) {
									var11.x += var18.x;
									var11.y += var18.y;
									var11.z += var18.z;
									var11.w += var18.w;
									var17.x += var12.x;
									var17.y += var12.y;
									var17.z += var12.z;
									var17.w += var12.w;
									var7++;
									this.shareMap[var10] = this.shareTic;
									this.shareMap2[var16] = this.shareTic;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3 || !arg5) {
			return;
		}
		for (int var19 = 0; var19 < arg0.numFaces; var19++) {
			if (this.shareMap[arg0.faceVertexA[var19]] == this.shareTic && this.shareMap[arg0.faceVertexB[var19]] == this.shareTic && this.shareMap[arg0.faceVertexC[var19]] == this.shareTic) {
				arg0.faceRenderType[var19] = -1;
			}
		}
		for (int var20 = 0; var20 < arg1.numFaces; var20++) {
			if (this.shareMap2[arg1.faceVertexA[var20]] == this.shareTic && this.shareMap2[arg1.faceVertexB[var20]] == this.shareTic && this.shareMap2[arg1.faceVertexC[var20]] == this.shareTic) {
				arg1.faceRenderType[var20] = -1;
			}
		}
	}

	@ObfuscatedName("r.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.squares[arg2][arg3][arg4];
		if (var6 == null) {
			return;
		}
		QuickGround var7 = var6.quickGround;
		if (var7 != null) {
			int var8 = var7.minimapRgb;
			if (var8 != 0) {
				for (int var9 = 0; var9 < 4; var9++) {
					arg0[arg1] = var8;
					arg0[arg1 + 1] = var8;
					arg0[arg1 + 2] = var8;
					arg0[arg1 + 3] = var8;
					arg1 += 512;
				}
			}
			return;
		}
		Ground var10 = var6.ground;
		if (var10 == null) {
			return;
		}
		int var11 = var10.overlayShape;
		int var12 = var10.overlayRotation;
		int var13 = var10.minimapOverlay;
		int var14 = var10.minimapUnderlay;
		int[] var15 = this.MINIMAP_SHAPE[var11];
		int[] var16 = this.MINIMAP_ROTATE[var12];
		int var17 = 0;
		if (var13 != 0) {
			for (int var18 = 0; var18 < 4; var18++) {
				arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg1 += 512;
			}
			return;
		}
		for (int var19 = 0; var19 < 4; var19++) {
			if (var15[var16[var17++]] != 0) {
				arg0[arg1] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 1] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 2] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 3] = var14;
			}
			arg1 += 512;
		}
	}

	@ObfuscatedName("r.a(IIB)V")
	public void updateMousePicking(int arg0, int arg1, byte arg2) {
		if (arg2 != 111) {
			return;
		}
		click = true;
		clickX = arg0;
		clickY = arg1;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("r.a(IIIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.maxTileX * 128) {
			arg0 = this.maxTileX * 128 - 1;
		}
		if (arg1 < 0) {
			arg1 = 0;
		} else if (arg1 >= this.maxTileZ * 128) {
			arg1 = this.maxTileZ * 128 - 1;
		}
		cycleNo++;
		cameraSinX = Model.sinTable[arg5];
		cameraCosX = Model.cosTable[arg5];
		cameraSinY = Model.sinTable[arg2];
		cameraCosY = Model.cosTable[arg2];
		visBackingDirty = visBacking[(arg5 - 128) / 32][arg2 / 64];
		cx = arg0;
		cy = arg3;
		cz = arg1;
		gx = arg0 / 128;
		gz = arg1 / 128;
		maxLevel = arg4;
		minX = gx - 25;
		if (minX < 0) {
			minX = 0;
		}
		minZ = gz - 25;
		if (minZ < 0) {
			minZ = 0;
		}
		maxX = gx + 25;
		if (maxX > this.maxTileX) {
			maxX = this.maxTileX;
		}
		maxZ = gz + 25;
		if (maxZ > this.maxTileZ) {
			maxZ = this.maxTileZ;
		}
		this.calcOcclude(this.field280);
		fillLeft = 0;
		for (int var7 = this.minLevel; var7 < this.maxTileLevel; var7++) {
			Square[][] var8 = this.squares[var7];
			for (int var9 = minX; var9 < maxX; var9++) {
				for (int var10 = minZ; var10 < maxZ; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field380 <= arg4 && (visBackingDirty[var9 + 25 - gx][var10 + 25 - gz] || this.groundh[var7][var9][var10] - arg3 >= 2000)) {
							var11.drawFront = true;
							var11.drawBack = true;
							if (var11.spriteCount > 0) {
								var11.drawSprites = true;
							} else {
								var11.drawSprites = false;
							}
							fillLeft++;
						} else {
							var11.drawFront = false;
							var11.drawBack = false;
							var11.cornerSides = 0;
						}
					}
				}
			}
		}
		for (int var12 = this.minLevel; var12 < this.maxTileLevel; var12++) {
			Square[][] var13 = this.squares[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = gx + var14;
				int var16 = gx - var14;
				if (var15 >= minX || var16 < maxX) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = gz + var17;
						int var19 = gz - var17;
						if (var15 >= minX) {
							if (var18 >= minZ) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.drawFront) {
									this.fill(var20, true);
								}
							}
							if (var19 < maxZ) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.drawFront) {
									this.fill(var21, true);
								}
							}
						}
						if (var16 < maxX) {
							if (var18 >= minZ) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.drawFront) {
									this.fill(var22, true);
								}
							}
							if (var19 < maxZ) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.drawFront) {
									this.fill(var23, true);
								}
							}
						}
						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}
		for (int var24 = this.minLevel; var24 < this.maxTileLevel; var24++) {
			Square[][] var25 = this.squares[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = gx + var26;
				int var28 = gx - var26;
				if (var27 >= minX || var28 < maxX) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = gz + var29;
						int var31 = gz - var29;
						if (var27 >= minX) {
							if (var30 >= minZ) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.drawFront) {
									this.fill(var32, false);
								}
							}
							if (var31 < maxZ) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.drawFront) {
									this.fill(var33, false);
								}
							}
						}
						if (var28 < maxX) {
							if (var30 >= minZ) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.drawFront) {
									this.fill(var34, false);
								}
							}
							if (var31 < maxZ) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.drawFront) {
									this.fill(var35, false);
								}
							}
						}
						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(Lv;Z)V")
	public void fill(Square arg0, boolean arg1) {
		fillQueue.push(arg0);
		while (true) {
			Square var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Square[][] var8;
			Square var70;
			do {
				Square var69;
				do {
					Square var68;
					do {
						Square var67;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var3 = (Square) fillQueue.popFront();
												if (var3 == null) {
													return;
												}
											} while (!var3.drawBack);
											var4 = var3.x;
											var5 = var3.z;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = this.squares[var6];
											if (!var3.drawFront) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.squares[var6 - 1][var4][var5];
													if (var9 != null && var9.drawBack) {
														continue;
													}
												}
												if (var4 <= gx && var4 > minX) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.drawBack && (var10.drawFront || (var3.spriteSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= gx && var4 < maxX - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.drawBack && (var11.drawFront || (var3.spriteSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= gz && var5 > minZ) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (var3.spriteSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= gz && var5 < maxZ - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.drawBack && (var13.drawFront || (var3.spriteSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.drawFront = false;
											if (var3.linkedSquare != null) {
												Square var14 = var3.linkedSquare;
												if (var14.quickGround == null) {
													if (var14.ground != null && !this.groundOccluded(0, var4, var5)) {
														this.renderGround(cameraSinY, cameraCosX, var4, var14.ground, cameraCosY, var5, cameraSinX);
													}
												} else if (!this.groundOccluded(0, var4, var5)) {
													this.renderQuickGround(var14.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var15.field266 - cx, var15.field265 - cy, var15.field267 - cz, var15.typecode);
												}
												for (int var16 = 0; var16 < var14.spriteCount; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var17.x - cx, var17.field252 - cy, var17.z - cz, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.groundOccluded(var7, var4, var5)) {
													var18 = true;
													this.renderGround(cameraSinY, cameraCosX, var4, var3.ground, cameraCosY, var5, cameraSinX);
												}
											} else if (!this.groundOccluded(var7, var4, var5)) {
												var18 = true;
												this.renderQuickGround(var3.quickGround, var7, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (gx == var4) {
													var19++;
												} else if (gx < var4) {
													var19 += 2;
												}
												if (gz == var5) {
													var19 += 3;
												} else if (gz > var5) {
													var19 += 6;
												}
												var20 = PRETAB[var19];
												var3.backWallTypes = POSTTAB[var19];
											}
											if (var21 != null) {
												if ((var21.angle1 & MIDTAB[var19]) == 0) {
													var3.cornerSides = 0;
												} else if (var21.angle1 == 16) {
													var3.cornerSides = 3;
													var3.sidesBeforeCorner = MIDDEP_16[var19];
													var3.sidesAfterCorner = 3 - var3.sidesBeforeCorner;
												} else if (var21.angle1 == 32) {
													var3.cornerSides = 6;
													var3.sidesBeforeCorner = MIDDEP_32[var19];
													var3.sidesAfterCorner = 6 - var3.sidesBeforeCorner;
												} else if (var21.angle1 == 64) {
													var3.cornerSides = 12;
													var3.sidesBeforeCorner = MIDDEP_64[var19];
													var3.sidesAfterCorner = 12 - var3.sidesBeforeCorner;
												} else {
													var3.cornerSides = 9;
													var3.sidesBeforeCorner = MIDDEP_128[var19];
													var3.sidesAfterCorner = 9 - var3.sidesBeforeCorner;
												}
												if ((var21.angle1 & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.angle1)) {
													var21.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.field266 - cx, var21.field265 - cy, var21.field267 - cz, var21.typecode);
												}
												if ((var21.angle2 & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.angle2)) {
													var21.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.field266 - cx, var21.field265 - cy, var21.field267 - cz, var21.typecode);
												}
											}
											if (var22 != null && !this.spriteOccluded(var7, var4, var5, var22.model.minY)) {
												if ((var22.wshape & var20) != 0) {
													var22.model.worldRender(var22.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22.x - cx, var22.y - cy, var22.z - cz, var22.typecode);
												} else if ((var22.wshape & 0x300) != 0) {
													int var23 = var22.x - cx;
													int var24 = var22.y - cy;
													int var25 = var22.z - cz;
													int var26 = var22.angle;
													int var27;
													if (var26 == 1 || var26 == 2) {
														var27 = -var23;
													} else {
														var27 = var23;
													}
													int var28;
													if (var26 == 2 || var26 == 3) {
														var28 = -var25;
													} else {
														var28 = var25;
													}
													if ((var22.wshape & 0x100) != 0 && var28 < var27) {
														int var29 = var23 + DECORXOF[var26];
														int var30 = var25 + DECORYOF[var26];
														var22.model.worldRender(var26 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29, var24, var30, var22.typecode);
													}
													if ((var22.wshape & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + DECORXOF2[var26];
														int var32 = var25 + DECORYOF2[var26];
														var22.model.worldRender(var26 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var31, var24, var32, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var33.field192 - cx, var33.field191 - cy, var33.field193 - cz, var33.typecode);
												}
												GroundObject var34 = var3.groundObject;
												if (var34 != null && var34.height == 0) {
													if (var34.bottomObj != null) {
														var34.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.field198 - cx, var34.field197 - cy, var34.field199 - cz, var34.field203);
													}
													if (var34.middleObj != null) {
														var34.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.field198 - cx, var34.field197 - cy, var34.field199 - cz, var34.field203);
													}
													if (var34.topObj != null) {
														var34.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.field198 - cx, var34.field197 - cy, var34.field199 - cz, var34.field203);
													}
												}
											}
											int var35 = var3.spriteSpans;
											if (var35 != 0) {
												if (var4 < gx && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.drawBack) {
														fillQueue.push(var36);
													}
												}
												if (var5 < gz && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.drawBack) {
														fillQueue.push(var37);
													}
												}
												if (var4 > gx && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.drawBack) {
														fillQueue.push(var38);
													}
												}
												if (var5 > gz && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.drawBack) {
														fillQueue.push(var39);
													}
												}
											}
											break;
										}
										if (var3.cornerSides != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.spriteCount; var41++) {
												if (var3.sprites[var41].cycle != cycleNo && (var3.spriteSpan[var41] & var3.cornerSides) == var3.sidesBeforeCorner) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.wallOccluded(var7, var4, var5, var42.angle1)) {
													var42.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var42.field266 - cx, var42.field265 - cy, var42.field267 - cz, var42.typecode);
												}
												var3.cornerSides = 0;
											}
										}
										if (!var3.drawSprites) {
											break;
										}
										int var43 = var3.spriteCount;
										var3.drawSprites = false;
										int var44 = 0;
										label556: for (int var45 = 0; var45 < var43; var45++) {
											Sprite var46 = var3.sprites[var45];
											if (var46.cycle != cycleNo) {
												for (int var47 = var46.minTileX; var47 <= var46.maxTileX; var47++) {
													for (int var48 = var46.minTileZ; var48 <= var46.maxTileZ; var48++) {
														Square var49 = var8[var47][var48];
														if (var49.drawFront) {
															var3.drawSprites = true;
															continue label556;
														}
														if (var49.cornerSides != 0) {
															int var50 = 0;
															if (var47 > var46.minTileX) {
																var50++;
															}
															if (var47 < var46.maxTileX) {
																var50 += 4;
															}
															if (var48 > var46.minTileZ) {
																var50 += 8;
															}
															if (var48 < var46.maxTileZ) {
																var50 += 2;
															}
															if ((var50 & var49.cornerSides) == var3.sidesAfterCorner) {
																var3.drawSprites = true;
																continue label556;
															}
														}
													}
												}
												spriteBuffer[var44++] = var46;
												int var51 = gx - var46.minTileX;
												int var52 = var46.maxTileX - gx;
												if (var52 > var51) {
													var51 = var52;
												}
												int var53 = gz - var46.minTileZ;
												int var54 = var46.maxTileZ - gz;
												if (var54 > var53) {
													var46.distance = var51 + var54;
												} else {
													var46.distance = var51 + var53;
												}
											}
										}
										while (var44 > 0) {
											int var55 = -50;
											int var56 = -1;
											for (int var57 = 0; var57 < var44; var57++) {
												Sprite var58 = spriteBuffer[var57];
												if (var58.cycle != cycleNo) {
													if (var58.distance > var55) {
														var55 = var58.distance;
														var56 = var57;
													} else if (var58.distance == var55) {
														int var59 = var58.x - cx;
														int var60 = var58.z - cz;
														int var61 = spriteBuffer[var56].x - cx;
														int var62 = spriteBuffer[var56].z - cz;
														if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
															var56 = var57;
														}
													}
												}
											}
											if (var56 == -1) {
												break;
											}
											Sprite var63 = spriteBuffer[var56];
											var63.cycle = cycleNo;
											if (!this.spriteOccluded2(var7, var63.minTileX, var63.maxTileX, var63.minTileZ, var63.maxTileZ, var63.model.minY)) {
												var63.model.worldRender(var63.field256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var63.x - cx, var63.field252 - cy, var63.z - cz, var63.typecode);
											}
											for (int var64 = var63.minTileX; var64 <= var63.maxTileX; var64++) {
												for (int var65 = var63.minTileZ; var65 <= var63.maxTileZ; var65++) {
													Square var66 = var8[var64][var65];
													if (var66.cornerSides != 0) {
														fillQueue.push(var66);
													} else if ((var64 != var4 || var65 != var5) && var66.drawBack) {
														fillQueue.push(var66);
													}
												}
											}
										}
										if (!var3.drawSprites) {
											break;
										}
									}
								} while (!var3.drawBack);
							} while (var3.cornerSides != 0);
							if (var4 > gx || var4 <= minX) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.drawBack);
						if (var4 < gx || var4 >= maxX - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.drawBack);
					if (var5 > gz || var5 <= minZ) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.drawBack);
				if (var5 < gz || var5 >= maxZ - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.drawBack);
			var3.drawBack = false;
			fillLeft--;
			GroundObject var71 = var3.groundObject;
			if (var71 != null && var71.height != 0) {
				if (var71.bottomObj != null) {
					var71.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.field198 - cx, var71.field197 - cy - var71.height, var71.field199 - cz, var71.field203);
				}
				if (var71.middleObj != null) {
					var71.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.field198 - cx, var71.field197 - cy - var71.height, var71.field199 - cz, var71.field203);
				}
				if (var71.topObj != null) {
					var71.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.field198 - cx, var71.field197 - cy - var71.height, var71.field199 - cz, var71.field203);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var72 = var3.decor;
				if (var72 != null && !this.spriteOccluded(var7, var4, var5, var72.model.minY)) {
					if ((var72.wshape & var3.backWallTypes) != 0) {
						var72.model.worldRender(var72.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var72.x - cx, var72.y - cy, var72.z - cz, var72.typecode);
					} else if ((var72.wshape & 0x300) != 0) {
						int var73 = var72.x - cx;
						int var74 = var72.y - cy;
						int var75 = var72.z - cz;
						int var76 = var72.angle;
						int var77;
						if (var76 == 1 || var76 == 2) {
							var77 = -var73;
						} else {
							var77 = var73;
						}
						int var78;
						if (var76 == 2 || var76 == 3) {
							var78 = -var75;
						} else {
							var78 = var75;
						}
						if ((var72.wshape & 0x100) != 0 && var78 >= var77) {
							int var79 = var73 + DECORXOF[var76];
							int var80 = var75 + DECORYOF[var76];
							var72.model.worldRender(var76 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var79, var74, var80, var72.typecode);
						}
						if ((var72.wshape & 0x200) != 0 && var78 <= var77) {
							int var81 = var73 + DECORXOF2[var76];
							int var82 = var75 + DECORYOF2[var76];
							var72.model.worldRender(var76 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var81, var74, var82, var72.typecode);
						}
					}
				}
				Wall var83 = var3.wall;
				if (var83 != null) {
					if ((var83.angle2 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle2)) {
						var83.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var83.field266 - cx, var83.field265 - cy, var83.field267 - cz, var83.typecode);
					}
					if ((var83.angle1 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle1)) {
						var83.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var83.field266 - cx, var83.field265 - cy, var83.field267 - cz, var83.typecode);
					}
				}
			}
			if (var6 < this.maxTileLevel - 1) {
				Square var84 = this.squares[var6 + 1][var4][var5];
				if (var84 != null && var84.drawBack) {
					fillQueue.push(var84);
				}
			}
			if (var4 < gx) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.drawBack) {
					fillQueue.push(var85);
				}
			}
			if (var5 < gz) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.drawBack) {
					fillQueue.push(var86);
				}
			}
			if (var4 > gx) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.drawBack) {
					fillQueue.push(var87);
				}
			}
			if (var5 > gz) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.drawBack) {
					fillQueue.push(var88);
				}
			}
		}
	}

	@ObfuscatedName("r.a(Lo;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - cx;
		int var11;
		int var12 = var11 = (arg7 << 7) - cz;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.groundh[arg1][arg6][arg7] - cy;
		int var18 = this.groundh[arg1][arg6 + 1][arg7] - cy;
		int var19 = this.groundh[arg1][arg6 + 1][arg7 + 1] - cy;
		int var20 = this.groundh[arg1][arg6][arg7 + 1] - cy;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = var11 * arg4 + var14 * arg5 >> 16;
		int var28 = var11 * arg5 - var14 * arg4 >> 16;
		int var30 = var18 * arg3 - var28 * arg2 >> 16;
		int var31 = var18 * arg2 + var28 * arg3 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = var16 * arg4 + var13 * arg5 >> 16;
		int var34 = var16 * arg5 - var13 * arg4 >> 16;
		int var36 = var19 * arg3 - var34 * arg2 >> 16;
		int var37 = var19 * arg2 + var34 * arg3 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = var15 * arg4 + var9 * arg5 >> 16;
		int var40 = var15 * arg5 - var9 * arg4 >> 16;
		int var42 = var20 * arg3 - var40 * arg2 >> 16;
		int var43 = var20 * arg2 + var40 * arg3 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = Pix3D.originX + (var21 << 9) / var25;
		int var45 = Pix3D.originY + (var24 << 9) / var25;
		int var46 = Pix3D.originX + (var27 << 9) / var31;
		int var47 = Pix3D.originY + (var30 << 9) / var31;
		int var48 = Pix3D.originX + (var33 << 9) / var37;
		int var49 = Pix3D.originY + (var36 << 9) / var37;
		int var50 = Pix3D.originX + (var39 << 9) / var43;
		int var51 = Pix3D.originY + (var42 << 9) / var43;
		Pix3D.trans = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			Pix3D.hclip = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix2D.sizeX || var50 > Pix2D.sizeX || var46 > Pix2D.sizeX) {
				Pix3D.hclip = true;
			}
			if (click && this.insideTriangle(clickX, clickY, var49, var51, var47, var48, var50, var46)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (arg0.texture == -1) {
				if (arg0.colourNE != 12345678) {
					Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field247, arg0.field245);
				}
			} else if (lowMem) {
				int var52 = TEXTURE_AVERAGE[arg0.texture];
				Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, this.getTable(var52, arg0.colourNE), this.getTable(var52, arg0.field247), this.getTable(var52, arg0.field245));
			} else if (arg0.flat) {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field247, arg0.field245, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
			} else {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field247, arg0.field245, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.texture);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix2D.sizeX || var46 > Pix2D.sizeX || var50 > Pix2D.sizeX) {
			Pix3D.hclip = true;
		}
		if (click && this.insideTriangle(clickX, clickY, var45, var47, var51, var44, var46, var50)) {
			groundX = arg6;
			groundZ = arg7;
		}
		if (arg0.texture != -1) {
			if (!lowMem) {
				Pix3D.textureTriangle(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.field245, arg0.field247, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
				return;
			}
			int var53 = TEXTURE_AVERAGE[arg0.texture];
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, this.getTable(var53, arg0.colourSW), this.getTable(var53, arg0.field245), this.getTable(var53, arg0.field247));
		} else if (arg0.colourSW != 12345678) {
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.field245, arg0.field247);
			return;
		}
	}

	@ObfuscatedName("r.a(IIILi;IIII)V")
	public void renderGround(int arg0, int arg1, int arg2, Ground arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3.vertexX.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg3.vertexX[var9] - cx;
			int var11 = arg3.vertexY[var9] - cy;
			int var12 = arg3.vertexZ[var9] - cz;
			int var13 = var12 * arg0 + var10 * arg4 >> 16;
			int var14 = var12 * arg4 - var10 * arg0 >> 16;
			int var16 = var11 * arg1 - var14 * arg6 >> 16;
			int var17 = var11 * arg6 + var14 * arg1 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg3.faceTexture != null) {
				Ground.drawTextureVertexX[var9] = var13;
				Ground.drawTextureVertexY[var9] = var16;
				Ground.drawTextureVertexZ[var9] = var17;
			}
			Ground.drawVertexX[var9] = Pix3D.originX + (var13 << 9) / var17;
			Ground.drawVertexY[var9] = Pix3D.originY + (var16 << 9) / var17;
		}
		Pix3D.trans = 0;
		int var18 = arg3.faceVertexA.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg3.faceVertexA[var19];
			int var21 = arg3.faceVertexB[var19];
			int var22 = arg3.faceVertexC[var19];
			int var23 = Ground.drawVertexX[var20];
			int var24 = Ground.drawVertexX[var21];
			int var25 = Ground.drawVertexX[var22];
			int var26 = Ground.drawVertexY[var20];
			int var27 = Ground.drawVertexY[var21];
			int var28 = Ground.drawVertexY[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				Pix3D.hclip = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix2D.sizeX || var24 > Pix2D.sizeX || var25 > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}
				if (click && this.insideTriangle(clickX, clickY, var26, var27, var28, var23, var24, var25)) {
					groundX = arg2;
					groundZ = arg5;
				}
				if (arg3.faceTexture == null || arg3.faceTexture[var19] == -1) {
					if (arg3.faceColourA[var19] != 12345678) {
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.field170[var19], arg3.field171[var19]);
					}
				} else if (lowMem) {
					int var29 = TEXTURE_AVERAGE[arg3.faceTexture[var19]];
					Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, this.getTable(var29, arg3.faceColourA[var19]), this.getTable(var29, arg3.field170[var19]), this.getTable(var29, arg3.field171[var19]));
				} else if (arg3.flat) {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.field170[var19], arg3.field171[var19], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg3.faceTexture[var19]);
				} else {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.field170[var19], arg3.field171[var19], Ground.drawTextureVertexX[var20], Ground.drawTextureVertexX[var21], Ground.drawTextureVertexX[var22], Ground.drawTextureVertexY[var20], Ground.drawTextureVertexY[var21], Ground.drawTextureVertexY[var22], Ground.drawTextureVertexZ[var20], Ground.drawTextureVertexZ[var21], Ground.drawTextureVertexZ[var22], arg3.faceTexture[var19]);
				}
			}
		}
	}

	@ObfuscatedName("r.e(III)I")
	public int getTable(int arg0, int arg1) {
		if (this.field279 != -12792) {
			return 4;
		}
		int var3 = 127 - arg1;
		int var4 = var3 * (arg0 & 0x7F) / 160;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	@ObfuscatedName("r.a(IIIIIIII)Z")
	public boolean insideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var9 * var11 > 0 && var11 * var10 > 0;
		}
	}

	@ObfuscatedName("r.b(I)V")
	public void calcOcclude(int arg0) {
		int var2 = numOccluders[maxLevel];
		Occlude[] var3 = occluders[maxLevel];
		numActiveOccluders = 0;
		for (int var4 = 0; var4 < var2; var4++) {
			Occlude var5 = var3[var4];
			if (var5.type == 1) {
				int var6 = var5.minTileX + 25 - gx;
				if (var6 >= 0 && var6 <= 50) {
					int var7 = var5.minTileZ + 25 - gz;
					if (var7 < 0) {
						var7 = 0;
					}
					int var8 = var5.maxTileZ + 25 - gz;
					if (var8 > 50) {
						var8 = 50;
					}
					boolean var9 = false;
					while (var7 <= var8) {
						if (visBackingDirty[var6][var7++]) {
							var9 = true;
							break;
						}
					}
					if (var9) {
						int var10 = cx - var5.minX;
						if (var10 > 32) {
							var5.mode = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}
							var5.mode = 2;
							var10 = -var10;
						}
						var5.minDeltaZ = (var5.minZ - cz << 8) / var10;
						var5.maxDeltaZ = (var5.maxZ - cz << 8) / var10;
						var5.minDeltaY = (var5.minY - cy << 8) / var10;
						var5.maxDeltaY = (var5.maxY - cy << 8) / var10;
						activeOccluders[numActiveOccluders++] = var5;
					}
				}
			} else if (var5.type == 2) {
				int var11 = var5.minTileZ + 25 - gz;
				if (var11 >= 0 && var11 <= 50) {
					int var12 = var5.minTileX + 25 - gx;
					if (var12 < 0) {
						var12 = 0;
					}
					int var13 = var5.maxTileX + 25 - gx;
					if (var13 > 50) {
						var13 = 50;
					}
					boolean var14 = false;
					while (var12 <= var13) {
						if (visBackingDirty[var12++][var11]) {
							var14 = true;
							break;
						}
					}
					if (var14) {
						int var15 = cz - var5.minZ;
						if (var15 > 32) {
							var5.mode = 3;
						} else {
							if (var15 >= -32) {
								continue;
							}
							var5.mode = 4;
							var15 = -var15;
						}
						var5.minDeltaX = (var5.minX - cx << 8) / var15;
						var5.maxDeltaX = (var5.maxX - cx << 8) / var15;
						var5.minDeltaY = (var5.minY - cy << 8) / var15;
						var5.maxDeltaY = (var5.maxY - cy << 8) / var15;
						activeOccluders[numActiveOccluders++] = var5;
					}
				}
			} else if (var5.type == 4) {
				int var16 = var5.minY - cy;
				if (var16 > 128) {
					int var17 = var5.minTileZ + 25 - gz;
					if (var17 < 0) {
						var17 = 0;
					}
					int var18 = var5.maxTileZ + 25 - gz;
					if (var18 > 50) {
						var18 = 50;
					}
					if (var17 <= var18) {
						int var19 = var5.minTileX + 25 - gx;
						if (var19 < 0) {
							var19 = 0;
						}
						int var20 = var5.maxTileX + 25 - gx;
						if (var20 > 50) {
							var20 = 50;
						}
						boolean var21 = false;
						label157: for (int var22 = var19; var22 <= var20; var22++) {
							for (int var23 = var17; var23 <= var18; var23++) {
								if (visBackingDirty[var22][var23]) {
									var21 = true;
									break label157;
								}
							}
						}
						if (var21) {
							var5.mode = 5;
							var5.minDeltaX = (var5.minX - cx << 8) / var16;
							var5.maxDeltaX = (var5.maxX - cx << 8) / var16;
							var5.minDeltaZ = (var5.minZ - cz << 8) / var16;
							var5.maxDeltaZ = (var5.maxZ - cz << 8) / var16;
							activeOccluders[numActiveOccluders++] = var5;
						}
					}
				}
			}
		}
		if (arg0 < 4 || arg0 > 4) {
			for (int var24 = 1; var24 > 0; var24++) {
			}
		}
	}

	@ObfuscatedName("r.f(III)Z")
	public boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var4 = this.occlusionCycle[arg0][arg1][arg2];
		if (var4 == -cycleNo) {
			return false;
		} else if (var4 == cycleNo) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.occlusionCycle[arg0][arg1][arg2] = cycleNo;
				return true;
			} else {
				this.occlusionCycle[arg0][arg1][arg2] = -cycleNo;
				return false;
			}
		}
	}

	@ObfuscatedName("r.f(IIII)Z")
	public boolean wallOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!this.groundOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.groundh[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > cx) {
					if (!this.occluded(var5, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < cz) {
					if (!this.occluded(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < cx) {
					if (!this.occluded(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > cz) {
					if (!this.occluded(var5, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.occluded(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.occluded(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.occluded(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.occluded(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.occluded(var5, var9, var6);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("r.g(IIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (this.groundOccluded(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("r.b(IIIIII)Z")
	public boolean spriteOccluded2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.occlusionCycle[arg0][var9][var10] == -cycleNo) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.groundh[arg0][arg1][arg3] - arg5;
			if (!this.occluded(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.occluded(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.occluded(var11, var13, var15)) {
				return false;
			} else if (this.occluded(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.groundOccluded(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.occluded(var7 + 1, this.groundh[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundh[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundh[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.groundh[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("r.g(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numActiveOccluders; var4++) {
			Occlude var5 = activeOccluders[var4];
			if (var5.mode == 1) {
				int var6 = var5.minX - arg0;
				if (var6 > 0) {
					int var7 = var5.minZ + (var5.minDeltaZ * var6 >> 8);
					int var8 = var5.maxZ + (var5.maxDeltaZ * var6 >> 8);
					int var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
					int var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.mode == 2) {
				int var11 = arg0 - var5.minX;
				if (var11 > 0) {
					int var12 = var5.minZ + (var5.minDeltaZ * var11 >> 8);
					int var13 = var5.maxZ + (var5.maxDeltaZ * var11 >> 8);
					int var14 = var5.minY + (var5.minDeltaY * var11 >> 8);
					int var15 = var5.maxY + (var5.maxDeltaY * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.mode == 3) {
				int var16 = var5.minZ - arg2;
				if (var16 > 0) {
					int var17 = var5.minX + (var5.minDeltaX * var16 >> 8);
					int var18 = var5.maxX + (var5.maxDeltaX * var16 >> 8);
					int var19 = var5.minY + (var5.minDeltaY * var16 >> 8);
					int var20 = var5.maxY + (var5.maxDeltaY * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.mode == 4) {
				int var21 = arg2 - var5.minZ;
				if (var21 > 0) {
					int var22 = var5.minX + (var5.minDeltaX * var21 >> 8);
					int var23 = var5.maxX + (var5.maxDeltaX * var21 >> 8);
					int var24 = var5.minY + (var5.minDeltaY * var21 >> 8);
					int var25 = var5.maxY + (var5.maxDeltaY * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.mode == 5) {
				int var26 = arg1 - var5.minY;
				if (var26 > 0) {
					int var27 = var5.minX + (var5.minDeltaX * var26 >> 8);
					int var28 = var5.maxX + (var5.maxDeltaX * var26 >> 8);
					int var29 = var5.minZ + (var5.minDeltaZ * var26 >> 8);
					int var30 = var5.maxZ + (var5.maxDeltaZ * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
