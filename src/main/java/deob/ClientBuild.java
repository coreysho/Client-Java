package deob;

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
	public static boolean field42 = true;

	@ObfuscatedName("c.f")
	public static int field43;

	@ObfuscatedName("c.g")
	public final int field44 = 104;

	@ObfuscatedName("c.h")
	public final int field45 = 104;

	@ObfuscatedName("c.i")
	public final int[][][] field46;

	@ObfuscatedName("c.j")
	public final byte[][][] field47;

	@ObfuscatedName("c.k")
	public final byte[][][] field48;

	@ObfuscatedName("c.l")
	public final byte[][][] field49;

	@ObfuscatedName("c.m")
	public final byte[][][] field50;

	@ObfuscatedName("c.n")
	public final byte[][][] field51;

	@ObfuscatedName("c.o")
	public final byte[][][] field52;

	@ObfuscatedName("c.p")
	public final int[][] field53;

	@ObfuscatedName("c.q")
	public final int[] field54;

	@ObfuscatedName("c.r")
	public final int[] field55;

	@ObfuscatedName("c.s")
	public final int[] field56;

	@ObfuscatedName("c.t")
	public final int[] field57;

	@ObfuscatedName("c.u")
	public final int[] field58;

	@ObfuscatedName("c.v")
	public final int[][][] field59;

	@ObfuscatedName("c.w")
	public static final int[] field60 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] field61 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] field62 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] field63 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.A")
	public static int field64 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.B")
	public static int field65 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("c.a(B[BII)Z")
	public static boolean method16(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg0, (byte) 1);
		int var5 = -1;
		label50: while (true) {
			int var6 = var4.method238();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				while (!var8) {
					int var10 = var4.method238();
					if (var10 == 0) {
						continue label50;
					}
					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method224() >> 2;
					int var14 = var12 + arg2;
					int var15 = var11 + arg1;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.method325(var5);
						if (var13 != 22 || !field42 || var16.field964 || var16.field984) {
							var3 &= var16.method329();
							var8 = true;
						}
					}
				}
				int var9 = var4.method238();
				if (var9 == 0) {
					break;
				}
				var4.method224();
			}
		}
	}

	@ObfuscatedName("c.a(BLlb;Lub;)V")
	public static void method17(Packet arg0, OnDemand arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}
			var2 += var3;
			LocType var4 = LocType.method325(var2);
			var4.method330(arg1);
			while (true) {
				int var5 = arg0.method238();
				if (var5 == 0) {
					break;
				}
				arg0.method224();
			}
		}
	}

	@ObfuscatedName("c.a(II)I")
	public static int method22(int arg0, int arg1) {
		int var2 = method23(arg0 + 45365, arg1 + 91923, 4) + (method23(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method23(arg0, arg1, 1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("c.a(III)I")
	public static int method23(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method25(var3, var5);
		int var8 = method25(var3 + 1, var5);
		int var9 = method25(var3, var5 + 1);
		int var10 = method25(var3 + 1, var5 + 1);
		int var11 = method24(var7, var8, var4, arg2);
		int var12 = method24(var9, var10, var4, arg2);
		return method24(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static int method24(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.field638[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static int method25(int arg0, int arg1) {
		int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
		int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
		int var4 = method26(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("c.c(II)I")
	public static int method26(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static int method27(int arg0, int arg1) {
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
	public static boolean method30(int arg0, int arg1) {
		LocType var2 = LocType.method325(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var2.method328(arg1);
	}

	@ObfuscatedName("c.a(Lr;IIZIIILjc;[[[III)V")
	public static void method31(World arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int[][][] arg8, int arg9, int arg10) {
		int var11 = arg8[arg1][arg10][arg9];
		int var12 = arg8[arg1][arg10 + 1][arg9];
		int var13 = arg8[arg1][arg10 + 1][arg9 + 1];
		int var14 = arg8[arg1][arg10][arg9 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		if (!arg3) {
			return;
		}
		LocType var16 = LocType.method325(arg4);
		int var17 = arg10 + (arg9 << 7) + (arg4 << 14) + 1073741824;
		if (!var16.field964) {
			var17 += Integer.MIN_VALUE;
		}
		byte var18 = (byte) ((arg6 << 6) + arg5);
		if (arg5 == 22) {
			ModelSource var19;
			if (var16.field968 == -1) {
				var19 = var16.method331(22, arg6, var11, var12, var13, var14, -1);
			} else {
				var19 = new ClientLocAnim(22, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method56(var15, var19, arg10, arg2, var17, var18, arg9);
			if (var16.field962 && var16.field964) {
				arg7.method355(arg10, arg9);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ModelSource var20;
			if (var16.field968 == -1) {
				var20 = var16.method331(10, arg6, var11, var12, var13, var14, -1);
			} else {
				var20 = new ClientLocAnim(10, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			if (var20 != null) {
				int var21 = 0;
				if (arg5 == 11) {
					var21 += 256;
				}
				int var22;
				int var23;
				if (arg6 == 1 || arg6 == 3) {
					var22 = var16.field961;
					var23 = var16.field960;
				} else {
					var22 = var16.field960;
					var23 = var16.field961;
				}
				arg0.method60(arg10, arg9, var23, arg2, var15, var20, var18, var22, var21, var17);
			}
			if (var16.field962) {
				arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963);
			}
		} else if (arg5 >= 12) {
			ModelSource var24;
			if (var16.field968 == -1) {
				var24 = var16.method331(arg5, arg6, var11, var12, var13, var14, -1);
			} else {
				var24 = new ClientLocAnim(arg5, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method60(arg10, arg9, 1, arg2, var15, var24, var18, 1, 0, var17);
			if (var16.field962) {
				arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963);
			}
		} else if (arg5 == 0) {
			ModelSource var25;
			if (var16.field968 == -1) {
				var25 = var16.method331(0, arg6, var11, var12, var13, var14, -1);
			} else {
				var25 = new ClientLocAnim(0, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method58(field60[arg6], null, var15, arg10, arg2, var18, 0, var17, var25, arg9);
			if (var16.field962) {
				arg7.method353(arg6, arg5, var16.field963, arg9, arg10);
			}
		} else if (arg5 == 1) {
			ModelSource var26;
			if (var16.field968 == -1) {
				var26 = var16.method331(1, arg6, var11, var12, var13, var14, -1);
			} else {
				var26 = new ClientLocAnim(1, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method58(field61[arg6], null, var15, arg10, arg2, var18, 0, var17, var26, arg9);
			if (var16.field962) {
				arg7.method353(arg6, arg5, var16.field963, arg9, arg10);
			}
		} else if (arg5 == 2) {
			int var27 = arg6 + 1 & 0x3;
			ModelSource var28;
			ModelSource var29;
			if (var16.field968 == -1) {
				var28 = var16.method331(2, arg6 + 4, var11, var12, var13, var14, -1);
				var29 = var16.method331(2, var27, var11, var12, var13, var14, -1);
			} else {
				var28 = new ClientLocAnim(2, arg6 + 4, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				var29 = new ClientLocAnim(2, var27, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method58(field60[arg6], var29, var15, arg10, arg2, var18, field60[var27], var17, var28, arg9);
			if (var16.field962) {
				arg7.method353(arg6, arg5, var16.field963, arg9, arg10);
			}
		} else if (arg5 == 3) {
			ModelSource var30;
			if (var16.field968 == -1) {
				var30 = var16.method331(3, arg6, var11, var12, var13, var14, -1);
			} else {
				var30 = new ClientLocAnim(3, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method58(field61[arg6], null, var15, arg10, arg2, var18, 0, var17, var30, arg9);
			if (var16.field962) {
				arg7.method353(arg6, arg5, var16.field963, arg9, arg10);
			}
		} else if (arg5 == 9) {
			ModelSource var31;
			if (var16.field968 == -1) {
				var31 = var16.method331(arg5, arg6, var11, var12, var13, var14, -1);
			} else {
				var31 = new ClientLocAnim(arg5, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
			}
			arg0.method60(arg10, arg9, 1, arg2, var15, var31, var18, 1, 0, var17);
			if (var16.field962) {
				arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963);
			}
		} else {
			if (var16.field965) {
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
				if (var16.field968 == -1) {
					var36 = var16.method331(4, 0, var11, var12, var13, var14, -1);
				} else {
					var36 = new ClientLocAnim(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.method59(field60[arg6], var36, var18, arg9, var15, 0, arg6 * 512, arg2, arg10, 0, var17);
			} else if (arg5 == 5) {
				int var37 = 16;
				int var38 = arg0.method76(arg2, arg10, arg9);
				if (var38 > 0) {
					var37 = LocType.method325(var38 >> 14 & 0x7FFF).field969;
				}
				ModelSource var39;
				if (var16.field968 == -1) {
					var39 = var16.method331(4, 0, var11, var12, var13, var14, -1);
				} else {
					var39 = new ClientLocAnim(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.method59(field60[arg6], var39, var18, arg9, var15, field62[arg6] * var37, arg6 * 512, arg2, arg10, field63[arg6] * var37, var17);
			} else if (arg5 == 6) {
				ModelSource var40;
				if (var16.field968 == -1) {
					var40 = var16.method331(4, 0, var11, var12, var13, var14, -1);
				} else {
					var40 = new ClientLocAnim(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.method59(256, var40, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			} else if (arg5 == 7) {
				ModelSource var41;
				if (var16.field968 == -1) {
					var41 = var16.method331(4, 0, var11, var12, var13, var14, -1);
				} else {
					var41 = new ClientLocAnim(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.method59(512, var41, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			} else if (arg5 == 8) {
				ModelSource var42;
				if (var16.field968 == -1) {
					var42 = var16.method331(4, 0, var11, var12, var13, var14, -1);
				} else {
					var42 = new ClientLocAnim(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
				}
				arg0.method59(768, var42, var18, arg9, var15, 0, arg6, arg2, arg10, 0, var17);
			}
		}
	}

	public ClientBuild(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
		this.field46 = arg1;
		this.field47 = arg4;
		this.field48 = new byte[4][this.field44][this.field45];
		this.field49 = new byte[4][this.field44][this.field45];
		this.field50 = new byte[4][this.field44][this.field45];
		this.field51 = new byte[4][this.field44][this.field45];
		this.field59 = new int[4][this.field44 + 1][this.field45 + 1];
		this.field52 = new byte[4][this.field44 + 1][this.field45 + 1];
		this.field53 = new int[this.field44 + 1][this.field45 + 1];
		this.field54 = new int[this.field45];
		this.field55 = new int[this.field45];
		this.field56 = new int[this.field45];
		this.field57 = new int[this.field45];
		this.field58 = new int[this.field45];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public void method14(int arg0, int arg1) {
		for (int var3 = arg0; var3 <= arg0 + 64; var3++) {
			for (int var4 = arg1; var4 <= arg1 + 64; var4++) {
				if (var4 >= 0 && var4 < this.field44 && var3 >= 0 && var3 < this.field45) {
					this.field52[0][var4][var3] = 127;
					if (var4 == arg1 && var4 > 0) {
						this.field46[0][var4][var3] = this.field46[0][var4 - 1][var3];
					}
					if (var4 == arg1 + 64 && var4 < this.field44 - 1) {
						this.field46[0][var4][var3] = this.field46[0][var4 + 1][var3];
					}
					if (var3 == arg0 && var3 > 0) {
						this.field46[0][var4][var3] = this.field46[0][var4][var3 - 1];
					}
					if (var3 == arg0 + 64 && var3 < this.field45 - 1) {
						this.field46[0][var4][var3] = this.field46[0][var4][var3 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(ZI[BIII)V")
	public void method15(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
		Packet var6 = new Packet(arg1, (byte) 1);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = var8 + arg4;
					int var11 = var9 + arg2;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						this.field47[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method224();
							if (var12 == 0) {
								if (var7 == 0) {
									this.field46[0][var10][var11] = -method22(var10 + arg0 + 932731, var11 + 556238 + arg3) * 8;
								} else {
									this.field46[var7][var10][var11] = this.field46[var7 - 1][var10][var11] - 240;
								}
								break;
							}
							if (var12 == 1) {
								int var13 = var6.method224();
								if (var13 == 1) {
									var13 = 0;
								}
								if (var7 == 0) {
									this.field46[0][var10][var11] = -var13 * 8;
								} else {
									this.field46[var7][var10][var11] = this.field46[var7 - 1][var10][var11] - var13 * 8;
								}
								break;
							}
							if (var12 <= 49) {
								this.field49[var7][var10][var11] = var6.method225();
								this.field50[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								this.field51[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								this.field47[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								this.field48[var7][var10][var11] = (byte) (var12 - 81);
							}
						}
					} else {
						while (true) {
							int var14 = var6.method224();
							if (var14 == 0) {
								break;
							}
							if (var14 == 1) {
								var6.method224();
								break;
							}
							if (var14 <= 49) {
								var6.method224();
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BZLr;I[Ljc;)V")
	public void method18(int arg0, byte[] arg1, World arg2, int arg3, CollisionMap[] arg4) {
		Packet var6 = new Packet(arg1, (byte) 1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method238();
			if (var8 == 0) {
				return;
			}
			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method238();
				if (var10 == 0) {
					break;
				}
				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method224();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = var12 + arg3;
				int var18 = var11 + arg0;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((this.field47[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}
					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}
					this.method19(var13, var20, var16, var15, var18, arg2, var7, var17);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IILjc;IIILr;II)V")
	public void method19(int arg0, CollisionMap arg1, int arg2, int arg3, int arg4, World arg5, int arg6, int arg7) {
		if (field42) {
			if ((this.field47[arg0][arg7][arg4] & 0x10) != 0) {
				return;
			}
			if (this.method21(arg0, arg4, arg7) != field43) {
				return;
			}
		}
		int var9 = this.field46[arg0][arg7][arg4];
		int var10 = this.field46[arg0][arg7 + 1][arg4];
		int var11 = this.field46[arg0][arg7 + 1][arg4 + 1];
		int var12 = this.field46[arg0][arg7][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.method325(arg6);
		int var15 = arg7 + (arg4 << 7) + (arg6 << 14) + 1073741824;
		if (!var14.field964) {
			var15 += Integer.MIN_VALUE;
		}
		byte var16 = (byte) ((arg2 << 6) + arg3);
		if (arg3 == 22) {
			if (!field42 || var14.field964 || var14.field984) {
				ModelSource var17;
				if (var14.field968 == -1) {
					var17 = var14.method331(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new ClientLocAnim(22, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method56(var13, var17, arg7, arg0, var15, var16, arg4);
				if (var14.field962 && var14.field964 && arg1 != null) {
					arg1.method355(arg7, arg4);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ModelSource var18;
			if (var14.field968 == -1) {
				var18 = var14.method331(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new ClientLocAnim(10, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}
				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.field961;
					var21 = var14.field960;
				} else {
					var20 = var14.field960;
					var21 = var14.field961;
				}
				if (arg5.method60(arg7, arg4, var21, arg0, var13, var18, var16, var20, var19, var15) && var14.field976) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.method331(10, arg2, var9, var10, var11, var12, -1);
					}
					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field560 / 4;
								if (var25 > 30) {
									var25 = 30;
								}
								if (var25 > this.field52[arg0][arg7 + var23][arg4 + var24]) {
									this.field52[arg0][arg7 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}
			if (var14.field962 && arg1 != null) {
				arg1.method354(var14.field960, arg7, var14.field961, arg4, arg2, var14.field963);
			}
		} else if (arg3 >= 12) {
			ModelSource var26;
			if (var14.field968 == -1) {
				var26 = var14.method331(arg3, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new ClientLocAnim(arg3, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method60(arg7, arg4, 1, arg0, var13, var26, var16, 1, 0, var15);
			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
				this.field59[arg0][arg7][arg4] |= 0x924;
			}
			if (var14.field962 && arg1 != null) {
				arg1.method354(var14.field960, arg7, var14.field961, arg4, arg2, var14.field963);
			}
		} else if (arg3 == 0) {
			ModelSource var27;
			if (var14.field968 == -1) {
				var27 = var14.method331(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new ClientLocAnim(0, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method58(field60[arg2], null, var13, arg7, arg0, var16, 0, var15, var27, arg4);
			if (arg2 == 0) {
				if (var14.field976) {
					this.field52[arg0][arg7][arg4] = 50;
					this.field52[arg0][arg7][arg4 + 1] = 50;
				}
				if (var14.field967) {
					this.field59[arg0][arg7][arg4] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.field976) {
					this.field52[arg0][arg7][arg4 + 1] = 50;
					this.field52[arg0][arg7 + 1][arg4 + 1] = 50;
				}
				if (var14.field967) {
					this.field59[arg0][arg7][arg4 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.field976) {
					this.field52[arg0][arg7 + 1][arg4] = 50;
					this.field52[arg0][arg7 + 1][arg4 + 1] = 50;
				}
				if (var14.field967) {
					this.field59[arg0][arg7 + 1][arg4] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.field976) {
					this.field52[arg0][arg7][arg4] = 50;
					this.field52[arg0][arg7 + 1][arg4] = 50;
				}
				if (var14.field967) {
					this.field59[arg0][arg7][arg4] |= 0x492;
				}
			}
			if (var14.field962 && arg1 != null) {
				arg1.method353(arg2, arg3, var14.field963, arg4, arg7);
			}
			if (var14.field969 != 16) {
				arg5.method66(arg7, arg4, arg0, var14.field969);
			}
		} else if (arg3 == 1) {
			ModelSource var28;
			if (var14.field968 == -1) {
				var28 = var14.method331(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new ClientLocAnim(1, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method58(field61[arg2], null, var13, arg7, arg0, var16, 0, var15, var28, arg4);
			if (var14.field976) {
				if (arg2 == 0) {
					this.field52[arg0][arg7][arg4 + 1] = 50;
				} else if (arg2 == 1) {
					this.field52[arg0][arg7 + 1][arg4 + 1] = 50;
				} else if (arg2 == 2) {
					this.field52[arg0][arg7 + 1][arg4] = 50;
				} else if (arg2 == 3) {
					this.field52[arg0][arg7][arg4] = 50;
				}
			}
			if (var14.field962 && arg1 != null) {
				arg1.method353(arg2, arg3, var14.field963, arg4, arg7);
			}
		} else if (arg3 == 2) {
			int var29 = arg2 + 1 & 0x3;
			ModelSource var30;
			ModelSource var31;
			if (var14.field968 == -1) {
				var30 = var14.method331(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method331(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new ClientLocAnim(2, arg2 + 4, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				var31 = new ClientLocAnim(2, var29, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method58(field60[arg2], var31, var13, arg7, arg0, var16, field60[var29], var15, var30, arg4);
			if (var14.field967) {
				if (arg2 == 0) {
					this.field59[arg0][arg7][arg4] |= 0x249;
					this.field59[arg0][arg7][arg4 + 1] |= 0x492;
				} else if (arg2 == 1) {
					this.field59[arg0][arg7][arg4 + 1] |= 0x492;
					this.field59[arg0][arg7 + 1][arg4] |= 0x249;
				} else if (arg2 == 2) {
					this.field59[arg0][arg7 + 1][arg4] |= 0x249;
					this.field59[arg0][arg7][arg4] |= 0x492;
				} else if (arg2 == 3) {
					this.field59[arg0][arg7][arg4] |= 0x492;
					this.field59[arg0][arg7][arg4] |= 0x249;
				}
			}
			if (var14.field962 && arg1 != null) {
				arg1.method353(arg2, arg3, var14.field963, arg4, arg7);
			}
			if (var14.field969 != 16) {
				arg5.method66(arg7, arg4, arg0, var14.field969);
			}
		} else if (arg3 == 3) {
			ModelSource var32;
			if (var14.field968 == -1) {
				var32 = var14.method331(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new ClientLocAnim(3, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method58(field61[arg2], null, var13, arg7, arg0, var16, 0, var15, var32, arg4);
			if (var14.field976) {
				if (arg2 == 0) {
					this.field52[arg0][arg7][arg4 + 1] = 50;
				} else if (arg2 == 1) {
					this.field52[arg0][arg7 + 1][arg4 + 1] = 50;
				} else if (arg2 == 2) {
					this.field52[arg0][arg7 + 1][arg4] = 50;
				} else if (arg2 == 3) {
					this.field52[arg0][arg7][arg4] = 50;
				}
			}
			if (var14.field962 && arg1 != null) {
				arg1.method353(arg2, arg3, var14.field963, arg4, arg7);
			}
		} else if (arg3 == 9) {
			ModelSource var33;
			if (var14.field968 == -1) {
				var33 = var14.method331(arg3, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new ClientLocAnim(arg3, arg2, var14.field968, arg6, var11, field41, true, var10, var12, var9);
			}
			arg5.method60(arg7, arg4, 1, arg0, var13, var33, var16, 1, 0, var15);
			if (var14.field962 && arg1 != null) {
				arg1.method354(var14.field960, arg7, var14.field961, arg4, arg2, var14.field963);
			}
		} else {
			if (var14.field965) {
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
				if (var14.field968 == -1) {
					var38 = var14.method331(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new ClientLocAnim(4, 0, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method59(field60[arg2], var38, var16, arg4, var13, 0, arg2 * 512, arg0, arg7, 0, var15);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg5.method76(arg0, arg7, arg4);
				if (var40 > 0) {
					var39 = LocType.method325(var40 >> 14 & 0x7FFF).field969;
				}
				ModelSource var41;
				if (var14.field968 == -1) {
					var41 = var14.method331(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new ClientLocAnim(4, 0, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method59(field60[arg2], var41, var16, arg4, var13, field62[arg2] * var39, arg2 * 512, arg0, arg7, field63[arg2] * var39, var15);
			} else if (arg3 == 6) {
				ModelSource var42;
				if (var14.field968 == -1) {
					var42 = var14.method331(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new ClientLocAnim(4, 0, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method59(256, var42, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			} else if (arg3 == 7) {
				ModelSource var43;
				if (var14.field968 == -1) {
					var43 = var14.method331(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new ClientLocAnim(4, 0, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method59(512, var43, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			} else if (arg3 == 8) {
				ModelSource var44;
				if (var14.field968 == -1) {
					var44 = var14.method331(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new ClientLocAnim(4, 0, var14.field968, arg6, var11, field41, true, var10, var12, var9);
				}
				arg5.method59(768, var44, var16, arg4, var13, 0, arg2, arg0, arg7, 0, var15);
			}
		}
	}

	@ObfuscatedName("c.a([Ljc;ZLr;)V")
	public void method20(CollisionMap[] arg0, World arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((this.field47[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((this.field47[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}
						if (var6 >= 0) {
							arg0[var6].method355(var4, var5);
						}
					}
				}
			}
		}
		field64 += (int) (Math.random() * 5.0D) - 2;
		if (field64 < -8) {
			field64 = -8;
		}
		if (field64 > 8) {
			field64 = 8;
		}
		field65 += (int) (Math.random() * 5.0D) - 2;
		if (field65 < -16) {
			field65 = -16;
		}
		if (field65 > 16) {
			field65 = 16;
		}
		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = this.field52[var7];
			int var9 = (int) Math.sqrt((double) 5100);
			int var10 = var9 * 768 >> 8;
			for (int var11 = 1; var11 < this.field45 - 1; var11++) {
				for (int var12 = 1; var12 < this.field44 - 1; var12++) {
					int var13 = this.field46[var7][var12 + 1][var11] - this.field46[var7][var12 - 1][var11];
					int var14 = this.field46[var7][var12][var11 + 1] - this.field46[var7][var12][var11 - 1];
					int var15 = (int) Math.sqrt((double) (var13 * var13 + var14 * var14 + 65536));
					int var16 = (var13 << 8) / var15;
					int var17 = 65536 / var15;
					int var18 = (var14 << 8) / var15;
					int var19 = (var16 * -50 + var17 * -10 + var18 * -50) / var10 + 96;
					int var20 = (var8[var12 - 1][var11] >> 2) + (var8[var12 + 1][var11] >> 3) + (var8[var12][var11 - 1] >> 2) + (var8[var12][var11 + 1] >> 3) + (var8[var12][var11] >> 1);
					this.field53[var12][var11] = var19 - var20;
				}
			}
			for (int var21 = 0; var21 < this.field45; var21++) {
				this.field54[var21] = 0;
				this.field55[var21] = 0;
				this.field56[var21] = 0;
				this.field57[var21] = 0;
				this.field58[var21] = 0;
			}
			for (int var22 = -5; var22 < this.field44 + 5; var22++) {
				for (int var23 = 0; var23 < this.field45; var23++) {
					int var24 = var22 + 5;
					int var10002;
					if (var24 >= 0 && var24 < this.field44) {
						int var25 = this.field48[var7][var24][var23] & 0xFF;
						if (var25 > 0) {
							FloType var26 = FloType.field1098[var25 - 1];
							this.field54[var23] += var26.field1107;
							this.field55[var23] += var26.field1105;
							this.field56[var23] += var26.field1106;
							this.field57[var23] += var26.field1108;
							var10002 = this.field58[var23]++;
						}
					}
					int var27 = var22 - 5;
					if (var27 >= 0 && var27 < this.field44) {
						int var28 = this.field48[var7][var27][var23] & 0xFF;
						if (var28 > 0) {
							FloType var29 = FloType.field1098[var28 - 1];
							this.field54[var23] -= var29.field1107;
							this.field55[var23] -= var29.field1105;
							this.field56[var23] -= var29.field1106;
							this.field57[var23] -= var29.field1108;
							var10002 = this.field58[var23]--;
						}
					}
				}
				if (var22 >= 1 && var22 < this.field44 - 1) {
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					int var34 = 0;
					for (int var35 = -5; var35 < this.field45 + 5; var35++) {
						int var36 = var35 + 5;
						if (var36 >= 0 && var36 < this.field45) {
							var30 += this.field54[var36];
							var31 += this.field55[var36];
							var32 += this.field56[var36];
							var33 += this.field57[var36];
							var34 += this.field58[var36];
						}
						int var37 = var35 - 5;
						if (var37 >= 0 && var37 < this.field45) {
							var30 -= this.field54[var37];
							var31 -= this.field55[var37];
							var32 -= this.field56[var37];
							var33 -= this.field57[var37];
							var34 -= this.field58[var37];
						}
						if (var35 >= 1 && var35 < this.field45 - 1 && (!field42 || (this.field47[var7][var22][var35] & 0x10) == 0 && this.method21(var7, var35, var22) == field43)) {
							int var38 = this.field48[var7][var22][var35] & 0xFF;
							int var39 = this.field49[var7][var22][var35] & 0xFF;
							if (var38 > 0 || var39 > 0) {
								int var40 = this.field46[var7][var22][var35];
								int var41 = this.field46[var7][var22 + 1][var35];
								int var42 = this.field46[var7][var22 + 1][var35 + 1];
								int var43 = this.field46[var7][var22][var35 + 1];
								int var44 = this.field53[var22][var35];
								int var45 = this.field53[var22 + 1][var35];
								int var46 = this.field53[var22 + 1][var35 + 1];
								int var47 = this.field53[var22][var35 + 1];
								int var48 = -1;
								int var49 = -1;
								if (var38 > 0) {
									int var50 = var30 * 256 / var33;
									int var51 = var31 / var34;
									int var52 = var32 / var34;
									var48 = this.method29(var50, var51, var52);
									int var53 = var50 + field64 & 0xFF;
									int var54 = var52 + field65;
									if (var54 < 0) {
										var54 = 0;
									} else if (var54 > 255) {
										var54 = 255;
									}
									var49 = this.method29(var53, var51, var54);
								}
								if (var7 > 0) {
									boolean var55 = true;
									if (var38 == 0 && this.field50[var7][var22][var35] != 0) {
										var55 = false;
									}
									if (var39 > 0 && !FloType.field1098[var39 - 1].field1102) {
										var55 = false;
									}
									if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
										this.field59[var7][var22][var35] |= 0x924;
									}
								}
								int var56 = 0;
								if (var48 != -1) {
									var56 = Pix3D.field649[method27(var49, 96)];
								}
								if (var39 == 0) {
									arg1.method55(var7, var22, var35, 0, 0, -1, var40, var41, var42, var43, method27(var48, var44), method27(var48, var45), method27(var48, var46), method27(var48, var47), 0, 0, 0, 0, var56, 0);
								} else {
									int var57 = this.field50[var7][var22][var35] + 1;
									byte var58 = this.field51[var7][var22][var35];
									FloType var59 = FloType.field1098[var39 - 1];
									int var60 = var59.field1100;
									int var61;
									int var62;
									if (var60 >= 0) {
										var61 = Pix3D.method169(var60);
										var62 = -1;
									} else if (var59.field1099 == 16711935) {
										var61 = 0;
										var62 = -2;
										var60 = -1;
									} else {
										var62 = this.method29(var59.field1104, var59.field1105, var59.field1106);
										var61 = Pix3D.field649[this.method28(var59.field1109, 96)];
									}
									arg1.method55(var7, var22, var35, var57, var58, var60, var40, var41, var42, var43, method27(var48, var44), method27(var48, var45), method27(var48, var46), method27(var48, var47), this.method28(var62, var44), this.method28(var62, var45), this.method28(var62, var46), this.method28(var62, var47), var56, var61);
								}
							}
						}
					}
				}
			}
			for (int var63 = 1; var63 < this.field45 - 1; var63++) {
				for (int var64 = 1; var64 < this.field44 - 1; var64++) {
					arg1.method54(var7, var64, var63, this.method21(var7, var63, var64));
				}
			}
		}
		arg1.method81();
		for (int var65 = 0; var65 < this.field44; var65++) {
			for (int var66 = 0; var66 < this.field45; var66++) {
				if ((this.field47[1][var65][var66] & 0x2) == 2) {
					arg1.method52(var65, var66);
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
				for (int var72 = 0; var72 <= this.field45; var72++) {
					for (int var73 = 0; var73 <= this.field44; var73++) {
						if ((this.field59[var71][var73][var72] & var67) != 0) {
							int var74 = var72;
							int var75 = var72;
							int var76 = var71;
							int var77 = var71;
							while (var74 > 0 && (this.field59[var71][var73][var74 - 1] & var67) != 0) {
								var74--;
							}
							while (var75 < this.field45 && (this.field59[var71][var73][var75 + 1] & var67) != 0) {
								var75++;
							}
							label321: while (var76 > 0) {
								for (int var78 = var74; var78 <= var75; var78++) {
									if ((this.field59[var76 - 1][var73][var78] & var67) == 0) {
										break label321;
									}
								}
								var76--;
							}
							label310: while (var77 < var70) {
								for (int var79 = var74; var79 <= var75; var79++) {
									if ((this.field59[var77 + 1][var73][var79] & var67) == 0) {
										break label310;
									}
								}
								var77++;
							}
							int var80 = (var77 + 1 - var76) * (var75 + 1 - var74);
							if (var80 >= 8) {
								int var81 = this.field46[var77][var73][var74] - 240;
								int var82 = this.field46[var76][var73][var74];
								World.method53(var70, var81, var75 * 128 + 128, var73 * 128, var73 * 128, var74 * 128, var82, 1);
								for (int var83 = var76; var83 <= var77; var83++) {
									for (int var84 = var74; var84 <= var75; var84++) {
										this.field59[var83][var73][var84] &= ~var67;
									}
								}
							}
						}
						if ((this.field59[var71][var73][var72] & var68) != 0) {
							int var85 = var73;
							int var86 = var73;
							int var87 = var71;
							int var88 = var71;
							while (var85 > 0 && (this.field59[var71][var85 - 1][var72] & var68) != 0) {
								var85--;
							}
							while (var86 < this.field44 && (this.field59[var71][var86 + 1][var72] & var68) != 0) {
								var86++;
							}
							label374: while (var87 > 0) {
								for (int var89 = var85; var89 <= var86; var89++) {
									if ((this.field59[var87 - 1][var89][var72] & var68) == 0) {
										break label374;
									}
								}
								var87--;
							}
							label363: while (var88 < var70) {
								for (int var90 = var85; var90 <= var86; var90++) {
									if ((this.field59[var88 + 1][var90][var72] & var68) == 0) {
										break label363;
									}
								}
								var88++;
							}
							int var91 = (var88 + 1 - var87) * (var86 + 1 - var85);
							if (var91 >= 8) {
								int var92 = this.field46[var88][var85][var72] - 240;
								int var93 = this.field46[var87][var85][var72];
								World.method53(var70, var92, var72 * 128, var85 * 128, var86 * 128 + 128, var72 * 128, var93, 2);
								for (int var94 = var87; var94 <= var88; var94++) {
									for (int var95 = var85; var95 <= var86; var95++) {
										this.field59[var94][var95][var72] &= ~var68;
									}
								}
							}
						}
						if ((this.field59[var71][var73][var72] & var69) != 0) {
							int var96 = var73;
							int var97 = var73;
							int var98 = var72;
							int var99 = var72;
							while (var98 > 0 && (this.field59[var71][var73][var98 - 1] & var69) != 0) {
								var98--;
							}
							while (var99 < this.field45 && (this.field59[var71][var73][var99 + 1] & var69) != 0) {
								var99++;
							}
							label427: while (var96 > 0) {
								for (int var100 = var98; var100 <= var99; var100++) {
									if ((this.field59[var71][var96 - 1][var100] & var69) == 0) {
										break label427;
									}
								}
								var96--;
							}
							label416: while (var97 < this.field44) {
								for (int var101 = var98; var101 <= var99; var101++) {
									if ((this.field59[var71][var97 + 1][var101] & var69) == 0) {
										break label416;
									}
								}
								var97++;
							}
							if ((var97 + 1 - var96) * (var99 + 1 - var98) >= 4) {
								int var102 = this.field46[var71][var96][var98];
								World.method53(var70, var102, var99 * 128 + 128, var96 * 128, var97 * 128 + 128, var98 * 128, var102, 4);
								for (int var103 = var96; var103 <= var97; var103++) {
									for (int var104 = var98; var104 <= var99; var104++) {
										this.field59[var71][var103][var104] &= ~var69;
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
	public int method21(int arg0, int arg1, int arg2) {
		if ((this.field47[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (this.field47[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("c.e(II)I")
	public int method28(int arg0, int arg1) {
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
	public int method29(int arg0, int arg1, int arg2) {
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
