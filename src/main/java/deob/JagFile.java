package deob;

@ObfuscatedName("xb")
public final class JagFile {

	@ObfuscatedName("xb.a")
	public final int field861 = 9;

	@ObfuscatedName("xb.b")
	public final int field862 = 29615;

	@ObfuscatedName("xb.c")
	public final boolean field863 = true;

	@ObfuscatedName("xb.d")
	public byte[] field864;

	@ObfuscatedName("xb.e")
	public int field865;

	@ObfuscatedName("xb.f")
	public int[] field866;

	@ObfuscatedName("xb.g")
	public int[] field867;

	@ObfuscatedName("xb.h")
	public int[] field868;

	@ObfuscatedName("xb.i")
	public int[] field869;

	@ObfuscatedName("xb.j")
	public boolean field870;

	public JagFile(int arg0, byte[] arg1) {
		this.method293(arg1);
	}

	@ObfuscatedName("xb.a(I[B)V")
	public void method293(byte[] arg0) {
		Packet var2 = new Packet(arg0, (byte) 1);
		int var3 = var2.g3();
		int var4 = var2.g3();
		if (var4 == var3) {
			this.field864 = arg0;
			this.field870 = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.method256(var5, var3, arg0, var4, 6);
			this.field864 = var5;
			var2 = new Packet(this.field864, (byte) 1);
			this.field870 = true;
		}
		this.field865 = var2.g2();
		this.field866 = new int[this.field865];
		this.field867 = new int[this.field865];
		this.field868 = new int[this.field865];
		this.field869 = new int[this.field865];
		int var6 = var2.data + this.field865 * 10;
		for (int var7 = 0; var7 < this.field865; var7++) {
			this.field866[var7] = var2.g4();
			this.field867[var7] = var2.g3();
			this.field868[var7] = var2.g3();
			this.field869[var7] = var6;
			var6 += this.field868[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] method294(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.field865; var6++) {
			if (this.field866[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.field867[var6]];
				}
				if (this.field870) {
					for (int var7 = 0; var7 < this.field867[var6]; var7++) {
						arg1[var7] = this.field864[this.field869[var6] + var7];
					}
				} else {
					BZip2.method256(arg1, this.field867[var6], this.field864, this.field868[var6], this.field869[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
