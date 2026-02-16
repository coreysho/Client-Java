package deob;

@ObfuscatedName("pc")
public final class class68 {

	@ObfuscatedName("pc.a")
	public final boolean field1152 = false;

	@ObfuscatedName("pc.b")
	public static int field1153;

	@ObfuscatedName("pc.c")
	public static class68[] field1154;

	@ObfuscatedName("pc.d")
	public int field1155;

	@ObfuscatedName("pc.e")
	public int field1156;

	@ObfuscatedName("pc.f")
	public int field1157 = -1;

	@ObfuscatedName("pc.g")
	public class66 field1158;

	@ObfuscatedName("pc.h")
	public final int[] field1159 = new int[6];

	@ObfuscatedName("pc.i")
	public final int[] field1160 = new int[6];

	@ObfuscatedName("pc.j")
	public int field1161 = 128;

	@ObfuscatedName("pc.k")
	public int field1162 = 128;

	@ObfuscatedName("pc.l")
	public int field1163;

	@ObfuscatedName("pc.m")
	public int field1164;

	@ObfuscatedName("pc.n")
	public int field1165;

	@ObfuscatedName("pc.o")
	public static class19 field1166 = new class19(30, 0);

	@ObfuscatedName("pc.a(ZLxb;)V")
	public static void method377(class50 arg0) {
		class38 var1 = new class38(arg0.method294("spotanim.dat", null), (byte) 1);
		field1153 = var1.method226();
		if (field1154 == null) {
			field1154 = new class68[field1153];
		}
		for (int var2 = 0; var2 < field1153; var2++) {
			if (field1154[var2] == null) {
				field1154[var2] = new class68();
			}
			field1154[var2].field1155 = var2;
			field1154[var2].method378(var1);
		}
	}

	@ObfuscatedName("pc.a(BLlb;)V")
	public void method378(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field1156 = arg0.method226();
			} else if (var2 == 2) {
				this.field1157 = arg0.method226();
				if (class66.field1133 != null) {
					this.field1158 = class66.field1133[this.field1157];
				}
			} else if (var2 == 4) {
				this.field1161 = arg0.method226();
			} else if (var2 == 5) {
				this.field1162 = arg0.method226();
			} else if (var2 == 6) {
				this.field1163 = arg0.method226();
			} else if (var2 == 7) {
				this.field1164 = arg0.method224();
			} else if (var2 == 8) {
				this.field1165 = arg0.method224();
			} else if (var2 >= 40 && var2 < 50) {
				this.field1159[var2 - 40] = arg0.method226();
			} else if (var2 >= 50 && var2 < 60) {
				this.field1160[var2 - 50] = arg0.method226();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public class31 method379() {
		class31 var1 = (class31) field1166.method101((long) this.field1155);
		if (var1 != null) {
			return var1;
		}
		class31 var2 = class31.method125(this.field1156);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.field1159[0] != 0) {
				var2.method139(this.field1159[var3], this.field1160[var3]);
			}
		}
		field1166.method102((long) this.field1155, var2);
		return var2;
	}
}
