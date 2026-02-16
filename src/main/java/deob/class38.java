package deob;

import java.math.BigInteger;

@ObfuscatedName("lb")
public final class class38 extends class23 {

	@ObfuscatedName("lb.i")
	public final boolean field697 = true;

	@ObfuscatedName("lb.j")
	public int field698 = 9;

	@ObfuscatedName("lb.k")
	public final int field699 = -442;

	@ObfuscatedName("lb.l")
	public final int field700 = -41441;

	@ObfuscatedName("lb.m")
	public final boolean field701 = true;

	@ObfuscatedName("lb.n")
	public final int field702 = 368;

	@ObfuscatedName("lb.o")
	public final boolean field703 = true;

	@ObfuscatedName("lb.p")
	public final boolean field704 = true;

	@ObfuscatedName("lb.q")
	public final boolean field705 = false;

	@ObfuscatedName("lb.r")
	public final boolean field706 = false;

	@ObfuscatedName("lb.s")
	public final int field707 = -186;

	@ObfuscatedName("lb.t")
	public byte[] field708;

	@ObfuscatedName("lb.u")
	public int field709;

	@ObfuscatedName("lb.v")
	public int field710;

	@ObfuscatedName("lb.w")
	public static final int[] field711 = new int[256];

	@ObfuscatedName("lb.x")
	public static final int[] field712;

	@ObfuscatedName("lb.y")
	public class49 field713;

	@ObfuscatedName("lb.z")
	public static int field714;

	@ObfuscatedName("lb.C")
	public static final class41 field717;

	@ObfuscatedName("lb.D")
	public static final class41 field718;

	@ObfuscatedName("lb.E")
	public static final class41 field719;

	@ObfuscatedName("lb.F")
	public final char[] field720 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.A")
	public static int field715;

	@ObfuscatedName("lb.B")
	public static int field716;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field711[var0] = var1;
		}
		field712 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		field717 = new class41(-822);
		field718 = new class41(-822);
		field719 = new class41(-822);
	}

	@ObfuscatedName("lb.a(II)Llb;")
	public static class38 method212(int arg0, int arg1) {
		class41 var2 = field718;
		synchronized (field718) {
			class38 var3 = null;
			if (arg1 == 0 && field714 > 0) {
				field714--;
				var3 = (class38) field717.method242();
			} else if (arg1 == 1 && field715 > 0) {
				field715--;
				var3 = (class38) field718.method242();
			} else if (arg1 == 2 && field716 > 0) {
				field716--;
				var3 = (class38) field719.method242();
			}
			if (var3 != null) {
				var3.field709 = 0;
				return var3;
			}
		}
		class38 var4 = new class38((byte) 3);
		if (arg0 != -7939) {
			throw new NullPointerException();
		}
		var4.field709 = 0;
		if (arg1 == 0) {
			var4.field708 = new byte[100];
		} else if (arg1 == 1) {
			var4.field708 = new byte[5000];
		} else {
			var4.field708 = new byte[30000];
		}
		return var4;
	}

	public class38(byte arg0) {
		if (arg0 != 3) {
			throw new NullPointerException();
		}
	}

	public class38(byte[] arg0, byte arg1) {
		this.field708 = arg0;
		this.field709 = 0;
	}

	@ObfuscatedName("lb.a(BI)V")
	public void method213(int arg0) {
		this.field708[this.field709++] = (byte) (arg0 + this.field713.method290());
	}

	@ObfuscatedName("lb.a(I)V")
	public void method214(int arg0) {
		this.field708[this.field709++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void method215(int arg0) {
		this.field708[this.field709++] = (byte) (arg0 >> 8);
		this.field708[this.field709++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(ZI)V")
	public void method216(int arg0) {
		this.field708[this.field709++] = (byte) arg0;
		this.field708[this.field709++] = 0;
	}

	@ObfuscatedName("lb.c(I)V")
	public void method217(int arg0) {
		this.field708[this.field709++] = (byte) (arg0 >> 16);
		this.field708[this.field709++] = (byte) (arg0 >> 8);
		this.field708[this.field709++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void method218(int arg0) {
		this.field708[this.field709++] = (byte) (arg0 >> 24);
		this.field708[this.field709++] = (byte) (arg0 >> 16);
		this.field708[this.field709++] = (byte) (arg0 >> 8);
		this.field708[this.field709++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(ZI)V")
	public void method219(int arg0) {
		this.field708[this.field709++] = (byte) arg0;
		this.field708[this.field709++] = (byte) (arg0 >> 8);
		this.field708[this.field709++] = (byte) (arg0 >> 16);
		this.field708[this.field709++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(JI)V")
	public void method220(long arg0) {
		this.field708[this.field709++] = (byte) (arg0 >> 56);
		this.field708[this.field709++] = (byte) (arg0 >> 48);
		this.field708[this.field709++] = (byte) (arg0 >> 40);
		this.field708[this.field709++] = (byte) (arg0 >> 32);
		this.field708[this.field709++] = (byte) (arg0 >> 24);
		this.field708[this.field709++] = (byte) (arg0 >> 16);
		this.field708[this.field709++] = (byte) (arg0 >> 8);
		this.field708[this.field709++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void method221(String arg0) {
		arg0.getBytes(0, arg0.length(), this.field708, this.field709);
		this.field709 += arg0.length();
		this.field708[this.field709++] = 10;
	}

	@ObfuscatedName("lb.a([BZII)V")
	public void method222(byte[] arg0, int arg1) {
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field708[this.field709++] = arg0[var3];
		}
	}

	@ObfuscatedName("lb.b(II)V")
	public void method223(int arg0, int arg1) {
		if (arg1 == 0) {
			this.field708[this.field709 - arg0 - 1] = (byte) arg0;
		}
	}

	@ObfuscatedName("lb.c()I")
	public int method224() {
		return this.field708[this.field709++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte method225() {
		return this.field708[this.field709++];
	}

	@ObfuscatedName("lb.e()I")
	public int method226() {
		this.field709 += 2;
		return ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int method227() {
		this.field709 += 2;
		int var1 = ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int method228() {
		this.field709 += 3;
		return ((this.field708[this.field709 - 3] & 0xFF) << 16) + ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.h()I")
	public int method229() {
		this.field709 += 4;
		return ((this.field708[this.field709 - 4] & 0xFF) << 24) + ((this.field708[this.field709 - 3] & 0xFF) << 16) + ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.e(I)J")
	public long method230() {
		long var1 = (long) this.method229() & 0xFFFFFFFFL;
		long var3 = (long) this.method229() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String method231() {
		int var1 = this.field709;
		while (this.field708[this.field709++] != 10) {
		}
		return new String(this.field708, var1, this.field709 - var1 - 1);
	}

	@ObfuscatedName("lb.f(I)[B")
	public byte[] method232(int arg0) {
		int var2 = this.field709;
		while (this.field708[this.field709++] != 10) {
		}
		byte[] var3 = new byte[this.field709 - var2 - 1];
		if (arg0 != -32952) {
			this.field698 = 127;
		}
		for (int var4 = var2; var4 < this.field709 - 1; var4++) {
			var3[var4 - var2] = this.field708[var4];
		}
		return var3;
	}

	@ObfuscatedName("lb.a(I[BII)V")
	public void method233(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.field708[this.field709++];
		}
	}

	@ObfuscatedName("lb.a(B)V")
	public void method234() {
		this.field710 = this.field709 * 8;
	}

	@ObfuscatedName("lb.a(IB)I")
	public int method235(int arg0) {
		int var2 = this.field710 >> 3;
		int var3 = 8 - (this.field710 & 0x7);
		int var4 = 0;
		this.field710 += arg0;
		while (arg0 > var3) {
			var4 += (this.field708[var2++] & field712[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (this.field708[var2] & field712[var3]);
		} else {
			var5 = var4 + (this.field708[var2] >> var3 - arg0 & field712[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("lb.g(I)V")
	public void method236() {
		this.field709 = (this.field710 + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int method237() {
		int var1 = this.field708[this.field709] & 0xFF;
		return var1 < 128 ? this.method224() - 64 : this.method226() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int method238() {
		int var1 = this.field708[this.field709] & 0xFF;
		return var1 < 128 ? this.method224() : this.method226() - 32768;
	}

	@ObfuscatedName("lb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method239(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field709;
		this.field709 = 0;
		byte[] var4 = new byte[var3];
		this.method233(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		this.field709 = 0;
		this.method214(var7.length);
		this.method222(var7, var7.length);
	}
}
