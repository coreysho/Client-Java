package deob;

@ObfuscatedName("sc")
public final class class71 {

	@ObfuscatedName("sc.a")
	public static boolean field1192;

	@ObfuscatedName("sc.b")
	public static final int field1193 = -226;

	@ObfuscatedName("sc.c")
	public static int field1194;

	@ObfuscatedName("sc.e")
	public static int field1196;

	@ObfuscatedName("sc.f")
	public static final int field1197 = -484;

	@ObfuscatedName("sc.g")
	public static boolean field1198;

	@ObfuscatedName("sc.h")
	public static final int field1199 = 9;

	@ObfuscatedName("sc.i")
	public static int field1200;

	@ObfuscatedName("sc.j")
	public static final byte field1201 = -17;

	@ObfuscatedName("sc.k")
	public static final int field1202 = 5;

	@ObfuscatedName("sc.l")
	public static boolean field1203;

	@ObfuscatedName("sc.m")
	public static int field1204 = 443;

	@ObfuscatedName("sc.n")
	public static int[] field1205;

	@ObfuscatedName("sc.o")
	public static char[][] field1206;

	@ObfuscatedName("sc.p")
	public static byte[][][] field1207;

	@ObfuscatedName("sc.q")
	public static char[][] field1208;

	@ObfuscatedName("sc.r")
	public static char[][] field1209;

	@ObfuscatedName("sc.s")
	public static int[] field1210;

	@ObfuscatedName("sc.t")
	public static final String[] field1211 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("sc.a(Lxb;)V")
	public static void method384(class50 arg0) {
		class38 var1 = new class38(arg0.method294("fragmentsenc.txt", null), (byte) 1);
		class38 var2 = new class38(arg0.method294("badenc.txt", null), (byte) 1);
		class38 var3 = new class38(arg0.method294("domainenc.txt", null), (byte) 1);
		class38 var4 = new class38(arg0.method294("tldlist.txt", null), (byte) 1);
		method385(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Llb;Llb;Llb;Llb;)V")
	public static void method385(class38 arg0, class38 arg1, class38 arg2, class38 arg3) {
		method387(arg1);
		method388(arg2);
		method389(arg0);
		method386(arg3);
	}

	@ObfuscatedName("sc.a(Llb;B)V")
	public static void method386(class38 arg0) {
		int var1 = arg0.method229();
		field1209 = new char[var1][];
		field1210 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1210[var2] = arg0.method224();
			char[] var3 = new char[arg0.method224()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method224();
			}
			field1209[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a(ILlb;)V")
	public static void method387(class38 arg0) {
		int var1 = arg0.method229();
		field1206 = new char[var1][];
		field1207 = new byte[var1][][];
		method390(arg0, field1207, field1206);
	}

	@ObfuscatedName("sc.a(Llb;Z)V")
	public static void method388(class38 arg0) {
		int var1 = arg0.method229();
		field1208 = new char[var1][];
		method391(field1208, arg0);
	}

	@ObfuscatedName("sc.b(ILlb;)V")
	public static void method389(class38 arg0) {
		field1205 = new int[arg0.method229()];
		for (int var1 = 0; var1 < field1205.length; var1++) {
			field1205[var1] = arg0.method226();
		}
	}

	@ObfuscatedName("sc.a(Llb;[[[B[[CZ)V")
	public static void method390(class38 arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method224()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method224();
			}
			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method224()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method224();
				var6[var7][1] = (byte) arg0.method224();
			}
			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("sc.a(Z[[CLlb;)V")
	public static void method391(char[][] arg0, class38 arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method224()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method224();
			}
			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static void method392(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method393(arg0[var2])) {
				arg0[var1] = arg0[var2];
			} else {
				arg0[var1] = ' ';
			}
			if (var1 == 0 || arg0[var1] != ' ' || arg0[var1 - 1] != ' ') {
				var1++;
			}
		}
		for (int var3 = var1; var3 < arg0.length; var3++) {
			arg0[var3] = ' ';
		}
	}

	@ObfuscatedName("sc.a(CI)Z")
	public static boolean method393(char arg0) {
		return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
	}

	@ObfuscatedName("sc.a(BLjava/lang/String;)Ljava/lang/String;")
	public static String method394(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method392(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method402(var5);
		method397(var5);
		method398(var5);
		method411(var5);
		for (int var7 = 0; var7 < field1211.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1211[var7], var8 + 1)) != -1) {
				char[] var9 = field1211[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var10 + var8] = var9[var10];
				}
			}
		}
		method395(var5, var4.toCharArray());
		method396(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("sc.a([C[CI)V")
	public static void method395(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method419(field1202, arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("sc.a(B[C)V")
	public static void method396(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method416(field1201, var3)) {
				var1 = true;
			} else if (var1) {
				if (method418(var3)) {
					var1 = false;
				}
			} else if (method419(field1202, var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a([CB)V")
	public static void method397(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1206.length - 1; var2 >= 0; var2--) {
				method406(arg0, field1206[var2], field1207[var2]);
			}
		}
	}

	@ObfuscatedName("sc.b([CB)V")
	public static void method398(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method406(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method406(var3, var4, null);
		for (int var5 = field1208.length - 1; var5 >= 0; var5--) {
			method399(var1, field1208[var5], arg0, var3);
		}
	}

	@ObfuscatedName("sc.a([CB[C[C[C)V")
	public static void method399(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg1.length > arg2.length) {
			return;
		}
		int var7;
		for (int var4 = 0; var4 <= arg2.length - arg1.length; var4 += var7) {
			int var5 = var4;
			int var6 = 0;
			var7 = 1;
			label55: while (true) {
				while (true) {
					if (var5 >= arg2.length) {
						break label55;
					}
					char var8 = arg2[var5];
					char var9 = 0;
					if (var5 + 1 < arg2.length) {
						var9 = arg2[var5 + 1];
					}
					int var10;
					if (var6 < arg1.length && (var10 = method408(arg1[var6], var9, var8)) > 0) {
						var5 += var10;
						var6++;
					} else {
						if (var6 == 0) {
							break label55;
						}
						int var11;
						if ((var11 = method408(arg1[var6 - 1], var9, var8)) > 0) {
							var5 += var11;
							if (var6 == 1) {
								var7++;
							}
						} else {
							if (var6 >= arg1.length || !method414(var8)) {
								break label55;
							}
							var5++;
						}
					}
				}
			}
			if (var6 >= arg1.length) {
				boolean var12 = false;
				int var13 = method400(arg2, var4, arg0);
				int var14 = method401(var5 - 1, arg2, arg3);
				if (var13 > 2 || var14 > 2) {
					var12 = true;
				}
				if (var12) {
					for (int var15 = var4; var15 < var5; var15++) {
						arg2[var15] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a([CBI[C)I")
	public static int method400(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}
		for (int var3 = arg1 - 1; var3 >= 0 && method414(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}
		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method414(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}
		if (var4 >= 3) {
			return 4;
		} else if (method414(arg0[arg1 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a(IB[C[C)I")
	public static int method401(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}
		int var3 = arg0 + 1;
		while (true) {
			if (var3 < arg1.length && method414(arg1[var3])) {
				if (arg1[var3] != '.' && arg1[var3] != ',') {
					var3++;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg0 + 1; var5 < arg1.length && method414(arg2[var5]); var5++) {
				if (arg2[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 3) {
				return 4;
			}
			if (method414(arg1[arg0 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a(Z[C)V")
	public static void method402(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method406(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method406(var3, var4, null);
		for (int var5 = 0; var5 < field1209.length; var5++) {
			method403(var1, field1210[var5], arg0, var3, field1209[var5]);
		}
	}

	@ObfuscatedName("sc.a([CI[C[C[CI)V")
	public static void method403(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
		if (arg4.length > arg2.length) {
			return;
		}
		int var8;
		for (int var5 = 0; var5 <= arg2.length - arg4.length; var5 += var8) {
			int var6 = var5;
			int var7 = 0;
			var8 = 1;
			label117: while (true) {
				while (true) {
					if (var6 >= arg2.length) {
						break label117;
					}
					char var9 = arg2[var6];
					char var10 = 0;
					if (var6 + 1 < arg2.length) {
						var10 = arg2[var6 + 1];
					}
					int var11;
					if (var7 < arg4.length && (var11 = method408(arg4[var7], var10, var9)) > 0) {
						var6 += var11;
						var7++;
					} else {
						if (var7 == 0) {
							break label117;
						}
						int var12;
						if ((var12 = method408(arg4[var7 - 1], var10, var9)) > 0) {
							var6 += var12;
							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg4.length || !method414(var9)) {
								break label117;
							}
							var6++;
						}
					}
				}
			}
			if (var7 >= arg4.length) {
				boolean var13 = false;
				int var14 = method404(arg0, arg2, var5);
				int var15 = method405(arg3, var6 - 1, arg2);
				if (arg1 == 1 && var14 > 0 && var15 > 0) {
					var13 = true;
				}
				if (arg1 == 2 && (var14 > 2 && var15 > 0 || var14 > 0 && var15 > 2)) {
					var13 = true;
				}
				if (arg1 == 3 && var14 > 0 && var15 > 2) {
					var13 = true;
				}
				boolean var10000;
				if (arg1 == 3 && var14 > 2 && var15 > 0) {
					var10000 = true;
				} else {
					var10000 = false;
				}
				if (var13) {
					int var16 = var5;
					int var17 = var6 - 1;
					if (var14 > 2) {
						if (var14 == 4) {
							boolean var18 = false;
							for (int var19 = var5 - 1; var19 >= 0; var19--) {
								if (var18) {
									if (arg0[var19] != '*') {
										break;
									}
									var16 = var19;
								} else if (arg0[var19] == '*') {
									var16 = var19;
									var18 = true;
								}
							}
						}
						boolean var20 = false;
						for (int var21 = var16 - 1; var21 >= 0; var21--) {
							if (var20) {
								if (method414(arg2[var21])) {
									break;
								}
								var16 = var21;
							} else if (!method414(arg2[var21])) {
								var20 = true;
								var16 = var21;
							}
						}
					}
					if (var15 > 2) {
						if (var15 == 4) {
							boolean var22 = false;
							for (int var23 = var17 + 1; var23 < arg2.length; var23++) {
								if (var22) {
									if (arg3[var23] != '*') {
										break;
									}
									var17 = var23;
								} else if (arg3[var23] == '*') {
									var17 = var23;
									var22 = true;
								}
							}
						}
						boolean var24 = false;
						for (int var25 = var17 + 1; var25 < arg2.length; var25++) {
							if (var24) {
								if (method414(arg2[var25])) {
									break;
								}
								var17 = var25;
							} else if (!method414(arg2[var25])) {
								var24 = true;
								var17 = var25;
							}
						}
					}
					for (int var26 = var16; var26 <= var17; var26++) {
						arg2[var26] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a([CZ[CI)I")
	public static int method404(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}
		int var3 = arg2 - 1;
		while (true) {
			if (var3 >= 0 && method414(arg1[var3])) {
				if (arg1[var3] != ',' && arg1[var3] != '.') {
					var3--;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg2 - 1; var5 >= 0 && method414(arg0[var5]); var5--) {
				if (arg0[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 3) {
				return 4;
			}
			if (method414(arg1[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CII[C)I")
	public static int method405(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}
		int var3 = arg1 + 1;
		while (true) {
			if (var3 < arg2.length && method414(arg2[var3])) {
				if (arg2[var3] != '\\' && arg2[var3] != '/') {
					var3++;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg1 + 1; var5 < arg2.length && method414(arg0[var5]); var5++) {
				if (arg0[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 5) {
				return 4;
			}
			if (method414(arg2[arg1 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([C[CI[[B)V")
	public static void method406(char[] arg0, char[] arg1, byte[][] arg2) {
		if (arg1.length > arg0.length) {
			return;
		}
		int var7;
		for (int var3 = 0; var3 <= arg0.length - arg1.length; var3 += var7) {
			int var4 = var3;
			int var5 = 0;
			int var6 = 0;
			var7 = 1;
			boolean var8 = false;
			boolean var9 = false;
			boolean var10 = false;
			label161: while (true) {
				while (true) {
					if (var4 >= arg0.length || var9 && var10) {
						break label161;
					}
					char var11 = arg0[var4];
					char var12 = 0;
					if (var4 + 1 < arg0.length) {
						var12 = arg0[var4 + 1];
					}
					int var13;
					if (var5 < arg1.length && (var13 = method409(var11, var12, arg1[var5])) > 0) {
						if (var13 == 1 && method417(var11)) {
							var9 = true;
						}
						if (var13 == 2 && (method417(var11) || method417(var12))) {
							var9 = true;
						}
						var4 += var13;
						var5++;
					} else {
						if (var5 == 0) {
							break label161;
						}
						int var14;
						if ((var14 = method409(var11, var12, arg1[var5 - 1])) > 0) {
							var4 += var14;
							if (var5 == 1) {
								var7++;
							}
						} else {
							if (var5 >= arg1.length || !method415(var11)) {
								break label161;
							}
							if (method414(var11) && var11 != '\'') {
								var8 = true;
							}
							if (method417(var11)) {
								var10 = true;
							}
							var4++;
							var6++;
							if (var6 * 100 / (var4 - var3) > 90) {
								break label161;
							}
						}
					}
				}
			}
			if (var5 >= arg1.length && (!var9 || !var10)) {
				boolean var15 = true;
				if (var8) {
					boolean var20 = false;
					boolean var21 = false;
					if (var3 - 1 < 0 || method414(arg0[var3 - 1]) && arg0[var3 - 1] != '\'') {
						var20 = true;
					}
					if (var4 >= arg0.length || method414(arg0[var4]) && arg0[var4] != '\'') {
						var21 = true;
					}
					if (!var20 || !var21) {
						boolean var22 = false;
						int var23 = var3 - 2;
						if (var20) {
							var23 = var3;
						}
						while (!var22 && var23 < var4) {
							if (var23 >= 0 && (!method414(arg0[var23]) || arg0[var23] == '\'')) {
								char[] var24 = new char[3];
								int var25;
								for (var25 = 0; var25 < 3 && var23 + var25 < arg0.length && (!method414(arg0[var23 + var25]) || arg0[var23 + var25] == '\''); var25++) {
									var24[var25] = arg0[var23 + var25];
								}
								boolean var26 = true;
								if (var25 == 0) {
									var26 = false;
								}
								if (var25 < 3 && var23 - 1 >= 0 && (!method414(arg0[var23 - 1]) || arg0[var23 - 1] == '\'')) {
									var26 = false;
								}
								if (var26 && !method420(var24)) {
									var22 = true;
								}
							}
							var23++;
						}
						if (!var22) {
							var15 = false;
						}
					}
				} else {
					char var16 = ' ';
					if (var3 - 1 >= 0) {
						var16 = arg0[var3 - 1];
					}
					char var17 = ' ';
					if (var4 < arg0.length) {
						var17 = arg0[var4];
					}
					byte var18 = method410(var16);
					byte var19 = method410(var17);
					if (arg2 != null && method407(arg2, var18, var19)) {
						var15 = false;
					}
				}
				if (var15) {
					int var27 = 0;
					int var28 = 0;
					int var29 = -1;
					for (int var30 = var3; var30 < var4; var30++) {
						if (method417(arg0[var30])) {
							var27++;
						} else if (method416(field1201, arg0[var30])) {
							var28++;
							var29 = var30;
						}
					}
					if (var29 > -1) {
						var27 -= var4 - var29 - 1;
					}
					if (var27 <= var28) {
						for (int var31 = var3; var31 < var4; var31++) {
							arg0[var31] = '*';
						}
					} else {
						var7 = 1;
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(I[[BBB)Z")
	public static boolean method407(byte[][] arg0, byte arg1, byte arg2) {
		int var3 = 0;
		if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
			return true;
		}
		int var4 = arg0.length - 1;
		if (arg0[var4][0] == arg1 && arg0[var4][1] == arg2) {
			return true;
		}
		do {
			int var5 = (var3 + var4) / 2;
			if (arg0[var5][0] == arg1 && arg0[var5][1] == arg2) {
				return true;
			}
			if (arg1 < arg0[var5][0] || arg1 == arg0[var5][0] && arg2 < arg0[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);
		return false;
	}

	@ObfuscatedName("sc.a(CZCC)I")
	public static int method408(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		} else if (arg0 == 'o' && arg2 == '0') {
			return 1;
		} else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
			return 2;
		} else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
			return 1;
		} else if (arg0 == 'e' && arg2 == '€') {
			return 1;
		} else if (arg0 == 's' && arg2 == '$') {
			return 1;
		} else if (arg0 == 'l' && arg2 == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a(CCCI)I")
	public static int method409(char arg0, char arg1, char arg2) {
		if (arg2 == arg0) {
			return 1;
		}
		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
					if (arg0 == '/' && arg1 == '\\') {
						return 2;
					}
					return 0;
				}
				return 1;
			}
			if (arg2 == 'b') {
				if (arg0 != '6' && arg0 != '8') {
					if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
						return 0;
					}
					return 2;
				}
				return 1;
			}
			if (arg2 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'd') {
				if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'f') {
				if (arg0 == 'p' && arg1 == 'h') {
					return 2;
				}
				if (arg0 == '£') {
					return 1;
				}
				return 0;
			}
			if (arg2 == 'g') {
				if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'h') {
				if (arg0 == '#') {
					return 1;
				}
				return 0;
			}
			if (arg2 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'j') {
				return 0;
			}
			if (arg2 == 'k') {
				return 0;
			}
			if (arg2 == 'l') {
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'm') {
				return 0;
			}
		}
		if (arg2 >= 'n' && arg2 <= 'z') {
			if (arg2 == 'n') {
				return 0;
			}
			if (arg2 == 'o') {
				if (arg0 != '0' && arg0 != '*') {
					if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
						return 0;
					}
					return 2;
				}
				return 1;
			}
			if (arg2 == 'p') {
				return 0;
			}
			if (arg2 == 'q') {
				return 0;
			}
			if (arg2 == 'r') {
				return 0;
			}
			if (arg2 == 's') {
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 't') {
				if (arg0 != '7' && arg0 != '+') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'v') {
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'w') {
				if (arg0 == 'v' && arg1 == 'v') {
					return 2;
				}
				return 0;
			}
			if (arg2 == 'x') {
				if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'y') {
				return 0;
			}
			if (arg2 == 'z') {
				return 0;
			}
		}
		if (arg2 >= '0' && arg2 <= '9') {
			if (arg2 == '0') {
				if (arg0 == 'o' || arg0 == 'O') {
					return 1;
				} else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
					return 0;
				} else {
					return 2;
				}
			} else if (arg2 == '1') {
				return arg0 == 'l' ? 1 : 0;
			} else {
				return 0;
			}
		} else if (arg2 == ',') {
			return arg0 == '.' ? 1 : 0;
		} else if (arg2 == '.') {
			return arg0 == ',' ? 1 : 0;
		} else if (arg2 == '!') {
			return arg0 == 'i' ? 1 : 0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.b(CI)B")
	public static byte method410(char arg0) {
		if (field1199 > 9 || field1199 < 9) {
			field1194 = -479;
		}
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		} else if (arg0 == '\'') {
			return 28;
		} else if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		} else {
			return 27;
		}
	}

	@ObfuscatedName("sc.b([CI)V")
	public static void method411(char[] arg0) {
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		while (true) {
			do {
				int var6;
				if ((var6 = method412(arg0, field1200, var1)) == -1) {
					return;
				}
				boolean var4 = false;
				for (int var5 = var1; var5 >= 0 && var5 < var6 && !var4; var5++) {
					if (!method414(arg0[var5]) && !method415(arg0[var5])) {
						var4 = true;
					}
				}
				if (var4) {
					var2 = 0;
				}
				if (var2 == 0) {
					var3 = var6;
				}
				var1 = method413(arg0, var6);
				int var7 = 0;
				for (int var8 = var6; var8 < var1; var8++) {
					var7 = var7 * 10 + arg0[var8] - 48;
				}
				if (var7 <= 255 && var1 - var6 <= 8) {
					var2++;
				} else {
					var2 = 0;
				}
			} while (var2 != 4);
			for (int var9 = var3; var9 < var1; var9++) {
				arg0[var9] = '*';
			}
			var2 = 0;
		}
	}

	@ObfuscatedName("sc.a([CII)I")
	public static int method412(char[] arg0, int arg1, int arg2) {
		if (arg1 != 0) {
			field1204 = 256;
		}
		for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
			if (arg0[var3] >= '0' && arg0[var3] <= '9') {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("sc.a(I[CI)I")
	public static int method413(char[] arg0, int arg1) {
		int var2 = arg1;
		while (true) {
			if (var2 < arg0.length && var2 >= 0) {
				if (arg0[var2] >= '0' && arg0[var2] <= '9') {
					var2++;
					continue;
				}
				return var2;
			}
			return arg0.length;
		}
	}

	@ObfuscatedName("sc.a(IC)Z")
	public static boolean method414(char arg0) {
		return !method416(field1201, arg0) && !method417(arg0);
	}

	@ObfuscatedName("sc.c(CI)Z")
	public static boolean method415(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("sc.a(BC)Z")
	public static boolean method416(byte arg0, char arg1) {
		if (arg0 != -17) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("sc.b(IC)Z")
	public static boolean method417(char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@ObfuscatedName("sc.c(IC)Z")
	public static boolean method418(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("sc.d(IC)Z")
	public static boolean method419(int arg0, char arg1) {
		if (arg0 != 5) {
			throw new NullPointerException();
		}
		return arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("sc.c([CI)Z")
	public static boolean method420(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method417(arg0[var2]) && arg0[var2] != '\u0000') {
				var1 = false;
			}
		}
		if (var1) {
			return true;
		}
		int var3 = method421(arg0);
		int var4 = 0;
		int var5 = field1205.length - 1;
		if (var3 == field1205[0] || var3 == field1205[var5]) {
			return true;
		}
		do {
			int var6 = (var4 + var5) / 2;
			if (var3 == field1205[var6]) {
				return true;
			}
			if (var3 < field1205[var6]) {
				var5 = var6;
			} else {
				var4 = var6;
			}
		} while (var4 != var5 && var4 + 1 != var5);
		return false;
	}

	@ObfuscatedName("sc.b(B[C)I")
	public static int method421(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[arg0.length - var2 - 1];
			if (var3 >= 'a' && var3 <= 'z') {
				var1 = var1 * 38 + var3 + 1 - 'a';
			} else if (var3 == '\'') {
				var1 = var1 * 38 + 27;
			} else if (var3 >= '0' && var3 <= '9') {
				var1 = var1 * 38 + var3 + 28 - '0';
			} else if (var3 != '\u0000') {
				return 0;
			}
		}
		return var1;
	}
}
