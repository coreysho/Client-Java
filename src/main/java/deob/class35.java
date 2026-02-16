package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class class35 extends class33 {

	@ObfuscatedName("ib.w")
	public int field651 = -407;

	@ObfuscatedName("ib.x")
	public final boolean field652 = true;

	@ObfuscatedName("ib.y")
	public final byte field653 = -65;

	@ObfuscatedName("ib.z")
	public final int field654 = 35961;

	@ObfuscatedName("ib.A")
	public final int field655 = -676;

	@ObfuscatedName("ib.C")
	public final byte field657 = 3;

	@ObfuscatedName("ib.D")
	public final int field658 = -582;

	@ObfuscatedName("ib.E")
	public final boolean field659 = false;

	@ObfuscatedName("ib.F")
	public boolean field660 = false;

	@ObfuscatedName("ib.G")
	public int[] field661;

	@ObfuscatedName("ib.L")
	public int field666;

	@ObfuscatedName("ib.H")
	public int field662;

	@ObfuscatedName("ib.M")
	public int field667;

	@ObfuscatedName("ib.I")
	public int field663;

	@ObfuscatedName("ib.K")
	public int field665;

	@ObfuscatedName("ib.J")
	public int field664;

	@ObfuscatedName("ib.B")
	public int field656;

	public class35(int arg0, int arg1) {
		this.field661 = new int[arg0 * arg1];
		this.field662 = this.field666 = arg0;
		this.field663 = this.field667 = arg1;
		this.field664 = this.field665 = 0;
	}

	public class35(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.field662 = var3.getWidth(arg1);
			this.field663 = var3.getHeight(arg1);
			this.field666 = this.field662;
			this.field667 = this.field663;
			this.field664 = 0;
			this.field665 = 0;
			this.field661 = new int[this.field662 * this.field663];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field662, this.field663, this.field661, 0, this.field662);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class35(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method294(arg1 + ".dat", null), (byte) 1);
		class38 var5 = new class38(arg0.method294("index.dat", null), (byte) 1);
		var5.field709 = var4.method226();
		this.field666 = var5.method226();
		this.field667 = var5.method226();
		int var6 = var5.method224();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method228();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field709 += 2;
			var4.field709 += var5.method226() * var5.method226();
			var5.field709++;
		}
		this.field664 = var5.method224();
		this.field665 = var5.method224();
		this.field662 = var5.method226();
		this.field663 = var5.method226();
		int var10 = var5.method224();
		int var11 = this.field662 * this.field663;
		this.field661 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.field661[var12] = var7[var4.method224()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.field662; var13++) {
				for (int var14 = 0; var14 < this.field663; var14++) {
					this.field661[var13 + var14 * this.field662] = var7[var4.method224()];
				}
			}
		}
	}

	@ObfuscatedName("ib.b(Z)V")
	public void method180(boolean arg0) {
		if (!arg0) {
			this.field651 = 192;
		}
		class33.method151(this.field662, this.field663, this.field661);
	}

	@ObfuscatedName("ib.a(IIII)V")
	public void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field661.length; var4++) {
			int var5 = this.field661[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				int var7 = var6 + arg1;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = var5 >> 8 & 0xFF;
				int var9 = var8 + arg2;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}
				int var10 = var5 & 0xFF;
				int var11 = var10 + arg0;
				if (var11 < 1) {
					var11 = 1;
				} else if (var11 > 255) {
					var11 = 255;
				}
				this.field661[var4] = (var7 << 16) + (var9 << 8) + var11;
			}
		}
	}

	@ObfuscatedName("ib.a(B)V")
	public void method182() {
		int[] var1 = new int[this.field666 * this.field667];
		for (int var2 = 0; var2 < this.field663; var2++) {
			for (int var3 = 0; var3 < this.field662; var3++) {
				var1[(var2 + this.field665) * this.field666 + var3 + this.field664] = this.field661[var2 * this.field662 + var3];
			}
		}
		this.field661 = var1;
		this.field662 = this.field666;
		this.field663 = this.field667;
		this.field664 = 0;
		this.field665 = 0;
	}

	@ObfuscatedName("ib.a(IZI)V")
	public void method183(int arg0, int arg1) {
		int var3 = arg1 + this.field664;
		int var4 = arg0 + this.field665;
		int var5 = var3 + var4 * class33.field616;
		int var6 = 0;
		int var7 = this.field663;
		int var8 = this.field662;
		int var9 = class33.field616 - var8;
		int var10 = 0;
		if (var4 < class33.field618) {
			int var11 = class33.field618 - var4;
			var7 -= var11;
			var4 = class33.field618;
			var6 = var11 * var8;
			var5 += var11 * class33.field616;
		}
		if (var4 + var7 > class33.field619) {
			var7 -= var4 + var7 - class33.field619;
		}
		if (var3 < class33.field620) {
			int var12 = class33.field620 - var3;
			var8 -= var12;
			var3 = class33.field620;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class33.field621) {
			int var13 = var3 + var8 - class33.field621;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			this.method184(var10, var6, this.field661, this.field652, var7, var8, var9, var5, class33.field615);
		}
	}

	@ObfuscatedName("ib.a(II[IZIIII[I)V")
	public void method184(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg5 >> 2);
		if (!arg3) {
			this.field651 = 362;
		}
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg8[arg7++] = arg2[arg1++];
				arg8[arg7++] = arg2[arg1++];
				arg8[arg7++] = arg2[arg1++];
				arg8[arg7++] = arg2[arg1++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg8[arg7++] = arg2[arg1++];
			}
			arg7 += arg6;
			arg1 += arg0;
		}
	}

	@ObfuscatedName("ib.a(BII)V")
	public void method185(byte arg0, int arg1, int arg2) {
		int var4 = arg1 + this.field664;
		int var5 = arg2 + this.field665;
		int var6 = var4 + var5 * class33.field616;
		int var7 = 0;
		if (arg0 != 7) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		int var9 = this.field663;
		int var10 = this.field662;
		int var11 = class33.field616 - var10;
		int var12 = 0;
		if (var5 < class33.field618) {
			int var13 = class33.field618 - var5;
			var9 -= var13;
			var5 = class33.field618;
			var7 = var13 * var10;
			var6 += var13 * class33.field616;
		}
		if (var5 + var9 > class33.field619) {
			var9 -= var5 + var9 - class33.field619;
		}
		if (var4 < class33.field620) {
			int var14 = class33.field620 - var4;
			var10 -= var14;
			var4 = class33.field620;
			var7 += var14;
			var6 += var14;
			var12 = var14;
			var11 += var14;
		}
		if (var4 + var10 > class33.field621) {
			int var15 = var4 + var10 - class33.field621;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method186(class33.field615, this.field661, var7, var6, var10, var9, var11, var12);
		}
	}

	@ObfuscatedName("ib.a([I[IIIIIIII)V")
	public void method186(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				int var13 = arg1[arg2++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var13;
				}
				int var14 = arg1[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var14;
				}
				int var15 = arg1[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var15;
				}
				int var16 = arg1[arg2++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var16;
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				int var18 = arg1[arg2++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var18;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("ib.b(IIII)V")
	public void method187(int arg0, int arg1) {
		int var3 = arg1 + this.field664;
		int var4 = arg0 + this.field665;
		int var5 = var3 + var4 * class33.field616;
		int var6 = 0;
		int var7 = this.field663;
		int var8 = this.field662;
		int var9 = class33.field616 - var8;
		int var10 = 0;
		if (var4 < class33.field618) {
			int var11 = class33.field618 - var4;
			var7 -= var11;
			var4 = class33.field618;
			var6 = var11 * var8;
			var5 += var11 * class33.field616;
		}
		if (var4 + var7 > class33.field619) {
			var7 -= var4 + var7 - class33.field619;
		}
		if (var3 < class33.field620) {
			int var12 = class33.field620 - var3;
			var8 -= var12;
			var3 = class33.field620;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class33.field621) {
			int var13 = var3 + var8 - class33.field621;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			this.method188(var9, var10, var8, class33.field615, var5, this.field656, var6, var7, this.field661);
		}
	}

	@ObfuscatedName("ib.a(IIII[IIIIII[I)V")
	public void method188(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		if (arg5 != 0) {
			this.field660 = !this.field660;
		}
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = -arg2; var11 < 0; var11++) {
				int var12 = arg8[arg6++];
				if (var12 == 0) {
					arg4++;
				} else {
					int var13 = arg3[arg4];
					arg3[arg4++] = ((var12 & 0xFF00FF) * 128 + (var13 & 0xFF00FF) * 128 & 0xFF00FF00) + ((var12 & 0xFF00) * 128 + (var13 & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg0;
			arg6 += arg1;
		}
	}

	@ObfuscatedName("ib.a(IIIII[II[IIII)V")
	public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
			int var15 = var13 * arg0 >> 8;
			int var16 = var14 * arg0 >> 8;
			int var17 = (arg1 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg6 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg4 + arg9 * class33.field616;
			for (int var20 = 0; var20 < arg3; var20++) {
				int var21 = arg7[var20];
				int var22 = var19 + var21;
				int var23 = var17 + var16 * var21;
				int var24 = var18 - var15 * var21;
				for (int var25 = -arg5[var20]; var25 < 0; var25++) {
					class33.field615[var22++] = this.field661[(var23 >> 16) + (var24 >> 16) * this.field662];
					var23 += var16;
					var24 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += class33.field616;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("ib.a(IIIIDIBII)V")
	public void method190(int arg0, int arg1, double arg2) {
		try {
			int var5 = (int) (Math.sin(arg2) * 65536.0D);
			int var6 = (int) (Math.cos(arg2) * 65536.0D);
			int var7 = var5 * 256 >> 8;
			int var8 = var6 * 256 >> 8;
			int var9 = var7 * -10 + var8 * -10 + 983040;
			int var10 = var8 * -10 + 983040 - var7 * -10;
			int var11 = arg0 + arg1 * class33.field616;
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = var11;
				int var14 = var9;
				int var15 = var10;
				for (int var16 = -20; var16 < 0; var16++) {
					int var17 = this.field661[(var14 >> 16) + (var15 >> 16) * this.field662];
					if (var17 == 0) {
						var13++;
					} else {
						class33.field615[var13++] = var17;
					}
					var14 += var8;
					var15 -= var7;
				}
				var9 += var7;
				var10 += var8;
				var11 += class33.field616;
			}
		} catch (Exception var18) {
		}
	}

	@ObfuscatedName("ib.a(IILjb;I)V")
	public void method191(int arg0, class36 arg1, int arg2) {
		int var4 = arg0 + this.field664;
		int var5 = arg2 + this.field665;
		int var6 = var4 + var5 * class33.field616;
		int var7 = 0;
		int var8 = this.field663;
		int var9 = this.field662;
		int var10 = class33.field616 - var9;
		int var11 = 0;
		if (var5 < class33.field618) {
			int var12 = class33.field618 - var5;
			var8 -= var12;
			var5 = class33.field618;
			var7 = var12 * var9;
			var6 += var12 * class33.field616;
		}
		if (var5 + var8 > class33.field619) {
			var8 -= var5 + var8 - class33.field619;
		}
		if (var4 < class33.field620) {
			int var13 = class33.field620 - var4;
			var9 -= var13;
			var4 = class33.field620;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > class33.field621) {
			int var14 = var4 + var9 - class33.field621;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method192(class33.field615, var6, var7, var8, var11, var9, arg1.field675, var10, this.field661);
		}
	}

	@ObfuscatedName("ib.a([IIIIIIII[BI[I)V")
	public void method192(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int[] arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var14 = arg8[arg2++];
				if (var14 != 0 && arg6[arg1] == 0) {
					arg0[arg1++] = var14;
				} else {
					arg1++;
				}
				int var15 = arg8[arg2++];
				if (var15 != 0 && arg6[arg1] == 0) {
					arg0[arg1++] = var15;
				} else {
					arg1++;
				}
				int var16 = arg8[arg2++];
				if (var16 != 0 && arg6[arg1] == 0) {
					arg0[arg1++] = var16;
				} else {
					arg1++;
				}
				int var17 = arg8[arg2++];
				if (var17 != 0 && arg6[arg1] == 0) {
					arg0[arg1++] = var17;
				} else {
					arg1++;
				}
			}
			for (int var18 = var11; var18 < 0; var18++) {
				int var19 = arg8[arg2++];
				if (var19 != 0 && arg6[arg1] == 0) {
					arg0[arg1++] = var19;
				} else {
					arg1++;
				}
			}
			arg1 += arg7;
			arg2 += arg4;
		}
	}
}
