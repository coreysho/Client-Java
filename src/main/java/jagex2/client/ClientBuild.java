package jagex2.client;

import deob.*;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.dash3d.*;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public final class ClientBuild {

	@ObfuscatedName("c.a")
	public final int field38 = 618;

	@ObfuscatedName("c.b")
	public final int field39 = 587;

	@ObfuscatedName("c.c")
	public final boolean field40 = false;

	@ObfuscatedName("c.d")
	public static int field41;

	@ObfuscatedName("c.e")
	public static boolean lowMem = true;

	@ObfuscatedName("c.f")
	public static int minusedlevel;

	@ObfuscatedName("c.g")
	public final int maxTileX = 104;

	@ObfuscatedName("c.h")
	public final int maxTileZ = 104;

	@ObfuscatedName("c.i")
	public final int[][][] groundh;

	@ObfuscatedName("c.j")
	public final byte[][][] mapl;

	@ObfuscatedName("c.k")
	public final byte[][][] floort1;

	@ObfuscatedName("c.l")
	public final byte[][][] floort2;

	@ObfuscatedName("c.m")
	public final byte[][][] floors;

	@ObfuscatedName("c.n")
	public final byte[][][] floorr;

	@ObfuscatedName("c.o")
	public final byte[][][] shadow;

	@ObfuscatedName("c.p")
	public final int[][] lightmap;

	@ObfuscatedName("c.q")
	public final int[] huetot;

	@ObfuscatedName("c.r")
	public final int[] sattot;

	@ObfuscatedName("c.s")
	public final int[] ligtot;

	@ObfuscatedName("c.t")
	public final int[] comtot;

	@ObfuscatedName("c.u")
	public final int[] tot;

	@ObfuscatedName("c.v")
	public final int[][][] mapo;

	@ObfuscatedName("c.w")
	public static final int[] WSHAPE0 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] WSHAPE1 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] field62 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] field63 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.A")
	public static int hueOff = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.B")
	public static int ligOff = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("c.a(B[BII)Z")
	public static boolean checkLocations(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg0, (byte) 1);
		int var5 = -1;
		label50: while (true) {
			int var6 = var4.gsmart();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				while (!var8) {
					int var10 = var4.gsmart();
					if (var10 == 0) {
						continue label50;
					}
					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.g1() >> 2;
					int var14 = var12 + arg2;
					int var15 = var11 + arg1;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.list(var5);
						if (var13 != 22 || !lowMem || var16.active || var16.forcedecor) {
							var3 &= var16.checkModelAll();
							var8 = true;
						}
					}
				}
				int var9 = var4.gsmart();
				if (var9 == 0) {
					break;
				}
				var4.g1();
			}
		}
	}

	@ObfuscatedName("c.a(BLlb;Lub;)V")
	public static void prefetchLocations(Packet arg0, OnDemand arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.gsmart();
			if (var3 == 0) {
				return;
			}
			var2 += var3;
			LocType var4 = LocType.list(var2);
			var4.prefetchModelAll(arg1);
			while (true) {
				int var5 = arg0.gsmart();
				if (var5 == 0) {
					break;
				}
				arg0.g1();
			}
		}
	}

	@ObfuscatedName("c.a(II)I")
	public static int perlinNoise(int arg0, int arg1) {
		int var2 = interpolatedNoise(arg0 + 45365, arg1 + 91923, 4) + (interpolatedNoise(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (interpolatedNoise(arg0, arg1, 1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("c.a(III)I")
	public static int interpolatedNoise(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = smoothNoise(var3, var5);
		int var8 = smoothNoise(var3 + 1, var5);
		int var9 = smoothNoise(var3, var5 + 1);
		int var10 = smoothNoise(var3 + 1, var5 + 1);
		int var11 = interpolate(var7, var8, var4, arg2);
		int var12 = interpolate(var9, var10, var4, arg2);
		return interpolate(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static int interpolate(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("c.c(II)I")
	public static int noise(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static int getUCol(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = arg1 * (arg0 & 0x7F) / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("c.c(III)Z")
	public static boolean changeLocAvailable(int arg0, int arg1) {
		LocType var2 = LocType.list(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var2.checkModel(arg1);
	}

	@ObfuscatedName("c.a(Lr;IIZIIILjc;[[[III)V")
	public static void changeLocUnchecked(World arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int[][][] arg8, int arg9, int arg10) {
		int var11 = arg8[arg1][arg10][arg9];
		int var12 = arg8[arg1][arg10 + 1][arg9];
		int var13 = arg8[arg1][arg10 + 1][arg9 + 1];
		int var14 = arg8[arg1][arg10][arg9 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		if (!arg3) {
			return;
		}
		LocType var16 = LocType.list(arg4);
		int var17 = arg10 + (arg9 << 7) + (arg4 << 14) + 1073741824;
		if (!var16.active) {
			var17 += Integer.MIN_VALUE;
		}
		byte var18 = (byte) ((arg6 << 6) + arg5);
		if (arg5 == 22) {
			ModelSource var19;
			if (var16.anim == -1) {
				var19 = var16.getModel(22, arg6, var11, var12, var13, var14, -1);
			} else {
				var19 = new ClientLocAnim(22, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.setGroundDecor(var15, var19, arg10, arg2, var17, var18, arg9);
			if (var16.blockwalk && var16.active) {
				arg7.blockGround(arg10, arg9);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ModelSource var20;
			if (var16.anim == -1) {
				var20 = var16.getModel(10, arg6, var11, var12, var13, var14, -1);
			} else {
				var20 = new ClientLocAnim(10, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			if (var20 != null) {
				int var21 = 0;
				if (arg5 == 11) {
					var21 += 256;
				}
				int var22;
				int var23;
				if (arg6 == 1 || arg6 == 3) {
					var22 = var16.length;
					var23 = var16.width;
				} else {
					var22 = var16.width;
					var23 = var16.length;
				}
				arg0.addScenery(arg10, arg9, var23, arg2, var15, var20, var18, var22, var21, var17);
			}
			if (var16.blockwalk) {
				arg7.addLoc(var16.width, arg10, var16.length, arg9, arg6, var16.blockrange);
			}
		} else if (arg5 >= 12) {
			ModelSource var24;
			if (var16.anim == -1) {
				var24 = var16.getModel(arg5, arg6, var11, var12, var13, var14, -1);
			} else {
				var24 = new ClientLocAnim(arg5, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.addScenery(arg10, arg9, 1, arg2, var15, var24, var18, 1, 0, var17);
			if (var16.blockwalk) {
				arg7.addLoc(var16.width, arg10, var16.length, arg9, arg6, var16.blockrange);
			}
		} else if (arg5 == 0) {
			ModelSource var25;
			if (var16.anim == -1) {
				var25 = var16.getModel(0, arg6, var11, var12, var13, var14, -1);
			} else {
				var25 = new ClientLocAnim(0, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.setWall(WSHAPE0[arg6], null, var15, arg10, arg2, var18, 0, var17, var25, arg9);
			if (var16.blockwalk) {
				arg7.addWall(arg6, arg5, var16.blockrange, arg9, arg10);
			}
		} else if (arg5 == 1) {
			ModelSource var26;
			if (var16.anim == -1) {
				var26 = var16.getModel(1, arg6, var11, var12, var13, var14, -1);
			} else {
				var26 = new ClientLocAnim(1, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.setWall(WSHAPE1[arg6], null, var15, arg10, arg2, var18, 0, var17, var26, arg9);
			if (var16.blockwalk) {
				arg7.addWall(arg6, arg5, var16.blockrange, arg9, arg10);
			}
		} else if (arg5 == 2) {
			int var27 = arg6 + 1 & 0x3;
			ModelSource var28;
			ModelSource var29;
			if (var16.anim == -1) {
				var28 = var16.getModel(2, arg6 + 4, var11, var12, var13, var14, -1);
				var29 = var16.getModel(2, var27, var11, var12, var13, var14, -1);
			} else {
				var28 = new ClientLocAnim(2, arg6 + 4, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				var29 = new ClientLocAnim(2, var27, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.setWall(WSHAPE0[arg6], var29, var15, arg10, arg2, var18, WSHAPE0[var27], var17, var28, arg9);
			if (var16.blockwalk) {
				arg7.addWall(arg6, arg5, var16.blockrange, arg9, arg10);
			}
		} else if (arg5 == 3) {
			ModelSource var30;
			if (var16.anim == -1) {
				var30 = var16.getModel(3, arg6, var11, var12, var13, var14, -1);
			} else {
				var30 = new ClientLocAnim(3, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.setWall(WSHAPE1[arg6], null, var15, arg10, arg2, var18, 0, var17, var30, arg9);
			if (var16.blockwalk) {
				arg7.addWall(arg6, arg5, var16.blockrange, arg9, arg10);
			}
		} else if (arg5 == 9) {
			ModelSource var31;
			if (var16.anim == -1) {
				var31 = var16.getModel(arg5, arg6, var11, var12, var13, var14, -1);
			} else {
				var31 = new ClientLocAnim(arg5, arg6, var16.anim, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.addScenery(arg10, arg9, 1, arg2, var15, var31, var18, 1, 0, var17);
			if (var16.blockwalk) {
				arg7.addLoc(var16.width, arg10, var16.length, arg9, arg6, var16.blockrange);
			}
		} else {
			if (var16.hillskew) {
				if (arg6 == 1) {
					int var32 = var14;
					var14 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var32;
				} else if (arg6 == 2) {
					int var33 = var14;
					var14 = var12;
					var12 = var33;
					int var34 = var13;
					var13 = var11;
					var11 = var34;
				} else if (arg6 == 3) {
					int var35 = var14;
					var14 = var11;
					var11 = var12;
					var12 = var13;
					var13 = var35;
				}
			}
			if (arg5 == 4) {
				ModelSource var36;
				if (var16.anim == -1) {
					var36 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
				} else {
					var36 = new ClientLocAnim(4, 0, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.setDecor(WSHAPE0[arg6], var36, var18, arg9, var15, 0, arg6 * 512, arg2, arg10, 0, var17);
			} else if (arg5 == 5) {
				int var37 = 16;
				int var38 = arg0.getWall(arg2, arg10, arg9);
				if (var38 > 0) {
					var37 = LocType.list(var38 >> 14 & 0x7FFF).wallwidth;
				}
				ModelSource var39;
				if (var16.anim == -1) {
					var39 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
				} else {
					var39 = new ClientLocAnim(4, 0, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.setDecor(WSHAPE0[arg6], var39, var18, arg9, var15, field62[arg6] * var37, arg6 * 512, arg2, arg10, field63[arg6] * var37, var17);
			} else if (arg5 == 6) {
				ModelSource var40;
				if (var16.anim == -1) {
					var40 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
				} else {
					var40 = new ClientLocAnim(4, 0, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.setDecor(256, var40, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			} else if (arg5 == 7) {
				ModelSource var41;
				if (var16.anim == -1) {
					var41 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
				} else {
					var41 = new ClientLocAnim(4, 0, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.setDecor(512, var41, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			} else if (arg5 == 8) {
				ModelSource var42;
				if (var16.anim == -1) {
					var42 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
				} else {
					var42 = new ClientLocAnim(4, 0, var16.anim, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.setDecor(768, var42, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			}
		}
	}

	public ClientBuild(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
		this.groundh = arg1;
		this.mapl = arg4;
		this.floort1 = new byte[4][this.maxTileX][this.maxTileZ];
		this.floort2 = new byte[4][this.maxTileX][this.maxTileZ];
		this.floors = new byte[4][this.maxTileX][this.maxTileZ];
		this.floorr = new byte[4][this.maxTileX][this.maxTileZ];
		this.mapo = new int[4][this.maxTileX + 1][this.maxTileZ + 1];
		this.shadow = new byte[4][this.maxTileX + 1][this.maxTileZ + 1];
		this.lightmap = new int[this.maxTileX + 1][this.maxTileZ + 1];
		this.huetot = new int[this.maxTileZ];
		this.sattot = new int[this.maxTileZ];
		this.ligtot = new int[this.maxTileZ];
		this.comtot = new int[this.maxTileZ];
		this.tot = new int[this.maxTileZ];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public void fadeAdjacent(int arg0, int arg1) {
		for (int var3 = arg0; var3 <= arg0 + 64; var3++) {
			for (int var4 = arg1; var4 <= arg1 + 64; var4++) {
				if (var4 >= 0 && var4 < this.maxTileX && var3 >= 0 && var3 < this.maxTileZ) {
					this.shadow[0][var4][var3] = 127;
					if (var4 == arg1 && var4 > 0) {
						this.groundh[0][var4][var3] = this.groundh[0][var4 - 1][var3];
					}
					if (var4 == arg1 + 64 && var4 < this.maxTileX - 1) {
						this.groundh[0][var4][var3] = this.groundh[0][var4 + 1][var3];
					}
					if (var3 == arg0 && var3 > 0) {
						this.groundh[0][var4][var3] = this.groundh[0][var4][var3 - 1];
					}
					if (var3 == arg0 + 64 && var3 < this.maxTileZ - 1) {
						this.groundh[0][var4][var3] = this.groundh[0][var4][var3 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(ZI[BIII)V")
	public void loadGround(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
		Packet var6 = new Packet(arg1, (byte) 1);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = var8 + arg4;
					int var11 = var9 + arg2;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						this.mapl[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.g1();
							if (var12 == 0) {
								if (var7 == 0) {
									this.groundh[0][var10][var11] = -perlinNoise(var10 + arg0 + 932731, var11 + 556238 + arg3) * 8;
								} else {
									this.groundh[var7][var10][var11] = this.groundh[var7 - 1][var10][var11] - 240;
								}
								break;
							}
							if (var12 == 1) {
								int var13 = var6.g1();
								if (var13 == 1) {
									var13 = 0;
								}
								if (var7 == 0) {
									this.groundh[0][var10][var11] = -var13 * 8;
								} else {
									this.groundh[var7][var10][var11] = this.groundh[var7 - 1][var10][var11] - var13 * 8;
								}
								break;
							}
							if (var12 <= 49) {
								this.floort2[var7][var10][var11] = var6.g1b();
								this.floors[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								this.floorr[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								this.mapl[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								this.floort1[var7][var10][var11] = (byte) (var12 - 81);
							}
						}
					} else {
						while (true) {
							int var14 = var6.g1();
							if (var14 == 0) {
								break;
							}
							if (var14 == 1) {
								var6.g1();
								break;
							}
							if (var14 <= 49) {
								var6.g1();
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BZLr;I[Ljc;)V")
	public void loadLocations(int arg0, byte[] arg1, World arg2, int arg3, CollisionMap[] arg4) {
		Packet var6 = new Packet(arg1, (byte) 1);
		int var7 = -1;
		while (true) {
			int var8 = var6.gsmart();
			if (var8 == 0) {
				return;
			}
			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.gsmart();
				if (var10 == 0) {
					break;
				}
				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.g1();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = var12 + arg3;
				int var18 = var11 + arg0;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((this.mapl[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}
					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}
					this.addLoc(var13, var20, var16, var15, var18, arg2, var7, var17);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IILjc;IIILr;II)V")
	public void addLoc(int arg0, CollisionMap arg1, int arg2, int arg3, int arg4, World arg5, int arg6, int arg7) {
		if (lowMem) {
			if ((this.mapl[arg0][arg7][arg4] & 0x10) != 0) {
				return;
			}
			if (this.getVisBelowLevel(arg0, arg4, arg7) != minusedlevel) {
				return;
			}
		}
		int var9 = this.groundh[arg0][arg7][arg4];
		int var10 = this.groundh[arg0][arg7 + 1][arg4];
		int var11 = this.groundh[arg0][arg7 + 1][arg4 + 1];
		int var12 = this.groundh[arg0][arg7][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.list(arg6);
		int var15 = arg7 + (arg4 << 7) + (arg6 << 14) + 1073741824;
		if (!var14.active) {
			var15 += Integer.MIN_VALUE;
		}
		byte var16 = (byte) ((arg2 << 6) + arg3);
		if (arg3 == 22) {
			if (!lowMem || var14.active || var14.forcedecor) {
				ModelSource var17;
				if (var14.anim == -1) {
					var17 = var14.getModel(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new ClientLocAnim(22, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setGroundDecor(var13, var17, arg7, arg0, var15, var16, arg4);
				if (var14.blockwalk && var14.active && arg1 != null) {
					arg1.blockGround(arg7, arg4);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ModelSource var18;
			if (var14.anim == -1) {
				var18 = var14.getModel(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new ClientLocAnim(10, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}
				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.length;
					var21 = var14.width;
				} else {
					var20 = var14.width;
					var21 = var14.length;
				}
				if (arg5.addScenery(arg7, arg4, var21, arg0, var13, var18, var16, var20, var19, var15) && var14.shadow) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.getModel(10, arg2, var9, var10, var11, var12, -1);
					}
					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.radius / 4;
								if (var25 > 30) {
									var25 = 30;
								}
								if (var25 > this.shadow[arg0][arg7 + var23][arg4 + var24]) {
									this.shadow[arg0][arg7 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addLoc(var14.width, arg7, var14.length, arg4, arg2, var14.blockrange);
			}
		} else if (arg3 >= 12) {
			ModelSource var26;
			if (var14.anim == -1) {
				var26 = var14.getModel(arg3, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new ClientLocAnim(arg3, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.addScenery(arg7, arg4, 1, arg0, var13, var26, var16, 1, 0, var15);
			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
				this.mapo[arg0][arg7][arg4] |= 0x924;
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addLoc(var14.width, arg7, var14.length, arg4, arg2, var14.blockrange);
			}
		} else if (arg3 == 0) {
			ModelSource var27;
			if (var14.anim == -1) {
				var27 = var14.getModel(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new ClientLocAnim(0, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.setWall(WSHAPE0[arg2], null, var13, arg7, arg0, var16, 0, var15, var27, arg4);
			if (arg2 == 0) {
				if (var14.shadow) {
					this.shadow[arg0][arg7][arg4] = 50;
					this.shadow[arg0][arg7][arg4 + 1] = 50;
				}
				if (var14.occlude) {
					this.mapo[arg0][arg7][arg4] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.shadow) {
					this.shadow[arg0][arg7][arg4 + 1] = 50;
					this.shadow[arg0][arg7 + 1][arg4 + 1] = 50;
				}
				if (var14.occlude) {
					this.mapo[arg0][arg7][arg4 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.shadow) {
					this.shadow[arg0][arg7 + 1][arg4] = 50;
					this.shadow[arg0][arg7 + 1][arg4 + 1] = 50;
				}
				if (var14.occlude) {
					this.mapo[arg0][arg7 + 1][arg4] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.shadow) {
					this.shadow[arg0][arg7][arg4] = 50;
					this.shadow[arg0][arg7 + 1][arg4] = 50;
				}
				if (var14.occlude) {
					this.mapo[arg0][arg7][arg4] |= 0x492;
				}
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addWall(arg2, arg3, var14.blockrange, arg4, arg7);
			}
			if (var14.wallwidth != 16) {
				arg5.setDecor(arg7, arg4, arg0, var14.wallwidth);
			}
		} else if (arg3 == 1) {
			ModelSource var28;
			if (var14.anim == -1) {
				var28 = var14.getModel(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new ClientLocAnim(1, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.setWall(WSHAPE1[arg2], null, var13, arg7, arg0, var16, 0, var15, var28, arg4);
			if (var14.shadow) {
				if (arg2 == 0) {
					this.shadow[arg0][arg7][arg4 + 1] = 50;
				} else if (arg2 == 1) {
					this.shadow[arg0][arg7 + 1][arg4 + 1] = 50;
				} else if (arg2 == 2) {
					this.shadow[arg0][arg7 + 1][arg4] = 50;
				} else if (arg2 == 3) {
					this.shadow[arg0][arg7][arg4] = 50;
				}
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addWall(arg2, arg3, var14.blockrange, arg4, arg7);
			}
		} else if (arg3 == 2) {
			int var29 = arg2 + 1 & 0x3;
			ModelSource var30;
			ModelSource var31;
			if (var14.anim == -1) {
				var30 = var14.getModel(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.getModel(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new ClientLocAnim(2, arg2 + 4, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				var31 = new ClientLocAnim(2, var29, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.setWall(WSHAPE0[arg2], var31, var13, arg7, arg0, var16, WSHAPE0[var29], var15, var30, arg4);
			if (var14.occlude) {
				if (arg2 == 0) {
					this.mapo[arg0][arg7][arg4] |= 0x249;
					this.mapo[arg0][arg7][arg4 + 1] |= 0x492;
				} else if (arg2 == 1) {
					this.mapo[arg0][arg7][arg4 + 1] |= 0x492;
					this.mapo[arg0][arg7 + 1][arg4] |= 0x249;
				} else if (arg2 == 2) {
					this.mapo[arg0][arg7 + 1][arg4] |= 0x249;
					this.mapo[arg0][arg7][arg4] |= 0x492;
				} else if (arg2 == 3) {
					this.mapo[arg0][arg7][arg4] |= 0x492;
					this.mapo[arg0][arg7][arg4] |= 0x249;
				}
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addWall(arg2, arg3, var14.blockrange, arg4, arg7);
			}
			if (var14.wallwidth != 16) {
				arg5.setDecor(arg7, arg4, arg0, var14.wallwidth);
			}
		} else if (arg3 == 3) {
			ModelSource var32;
			if (var14.anim == -1) {
				var32 = var14.getModel(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new ClientLocAnim(3, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.setWall(WSHAPE1[arg2], null, var13, arg7, arg0, var16, 0, var15, var32, arg4);
			if (var14.shadow) {
				if (arg2 == 0) {
					this.shadow[arg0][arg7][arg4 + 1] = 50;
				} else if (arg2 == 1) {
					this.shadow[arg0][arg7 + 1][arg4 + 1] = 50;
				} else if (arg2 == 2) {
					this.shadow[arg0][arg7 + 1][arg4] = 50;
				} else if (arg2 == 3) {
					this.shadow[arg0][arg7][arg4] = 50;
				}
			}
			if (var14.blockwalk && arg1 != null) {
				arg1.addWall(arg2, arg3, var14.blockrange, arg4, arg7);
			}
		} else if (arg3 == 9) {
			ModelSource var33;
			if (var14.anim == -1) {
				var33 = var14.getModel(arg3, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new ClientLocAnim(arg3, arg2, var14.anim, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.addScenery(arg7, arg4, 1, arg0, var13, var33, var16, 1, 0, var15);
			if (var14.blockwalk && arg1 != null) {
				arg1.addLoc(var14.width, arg7, var14.length, arg4, arg2, var14.blockrange);
			}
		} else {
			if (var14.hillskew) {
				if (arg2 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg2 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg2 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}
			if (arg3 == 4) {
				ModelSource var38;
				if (var14.anim == -1) {
					var38 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new ClientLocAnim(4, 0, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setDecor(WSHAPE0[arg2], var38, var16, arg4, var13, 0, arg2 * 512, arg0, arg7, 0, var15);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg5.getWall(arg0, arg7, arg4);
				if (var40 > 0) {
					var39 = LocType.list(var40 >> 14 & 0x7FFF).wallwidth;
				}
				ModelSource var41;
				if (var14.anim == -1) {
					var41 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new ClientLocAnim(4, 0, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setDecor(WSHAPE0[arg2], var41, var16, arg4, var13, field62[arg2] * var39, arg2 * 512, arg0, arg7, field63[arg2] * var39, var15);
			} else if (arg3 == 6) {
				ModelSource var42;
				if (var14.anim == -1) {
					var42 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new ClientLocAnim(4, 0, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setDecor(256, var42, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			} else if (arg3 == 7) {
				ModelSource var43;
				if (var14.anim == -1) {
					var43 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new ClientLocAnim(4, 0, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setDecor(512, var43, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			} else if (arg3 == 8) {
				ModelSource var44;
				if (var14.anim == -1) {
					var44 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new ClientLocAnim(4, 0, var14.anim, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.setDecor(768, var44, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			}
		}
	}

	@ObfuscatedName("c.a([Ljc;ZLr;)V")
	public void finishBuild(CollisionMap[] arg0, World arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((this.mapl[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((this.mapl[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}
						if (var6 >= 0) {
							arg0[var6].blockGround(var4, var5);
						}
					}
				}
			}
		}
		hueOff += (int) (Math.random() * 5.0D) - 2;
		if (hueOff < -8) {
			hueOff = -8;
		}
		if (hueOff > 8) {
			hueOff = 8;
		}
		ligOff += (int) (Math.random() * 5.0D) - 2;
		if (ligOff < -16) {
			ligOff = -16;
		}
		if (ligOff > 16) {
			ligOff = 16;
		}
		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = this.shadow[var7];
			int var9 = (int) Math.sqrt((double) 5100);
			int var10 = var9 * 768 >> 8;
			for (int var11 = 1; var11 < this.maxTileZ - 1; var11++) {
				for (int var12 = 1; var12 < this.maxTileX - 1; var12++) {
					int var13 = this.groundh[var7][var12 + 1][var11] - this.groundh[var7][var12 - 1][var11];
					int var14 = this.groundh[var7][var12][var11 + 1] - this.groundh[var7][var12][var11 - 1];
					int var15 = (int) Math.sqrt((double) (var13 * var13 + var14 * var14 + 65536));
					int var16 = (var13 << 8) / var15;
					int var17 = 65536 / var15;
					int var18 = (var14 << 8) / var15;
					int var19 = (var16 * -50 + var17 * -10 + var18 * -50) / var10 + 96;
					int var20 = (var8[var12 - 1][var11] >> 2) + (var8[var12 + 1][var11] >> 3) + (var8[var12][var11 - 1] >> 2) + (var8[var12][var11 + 1] >> 3) + (var8[var12][var11] >> 1);
					this.lightmap[var12][var11] = var19 - var20;
				}
			}
			for (int var21 = 0; var21 < this.maxTileZ; var21++) {
				this.huetot[var21] = 0;
				this.sattot[var21] = 0;
				this.ligtot[var21] = 0;
				this.comtot[var21] = 0;
				this.tot[var21] = 0;
			}
			for (int var22 = -5; var22 < this.maxTileX + 5; var22++) {
				for (int var23 = 0; var23 < this.maxTileZ; var23++) {
					int var24 = var22 + 5;
					int var10002;
					if (var24 >= 0 && var24 < this.maxTileX) {
						int var25 = this.floort1[var7][var24][var23] & 0xFF;
						if (var25 > 0) {
							FloType var26 = FloType.list[var25 - 1];
							this.huetot[var23] += var26.underlayHue;
							this.sattot[var23] += var26.saturation;
							this.ligtot[var23] += var26.lightness;
							this.comtot[var23] += var26.chroma;
							var10002 = this.tot[var23]++;
						}
					}
					int var27 = var22 - 5;
					if (var27 >= 0 && var27 < this.maxTileX) {
						int var28 = this.floort1[var7][var27][var23] & 0xFF;
						if (var28 > 0) {
							FloType var29 = FloType.list[var28 - 1];
							this.huetot[var23] -= var29.underlayHue;
							this.sattot[var23] -= var29.saturation;
							this.ligtot[var23] -= var29.lightness;
							this.comtot[var23] -= var29.chroma;
							var10002 = this.tot[var23]--;
						}
					}
				}
				if (var22 >= 1 && var22 < this.maxTileX - 1) {
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					int var34 = 0;
					for (int var35 = -5; var35 < this.maxTileZ + 5; var35++) {
						int var36 = var35 + 5;
						if (var36 >= 0 && var36 < this.maxTileZ) {
							var30 += this.huetot[var36];
							var31 += this.sattot[var36];
							var32 += this.ligtot[var36];
							var33 += this.comtot[var36];
							var34 += this.tot[var36];
						}
						int var37 = var35 - 5;
						if (var37 >= 0 && var37 < this.maxTileZ) {
							var30 -= this.huetot[var37];
							var31 -= this.sattot[var37];
							var32 -= this.ligtot[var37];
							var33 -= this.comtot[var37];
							var34 -= this.tot[var37];
						}
						if (var35 >= 1 && var35 < this.maxTileZ - 1 && (!lowMem || (this.mapl[var7][var22][var35] & 0x10) == 0 && this.getVisBelowLevel(var7, var35, var22) == minusedlevel)) {
							int var38 = this.floort1[var7][var22][var35] & 0xFF;
							int var39 = this.floort2[var7][var22][var35] & 0xFF;
							if (var38 > 0 || var39 > 0) {
								int var40 = this.groundh[var7][var22][var35];
								int var41 = this.groundh[var7][var22 + 1][var35];
								int var42 = this.groundh[var7][var22 + 1][var35 + 1];
								int var43 = this.groundh[var7][var22][var35 + 1];
								int var44 = this.lightmap[var22][var35];
								int var45 = this.lightmap[var22 + 1][var35];
								int var46 = this.lightmap[var22 + 1][var35 + 1];
								int var47 = this.lightmap[var22][var35 + 1];
								int var48 = -1;
								int var49 = -1;
								if (var38 > 0) {
									int var50 = var30 * 256 / var33;
									int var51 = var31 / var34;
									int var52 = var32 / var34;
									var48 = this.getTable(var50, var51, var52);
									int var53 = var50 + hueOff & 0xFF;
									int var54 = var52 + ligOff;
									if (var54 < 0) {
										var54 = 0;
									} else if (var54 > 255) {
										var54 = 255;
									}
									var49 = this.getTable(var53, var51, var54);
								}
								if (var7 > 0) {
									boolean var55 = true;
									if (var38 == 0 && this.floors[var7][var22][var35] != 0) {
										var55 = false;
									}
									if (var39 > 0 && !FloType.list[var39 - 1].occlude) {
										var55 = false;
									}
									if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
										this.mapo[var7][var22][var35] |= 0x924;
									}
								}
								int var56 = 0;
								if (var48 != -1) {
									var56 = Pix3D.colourTable[getUCol(var49, 96)];
								}
								if (var39 == 0) {
									arg1.setGround(var7, var22, var35, 0, 0, -1, var40, var41, var42, var43, getUCol(var48, var44), getUCol(var48, var45), getUCol(var48, var46), getUCol(var48, var47), 0, 0, 0, 0, var56, 0);
								} else {
									int var57 = this.floors[var7][var22][var35] + 1;
									byte var58 = this.floorr[var7][var22][var35];
									FloType var59 = FloType.list[var39 - 1];
									int var60 = var59.texture;
									int var61;
									int var62;
									if (var60 >= 0) {
										var61 = Pix3D.getTextureAverage(var60);
										var62 = -1;
									} else if (var59.colour == 16711935) {
										var61 = 0;
										var62 = -2;
										var60 = -1;
									} else {
										var62 = this.getTable(var59.hue, var59.saturation, var59.lightness);
										var61 = Pix3D.colourTable[this.getOCol(var59.overlayHsl, 96)];
									}
									arg1.setGround(var7, var22, var35, var57, var58, var60, var40, var41, var42, var43, getUCol(var48, var44), getUCol(var48, var45), getUCol(var48, var46), getUCol(var48, var47), this.getOCol(var62, var44), this.getOCol(var62, var45), this.getOCol(var62, var46), this.getOCol(var62, var47), var56, var61);
								}
							}
						}
					}
				}
			}
			for (int var63 = 1; var63 < this.maxTileZ - 1; var63++) {
				for (int var64 = 1; var64 < this.maxTileX - 1; var64++) {
					arg1.setLayer(var7, var64, var63, this.getVisBelowLevel(var7, var63, var64));
				}
			}
		}
		arg1.shareLight();
		for (int var65 = 0; var65 < this.maxTileX; var65++) {
			for (int var66 = 0; var66 < this.maxTileZ; var66++) {
				if ((this.mapl[1][var65][var66] & 0x2) == 2) {
					arg1.pushDown(var65, var66);
				}
			}
		}
		int var67 = 1;
		int var68 = 2;
		int var69 = 4;
		for (int var70 = 0; var70 < 4; var70++) {
			if (var70 > 0) {
				var67 <<= 0x3;
				var68 <<= 0x3;
				var69 <<= 0x3;
			}
			for (int var71 = 0; var71 <= var70; var71++) {
				for (int var72 = 0; var72 <= this.maxTileZ; var72++) {
					for (int var73 = 0; var73 <= this.maxTileX; var73++) {
						if ((this.mapo[var71][var73][var72] & var67) != 0) {
							int var74 = var72;
							int var75 = var72;
							int var76 = var71;
							int var77 = var71;
							while (var74 > 0 && (this.mapo[var71][var73][var74 - 1] & var67) != 0) {
								var74--;
							}
							while (var75 < this.maxTileZ && (this.mapo[var71][var73][var75 + 1] & var67) != 0) {
								var75++;
							}
							label321: while (var76 > 0) {
								for (int var78 = var74; var78 <= var75; var78++) {
									if ((this.mapo[var76 - 1][var73][var78] & var67) == 0) {
										break label321;
									}
								}
								var76--;
							}
							label310: while (var77 < var70) {
								for (int var79 = var74; var79 <= var75; var79++) {
									if ((this.mapo[var77 + 1][var73][var79] & var67) == 0) {
										break label310;
									}
								}
								var77++;
							}
							int var80 = (var77 + 1 - var76) * (var75 + 1 - var74);
							if (var80 >= 8) {
								int var81 = this.groundh[var77][var73][var74] - 240;
								int var82 = this.groundh[var76][var73][var74];
								World.setOcclude(var70, var81, var75 * 128 + 128, var73 * 128, var73 * 128, var74 * 128, var82, 1);
								for (int var83 = var76; var83 <= var77; var83++) {
									for (int var84 = var74; var84 <= var75; var84++) {
										this.mapo[var83][var73][var84] &= ~var67;
									}
								}
							}
						}
						if ((this.mapo[var71][var73][var72] & var68) != 0) {
							int var85 = var73;
							int var86 = var73;
							int var87 = var71;
							int var88 = var71;
							while (var85 > 0 && (this.mapo[var71][var85 - 1][var72] & var68) != 0) {
								var85--;
							}
							while (var86 < this.maxTileX && (this.mapo[var71][var86 + 1][var72] & var68) != 0) {
								var86++;
							}
							label374: while (var87 > 0) {
								for (int var89 = var85; var89 <= var86; var89++) {
									if ((this.mapo[var87 - 1][var89][var72] & var68) == 0) {
										break label374;
									}
								}
								var87--;
							}
							label363: while (var88 < var70) {
								for (int var90 = var85; var90 <= var86; var90++) {
									if ((this.mapo[var88 + 1][var90][var72] & var68) == 0) {
										break label363;
									}
								}
								var88++;
							}
							int var91 = (var88 + 1 - var87) * (var86 + 1 - var85);
							if (var91 >= 8) {
								int var92 = this.groundh[var88][var85][var72] - 240;
								int var93 = this.groundh[var87][var85][var72];
								World.setOcclude(var70, var92, var72 * 128, var85 * 128, var86 * 128 + 128, var72 * 128, var93, 2);
								for (int var94 = var87; var94 <= var88; var94++) {
									for (int var95 = var85; var95 <= var86; var95++) {
										this.mapo[var94][var95][var72] &= ~var68;
									}
								}
							}
						}
						if ((this.mapo[var71][var73][var72] & var69) != 0) {
							int var96 = var73;
							int var97 = var73;
							int var98 = var72;
							int var99 = var72;
							while (var98 > 0 && (this.mapo[var71][var73][var98 - 1] & var69) != 0) {
								var98--;
							}
							while (var99 < this.maxTileZ && (this.mapo[var71][var73][var99 + 1] & var69) != 0) {
								var99++;
							}
							label427: while (var96 > 0) {
								for (int var100 = var98; var100 <= var99; var100++) {
									if ((this.mapo[var71][var96 - 1][var100] & var69) == 0) {
										break label427;
									}
								}
								var96--;
							}
							label416: while (var97 < this.maxTileX) {
								for (int var101 = var98; var101 <= var99; var101++) {
									if ((this.mapo[var71][var97 + 1][var101] & var69) == 0) {
										break label416;
									}
								}
								var97++;
							}
							if ((var97 + 1 - var96) * (var99 + 1 - var98) >= 4) {
								int var102 = this.groundh[var71][var96][var98];
								World.setOcclude(var70, var102, var99 * 128 + 128, var96 * 128, var97 * 128 + 128, var98 * 128, var102, 4);
								for (int var103 = var96; var103 <= var97; var103++) {
									for (int var104 = var98; var104 <= var99; var104++) {
										this.mapo[var71][var103][var104] &= ~var69;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIII)I")
	public int getVisBelowLevel(int arg0, int arg1, int arg2) {
		if ((this.mapl[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (this.mapl[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("c.e(II)I")
	public int getOCol(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var4 = arg1 * (arg0 & 0x7F) / 128;
			if (var4 < 2) {
				var4 = 2;
			} else if (var4 > 126) {
				var4 = 126;
			}
			return (arg0 & 0xFF80) + var4;
		}
	}

	@ObfuscatedName("c.b(III)I")
	public int getTable(int arg0, int arg1, int arg2) {
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
