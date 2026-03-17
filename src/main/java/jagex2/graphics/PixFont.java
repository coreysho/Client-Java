package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

import java.util.Random;

@ObfuscatedName("kb")
public final class PixFont extends Pix2D {

	@ObfuscatedName("kb.w")
	public int field683;

	@ObfuscatedName("kb.x")
	public final int field684 = 436;

	@ObfuscatedName("kb.y")
	public final int field685 = 436;

	@ObfuscatedName("kb.z")
	public final boolean field686 = false;

	@ObfuscatedName("kb.B")
	public final byte[][] charMask = new byte[256][];

	@ObfuscatedName("kb.C")
	public final int[] charMaskWidth = new int[256];

	@ObfuscatedName("kb.D")
	public final int[] charMaskHeight = new int[256];

	@ObfuscatedName("kb.E")
	public final int[] charOffsetX = new int[256];

	@ObfuscatedName("kb.F")
	public final int[] charOffsetY = new int[256];

	@ObfuscatedName("kb.G")
	public final int[] charAdvance = new int[256];

	@ObfuscatedName("kb.I")
	public final Random rand = new Random();

	@ObfuscatedName("kb.J")
	public boolean strikeout = false;

	@ObfuscatedName("kb.H")
	public int height;

	@ObfuscatedName("kb.A")
	public int field687;

	public PixFont(JagFile arg0, boolean arg1, String arg2, byte arg3) {
		Packet var5 = new Packet(arg0.read(arg2 + ".dat", null), (byte) 1);
		Packet var6 = new Packet(arg0.read("index.dat", null), (byte) 1);
		var6.data = var5.g2() + 4;
		int var7 = var6.g1();
		if (var7 > 0) {
			var6.data += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			this.charOffsetX[var8] = var6.g1();
			this.charOffsetY[var8] = var6.g1();
			int var9 = this.charMaskWidth[var8] = var6.g2();
			int var10 = this.charMaskHeight[var8] = var6.g2();
			int var11 = var6.g1();
			int var12 = var9 * var10;
			this.charMask[var8] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					this.charMask[var8][var13] = var5.g1b();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						this.charMask[var8][var14 + var15 * var9] = var5.g1b();
					}
				}
			}
			if (var10 > this.height && var8 < 128) {
				this.height = var10;
			}
			this.charOffsetX[var8] = 1;
			this.charAdvance[var8] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += this.charMask[var8][var17 * var9];
			}
			int var10002;
			if (var16 <= var10 / 7) {
				var10002 = this.charAdvance[var8]--;
				this.charOffsetX[var8] = 0;
			}
			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += this.charMask[var8][var9 + var19 * var9 - 1];
			}
			if (var18 <= var10 / 7) {
				var10002 = this.charAdvance[var8]--;
			}
		}
		if (arg1) {
			this.charAdvance[32] = this.charAdvance[73];
		} else {
			this.charAdvance[32] = this.charAdvance[105];
		}
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;Z)V")
	public void centreString(int arg0, int arg1, int arg2, String arg3) {
		this.drawString(arg0 - this.stringWid(arg3) / 2, arg3, arg2, arg1);
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;IZ)V")
	public void centreStringTag(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		this.drawStringTag(arg2, this.field684, arg4, arg1, arg0 - this.stringWid(arg2) / 2, arg3);
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;)I")
	public int stringWid(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += this.charAdvance[arg0.charAt(var3)];
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;IIZ)V")
	public void drawString(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 == null) {
			return;
		}
		int var5 = arg3 - this.height;
		for (int var6 = 0; var6 < arg1.length(); var6++) {
			char var7 = arg1.charAt(var6);
			if (var7 != ' ') {
				this.plotLetter(this.charMask[var7], arg0 + this.charOffsetX[var7], var5 + this.charOffsetY[var7], this.charMaskWidth[var7], this.charMaskHeight[var7], arg2);
			}
			arg0 += this.charAdvance[var7];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIII)V")
	public void centreStringWave(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		int var6 = arg2 - this.stringWid(arg0) / 2;
		int var7 = arg1 - this.height;
		for (int var8 = 0; var8 < arg0.length(); var8++) {
			char var9 = arg0.charAt(var8);
			if (var9 != ' ') {
				this.plotLetter(this.charMask[var9], var6 + this.charOffsetX[var9], var7 + this.charOffsetY[var9] + (int) (Math.sin((double) var8 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.charMaskWidth[var9], this.charMaskHeight[var9], arg3);
			}
			var6 += this.charAdvance[var9];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IZIII)V")
	public void drawStringTag(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		this.strikeout = false;
		int var7 = arg4;
		if (arg0 == null) {
			return;
		}
		int var8 = arg3 - this.height;
		for (int var9 = 0; var9 < arg0.length(); var9++) {
			if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
				int var10 = this.updateState(arg0.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg5 = var10;
				}
				var9 += 4;
			} else {
				char var11 = arg0.charAt(var9);
				if (var11 != ' ') {
					if (arg2) {
						this.plotLetter(this.charMask[var11], arg4 + this.charOffsetX[var11] + 1, var8 + this.charOffsetY[var11] + 1, this.charMaskWidth[var11], this.charMaskHeight[var11], 0);
					}
					this.plotLetter(this.charMask[var11], arg4 + this.charOffsetX[var11], var8 + this.charOffsetY[var11], this.charMaskWidth[var11], this.charMaskHeight[var11], arg5);
				}
				arg4 += this.charAdvance[var11];
			}
		}
		if (arg1 > 0 && this.strikeout) {
			Pix2D.hline(arg4 - var7, 8388608, var7, var8 + (int) ((double) this.height * 0.7D));
		}
	}

	@ObfuscatedName("kb.a(IILjava/lang/String;IIIZ)V")
	public void drawStringAntiMacro(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 == null) {
			return;
		}
		this.rand.setSeed((long) arg4);
		int var6 = (this.rand.nextInt() & 0x1F) + 192;
		int var7 = 15 - this.height;
		for (int var8 = 0; var8 < arg2.length(); var8++) {
			if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
				int var9 = this.updateState(arg2.substring(var8 + 1, var8 + 4));
				if (var9 != -1) {
					arg3 = var9;
				}
				var8 += 4;
			} else {
				char var10 = arg2.charAt(var8);
				if (var10 != ' ') {
					this.plotLetterTrans(var7 + this.charOffsetY[var10] + 1, this.charMask[var10], arg1 + this.charOffsetX[var10] + 1, 0, this.charMaskHeight[var10], 192, this.charMaskWidth[var10]);
					this.plotLetterTrans(var7 + this.charOffsetY[var10], this.charMask[var10], arg1 + this.charOffsetX[var10], arg3, this.charMaskHeight[var10], var6, this.charMaskWidth[var10]);
				}
				arg1 += this.charAdvance[var10];
				if ((this.rand.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
		if (arg0 == 12122) {
			;
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;I)I")
	public int updateState(String arg0) {
		if (arg0.equals("red")) {
			return 16711680;
		} else if (arg0.equals("gre")) {
			return 65280;
		} else if (arg0.equals("blu")) {
			return 255;
		} else if (arg0.equals("yel")) {
			return 16776960;
		} else if (arg0.equals("cya")) {
			return 65535;
		} else if (arg0.equals("mag")) {
			return 16711935;
		} else if (arg0.equals("whi")) {
			return 16777215;
		} else if (arg0.equals("bla")) {
			return 0;
		} else if (arg0.equals("lre")) {
			return 16748608;
		} else if (arg0.equals("dre")) {
			return 8388608;
		} else if (arg0.equals("dbl")) {
			return 128;
		} else if (arg0.equals("or1")) {
			return 16756736;
		} else if (arg0.equals("or2")) {
			return 16740352;
		} else if (arg0.equals("or3")) {
			return 16723968;
		} else if (arg0.equals("gr1")) {
			return 12648192;
		} else if (arg0.equals("gr2")) {
			return 8453888;
		} else if (arg0.equals("gr3")) {
			return 4259584;
		} else {
			if (arg0.equals("str")) {
				this.strikeout = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void plotLetter(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * Pix2D.width;
		int var8 = Pix2D.width - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			arg4 -= var11;
			arg2 = Pix2D.clipMinY;
			var10 = var11 * arg3;
			var7 += var11 * Pix2D.width;
		}
		if (arg2 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 + 1 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - arg1;
			arg3 -= var12;
			arg1 = Pix2D.clipMinX;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 + 1 - Pix2D.clipMaxX;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.plot(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void plot(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("kb.a(I[BIIIZII)V")
	public void plotLetterTrans(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg0 * Pix2D.width;
		int var9 = Pix2D.width - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg0;
			arg4 -= var12;
			arg0 = Pix2D.clipMinY;
			var11 = var12 * arg6;
			var8 += var12 * Pix2D.width;
		}
		if (arg0 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg0 + arg4 + 1 - Pix2D.clipMaxY;
		}
		if (arg2 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg2;
			arg6 -= var13;
			arg2 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg2 + arg6 >= Pix2D.clipMaxX) {
			int var14 = arg2 + arg6 + 1 - Pix2D.clipMaxX;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg6 > 0 && arg4 > 0) {
			this.plotTrans(arg4, arg1, arg3, arg6, var10, arg5, var8, Pix2D.pixels, var11, var9);
		}
	}

	@ObfuscatedName("kb.a(I[BIIIII[IIII)V")
	public void plotTrans(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		int var12 = 256 - arg5;
		for (int var13 = -arg0; var13 < 0; var13++) {
			for (int var14 = -arg3; var14 < 0; var14++) {
				if (arg1[arg8++] == 0) {
					arg6++;
				} else {
					int var15 = arg7[arg6];
					arg7[arg6++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
				}
			}
			arg6 += arg9;
			arg8 += arg4;
		}
	}
}
