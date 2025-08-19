package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;
import java.math.BigInteger;

public class Packet extends DoublyLinkable {

	@ObfuscatedName("MFMVIYHT.h")
	public boolean field1261 = false;

	@ObfuscatedName("MFMVIYHT.i")
	public int field1262 = 8;

	@ObfuscatedName("MFMVIYHT.j")
	public boolean field1263 = false;

	@ObfuscatedName("MFMVIYHT.k")
	public boolean field1264 = true;

	@ObfuscatedName("MFMVIYHT.l")
	public byte field1265 = 5;

	@ObfuscatedName("MFMVIYHT.m")
	public int field1266 = -29290;

	@ObfuscatedName("MFMVIYHT.n")
	public boolean field1267 = false;

	@ObfuscatedName("MFMVIYHT.o")
	public int field1268 = 217;

	@ObfuscatedName("MFMVIYHT.p")
	public int field1269 = 236;

	@ObfuscatedName("MFMVIYHT.q")
	public boolean field1270 = false;

	@ObfuscatedName("MFMVIYHT.t")
	public byte field1273 = 17;

	@ObfuscatedName("MFMVIYHT.u")
	public byte field1274 = 89;

	@ObfuscatedName("MFMVIYHT.v")
	public byte field1275 = -16;

	@ObfuscatedName("MFMVIYHT.w")
	public boolean field1276 = false;

	@ObfuscatedName("MFMVIYHT.y")
	public int field1278 = 1;

	@ObfuscatedName("MFMVIYHT.z")
	public byte[] data;

	@ObfuscatedName("MFMVIYHT.A")
	public int pos;

	@ObfuscatedName("MFMVIYHT.x")
	public static boolean field1277 = true;

	@ObfuscatedName("MFMVIYHT.C")
	public static int[] field1282 = new int[256];

	@ObfuscatedName("MFMVIYHT.D")
	public static final int[] field1283;

	@ObfuscatedName("MFMVIYHT.I")
	public static LinkList field1288;

	@ObfuscatedName("MFMVIYHT.J")
	public static LinkList field1289;

	@ObfuscatedName("MFMVIYHT.K")
	public static LinkList field1290;

	@ObfuscatedName("MFMVIYHT.L")
	public static char[] field1291;

	@ObfuscatedName("MFMVIYHT.r")
	public int field1271;

	@ObfuscatedName("MFMVIYHT.s")
	public int field1272;

	@ObfuscatedName("MFMVIYHT.B")
	public int field1281;

	@ObfuscatedName("MFMVIYHT.F")
	public static int field1285;

	@ObfuscatedName("MFMVIYHT.G")
	public static int field1286;

	@ObfuscatedName("MFMVIYHT.H")
	public static int field1287;

	@ObfuscatedName("MFMVIYHT.E")
	public Isaac field1284;

	@ObfuscatedName("MFMVIYHT.M")
	public static boolean field1292;

	@ObfuscatedName("MFMVIYHT.a(BI)LMFMVIYHT;")
	public static Packet alloc(byte arg0, int arg1) {
		LinkList var2 = field1289;
		synchronized (field1289) {
			Packet var3 = null;
			if (arg1 == 0 && field1285 > 0) {
				field1285--;
				var3 = (Packet) field1288.method5();
			} else if (arg1 == 1 && field1286 > 0) {
				field1286--;
				var3 = (Packet) field1289.method5();
			} else if (arg1 == 2 && field1287 > 0) {
				field1287--;
				var3 = (Packet) field1290.method5();
			}
			if (var3 != null) {
				var3.pos = 0;
				Packet var4 = var3;
				return var4;
			}
		}
		Packet var6 = new Packet(-211);
		if (arg0 != 0) {
			field1277 = !field1277;
		}
		var6.pos = 0;
		if (arg1 == 0) {
			var6.data = new byte[100];
		} else if (arg1 == 1) {
			var6.data = new byte[5000];
		} else {
			var6.data = new byte[30000];
		}
		return var6;
	}

	public Packet(int arg0) {
		if (arg0 >= 0) {
			throw new NullPointerException();
		}
	}

	public Packet(boolean arg0, byte[] arg1) {
		this.data = arg1;
		this.pos = 0;
		if (!arg0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("MFMVIYHT.b(BI)V")
	public void p1isaac(byte arg0, int arg1) {
		this.data[this.pos++] = (byte) (arg1 + this.field1284.method329());
		if (arg0 != 4) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("MFMVIYHT.a(I)V")
	public void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.b(I)V")
	public void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.a(IZ)V")
	public void ip2(int arg0, boolean arg1) {
		this.data[this.pos++] = (byte) arg0;
		if (!arg1) {
			this.data[this.pos++] = (byte) (arg0 >> 8);
		}
	}

	@ObfuscatedName("MFMVIYHT.c(I)V")
	public void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.d(I)V")
	public void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.b(IZ)V")
	public void ip4(int arg0, boolean arg1) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		if (arg1) {
			this.field1262 = 306;
		}
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MFMVIYHT.a(JZ)V")
	public void p8(long arg0, boolean arg1) {
		this.data[this.pos++] = (byte) (arg0 >> 56);
		this.data[this.pos++] = (byte) (arg0 >> 48);
		this.data[this.pos++] = (byte) (arg0 >> 40);
		this.data[this.pos++] = (byte) (arg0 >> 32);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
		if (arg1) {
			;
		}
	}

	@ObfuscatedName("MFMVIYHT.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), this.data, this.pos);
		this.pos += arg0.length();
		this.data[this.pos++] = 10;
	}

	@ObfuscatedName("MFMVIYHT.a([BIII)V")
	public void pdata(byte[] arg0, int arg1, int arg2, int arg3) {
		if (arg1 != 0) {
			field1277 = !field1277;
		}
		for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
			this.data[this.pos++] = arg0[var5];
		}
	}

	@ObfuscatedName("MFMVIYHT.a(II)V")
	public void psize1(int arg0, int arg1) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
		if (arg1 == 0) {
			;
		}
	}

	@ObfuscatedName("MFMVIYHT.c()I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.d()B")
	public byte g1b() {
		return this.data[this.pos++];
	}

	@ObfuscatedName("MFMVIYHT.e()I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.f()I")
	public int g2b() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("MFMVIYHT.g()I")
	public int g3() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MFMVIYHT.h()I")
	public int g4() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.e(I)J")
	public long g8(int arg0) {
		long var2 = (long) this.g4() & 0xFFFFFFFFL;
		if (arg0 >= 0) {
			throw new NullPointerException();
		}
		long var4 = (long) this.g4() & 0xFFFFFFFFL;
		return (var2 << 32) + var4;
	}

	@ObfuscatedName("MFMVIYHT.i()Ljava/lang/String;")
	public String gjstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, var1, this.pos - var1 - 1);
	}

	@ObfuscatedName("MFMVIYHT.f(I)[B")
	public byte[] gjstrraw(int arg0) {
		int var2 = this.pos;
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		while (this.data[this.pos++] != 10) {
		}
		byte[] var3 = new byte[this.pos - var2 - 1];
		for (int var4 = var2; var4 < this.pos - 1; var4++) {
			var3[var4 - var2] = this.data[var4];
		}
		return var3;
	}

	@ObfuscatedName("MFMVIYHT.a(III[B)V")
	public void gdata(int arg0, int arg1, int arg2, byte[] arg3) {
		if (arg2 >= 0) {
			this.field1264 = !this.field1264;
		}
		for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
			arg3[var5] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("MFMVIYHT.a(B)V")
	public void accessBits(byte arg0) {
		this.field1281 = this.pos * 8;
		if (arg0 == 6) {
			boolean var2 = false;
		}
	}

	@ObfuscatedName("MFMVIYHT.b(II)I")
	public int gBit(int arg0, int arg1) {
		int var3 = this.field1281 >> 3;
		int var4 = 8 - (this.field1281 & 0x7);
		int var5 = 0;
		this.field1281 += arg1;
		if (arg0 <= 0) {
			return this.field1278;
		}
		while (arg1 > var4) {
			var5 += (this.data[var3++] & field1283[var4]) << arg1 - var4;
			arg1 -= var4;
			var4 = 8;
		}
		int var6;
		if (arg1 == var4) {
			var6 = (this.data[var3] & field1283[var4]) + var5;
		} else {
			var6 = (this.data[var3] >> var4 - arg1 & field1283[arg1]) + var5;
		}
		return var6;
	}

	@ObfuscatedName("MFMVIYHT.g(I)V")
	public void accessBytes(int arg0) {
		if (this.field1266 != arg0) {
			this.field1266 = -448;
		}
		this.pos = (this.field1281 + 7) / 8;
	}

	@ObfuscatedName("MFMVIYHT.j()I")
	public int gsmart() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("MFMVIYHT.k()I")
	public int gsmarts() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("MFMVIYHT.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(int arg0, BigInteger arg1, BigInteger arg2) {
		int var4 = this.pos;
		this.pos = 0;
		byte[] var5 = new byte[var4];
		this.gdata(var4, 0, -21, var5);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(arg2, arg1);
		byte[] var8 = var7.toByteArray();
		if (arg0 >= 0 && arg0 <= 0) {
			this.pos = 0;
			this.p1(var8.length);
			this.pdata(var8, 0, var8.length, 0);
		}
	}

	@ObfuscatedName("MFMVIYHT.a(ZI)V")
	public void p1_alt1(boolean arg0, int arg1) {
		this.data[this.pos++] = (byte) (arg1 + 128);
		if (arg0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("MFMVIYHT.c(BI)V")
	public void p1_alt2(byte arg0, int arg1) {
		if (arg0 == 0) {
			boolean var3 = false;
		} else {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		this.data[this.pos++] = (byte) -arg1;
	}

	@ObfuscatedName("MFMVIYHT.c(II)V")
	public void p1_alt3(int arg0, int arg1) {
		if (arg1 == 1) {
			this.data[this.pos++] = (byte) (128 - arg0);
		}
	}

	@ObfuscatedName("MFMVIYHT.h(I)I")
	public int g1_alt1(int arg0) {
		return this.field1271 == arg0 ? this.data[this.pos++] - 128 & 0xFF : this.field1268;
	}

	@ObfuscatedName("MFMVIYHT.i(I)I")
	public int g1_alt2(int arg0) {
		return arg0 == -34545 ? -this.data[this.pos++] & 0xFF : this.field1262;
	}

	@ObfuscatedName("MFMVIYHT.j(I)I")
	public int g1_alt3(int arg0) {
		int var2 = 77 / arg0;
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.k(I)B")
	public byte g1b_alt1(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return (byte) (this.data[this.pos++] - 128);
	}

	@ObfuscatedName("MFMVIYHT.l(I)B")
	public byte g1b_alt2(int arg0) {
		if (arg0 != 0) {
			this.field1278 = 54;
		}
		return (byte) -this.data[this.pos++];
	}

	@ObfuscatedName("MFMVIYHT.m(I)B")
	public byte g1b_alt3(int arg0) {
		if (arg0 != 43428) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return (byte) (128 - this.data[this.pos++]);
	}

	@ObfuscatedName("MFMVIYHT.d(II)V")
	public void p2_alt1(int arg0, int arg1) {
		this.data[this.pos++] = (byte) arg1;
		this.data[this.pos++] = (byte) (arg1 >> 8);
		if (arg0 != 0) {
			this.field1272 = 403;
		}
	}

	@ObfuscatedName("MFMVIYHT.e(II)V")
	public void p2_alt2(int arg0, int arg1) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 + 128);
		if (arg1 == 0) {
			;
		}
	}

	@ObfuscatedName("MFMVIYHT.f(II)V")
	public void p2_alt3(int arg0, int arg1) {
		if (arg0 < 3 || arg0 > 3) {
			this.field1261 = !this.field1261;
		}
		this.data[this.pos++] = (byte) (arg1 + 128);
		this.data[this.pos++] = (byte) (arg1 >> 8);
	}

	@ObfuscatedName("MFMVIYHT.n(I)I")
	public int g2_alt1(int arg0) {
		this.pos += 2;
		return arg0 >= 0 ? 3 : ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.b(B)I")
	public int g2_alt2(byte arg0) {
		this.pos += 2;
		return arg0 == 9 ? ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF) : this.field1272;
	}

	@ObfuscatedName("MFMVIYHT.o(I)I")
	public int g2_alt3(int arg0) {
		this.pos += 2;
		if (arg0 >= 0) {
			this.field1272 = 68;
		}
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.p(I)I")
	public int g2b_alt1(int arg0) {
		this.pos += 2;
		int var2 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		while (arg0 >= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		if (var2 > 32767) {
			var2 -= 65536;
		}
		return var2;
	}

	@ObfuscatedName("MFMVIYHT.c(B)I")
	public int g2b_alt2(byte arg0) {
		this.pos += 2;
		if (this.field1273 != arg0) {
			this.field1267 = !this.field1267;
		}
		int var2 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
		if (var2 > 32767) {
			var2 -= 65536;
		}
		return var2;
	}

	@ObfuscatedName("MFMVIYHT.q(I)I")
	public int g3_alt3(int arg0) {
		this.pos += 3;
		return arg0 >= 0 ? 1 : (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("MFMVIYHT.r(I)I")
	public int g4_alt1(int arg0) {
		if (arg0 <= 0) {
			this.field1272 = -453;
		}
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.s(I)I")
	public int g4_alt2(int arg0) {
		if (arg0 < 3 || arg0 > 3) {
			this.field1272 = -258;
		}
		this.pos += 4;
		return (this.data[this.pos - 3] & 0xFF) + ((this.data[this.pos - 4] & 0xFF) << 8) + ((this.data[this.pos - 2] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.a(Z)I")
	public int g4_alt3(boolean arg0) {
		this.pos += 4;
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.a(B[BII)V")
	public void gdata_alt1(byte arg0, byte[] arg1, int arg2, int arg3) {
		if (arg0 == -73) {
			for (int var5 = arg2 + arg3 - 1; var5 >= arg3; var5--) {
				arg1[var5] = this.data[this.pos++];
			}
		}
	}

	@ObfuscatedName("MFMVIYHT.b([BIII)V")
	public void gdata_alt2(byte[] arg0, int arg1, int arg2, int arg3) {
		if (arg2 != 0) {
			this.field1264 = !this.field1264;
		}
		for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
			arg0[var5] = (byte) (this.data[this.pos++] - 128);
		}
	}

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
			field1282[var0] = var1;
		}
		field1283 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		field1288 = new LinkList(true);
		field1289 = new LinkList(true);
		field1290 = new LinkList(true);
		field1291 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}
}
