package deob;

@ObfuscatedName("lc")
public final class IdkType {

	@ObfuscatedName("lc.a")
	public final byte field1110 = 0;

	@ObfuscatedName("lc.b")
	public boolean field1111 = false;

	@ObfuscatedName("lc.c")
	public static int field1112;

	@ObfuscatedName("lc.d")
	public static IdkType[] field1113;

	@ObfuscatedName("lc.e")
	public int field1114 = -1;

	@ObfuscatedName("lc.f")
	public int[] field1115;

	@ObfuscatedName("lc.g")
	public final int[] field1116 = new int[6];

	@ObfuscatedName("lc.h")
	public final int[] field1117 = new int[6];

	@ObfuscatedName("lc.i")
	public final int[] field1118 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field1119 = false;

	@ObfuscatedName("lc.a(ZLxb;)V")
	public static void method368(JagFile arg0) {
		Packet var1 = new Packet(arg0.method294("idk.dat", null), (byte) 1);
		field1112 = var1.g2();
		if (field1113 == null) {
			field1113 = new IdkType[field1112];
		}
		for (int var2 = 0; var2 < field1112; var2++) {
			if (field1113[var2] == null) {
				field1113[var2] = new IdkType();
			}
			field1113[var2].method369(var1);
		}
	}

	@ObfuscatedName("lc.a(BLlb;)V")
	public void method369(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field1114 = arg0.g1();
			} else if (var2 == 2) {
				int var3 = arg0.g1();
				this.field1115 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.field1115[var4] = arg0.g2();
				}
			} else if (var2 == 3) {
				this.field1119 = true;
			} else if (var2 >= 40 && var2 < 50) {
				this.field1116[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				this.field1117[var2 - 50] = arg0.g2();
			} else if (var2 >= 60 && var2 < 70) {
				this.field1118[var2 - 60] = arg0.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method370() {
		if (this.field1115 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1115.length; var2++) {
			if (!Model.method126(this.field1115[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.a(B)Leb;")
	public Model method371() {
		if (this.field1110 != 0) {
			this.field1111 = !this.field1111;
		}
		if (this.field1115 == null) {
			return null;
		}
		Model[] var1 = new Model[this.field1115.length];
		for (int var2 = 0; var2 < this.field1115.length; var2++) {
			var1[var2] = Model.method125(this.field1115[var2]);
		}
		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1.length, -643, var1);
		}
		for (int var4 = 0; var4 < 6 && this.field1116[var4] != 0; var4++) {
			var3.method139(this.field1116[var4], this.field1117[var4]);
		}
		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean method372() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field1118[var2] != -1 && !Model.method126(this.field1118[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.b(B)Leb;")
	public Model method373() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field1118[var3] != -1) {
				var1[var2++] = Model.method125(this.field1118[var3]);
			}
		}
		Model var4 = new Model(var2, -643, var1);
		for (int var5 = 0; var5 < 6 && this.field1116[var5] != 0; var5++) {
			var4.method139(this.field1116[var5], this.field1117[var5]);
		}
		return var4;
	}
}
