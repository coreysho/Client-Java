package deob;

import java.util.Random;

@ObfuscatedName("kb")
public final class class37 extends class33 {

	@ObfuscatedName("kb.w")
	public int field683;

	@ObfuscatedName("kb.x")
	public final int field684 = 436;

	@ObfuscatedName("kb.y")
	public final int field685 = 436;

	@ObfuscatedName("kb.z")
	public final boolean field686 = false;

	@ObfuscatedName("kb.B")
	public final byte[][] field688 = new byte[256][];

	@ObfuscatedName("kb.C")
	public final int[] field689 = new int[256];

	@ObfuscatedName("kb.D")
	public final int[] field690 = new int[256];

	@ObfuscatedName("kb.E")
	public final int[] field691 = new int[256];

	@ObfuscatedName("kb.F")
	public final int[] field692 = new int[256];

	@ObfuscatedName("kb.G")
	public final int[] field693 = new int[256];

	@ObfuscatedName("kb.I")
	public final Random field695 = new Random();

	@ObfuscatedName("kb.J")
	public boolean field696 = false;

	@ObfuscatedName("kb.H")
	public int field694;

	@ObfuscatedName("kb.A")
	public int field687;

	public class37(class50 arg0, boolean arg1, String arg2, byte arg3) {
		class38 var5 = new class38(arg0.method294(arg2 + ".dat", null), (byte) 1);
		class38 var6 = new class38(arg0.method294("index.dat", null), (byte) 1);
		var6.field709 = var5.method226() + 4;
		int var7 = var6.method224();
		if (var7 > 0) {
			var6.field709 += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			this.field691[var8] = var6.method224();
			this.field692[var8] = var6.method224();
			int var9 = this.field689[var8] = var6.method226();
			int var10 = this.field690[var8] = var6.method226();
			int var11 = var6.method224();
			int var12 = var9 * var10;
			this.field688[var8] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					this.field688[var8][var13] = var5.method225();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						this.field688[var8][var14 + var15 * var9] = var5.method225();
					}
				}
			}
			if (var10 > this.field694 && var8 < 128) {
				this.field694 = var10;
			}
			this.field691[var8] = 1;
			this.field693[var8] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += this.field688[var8][var17 * var9];
			}
			int var10002;
			if (var16 <= var10 / 7) {
				var10002 = this.field693[var8]--;
				this.field691[var8] = 0;
			}
			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += this.field688[var8][var9 + var19 * var9 - 1];
			}
			if (var18 <= var10 / 7) {
				var10002 = this.field693[var8]--;
			}
		}
		if (arg1) {
			this.field693[32] = this.field693[73];
		} else {
			this.field693[32] = this.field693[105];
		}
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;Z)V")
	public void method200(int arg0, int arg1, int arg2, String arg3) {
		this.method203(arg0 - this.method202(arg3) / 2, arg3, arg2, arg1);
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;IZ)V")
	public void method201(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		this.method205(arg2, this.field684, arg4, arg1, arg0 - this.method202(arg2) / 2, arg3);
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;)I")
	public int method202(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += this.field693[arg0.charAt(var3)];
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;IIZ)V")
	public void method203(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 == null) {
			return;
		}
		int var5 = arg3 - this.field694;
		for (int var6 = 0; var6 < arg1.length(); var6++) {
			char var7 = arg1.charAt(var6);
			if (var7 != ' ') {
				this.method208(this.field688[var7], arg0 + this.field691[var7], var5 + this.field692[var7], this.field689[var7], this.field690[var7], arg2);
			}
			arg0 += this.field693[var7];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIII)V")
	public void method204(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		int var6 = arg2 - this.method202(arg0) / 2;
		int var7 = arg1 - this.field694;
		for (int var8 = 0; var8 < arg0.length(); var8++) {
			char var9 = arg0.charAt(var8);
			if (var9 != ' ') {
				this.method208(this.field688[var9], var6 + this.field691[var9], var7 + this.field692[var9] + (int) (Math.sin((double) var8 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.field689[var9], this.field690[var9], arg3);
			}
			var6 += this.field693[var9];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IZIII)V")
	public void method205(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		this.field696 = false;
		int var7 = arg4;
		if (arg0 == null) {
			return;
		}
		int var8 = arg3 - this.field694;
		for (int var9 = 0; var9 < arg0.length(); var9++) {
			if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
				int var10 = this.method207(arg0.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg5 = var10;
				}
				var9 += 4;
			} else {
				char var11 = arg0.charAt(var9);
				if (var11 != ' ') {
					if (arg2) {
						this.method208(this.field688[var11], arg4 + this.field691[var11] + 1, var8 + this.field692[var11] + 1, this.field689[var11], this.field690[var11], 0);
					}
					this.method208(this.field688[var11], arg4 + this.field691[var11], var8 + this.field692[var11], this.field689[var11], this.field690[var11], arg5);
				}
				arg4 += this.field693[var11];
			}
		}
		if (arg1 > 0 && this.field696) {
			class33.method159(arg4 - var7, 8388608, var7, var8 + (int) ((double) this.field694 * 0.7D));
		}
	}

	@ObfuscatedName("kb.a(IILjava/lang/String;IIIZ)V")
	public void method206(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 == null) {
			return;
		}
		this.field695.setSeed((long) arg4);
		int var6 = (this.field695.nextInt() & 0x1F) + 192;
		int var7 = 15 - this.field694;
		for (int var8 = 0; var8 < arg2.length(); var8++) {
			if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
				int var9 = this.method207(arg2.substring(var8 + 1, var8 + 4));
				if (var9 != -1) {
					arg3 = var9;
				}
				var8 += 4;
			} else {
				char var10 = arg2.charAt(var8);
				if (var10 != ' ') {
					this.method210(var7 + this.field692[var10] + 1, this.field688[var10], arg1 + this.field691[var10] + 1, 0, this.field690[var10], 192, this.field689[var10]);
					this.method210(var7 + this.field692[var10], this.field688[var10], arg1 + this.field691[var10], arg3, this.field690[var10], var6, this.field689[var10]);
				}
				arg1 += this.field693[var10];
				if ((this.field695.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
		if (arg0 == 12122) {
			;
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;I)I")
	public int method207(String arg0) {
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
				this.field696 = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void method208(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * class33.field616;
		int var8 = class33.field616 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class33.field618) {
			int var11 = class33.field618 - arg2;
			arg4 -= var11;
			arg2 = class33.field618;
			var10 = var11 * arg3;
			var7 += var11 * class33.field616;
		}
		if (arg2 + arg4 >= class33.field619) {
			arg4 -= arg2 + arg4 + 1 - class33.field619;
		}
		if (arg1 < class33.field620) {
			int var12 = class33.field620 - arg1;
			arg3 -= var12;
			arg1 = class33.field620;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= class33.field621) {
			int var13 = arg1 + arg3 + 1 - class33.field621;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method209(class33.field615, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void method209(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
	public void method210(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg0 * class33.field616;
		int var9 = class33.field616 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < class33.field618) {
			int var12 = class33.field618 - arg0;
			arg4 -= var12;
			arg0 = class33.field618;
			var11 = var12 * arg6;
			var8 += var12 * class33.field616;
		}
		if (arg0 + arg4 >= class33.field619) {
			arg4 -= arg0 + arg4 + 1 - class33.field619;
		}
		if (arg2 < class33.field620) {
			int var13 = class33.field620 - arg2;
			arg6 -= var13;
			arg2 = class33.field620;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg2 + arg6 >= class33.field621) {
			int var14 = arg2 + arg6 + 1 - class33.field621;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg6 > 0 && arg4 > 0) {
			this.method211(arg4, arg1, arg3, arg6, var10, arg5, var8, class33.field615, var11, var9);
		}
	}

	@ObfuscatedName("kb.a(I[BIIIII[IIII)V")
	public void method211(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
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
