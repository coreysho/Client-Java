package deob;

@ObfuscatedName("cc")
public final class JagFX {

	@ObfuscatedName("cc.a")
	public int field905;

	@ObfuscatedName("cc.b")
	public final byte field906 = 5;

	@ObfuscatedName("cc.c")
	public static boolean field907;

	@ObfuscatedName("cc.d")
	public static final JagFX[] field908 = new JagFX[1000];

	@ObfuscatedName("cc.e")
	public static final int[] field909 = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] field910;

	@ObfuscatedName("cc.g")
	public static Packet field911;

	@ObfuscatedName("cc.h")
	public final Tone[] field912 = new Tone[10];

	@ObfuscatedName("cc.i")
	public int field913;

	@ObfuscatedName("cc.j")
	public int field914;

	@ObfuscatedName("cc.a(ZLlb;)V")
	public static void method313(Packet arg0) {
		field910 = new byte[441000];
		field911 = new Packet(field910, (byte) 1);
		Tone.method319();
		while (true) {
			int var1 = arg0.method226();
			if (var1 == 65535) {
				return;
			}
			field908[var1] = new JagFX(-46900);
			field908[var1].method315(arg0);
			field909[var1] = field908[var1].method316();
		}
	}

	@ObfuscatedName("cc.a(IIB)Llb;")
	public static Packet method314(int arg0, int arg1) {
		if (field908[arg0] == null) {
			return null;
		} else {
			JagFX var2 = field908[arg0];
			return var2.method317(arg1);
		}
	}

	public JagFX(int arg0) {
	}

	@ObfuscatedName("cc.a(BLlb;)V")
	public void method315(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method224();
			if (var3 != 0) {
				arg0.field709--;
				this.field912[var2] = new Tone();
				this.field912[var2].method322(arg0);
			}
		}
		this.field913 = arg0.method226();
		this.field914 = arg0.method226();
	}

	@ObfuscatedName("cc.a(I)I")
	public int method316() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field912[var2] != null && this.field912[var2].field933 / 20 < var1) {
				var1 = this.field912[var2].field933 / 20;
			}
		}
		if (this.field913 < this.field914 && this.field913 / 20 < var1) {
			var1 = this.field913 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field912[var3] != null) {
				this.field912[var3].field933 -= var1 * 20;
			}
		}
		if (this.field913 < this.field914) {
			this.field913 -= var1 * 20;
			this.field914 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("cc.a(IB)Llb;")
	public Packet method317(int arg0) {
		int var2 = this.method318(arg0);
		field911.field709 = 0;
		field911.method218(1380533830);
		field911.method219(var2 + 36);
		field911.method218(1463899717);
		field911.method218(1718449184);
		field911.method219(16);
		field911.method216(1);
		field911.method216(1);
		field911.method219(22050);
		field911.method219(22050);
		field911.method216(1);
		field911.method216(8);
		field911.method218(1684108385);
		field911.method219(var2);
		if (this.field906 != 5) {
			throw new NullPointerException();
		}
		field911.field709 += var2;
		return field911;
	}

	@ObfuscatedName("cc.b(I)I")
	public int method318(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field912[var3] != null && this.field912[var3].field932 + this.field912[var3].field933 > var2) {
				var2 = this.field912[var3].field932 + this.field912[var3].field933;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.field913 * 22050 / 1000;
		int var6 = this.field914 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = var4 + (var6 - var5) * (arg0 - 1);
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field910[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.field912[var9] != null) {
				int var10 = this.field912[var9].field932 * 22050 / 1000;
				int var11 = this.field912[var9].field933 * 22050 / 1000;
				int[] var12 = this.field912[var9].method320(var10, this.field912[var9].field932);
				for (int var13 = 0; var13 < var10; var13++) {
					field910[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field910[var15 + var14] = field910[var15];
			}
			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field910[var18 + var17] = field910[var18];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
