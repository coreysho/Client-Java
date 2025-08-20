package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class Pix8 extends Pix2D {

	@ObfuscatedName("WRRBQEHV.J")
	public int field1554;

	@ObfuscatedName("WRRBQEHV.K")
	public int field1555;

	@ObfuscatedName("WRRBQEHV.E")
	public int[] field1549;

	@ObfuscatedName("WRRBQEHV.H")
	public int field1552;

	@ObfuscatedName("WRRBQEHV.I")
	public int field1553;

	@ObfuscatedName("WRRBQEHV.F")
	public int wi;

	@ObfuscatedName("WRRBQEHV.G")
	public int field1551;

	@ObfuscatedName("WRRBQEHV.D")
	public byte[] pixels;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.field1554 = var5.g2();
		this.field1555 = var5.g2();
		int var6 = var5.g1();
		this.field1549 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.field1549[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.field1552 = var5.g1();
		this.field1553 = var5.g1();
		this.wi = var5.g2();
		this.field1551 = var5.g2();
		int var9 = var5.g1();
		int var10 = this.field1551 * this.wi;
		this.pixels = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.pixels[var11] = var4.g1b();
			}
		} else {
			if (var9 == 1) {
				for (int var12 = 0; var12 < this.wi; var12++) {
					for (int var13 = 0; var13 < this.field1551; var13++) {
						this.pixels[this.wi * var13 + var12] = var4.g1b();
					}
				}
			}
		}
	}

	@ObfuscatedName("WRRBQEHV.b(I)V")
	public void method487() {
		this.field1554 /= 2;
		this.field1555 /= 2;
		byte[] var2 = new byte[this.field1555 * this.field1554];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field1551; var4++) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[(this.field1552 + var5 >> 1) + (this.field1553 + var4 >> 1) * this.field1554] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.wi = this.field1554;
		this.field1551 = this.field1555;
		this.field1552 = 0;
		this.field1553 = 0;
	}

	@ObfuscatedName("WRRBQEHV.a(Z)V")
	public void method488() {
		if (this.field1554 == this.wi && this.field1555 == this.field1551) {
			return;
		}
		byte[] var2 = new byte[this.field1555 * this.field1554];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field1551; var4++) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[(this.field1553 + var4) * this.field1554 + this.field1552 + var5] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.wi = this.field1554;
		this.field1551 = this.field1555;
		this.field1552 = 0;
		this.field1553 = 0;
	}

	@ObfuscatedName("WRRBQEHV.c(I)V")
	public void hflip() {
		byte[] var2 = new byte[this.field1551 * this.wi];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field1551; var4++) {
			for (int var5 = this.wi - 1; var5 >= 0; var5--) {
				var2[var3++] = this.pixels[this.wi * var4 + var5];
			}
		}
		this.pixels = var2;
		this.field1552 = this.field1554 - this.wi - this.field1552;
	}

	@ObfuscatedName("WRRBQEHV.b(B)V")
	public void vflip() {
		byte[] var2 = new byte[this.field1551 * this.wi];
		int var3 = 0;
		for (int var4 = this.field1551 - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[var3++] = this.pixels[this.wi * var4 + var5];
			}
		}
		this.pixels = var2;
		this.field1553 = this.field1555 - this.field1551 - this.field1553;
	}

	@ObfuscatedName("WRRBQEHV.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var5 = 0; var5 < this.field1549.length; var5++) {
			int var6 = this.field1549[var5] >> 16 & 0xFF;
			int var7 = arg2 + var6;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			int var8 = this.field1549[var5] >> 8 & 0xFF;
			int var9 = arg1 + var8;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}
			int var10 = this.field1549[var5] & 0xFF;
			int var11 = arg0 + var10;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			this.field1549[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
	}

	@ObfuscatedName("WRRBQEHV.a(III)V")
	public void plotSprite(int arg0, int arg1) {
		int var4 = this.field1552 + arg1;
		int var5 = this.field1553 + arg0;
		int var6 = Pix2D.field1095 * var5 + var4;
		int var7 = 0;
		int var8 = this.field1551;
		int var9 = this.wi;
		int var10 = Pix2D.field1095 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field1097) {
			int var12 = Pix2D.field1097 - var5;
			var8 -= var12;
			var5 = Pix2D.field1097;
			var7 += var9 * var12;
			var6 += Pix2D.field1095 * var12;
		}
		if (var5 + var8 > Pix2D.field1098) {
			var8 -= var5 + var8 - Pix2D.field1098;
		}
		if (var4 < Pix2D.field1099) {
			int var13 = Pix2D.field1099 - var4;
			var9 -= var13;
			var4 = Pix2D.field1099;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field1100) {
			int var14 = var4 + var9 - Pix2D.field1100;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method493(var7, Pix2D.field1094, this.pixels, var11, this.field1549, var8, var9, var6, var10);
		}
	}

	@ObfuscatedName("WRRBQEHV.a(I[I[BI[IIIIZI)V")
	public void method493(int arg0, int[] arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg9) {
		int var11 = -(arg6 >> 2);
		int var12 = -(arg6 & 0x3);
		for (int var13 = -arg5; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				byte var17 = arg2[arg0++];
				if (var17 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var17 & 0xFF];
				}
				byte var18 = arg2[arg0++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var18 & 0xFF];
				}
				byte var19 = arg2[arg0++];
				if (var19 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var19 & 0xFF];
				}
				byte var20 = arg2[arg0++];
				if (var20 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var20 & 0xFF];
				}
			}
			for (int var15 = var12; var15 < 0; var15++) {
				byte var16 = arg2[arg0++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var16 & 0xFF];
				}
			}
			arg7 += arg9;
			arg0 += arg3;
		}
	}
}
