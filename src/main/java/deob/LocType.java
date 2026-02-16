package deob;

@ObfuscatedName("ec")
public final class LocType {

	@ObfuscatedName("ec.a")
	public final int field942 = -32952;

	@ObfuscatedName("ec.b")
	public final boolean field943 = false;

	@ObfuscatedName("ec.c")
	public int field944;

	@ObfuscatedName("ec.d")
	public final boolean field945 = false;

	@ObfuscatedName("ec.e")
	public int field946;

	@ObfuscatedName("ec.f")
	public static int field947;

	@ObfuscatedName("ec.g")
	public static int[] field948;

	@ObfuscatedName("ec.h")
	public static Packet field949;

	@ObfuscatedName("ec.i")
	public static LocType[] field950;

	@ObfuscatedName("ec.j")
	public static int field951;

	@ObfuscatedName("ec.k")
	public static final Model[] field952 = new Model[4];

	@ObfuscatedName("ec.l")
	public int field953 = -1;

	@ObfuscatedName("ec.m")
	public int[] field954;

	@ObfuscatedName("ec.n")
	public int[] field955;

	@ObfuscatedName("ec.o")
	public String field956;

	@ObfuscatedName("ec.p")
	public byte[] field957;

	@ObfuscatedName("ec.q")
	public int[] field958;

	@ObfuscatedName("ec.r")
	public int[] field959;

	@ObfuscatedName("ec.s")
	public int field960;

	@ObfuscatedName("ec.t")
	public int field961;

	@ObfuscatedName("ec.u")
	public boolean field962;

	@ObfuscatedName("ec.v")
	public boolean field963;

	@ObfuscatedName("ec.w")
	public boolean field964;

	@ObfuscatedName("ec.x")
	public boolean field965;

	@ObfuscatedName("ec.y")
	public boolean field966;

	@ObfuscatedName("ec.z")
	public boolean field967;

	@ObfuscatedName("ec.T")
	public static LruCache field987 = new LruCache(500, 0);

	@ObfuscatedName("ec.U")
	public static LruCache field988 = new LruCache(30, 0);

	@ObfuscatedName("ec.C")
	public byte field970;

	@ObfuscatedName("ec.D")
	public byte field971;

	@ObfuscatedName("ec.A")
	public int field968;

	@ObfuscatedName("ec.B")
	public int field969;

	@ObfuscatedName("ec.F")
	public int field973;

	@ObfuscatedName("ec.G")
	public int field974;

	@ObfuscatedName("ec.J")
	public int field977;

	@ObfuscatedName("ec.K")
	public int field978;

	@ObfuscatedName("ec.L")
	public int field979;

	@ObfuscatedName("ec.M")
	public int field980;

	@ObfuscatedName("ec.N")
	public int field981;

	@ObfuscatedName("ec.O")
	public int field982;

	@ObfuscatedName("ec.P")
	public int field983;

	@ObfuscatedName("ec.S")
	public int field986;

	@ObfuscatedName("ec.H")
	public boolean field975;

	@ObfuscatedName("ec.I")
	public boolean field976;

	@ObfuscatedName("ec.Q")
	public boolean field984;

	@ObfuscatedName("ec.R")
	public boolean field985;

	@ObfuscatedName("ec.E")
	public String[] field972;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static void method323(JagFile arg0) {
		field949 = new Packet(arg0.method294("loc.dat", null), (byte) 1);
		Packet var1 = new Packet(arg0.method294("loc.idx", null), (byte) 1);
		field947 = var1.method226();
		field948 = new int[field947];
		int var2 = 2;
		for (int var3 = 0; var3 < field947; var3++) {
			field948[var3] = var2;
			var2 += var1.method226();
		}
		field950 = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field950[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static void method324() {
		field987 = null;
		field988 = null;
		field948 = null;
		field950 = null;
		field949 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static LocType method325(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field950[var1].field953 == arg0) {
				return field950[var1];
			}
		}
		field951 = (field951 + 1) % 10;
		LocType var2 = field950[field951];
		field949.field709 = field948[arg0];
		var2.field953 = arg0;
		var2.method326();
		var2.method327(field949);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public void method326() {
		this.field954 = null;
		this.field955 = null;
		this.field956 = null;
		this.field957 = null;
		this.field958 = null;
		this.field959 = null;
		this.field960 = 1;
		this.field961 = 1;
		this.field962 = true;
		this.field963 = true;
		this.field964 = false;
		this.field965 = false;
		this.field966 = false;
		this.field967 = false;
		this.field968 = -1;
		this.field969 = 16;
		this.field970 = 0;
		this.field971 = 0;
		this.field972 = null;
		this.field973 = -1;
		this.field974 = -1;
		this.field975 = false;
		this.field976 = true;
		this.field977 = 128;
		this.field978 = 128;
		this.field979 = 128;
		this.field983 = 0;
		this.field980 = 0;
		this.field981 = 0;
		this.field982 = 0;
		this.field984 = false;
		this.field985 = false;
		this.field986 = -1;
	}

	@ObfuscatedName("ec.a(BLlb;)V")
	public void method327(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method224();
					if (var3 == 0) {
						if (var2 == -1) {
							this.field964 = false;
							if (this.field954 != null && (this.field955 == null || this.field955[0] == 10)) {
								this.field964 = true;
							}
							if (this.field972 != null) {
								this.field964 = true;
							}
						}
						if (this.field985) {
							this.field962 = false;
							this.field963 = false;
						}
						if (this.field986 == -1) {
							this.field986 = this.field962 ? 1 : 0;
							return;
						}
						return;
					}
					if (var3 == 1) {
						var4 = arg0.method224();
						break;
					}
					if (var3 == 2) {
						this.field956 = arg0.method231();
					} else if (var3 == 3) {
						this.field957 = arg0.method232(this.field942);
					} else if (var3 == 5) {
						int var6 = arg0.method224();
						if (var6 > 0) {
							this.field955 = null;
							this.field954 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								this.field954[var7] = arg0.method226();
							}
						}
					} else if (var3 == 14) {
						this.field960 = arg0.method224();
					} else if (var3 == 15) {
						this.field961 = arg0.method224();
					} else if (var3 == 17) {
						this.field962 = false;
					} else if (var3 == 18) {
						this.field963 = false;
					} else if (var3 == 19) {
						var2 = arg0.method224();
						if (var2 == 1) {
							this.field964 = true;
						}
					} else if (var3 == 21) {
						this.field965 = true;
					} else if (var3 == 22) {
						this.field966 = true;
					} else if (var3 == 23) {
						this.field967 = true;
					} else if (var3 == 24) {
						this.field968 = arg0.method226();
						if (this.field968 == 65535) {
							this.field968 = -1;
						}
					} else if (var3 == 28) {
						this.field969 = arg0.method224();
					} else if (var3 == 29) {
						this.field970 = arg0.method225();
					} else if (var3 == 39) {
						this.field971 = arg0.method225();
					} else if (var3 >= 30 && var3 < 39) {
						if (this.field972 == null) {
							this.field972 = new String[5];
						}
						this.field972[var3 - 30] = arg0.method231();
						if (this.field972[var3 - 30].equalsIgnoreCase("hidden")) {
							this.field972[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method224();
						this.field958 = new int[var8];
						this.field959 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							this.field958[var9] = arg0.method226();
							this.field959[var9] = arg0.method226();
						}
					} else if (var3 == 60) {
						this.field973 = arg0.method226();
					} else if (var3 == 62) {
						this.field975 = true;
					} else if (var3 == 64) {
						this.field976 = false;
					} else if (var3 == 65) {
						this.field977 = arg0.method226();
					} else if (var3 == 66) {
						this.field978 = arg0.method226();
					} else if (var3 == 67) {
						this.field979 = arg0.method226();
					} else if (var3 == 68) {
						this.field974 = arg0.method226();
					} else if (var3 == 69) {
						this.field983 = arg0.method224();
					} else if (var3 == 70) {
						this.field980 = arg0.method227();
					} else if (var3 == 71) {
						this.field981 = arg0.method227();
					} else if (var3 == 72) {
						this.field982 = arg0.method227();
					} else if (var3 == 73) {
						this.field984 = true;
					} else if (var3 == 74) {
						this.field985 = true;
					} else if (var3 == 75) {
						this.field986 = arg0.method224();
					}
				}
			} while (var4 <= 0);
			this.field955 = new int[var4];
			this.field954 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				this.field954[var5] = arg0.method226();
				this.field955[var5] = arg0.method224();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public boolean method328(int arg0) {
		if (this.field955 != null) {
			for (int var4 = 0; var4 < this.field955.length; var4++) {
				if (this.field955[var4] == arg0) {
					return Model.method126(this.field954[var4] & 0xFFFF);
				}
			}
			return true;
		} else if (this.field954 == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field954.length; var3++) {
				var2 &= Model.method126(this.field954[var3] & 0xFFFF);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ec.a(Z)Z")
	public boolean method329() {
		if (this.field954 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field954.length; var2++) {
			var1 &= Model.method126(this.field954[var2] & 0xFFFF);
		}
		return var1;
	}

	@ObfuscatedName("ec.a(BLub;)V")
	public void method330(OnDemand arg0) {
		if (this.field954 != null) {
			for (int var2 = 0; var2 < this.field954.length; var2++) {
				arg0.method279(0, this.field954[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public Model method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.method332(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}
		if (this.field965 || this.field966) {
			var8 = new Model(this.field966, (byte) 72, var8, this.field965);
		}
		if (this.field965) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field536; var10++) {
				int var11 = var8.field537[var10];
				int var12 = var8.field539[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.field538[var10] += var15 - var9;
			}
			var8.method130();
		}
		return var8;
	}

	@ObfuscatedName("ec.a(IZII)Leb;")
	public Model method332(int arg0, int arg1, int arg2) {
		Model var4 = null;
		long var5;
		if (this.field955 == null) {
			if (arg2 != 10) {
				return null;
			}
			var5 = (long) ((this.field953 << 6) + arg0) + ((long) (arg1 + 1) << 32);
			Model var7 = (Model) field988.method101(var5);
			if (var7 != null) {
				return var7;
			}
			if (this.field954 == null) {
				return null;
			}
			boolean var8 = this.field975 ^ arg0 > 3;
			int var9 = this.field954.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = this.field954[var10];
				if (var8) {
					var11 += 65536;
				}
				var4 = (Model) field987.method101((long) var11);
				if (var4 == null) {
					var4 = Model.method125(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}
					if (var8) {
						var4.method140();
					}
					field987.method102((long) var11, var4);
				}
				if (var9 > 1) {
					field952[var10] = var4;
				}
			}
			if (var9 > 1) {
				var4 = new Model(var9, -643, field952);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < this.field955.length; var13++) {
				if (this.field955[var13] == arg2) {
					var12 = var13;
					break;
				}
			}
			if (var12 == -1) {
				return null;
			}
			var5 = (long) ((this.field953 << 6) + (var12 << 3) + arg0) + ((long) (arg1 + 1) << 32);
			Model var14 = (Model) field988.method101(var5);
			if (var14 != null) {
				return var14;
			}
			int var15 = this.field954[var12];
			boolean var16 = this.field975 ^ arg0 > 3;
			if (var16) {
				var15 += 65536;
			}
			var4 = (Model) field987.method101((long) var15);
			if (var4 == null) {
				var4 = Model.method125(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}
				if (var16) {
					var4.method140();
				}
				field987.method102((long) var15, var4);
			}
		}
		boolean var17;
		if (this.field977 == 128 && this.field978 == 128 && this.field979 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}
		boolean var18;
		if (this.field980 == 0 && this.field981 == 0 && this.field982 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}
		Model var19 = new Model(this.field958 == null, AnimFrame.method48(arg1), var4, true, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method132();
			var19.method133(arg1);
			var19.field568 = null;
			var19.field567 = null;
		}
		while (arg0-- > 0) {
			var19.method136();
		}
		if (this.field958 != null) {
			for (int var20 = 0; var20 < this.field958.length; var20++) {
				var19.method139(this.field958[var20], this.field959[var20]);
			}
		}
		if (var17) {
			var19.method141(this.field979, this.field977, this.field978);
		}
		if (var18) {
			var19.method138(this.field980, this.field981, this.field982);
		}
		var19.method142(this.field970 + 64, this.field971 * 5 + 768, -50, -10, -50, !this.field966);
		if (this.field986 == 1) {
			var19.field564 = var19.field394;
		}
		field988.method102(var5, var19);
		return var19;
	}
}
