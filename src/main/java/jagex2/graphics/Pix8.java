package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

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
	public int owi;

	@ObfuscatedName("jb.K")
	public int ohi;

	@ObfuscatedName("jb.E")
	public final int[] bpal;

	@ObfuscatedName("jb.H")
	public int xof;

	@ObfuscatedName("jb.I")
	public int yof;

	@ObfuscatedName("jb.F")
	public int wi;

	@ObfuscatedName("jb.G")
	public int hi;

	@ObfuscatedName("jb.D")
	public byte[] data;

	@ObfuscatedName("jb.C")
	public int field674;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), (byte) 1);
		Packet var5 = new Packet(arg0.read("index.dat", null), (byte) 1);
		var5.data = var4.g2();
		this.owi = var5.g2();
		this.ohi = var5.g2();
		int var6 = var5.g1();
		this.bpal = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.bpal[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.data += 2;
			var4.data += var5.g2() * var5.g2();
			var5.data++;
		}
		this.xof = var5.g1();
		this.yof = var5.g1();
		this.wi = var5.g2();
		this.hi = var5.g2();
		int var9 = var5.g1();
		int var10 = this.wi * this.hi;
		this.data = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.data[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.wi; var12++) {
				for (int var13 = 0; var13 < this.hi; var13++) {
					this.data[var12 + var13 * this.wi] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void halveSize() {
		this.owi /= 2;
		this.ohi /= 2;
		byte[] var1 = new byte[this.owi * this.ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[(var4 + this.xof >> 1) + (var3 + this.yof >> 1) * this.owi] = this.data[var2++];
			}
		}
		this.data = var1;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		if (this.field672 == 9) {
			this.yof = 0;
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void trim() {
		if (this.wi == this.owi && this.hi == this.ohi) {
			return;
		}
		byte[] var1 = new byte[this.owi * this.ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[var4 + this.xof + (var3 + this.yof) * this.owi] = this.data[var2++];
			}
		}
		this.data = var1;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("jb.c(I)V")
	public void hflip() {
		byte[] var1 = new byte[this.wi * this.hi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = this.wi - 1; var4 >= 0; var4--) {
				var1[var2++] = this.data[var4 + var3 * this.wi];
			}
		}
		this.data = var1;
		this.xof = this.owi - this.wi - this.xof;
	}

	@ObfuscatedName("jb.b(B)V")
	public void vflip() {
		byte[] var1 = new byte[this.wi * this.hi];
		int var2 = 0;
		for (int var3 = this.hi - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[var2++] = this.data[var4 + var3 * this.wi];
			}
		}
		this.data = var1;
		this.yof = this.ohi - this.hi - this.yof;
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.bpal.length; var4++) {
			int var5 = this.bpal[var4] >> 16 & 0xFF;
			int var6 = var5 + arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.bpal[var4] >> 8 & 0xFF;
			int var8 = var7 + arg2;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.bpal[var4] & 0xFF;
			int var10 = var9 + arg0;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.bpal[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}

	@ObfuscatedName("jb.a(BII)V")
	public void plotSprite(byte arg0, int arg1, int arg2) {
		int var4 = arg1 + this.xof;
		int var5 = arg2 + this.yof;
		int var6 = var4 + var5 * Pix2D.width;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (var5 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - var5;
			var8 -= var12;
			var5 = Pix2D.clipMinY;
			var7 = var12 * var9;
			var6 += var12 * Pix2D.width;
		}
		if (var5 + var8 > Pix2D.clipMaxY) {
			var8 -= var5 + var8 - Pix2D.clipMaxY;
		}
		if (var4 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - var4;
			var9 -= var13;
			var4 = Pix2D.clipMinX;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.clipMaxX) {
			int var14 = var4 + var9 - Pix2D.clipMaxX;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.plotSprite(var11, var10, var7, var8, var9, Pix2D.pixels, this.data, var6, this.bpal);
			if (arg0 != 7) {
				this.field668 = -485;
			}
		}
	}

	@ObfuscatedName("jb.a(IBIIII[I[BI[I)V")
	public void plotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, int arg7, int[] arg8) {
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
