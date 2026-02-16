package deob;

@ObfuscatedName("ac")
public final class Envelope {

	@ObfuscatedName("ac.a")
	public final int field880 = 1;

	@ObfuscatedName("ac.b")
	public final boolean field881 = false;

	@ObfuscatedName("ac.c")
	public int field882;

	@ObfuscatedName("ac.d")
	public int[] field883;

	@ObfuscatedName("ac.e")
	public int[] field884;

	@ObfuscatedName("ac.f")
	public int field885;

	@ObfuscatedName("ac.g")
	public int field886;

	@ObfuscatedName("ac.h")
	public int field887;

	@ObfuscatedName("ac.i")
	public int field888;

	@ObfuscatedName("ac.j")
	public int field889;

	@ObfuscatedName("ac.k")
	public int field890;

	@ObfuscatedName("ac.l")
	public int field891;

	@ObfuscatedName("ac.m")
	public int field892;

	@ObfuscatedName("ac.a(BLlb;)V")
	public void method304(Packet arg0) {
		this.field887 = arg0.g1();
		this.field885 = arg0.g4();
		this.field886 = arg0.g4();
		this.method305(arg0);
	}

	@ObfuscatedName("ac.a(Llb;I)V")
	public void method305(Packet arg0) {
		this.field882 = arg0.g1();
		this.field883 = new int[this.field882];
		this.field884 = new int[this.field882];
		for (int var2 = 0; var2 < this.field882; var2++) {
			this.field883[var2] = arg0.g2();
			this.field884[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public void method306() {
		this.field888 = 0;
		this.field889 = 0;
		this.field890 = 0;
		this.field891 = 0;
		this.field892 = 0;
	}

	@ObfuscatedName("ac.a(BI)I")
	public int method307(int arg0) {
		if (this.field892 >= this.field888) {
			this.field891 = this.field884[this.field889++] << 15;
			if (this.field889 >= this.field882) {
				this.field889 = this.field882 - 1;
			}
			this.field888 = (int) ((double) this.field883[this.field889] / 65536.0D * (double) arg0);
			if (this.field888 > this.field892) {
				this.field890 = ((this.field884[this.field889] << 15) - this.field891) / (this.field888 - this.field892);
			}
		}
		this.field891 += this.field890;
		this.field892++;
		return this.field891 - this.field890 >> 15;
	}
}
