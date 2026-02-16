package deob;

@ObfuscatedName("jb")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("jb.w")
	public int field668 = -41441;

	@ObfuscatedName("jb.x")
	public final boolean field669 = true;

	@ObfuscatedName("jb.y")
	public final int field670 = 35961;

	@ObfuscatedName("jb.z")
	public final int field671 = -676;

	@ObfuscatedName("jb.A")
	public final byte field672 = 9;

	@ObfuscatedName("jb.B")
	public final boolean field673 = true;

	@ObfuscatedName("jb.J")
	public int field681;

	@ObfuscatedName("jb.K")
	public int field682;

	@ObfuscatedName("jb.E")
	public final int[] field676;

	@ObfuscatedName("jb.H")
	public int field679;

	@ObfuscatedName("jb.I")
	public int field680;

	@ObfuscatedName("jb.F")
	public int field677;

	@ObfuscatedName("jb.G")
	public int field678;

	@ObfuscatedName("jb.D")
	public byte[] field675;

	@ObfuscatedName("jb.C")
	public int field674;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method294(arg1 + ".dat", null), (byte) 1);
		Packet var5 = new Packet(arg0.method294("index.dat", null), (byte) 1);
		var5.field709 = var4.method226();
		this.field681 = var5.method226();
		this.field682 = var5.method226();
		int var6 = var5.method224();
		this.field676 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.field676[var7 + 1] = var5.method228();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field709 += 2;
			var4.field709 += var5.method226() * var5.method226();
			var5.field709++;
		}
		this.field679 = var5.method224();
		this.field680 = var5.method224();
		this.field677 = var5.method226();
		this.field678 = var5.method226();
		int var9 = var5.method224();
		int var10 = this.field677 * this.field678;
		this.field675 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.field675[var11] = var4.method225();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.field677; var12++) {
				for (int var13 = 0; var13 < this.field678; var13++) {
					this.field675[var12 + var13 * this.field677] = var4.method225();
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void method193() {
		this.field681 /= 2;
		this.field682 /= 2;
		byte[] var1 = new byte[this.field681 * this.field682];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field678; var3++) {
			for (int var4 = 0; var4 < this.field677; var4++) {
				var1[(var4 + this.field679 >> 1) + (var3 + this.field680 >> 1) * this.field681] = this.field675[var2++];
			}
		}
		this.field675 = var1;
		this.field677 = this.field681;
		this.field678 = this.field682;
		this.field679 = 0;
		if (this.field672 == 9) {
			this.field680 = 0;
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void method194() {
		if (this.field677 == this.field681 && this.field678 == this.field682) {
			return;
		}
		byte[] var1 = new byte[this.field681 * this.field682];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field678; var3++) {
			for (int var4 = 0; var4 < this.field677; var4++) {
				var1[var4 + this.field679 + (var3 + this.field680) * this.field681] = this.field675[var2++];
			}
		}
		this.field675 = var1;
		this.field677 = this.field681;
		this.field678 = this.field682;
		this.field679 = 0;
		this.field680 = 0;
	}

	@ObfuscatedName("jb.c(I)V")
	public void method195() {
		byte[] var1 = new byte[this.field677 * this.field678];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field678; var3++) {
			for (int var4 = this.field677 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field675[var4 + var3 * this.field677];
			}
		}
		this.field675 = var1;
		this.field679 = this.field681 - this.field677 - this.field679;
	}

	@ObfuscatedName("jb.b(B)V")
	public void method196() {
		byte[] var1 = new byte[this.field677 * this.field678];
		int var2 = 0;
		for (int var3 = this.field678 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.field677; var4++) {
				var1[var2++] = this.field675[var4 + var3 * this.field677];
			}
		}
		this.field675 = var1;
		this.field680 = this.field682 - this.field678 - this.field680;
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method197(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field676.length; var4++) {
			int var5 = this.field676[var4] >> 16 & 0xFF;
			int var6 = var5 + arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field676[var4] >> 8 & 0xFF;
			int var8 = var7 + arg2;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.field676[var4] & 0xFF;
			int var10 = var9 + arg0;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.field676[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}

	@ObfuscatedName("jb.a(BII)V")
	public void method198(byte arg0, int arg1, int arg2) {
		int var4 = arg1 + this.field679;
		int var5 = arg2 + this.field680;
		int var6 = var4 + var5 * Pix2D.field616;
		int var7 = 0;
		int var8 = this.field678;
		int var9 = this.field677;
		int var10 = Pix2D.field616 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field618) {
			int var12 = Pix2D.field618 - var5;
			var8 -= var12;
			var5 = Pix2D.field618;
			var7 = var12 * var9;
			var6 += var12 * Pix2D.field616;
		}
		if (var5 + var8 > Pix2D.field619) {
			var8 -= var5 + var8 - Pix2D.field619;
		}
		if (var4 < Pix2D.field620) {
			int var13 = Pix2D.field620 - var4;
			var9 -= var13;
			var4 = Pix2D.field620;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field621) {
			int var14 = var4 + var9 - Pix2D.field621;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method199(var11, var10, var7, var8, var9, Pix2D.field615, this.field675, var6, this.field676);
			if (arg0 != 7) {
				this.field668 = -485;
			}
		}
	}

	@ObfuscatedName("jb.a(IBIIII[I[BI[I)V")
	public void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, int arg7, int[] arg8) {
		int var10 = -(arg4 >> 2);
		int var11 = -(arg4 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				byte var14 = arg6[arg2++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg8[var14 & 0xFF];
				}
				byte var15 = arg6[arg2++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg8[var15 & 0xFF];
				}
				byte var16 = arg6[arg2++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg8[var16 & 0xFF];
				}
				byte var17 = arg6[arg2++];
				if (var17 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg8[var17 & 0xFF];
				}
			}
			for (int var18 = var11; var18 < 0; var18++) {
				byte var19 = arg6[arg2++];
				if (var19 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg8[var19 & 0xFF];
				}
			}
			arg7 += arg1;
			arg2 += arg0;
		}
	}
}
