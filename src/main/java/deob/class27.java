package deob;

@ObfuscatedName("ab")
public final class class27 extends class25 {

	@ObfuscatedName("ab.qb")
	public int field454;

	@ObfuscatedName("ab.rb")
	public final int field455 = -12792;

	@ObfuscatedName("ab.sb")
	public final int field456 = -582;

	@ObfuscatedName("ab.tb")
	public String field457;

	@ObfuscatedName("ab.ub")
	public boolean field458 = false;

	@ObfuscatedName("ab.vb")
	public int field459;

	@ObfuscatedName("ab.wb")
	public int field460;

	@ObfuscatedName("ab.xb")
	public final int[] field461 = new int[12];

	@ObfuscatedName("ab.yb")
	public final int[] field462 = new int[5];

	@ObfuscatedName("ab.zb")
	public int field463;

	@ObfuscatedName("ab.Qb")
	public static class19 field480 = new class19(260, 0);

	@ObfuscatedName("ab.Nb")
	public boolean field477 = false;

	@ObfuscatedName("ab.Ob")
	public long field478 = -1L;

	@ObfuscatedName("ab.Ab")
	public int field464;

	@ObfuscatedName("ab.Cb")
	public int field466;

	@ObfuscatedName("ab.Db")
	public int field467;

	@ObfuscatedName("ab.Eb")
	public int field468;

	@ObfuscatedName("ab.Fb")
	public int field469;

	@ObfuscatedName("ab.Gb")
	public int field470;

	@ObfuscatedName("ab.Hb")
	public int field471;

	@ObfuscatedName("ab.Jb")
	public int field473;

	@ObfuscatedName("ab.Kb")
	public int field474;

	@ObfuscatedName("ab.Lb")
	public int field475;

	@ObfuscatedName("ab.Mb")
	public int field476;

	@ObfuscatedName("ab.Bb")
	public long field465;

	@ObfuscatedName("ab.Ib")
	public class31 field472;

	@ObfuscatedName("ab.Pb")
	public class59 field479;

	@ObfuscatedName("ab.a(Llb;I)V")
	public void method116(class38 arg0, int arg1) {
		arg0.field709 = 0;
		this.field459 = arg0.method224();
		this.field460 = arg0.method224();
		this.field479 = null;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.method224();
			if (var4 == 0) {
				this.field461[var3] = 0;
			} else {
				int var5 = arg0.method224();
				this.field461[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.field461[0] == 65535) {
					this.field479 = class59.method335(arg0.method226());
					break;
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method224();
			if (var7 < 0 || var7 >= client.field1657[var6].length) {
				var7 = 0;
			}
			this.field462[var6] = var7;
		}
		super.field402 = arg0.method226();
		if (super.field402 == 65535) {
			super.field402 = -1;
		}
		super.field403 = arg0.method226();
		if (super.field403 == 65535) {
			super.field403 = -1;
		}
		super.field404 = arg0.method226();
		if (super.field404 == 65535) {
			super.field404 = -1;
		}
		super.field405 = arg0.method226();
		if (super.field405 == 65535) {
			super.field405 = -1;
		}
		super.field406 = arg0.method226();
		if (super.field406 == 65535) {
			super.field406 = -1;
		}
		super.field407 = arg0.method226();
		if (super.field407 == 65535) {
			super.field407 = -1;
		}
		super.field408 = arg0.method226();
		if (super.field408 == 65535) {
			super.field408 = -1;
		}
		this.field457 = class51.method299(class51.method296(arg0.method230()));
		this.field463 = arg0.method224();
		this.field464 = arg0.method226();
		this.field458 = true;
		this.field465 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			this.field465 <<= 0x4;
			if (this.field461[var8] >= 256) {
				this.field465 += this.field461[var8] - 256;
			}
		}
		if (this.field461[0] >= 256) {
			this.field465 += this.field461[0] - 256 >> 4;
		}
		if (this.field461[1] >= 256) {
			this.field465 += this.field461[1] - 256 >> 8;
		}
		for (int var9 = 0; var9 < 5; var9++) {
			this.field465 <<= 0x3;
			this.field465 += this.field462[var9];
		}
		this.field465 <<= 0x1;
		this.field465 += this.field459;
	}

	@ObfuscatedName("ab.a(Z)Leb;")
	@Override
	public class31 method109() {
		if (!this.field458) {
			return null;
		}
		class31 var1 = this.method117();
		if (var1 == null) {
			return null;
		}
		super.field443 = var1.field394;
		var1.field569 = true;
		if (this.field477) {
			return var1;
		}
		if (super.field430 != -1 && super.field431 != -1) {
			class68 var2 = class68.field1154[super.field430];
			class31 var3 = var2.method379();
			if (var3 != null) {
				class31 var4 = new class31(true, class7.method48(super.field431), var3, true, false);
				var4.method138(0, -super.field434, 0);
				var4.method132();
				var4.method133(var2.field1158.field1135[super.field431]);
				var4.field568 = null;
				var4.field567 = null;
				if (var2.field1161 != 128 || var2.field1162 != 128) {
					var4.method141(var2.field1161, var2.field1161, var2.field1162);
				}
				var4.method142(var2.field1164 + 64, var2.field1165 + 850, -30, -50, -30, true);
				class31[] var5 = new class31[] { var1, var4 };
				var1 = new class31(true, (byte) 72, var5, 2);
			}
		}
		if (this.field472 != null) {
			if (client.field1218 >= this.field468) {
				this.field472 = null;
			}
			if (client.field1218 >= this.field467 && client.field1218 < this.field468) {
				class31 var6 = this.field472;
				var6.method138(this.field469 - super.field397, this.field470 - this.field466, this.field471 - super.field398);
				if (super.field444 == 512) {
					var6.method136();
					var6.method136();
					var6.method136();
				} else if (super.field444 == 1024) {
					var6.method136();
					var6.method136();
				} else if (super.field444 == 1536) {
					var6.method136();
				}
				class31[] var7 = new class31[] { var1, var6 };
				var1 = new class31(true, (byte) 72, var7, 2);
				if (super.field444 == 512) {
					var6.method136();
				} else if (super.field444 == 1024) {
					var6.method136();
					var6.method136();
				} else if (super.field444 == 1536) {
					var6.method136();
					var6.method136();
					var6.method136();
				}
				var6.method138(super.field397 - this.field469, this.field466 - this.field470, super.field398 - this.field471);
			}
		}
		var1.field569 = true;
		return var1;
	}

	@ObfuscatedName("ab.c(Z)Leb;")
	public class31 method117() {
		if (this.field479 != null) {
			int var1 = -1;
			if (super.field425 >= 0 && super.field428 == 0) {
				var1 = class66.field1133[super.field425].field1135[super.field426];
			} else if (super.field422 >= 0) {
				var1 = class66.field1133[super.field422].field1135[super.field423];
			}
			return this.field479.method337(var1, -1, null);
		}
		long var3 = this.field465;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (super.field425 >= 0 && super.field428 == 0) {
			class66 var9 = class66.field1133[super.field425];
			var5 = var9.field1135[super.field426];
			if (super.field422 >= 0 && super.field422 != super.field402) {
				var6 = class66.field1133[super.field422].field1135[super.field423];
			}
			if (var9.field1142 >= 0) {
				var7 = var9.field1142;
				var3 += var7 - this.field461[5] << 8;
			}
			if (var9.field1143 >= 0) {
				var8 = var9.field1143;
				var3 += var8 - this.field461[3] << 16;
			}
		} else if (super.field422 >= 0) {
			var5 = class66.field1133[super.field422].field1135[super.field423];
		}
		class31 var10 = (class31) field480.method101(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = this.field461[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}
				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}
				if (var13 >= 256 && var13 < 512 && !class64.field1113[var13 - 256].method370()) {
					var11 = true;
				}
				if (var13 >= 512 && !class60.method341(var13 - 512).method348(this.field459)) {
					var11 = true;
				}
			}
			if (var11) {
				if (this.field478 != -1L) {
					var10 = (class31) field480.method101(this.field478);
				}
				if (var10 == null) {
					return null;
				}
			}
		}
		if (var10 == null) {
			class31[] var14 = new class31[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = this.field461[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}
				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}
				if (var17 >= 256 && var17 < 512) {
					class31 var18 = class64.field1113[var17 - 256].method371();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}
				if (var17 >= 512) {
					class31 var19 = class60.method341(var17 - 512).method349(this.field459);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}
			var10 = new class31(var15, -643, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field462[var20] != 0) {
					var10.method139(client.field1657[var20][0], client.field1657[var20][this.field462[var20]]);
					if (var20 == 1) {
						var10.method139(client.field1550[0], client.field1550[this.field462[var20]]);
					}
				}
			}
			var10.method132();
			var10.method142(64, 850, -30, -50, -30, true);
			field480.method102(var3, var10);
			this.field478 = var3;
		}
		if (this.field477) {
			return var10;
		}
		class31 var21 = class31.field531;
		var21.method127(var10, class7.method48(var5) & class7.method48(var6));
		if (var5 != -1 && var6 != -1) {
			var21.method134(class66.field1133[super.field425].field1139, var5, var6);
		} else if (var5 != -1) {
			var21.method133(var5);
		}
		var21.method129();
		var21.field568 = null;
		var21.field567 = null;
		return var21;
	}

	@ObfuscatedName("ab.d(Z)Leb;")
	public class31 method118() {
		if (!this.field458) {
			return null;
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field461[var2];
			if (var3 >= 256 && var3 < 512 && !class64.field1113[var3 - 256].method372()) {
				var1 = true;
			}
			if (var3 >= 512 && !class60.method341(var3 - 512).method350(this.field459)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		class31[] var4 = new class31[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field461[var6];
			if (var7 >= 256 && var7 < 512) {
				class31 var8 = class64.field1113[var7 - 256].method373();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				class31 var9 = class60.method341(var7 - 512).method351(this.field459);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		class31 var10 = new class31(var5, -643, var4);
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field462[var11] != 0) {
				var10.method139(client.field1657[var11][0], client.field1657[var11][this.field462[var11]]);
				if (var11 == 1) {
					var10.method139(client.field1550[0], client.field1550[this.field462[var11]]);
				}
			}
		}
		return var10;
	}

	@ObfuscatedName("ab.a(I)Z")
	@Override
	public boolean method113() {
		return this.field458;
	}
}
