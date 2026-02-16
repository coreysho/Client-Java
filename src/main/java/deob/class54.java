package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.a")
	public int field894 = 181;

	@ObfuscatedName("bc.b")
	public final boolean field895 = true;

	@ObfuscatedName("bc.c")
	public final byte field896 = 1;

	@ObfuscatedName("bc.d")
	public final int[] field897 = new int[2];

	@ObfuscatedName("bc.e")
	public final int[][][] field898 = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public final int[][][] field899 = new int[2][2][4];

	@ObfuscatedName("bc.g")
	public final int[] field900 = new int[2];

	@ObfuscatedName("bc.h")
	public static final float[][] field901 = new float[2][8];

	@ObfuscatedName("bc.i")
	public static final int[][] field902 = new int[2][8];

	@ObfuscatedName("bc.j")
	public static float field903;

	@ObfuscatedName("bc.k")
	public static int field904;

	@ObfuscatedName("bc.a(IIIF)F")
	public float method308(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field899[arg1][0][arg0] + arg2 * (float) (this.field899[arg1][1][arg0] - this.field899[arg1][0][arg0]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("bc.a(BF)F")
	public float method309(float arg0) {
		float var2 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(BIIF)F")
	public float method310(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field898[arg0][0][arg1] + arg2 * (float) (this.field898[arg0][1][arg1] - this.field898[arg0][0][arg1]);
		if (this.field896 != 1) {
			this.field894 = -228;
		}
		float var5 = var4 * 1.2207031E-4F;
		return this.method309(var5);
	}

	@ObfuscatedName("bc.a(IFB)I")
	public int method311(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) this.field900[0] + (float) (this.field900[1] - this.field900[0]) * arg1;
			float var4 = var3 * 0.0030517578F;
			field903 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			field904 = (int) (field903 * 65536.0F);
		}
		if (this.field897[arg0] == 0) {
			return 0;
		}
		float var5 = this.method308(0, arg0, arg1);
		field901[arg0][0] = -2.0F * var5 * (float) Math.cos((double) this.method310(arg0, 0, arg1));
		field901[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < this.field897[arg0]; var6++) {
			float var7 = this.method308(var6, arg0, arg1);
			float var8 = -2.0F * var7 * (float) Math.cos((double) this.method310(arg0, var6, arg1));
			float var9 = var7 * var7;
			field901[arg0][var6 * 2 + 1] = field901[arg0][var6 * 2 - 1] * var9;
			field901[arg0][var6 * 2] = field901[arg0][var6 * 2 - 1] * var8 + field901[arg0][var6 * 2 - 2] * var9;
			for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
				field901[arg0][var10] += field901[arg0][var10 - 1] * var8 + field901[arg0][var10 - 2] * var9;
			}
			field901[arg0][1] += field901[arg0][0] * var8 + var9;
			field901[arg0][0] += var8;
		}
		if (arg0 == 0) {
			for (int var11 = 0; var11 < this.field897[0] * 2; var11++) {
				field901[0][var11] *= field903;
			}
		}
		for (int var12 = 0; var12 < this.field897[arg0] * 2; var12++) {
			field902[arg0][var12] = (int) (field901[arg0][var12] * 65536.0F);
		}
		return this.field897[arg0] * 2;
	}

	@ObfuscatedName("bc.a(Llb;BLac;)V")
	public void method312(class38 arg0, byte arg1, class53 arg2) {
		int var4 = arg0.method224();
		this.field897[0] = var4 >> 4;
		this.field897[1] = var4 & 0xF;
		if (arg1 != 6) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if (var4 == 0) {
			this.field900[0] = this.field900[1] = 0;
			return;
		}
		this.field900[0] = arg0.method226();
		this.field900[1] = arg0.method226();
		int var6 = arg0.method224();
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.field897[var7]; var8++) {
				this.field898[var7][0][var8] = arg0.method226();
				this.field899[var7][0][var8] = arg0.method226();
			}
		}
		for (int var9 = 0; var9 < 2; var9++) {
			for (int var10 = 0; var10 < this.field897[var9]; var10++) {
				if ((var6 & 0x1 << var9 * 4 << var10) == 0) {
					this.field898[var9][1][var10] = this.field898[var9][0][var10];
					this.field899[var9][1][var10] = this.field899[var9][0][var10];
				} else {
					this.field898[var9][1][var10] = arg0.method226();
					this.field899[var9][1][var10] = arg0.method226();
				}
			}
		}
		if (var6 != 0 || this.field900[1] != this.field900[0]) {
			arg2.method305(arg0);
		}
	}
}
