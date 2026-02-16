package deob;

@ObfuscatedName("nc")
public final class class66 {

	@ObfuscatedName("nc.a")
	public static int field1132;

	@ObfuscatedName("nc.b")
	public static class66[] field1133;

	@ObfuscatedName("nc.c")
	public int field1134;

	@ObfuscatedName("nc.d")
	public int[] field1135;

	@ObfuscatedName("nc.e")
	public int[] field1136;

	@ObfuscatedName("nc.f")
	public int[] field1137;

	@ObfuscatedName("nc.g")
	public int field1138 = -1;

	@ObfuscatedName("nc.h")
	public int[] field1139;

	@ObfuscatedName("nc.i")
	public boolean field1140 = false;

	@ObfuscatedName("nc.j")
	public int field1141 = 5;

	@ObfuscatedName("nc.k")
	public int field1142 = -1;

	@ObfuscatedName("nc.l")
	public int field1143 = -1;

	@ObfuscatedName("nc.m")
	public int field1144 = 99;

	@ObfuscatedName("nc.n")
	public int field1145 = -1;

	@ObfuscatedName("nc.o")
	public int field1146 = -1;

	@ObfuscatedName("nc.p")
	public int field1147;

	@ObfuscatedName("nc.a(ZLxb;)V")
	public static void method374(class50 arg0) {
		class38 var1 = new class38(arg0.method294("seq.dat", null), (byte) 1);
		field1132 = var1.method226();
		if (field1133 == null) {
			field1133 = new class66[field1132];
		}
		for (int var2 = 0; var2 < field1132; var2++) {
			if (field1133[var2] == null) {
				field1133[var2] = new class66();
			}
			field1133[var2].method376(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method375(int arg0) {
		int var2 = this.field1137[arg0];
		if (var2 == 0) {
			class7 var3 = class7.method47(this.field1135[arg0]);
			if (var3 != null) {
				var2 = this.field1137[arg0] = var3.field149;
			}
		}
		if (var2 == 0) {
			var2 = 1;
		}
		return var2;
	}

	@ObfuscatedName("nc.a(BLlb;)V")
	public void method376(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				if (this.field1134 == 0) {
					this.field1134 = 1;
					this.field1135 = new int[1];
					this.field1135[0] = -1;
					this.field1136 = new int[1];
					this.field1136[0] = -1;
					this.field1137 = new int[1];
					this.field1137[0] = -1;
				}
				if (this.field1145 == -1) {
					if (this.field1139 == null) {
						this.field1145 = 0;
					} else {
						this.field1145 = 2;
					}
				}
				if (this.field1146 == -1) {
					if (this.field1139 != null) {
						this.field1146 = 2;
						return;
					}
					this.field1146 = 0;
					return;
				}
				return;
			}
			if (var2 == 1) {
				this.field1134 = arg0.method224();
				this.field1135 = new int[this.field1134];
				this.field1136 = new int[this.field1134];
				this.field1137 = new int[this.field1134];
				for (int var3 = 0; var3 < this.field1134; var3++) {
					this.field1135[var3] = arg0.method226();
					this.field1136[var3] = arg0.method226();
					if (this.field1136[var3] == 65535) {
						this.field1136[var3] = -1;
					}
					this.field1137[var3] = arg0.method226();
				}
			} else if (var2 == 2) {
				this.field1138 = arg0.method226();
			} else if (var2 == 3) {
				int var4 = arg0.method224();
				this.field1139 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					this.field1139[var5] = arg0.method224();
				}
				this.field1139[var4] = 9999999;
			} else if (var2 == 4) {
				this.field1140 = true;
			} else if (var2 == 5) {
				this.field1141 = arg0.method224();
			} else if (var2 == 6) {
				this.field1142 = arg0.method226();
			} else if (var2 == 7) {
				this.field1143 = arg0.method226();
			} else if (var2 == 8) {
				this.field1144 = arg0.method224();
			} else if (var2 == 9) {
				this.field1145 = arg0.method224();
			} else if (var2 == 10) {
				this.field1146 = arg0.method224();
			} else if (var2 == 11) {
				this.field1147 = arg0.method224();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
