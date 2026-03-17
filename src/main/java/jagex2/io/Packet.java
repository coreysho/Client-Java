package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable2;

import java.math.BigInteger;

@ObfuscatedName("lb")
public final class Packet extends Linkable2 {

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
	public byte[] pos;

	@ObfuscatedName("lb.u")
	public int data;

	@ObfuscatedName("lb.v")
	public int field710;

	@ObfuscatedName("lb.w")
	public static final int[] crctable = new int[256];

	@ObfuscatedName("lb.x")
	public static final int[] bitmask;

	@ObfuscatedName("lb.y")
	public Isaac random;

	@ObfuscatedName("lb.z")
	public static int cacheMinCount;

	@ObfuscatedName("lb.C")
	public static final LinkList cacheMin;

	@ObfuscatedName("lb.D")
	public static final LinkList cacheMid;

	@ObfuscatedName("lb.E")
	public static final LinkList cacheMax;

	@ObfuscatedName("lb.F")
	public final char[] field720 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.A")
	public static int cacheMidCount;

	@ObfuscatedName("lb.B")
	public static int cacheMaxCount;

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
			crctable[var0] = var1;
		}
		bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		cacheMin = new LinkList(-822);
		cacheMid = new LinkList(-822);
		cacheMax = new LinkList(-822);
	}

	@ObfuscatedName("lb.a(II)Llb;")
	public static Packet alloc(int arg0, int arg1) {
		LinkList var2 = cacheMid;
		synchronized (cacheMid) {
			Packet var3 = null;
			if (arg1 == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				var3 = (Packet) cacheMin.popFront();
			} else if (arg1 == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				var3 = (Packet) cacheMid.popFront();
			} else if (arg1 == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				var3 = (Packet) cacheMax.popFront();
			}
			if (var3 != null) {
				var3.data = 0;
				return var3;
			}
		}
		Packet var4 = new Packet((byte) 3);
		if (arg0 != -7939) {
			throw new NullPointerException();
		}
		var4.data = 0;
		if (arg1 == 0) {
			var4.pos = new byte[100];
		} else if (arg1 == 1) {
			var4.pos = new byte[5000];
		} else {
			var4.pos = new byte[30000];
		}
		return var4;
	}

	public Packet(byte arg0) {
		if (arg0 != 3) {
			throw new NullPointerException();
		}
	}

	public Packet(byte[] arg0, byte arg1) {
		this.pos = arg0;
		this.data = 0;
	}

	@ObfuscatedName("lb.a(BI)V")
	public void p1Enc(int arg0) {
		this.pos[this.data++] = (byte) (arg0 + this.random.takeNextValue());
	}

	@ObfuscatedName("lb.a(I)V")
	public void p1(int arg0) {
		this.pos[this.data++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void p2(int arg0) {
		this.pos[this.data++] = (byte) (arg0 >> 8);
		this.pos[this.data++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(ZI)V")
	public void ip2(int arg0) {
		this.pos[this.data++] = (byte) arg0;
		this.pos[this.data++] = 0;
	}

	@ObfuscatedName("lb.c(I)V")
	public void p3(int arg0) {
		this.pos[this.data++] = (byte) (arg0 >> 16);
		this.pos[this.data++] = (byte) (arg0 >> 8);
		this.pos[this.data++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void p4(int arg0) {
		this.pos[this.data++] = (byte) (arg0 >> 24);
		this.pos[this.data++] = (byte) (arg0 >> 16);
		this.pos[this.data++] = (byte) (arg0 >> 8);
		this.pos[this.data++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(ZI)V")
	public void ip4(int arg0) {
		this.pos[this.data++] = (byte) arg0;
		this.pos[this.data++] = (byte) (arg0 >> 8);
		this.pos[this.data++] = (byte) (arg0 >> 16);
		this.pos[this.data++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(JI)V")
	public void p8(long arg0) {
		this.pos[this.data++] = (byte) (arg0 >> 56);
		this.pos[this.data++] = (byte) (arg0 >> 48);
		this.pos[this.data++] = (byte) (arg0 >> 40);
		this.pos[this.data++] = (byte) (arg0 >> 32);
		this.pos[this.data++] = (byte) (arg0 >> 24);
		this.pos[this.data++] = (byte) (arg0 >> 16);
		this.pos[this.data++] = (byte) (arg0 >> 8);
		this.pos[this.data++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), this.pos, this.data);
		this.data += arg0.length();
		this.pos[this.data++] = 10;
	}

	@ObfuscatedName("lb.a([BZII)V")
	public void pdata(byte[] arg0, int arg1) {
		for (int var3 = 0; var3 < arg1; var3++) {
			this.pos[this.data++] = arg0[var3];
		}
	}

	@ObfuscatedName("lb.b(II)V")
	public void psize1(int arg0, int arg1) {
		if (arg1 == 0) {
			this.pos[this.data - arg0 - 1] = (byte) arg0;
		}
	}

	@ObfuscatedName("lb.c()I")
	public int g1() {
		return this.pos[this.data++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte g1b() {
		return this.pos[this.data++];
	}

	@ObfuscatedName("lb.e()I")
	public int g2() {
		this.data += 2;
		return ((this.pos[this.data - 2] & 0xFF) << 8) + (this.pos[this.data - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int g2b() {
		this.data += 2;
		int var1 = ((this.pos[this.data - 2] & 0xFF) << 8) + (this.pos[this.data - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int g3() {
		this.data += 3;
		return ((this.pos[this.data - 3] & 0xFF) << 16) + ((this.pos[this.data - 2] & 0xFF) << 8) + (this.pos[this.data - 1] & 0xFF);
	}

	@ObfuscatedName("lb.h()I")
	public int g4() {
		this.data += 4;
		return ((this.pos[this.data - 4] & 0xFF) << 24) + ((this.pos[this.data - 3] & 0xFF) << 16) + ((this.pos[this.data - 2] & 0xFF) << 8) + (this.pos[this.data - 1] & 0xFF);
	}

	@ObfuscatedName("lb.e(I)J")
	public long g8() {
		long var1 = (long) this.g4() & 0xFFFFFFFFL;
		long var3 = (long) this.g4() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String gjstr() {
		int var1 = this.data;
		while (this.pos[this.data++] != 10) {
		}
		return new String(this.pos, var1, this.data - var1 - 1);
	}

	@ObfuscatedName("lb.f(I)[B")
	public byte[] gjstrraw(int arg0) {
		int var2 = this.data;
		while (this.pos[this.data++] != 10) {
		}
		byte[] var3 = new byte[this.data - var2 - 1];
		if (arg0 != -32952) {
			this.field698 = 127;
		}
		for (int var4 = var2; var4 < this.data - 1; var4++) {
			var3[var4 - var2] = this.pos[var4];
		}
		return var3;
	}

	@ObfuscatedName("lb.a(I[BII)V")
	public void gdata(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.pos[this.data++];
		}
	}

	@ObfuscatedName("lb.a(B)V")
	public void gBitStart() {
		this.field710 = this.data * 8;
	}

	@ObfuscatedName("lb.a(IB)I")
	public int gBit(int arg0) {
		int var2 = this.field710 >> 3;
		int var3 = 8 - (this.field710 & 0x7);
		int var4 = 0;
		this.field710 += arg0;
		while (arg0 > var3) {
			var4 += (this.pos[var2++] & bitmask[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (this.pos[var2] & bitmask[var3]);
		} else {
			var5 = var4 + (this.pos[var2] >> var3 - arg0 & bitmask[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("lb.g(I)V")
	public void gBitEnd() {
		this.data = (this.field710 + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int gsmarts() {
		int var1 = this.pos[this.data] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int gsmart() {
		int var1 = this.pos[this.data] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("lb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = this.data;
		this.data = 0;
		byte[] var4 = new byte[var3];
		this.gdata(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		this.data = 0;
		this.p1(var7.length);
		this.pdata(var7, var7.length);
	}
}
