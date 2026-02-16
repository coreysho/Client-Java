package deob;

@ObfuscatedName("t")
public final class HashTable {

	@ObfuscatedName("t.a")
	public int field355 = 7;

	@ObfuscatedName("t.b")
	public final int field356 = 7228;

	@ObfuscatedName("t.c")
	public final byte field357 = 0;

	@ObfuscatedName("t.d")
	public final boolean field358 = false;

	@ObfuscatedName("t.e")
	public final int field359 = 1024;

	@ObfuscatedName("t.f")
	public final Linkable[] field360;

	public HashTable(int arg0, int arg1) {
		if (arg1 != this.field356) {
			this.field355 = 236;
		}
		this.field360 = new Linkable[1024];
		for (int var3 = 0; var3 < 1024; var3++) {
			Linkable var4 = this.field360[var3] = new Linkable();
			var4.field363 = var4;
			var4.field364 = var4;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public Linkable method104(long arg0) {
		Linkable var3 = this.field360[(int) (arg0 & (long) (this.field359 - 1))];
		for (Linkable var4 = var3.field363; var4 != var3; var4 = var4.field363) {
			if (var4.field362 == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("t.a(ZJLu;)V")
	public void method105(long arg0, Linkable arg1) {
		if (arg1.field364 != null) {
			arg1.method106();
		}
		Linkable var4 = this.field360[(int) (arg0 & (long) (this.field359 - 1))];
		arg1.field364 = var4.field364;
		arg1.field363 = var4;
		arg1.field364.field363 = arg1;
		arg1.field363.field364 = arg1;
		arg1.field362 = arg0;
	}
}
