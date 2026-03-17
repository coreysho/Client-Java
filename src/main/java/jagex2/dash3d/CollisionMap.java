package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public final class CollisionMap {

	@ObfuscatedName("jc.a")
	public final int field1083 = 701;

	@ObfuscatedName("jc.b")
	public final int field1084 = 1;

	@ObfuscatedName("jc.c")
	public final int field1085 = 1;

	@ObfuscatedName("jc.d")
	public final boolean field1086 = false;

	@ObfuscatedName("jc.e")
	public final int field1087 = 1;

	@ObfuscatedName("jc.f")
	public final boolean field1088 = false;

	@ObfuscatedName("jc.g")
	public final boolean field1089 = false;

	@ObfuscatedName("jc.h")
	public final int startX = 0;

	@ObfuscatedName("jc.i")
	public final int startZ = 0;

	@ObfuscatedName("jc.j")
	public final int sizeX = 104;

	@ObfuscatedName("jc.k")
	public final int sizeZ = 104;

	@ObfuscatedName("jc.l")
	public final int[][] flags = new int[this.sizeX][this.sizeZ];

	public CollisionMap(int arg0, int arg1, boolean arg2) {
		this.reset();
	}

	@ObfuscatedName("jc.a(B)V")
	public void reset() {
		for (int var1 = 0; var1 < this.sizeX; var1++) {
			for (int var2 = 0; var2 < this.sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || var1 == this.sizeX - 1 || var2 == this.sizeZ - 1) {
					this.flags[var1][var2] = 16777215;
				} else {
					this.flags[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIBI)V")
	public void addWall(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		int var6 = arg4 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.addCMap(var6, var7, 128);
				this.addCMap(var6 - 1, var7, 8);
			}
			if (arg0 == 1) {
				this.addCMap(var6, var7, 2);
				this.addCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 2) {
				this.addCMap(var6, var7, 8);
				this.addCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 3) {
				this.addCMap(var6, var7, 32);
				this.addCMap(var6, var7 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.addCMap(var6, var7, 1);
				this.addCMap(var6 - 1, var7 + 1, 16);
			}
			if (arg0 == 1) {
				this.addCMap(var6, var7, 4);
				this.addCMap(var6 + 1, var7 + 1, 64);
			}
			if (arg0 == 2) {
				this.addCMap(var6, var7, 16);
				this.addCMap(var6 + 1, var7 - 1, 1);
			}
			if (arg0 == 3) {
				this.addCMap(var6, var7, 64);
				this.addCMap(var6 - 1, var7 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.addCMap(var6, var7, 130);
				this.addCMap(var6 - 1, var7, 8);
				this.addCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 1) {
				this.addCMap(var6, var7, 10);
				this.addCMap(var6, var7 + 1, 32);
				this.addCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 2) {
				this.addCMap(var6, var7, 40);
				this.addCMap(var6 + 1, var7, 128);
				this.addCMap(var6, var7 - 1, 2);
			}
			if (arg0 == 3) {
				this.addCMap(var6, var7, 160);
				this.addCMap(var6, var7 - 1, 2);
				this.addCMap(var6 - 1, var7, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.addCMap(var6, var7, 65536);
				this.addCMap(var6 - 1, var7, 4096);
			}
			if (arg0 == 1) {
				this.addCMap(var6, var7, 1024);
				this.addCMap(var6, var7 + 1, 16384);
			}
			if (arg0 == 2) {
				this.addCMap(var6, var7, 4096);
				this.addCMap(var6 + 1, var7, 65536);
			}
			if (arg0 == 3) {
				this.addCMap(var6, var7, 16384);
				this.addCMap(var6, var7 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.addCMap(var6, var7, 512);
				this.addCMap(var6 - 1, var7 + 1, 8192);
			}
			if (arg0 == 1) {
				this.addCMap(var6, var7, 2048);
				this.addCMap(var6 + 1, var7 + 1, 32768);
			}
			if (arg0 == 2) {
				this.addCMap(var6, var7, 8192);
				this.addCMap(var6 + 1, var7 - 1, 512);
			}
			if (arg0 == 3) {
				this.addCMap(var6, var7, 32768);
				this.addCMap(var6 - 1, var7 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.addCMap(var6, var7, 66560);
			this.addCMap(var6 - 1, var7, 4096);
			this.addCMap(var6, var7 + 1, 16384);
		}
		if (arg0 == 1) {
			this.addCMap(var6, var7, 5120);
			this.addCMap(var6, var7 + 1, 16384);
			this.addCMap(var6 + 1, var7, 65536);
		}
		if (arg0 == 2) {
			this.addCMap(var6, var7, 20480);
			this.addCMap(var6 + 1, var7, 65536);
			this.addCMap(var6, var7 - 1, 1024);
		}
		if (arg0 == 3) {
			this.addCMap(var6, var7, 81920);
			this.addCMap(var6, var7 - 1, 1024);
			this.addCMap(var6 - 1, var7, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(IIIIIZI)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 = 131328;
		}
		int var8 = arg1 - this.startX;
		int var9 = arg3 - this.startZ;
		if (arg4 == 1 || arg4 == 3) {
			int var10 = arg0;
			arg0 = arg2;
			arg2 = var10;
		}
		for (int var11 = var8; var11 < var8 + arg0; var11++) {
			if (var11 >= 0 && var11 < this.sizeX) {
				for (int var12 = var9; var12 < var9 + arg2; var12++) {
					if (var12 >= 0 && var12 < this.sizeZ) {
						this.addCMap(var11, var12, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void blockGround(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(BIZIII)V")
	public void delWall(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		int var6 = arg4 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.remCMap(var7, this.field1084, 128, var6);
				this.remCMap(var7, this.field1084, 8, var6 - 1);
			}
			if (arg2 == 1) {
				this.remCMap(var7, this.field1084, 2, var6);
				this.remCMap(var7 + 1, this.field1084, 32, var6);
			}
			if (arg2 == 2) {
				this.remCMap(var7, this.field1084, 8, var6);
				this.remCMap(var7, this.field1084, 128, var6 + 1);
			}
			if (arg2 == 3) {
				this.remCMap(var7, this.field1084, 32, var6);
				this.remCMap(var7 - 1, this.field1084, 2, var6);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.remCMap(var7, this.field1084, 1, var6);
				this.remCMap(var7 + 1, this.field1084, 16, var6 - 1);
			}
			if (arg2 == 1) {
				this.remCMap(var7, this.field1084, 4, var6);
				this.remCMap(var7 + 1, this.field1084, 64, var6 + 1);
			}
			if (arg2 == 2) {
				this.remCMap(var7, this.field1084, 16, var6);
				this.remCMap(var7 - 1, this.field1084, 1, var6 + 1);
			}
			if (arg2 == 3) {
				this.remCMap(var7, this.field1084, 64, var6);
				this.remCMap(var7 - 1, this.field1084, 4, var6 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.remCMap(var7, this.field1084, 130, var6);
				this.remCMap(var7, this.field1084, 8, var6 - 1);
				this.remCMap(var7 + 1, this.field1084, 32, var6);
			}
			if (arg2 == 1) {
				this.remCMap(var7, this.field1084, 10, var6);
				this.remCMap(var7 + 1, this.field1084, 32, var6);
				this.remCMap(var7, this.field1084, 128, var6 + 1);
			}
			if (arg2 == 2) {
				this.remCMap(var7, this.field1084, 40, var6);
				this.remCMap(var7, this.field1084, 128, var6 + 1);
				this.remCMap(var7 - 1, this.field1084, 2, var6);
			}
			if (arg2 == 3) {
				this.remCMap(var7, this.field1084, 160, var6);
				this.remCMap(var7 - 1, this.field1084, 2, var6);
				this.remCMap(var7, this.field1084, 8, var6 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.remCMap(var7, this.field1084, 65536, var6);
				this.remCMap(var7, this.field1084, 4096, var6 - 1);
			}
			if (arg2 == 1) {
				this.remCMap(var7, this.field1084, 1024, var6);
				this.remCMap(var7 + 1, this.field1084, 16384, var6);
			}
			if (arg2 == 2) {
				this.remCMap(var7, this.field1084, 4096, var6);
				this.remCMap(var7, this.field1084, 65536, var6 + 1);
			}
			if (arg2 == 3) {
				this.remCMap(var7, this.field1084, 16384, var6);
				this.remCMap(var7 - 1, this.field1084, 1024, var6);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.remCMap(var7, this.field1084, 512, var6);
				this.remCMap(var7 + 1, this.field1084, 8192, var6 - 1);
			}
			if (arg2 == 1) {
				this.remCMap(var7, this.field1084, 2048, var6);
				this.remCMap(var7 + 1, this.field1084, 32768, var6 + 1);
			}
			if (arg2 == 2) {
				this.remCMap(var7, this.field1084, 8192, var6);
				this.remCMap(var7 - 1, this.field1084, 512, var6 + 1);
			}
			if (arg2 == 3) {
				this.remCMap(var7, this.field1084, 32768, var6);
				this.remCMap(var7 - 1, this.field1084, 2048, var6 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.remCMap(var7, this.field1084, 66560, var6);
			this.remCMap(var7, this.field1084, 4096, var6 - 1);
			this.remCMap(var7 + 1, this.field1084, 16384, var6);
		}
		if (arg2 == 1) {
			this.remCMap(var7, this.field1084, 5120, var6);
			this.remCMap(var7 + 1, this.field1084, 16384, var6);
			this.remCMap(var7, this.field1084, 65536, var6 + 1);
		}
		if (arg2 == 2) {
			this.remCMap(var7, this.field1084, 20480, var6);
			this.remCMap(var7, this.field1084, 65536, var6 + 1);
			this.remCMap(var7 - 1, this.field1084, 1024, var6);
		}
		if (arg2 == 3) {
			this.remCMap(var7, this.field1084, 81920, var6);
			this.remCMap(var7 - 1, this.field1084, 1024, var6);
			this.remCMap(var7, this.field1084, 4096, var6 - 1);
			return;
		}
	}

	@ObfuscatedName("jc.b(IIIIIZI)V")
	public void delLoc(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 = 131328;
		}
		int var8 = arg1 - this.startX;
		int var9 = arg2 - this.startZ;
		if (arg3 == 1 || arg3 == 3) {
			int var10 = arg0;
			arg0 = arg5;
			arg5 = var10;
		}
		for (int var11 = var8; var11 < var8 + arg0; var11++) {
			if (var11 >= 0 && var11 < this.sizeX) {
				for (int var12 = var9; var12 < var9 + arg5; var12++) {
					if (var12 >= 0 && var12 < this.sizeZ) {
						this.remCMap(var12, this.field1084, var7, var11);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void remCMap(int arg0, int arg1, int arg2, int arg3) {
		this.flags[arg3][arg0] &= 16777215 - arg2;
		if (arg1 < this.field1085 || arg1 > this.field1085) {
			;
		}
	}

	@ObfuscatedName("jc.b(III)V")
	public void unblockGroundDecor(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var3][var4] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(ZIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg5 == arg3) {
			return true;
		}
		int var7 = arg0 - this.startX;
		int var8 = arg5 - this.startZ;
		int var9 = arg2 - this.startX;
		int var10 = arg3 - this.startZ;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg0 && arg5 == arg1) {
			return true;
		}
		int var7 = arg2 - this.startX;
		int var8 = arg5 - this.startZ;
		int var9 = arg0 - this.startX;
		int var10 = arg1 - this.startZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x80) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x8) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x8) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x80) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (var7 == var9 && var8 == var10 + 1 && (this.flags[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var9 && var8 == var10 - 1 && (this.flags[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var9 - 1 && var8 == var10 && (this.flags[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var9 + 1 && var8 == var10 && (this.flags[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field1087 != 1) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		int var9 = arg0 + arg1 - 1;
		int var10 = arg3 + arg6 - 1;
		if (arg5 >= arg0 && arg5 <= var9 && arg4 >= arg3 && arg4 <= var10) {
			return true;
		} else if (arg5 == arg0 - 1 && arg4 >= arg3 && arg4 <= var10 && (this.flags[arg5 - this.startX][arg4 - this.startZ] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg5 == var9 + 1 && arg4 >= arg3 && arg4 <= var10 && (this.flags[arg5 - this.startX][arg4 - this.startZ] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg3 - 1 && arg5 >= arg0 && arg5 <= var9 && (this.flags[arg5 - this.startX][arg4 - this.startZ] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == var10 + 1 && arg5 >= arg0 && arg5 <= var9 && (this.flags[arg5 - this.startX][arg4 - this.startZ] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}
