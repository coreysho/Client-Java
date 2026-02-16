package deob;

@ObfuscatedName("rc")
public final class class70 {

	@ObfuscatedName("rc.a")
	public static final int field1175 = -643;

	@ObfuscatedName("rc.b")
	public static final byte field1176 = 6;

	@ObfuscatedName("rc.c")
	public static int field1177;

	@ObfuscatedName("rc.d")
	public static class70[] field1178;

	@ObfuscatedName("rc.e")
	public static int field1179;

	@ObfuscatedName("rc.f")
	public static int[] field1180;

	@ObfuscatedName("rc.g")
	public String field1181;

	@ObfuscatedName("rc.h")
	public int field1182;

	@ObfuscatedName("rc.i")
	public int field1183;

	@ObfuscatedName("rc.j")
	public boolean field1184 = false;

	@ObfuscatedName("rc.k")
	public boolean field1185 = true;

	@ObfuscatedName("rc.l")
	public int field1186;

	@ObfuscatedName("rc.m")
	public boolean field1187 = false;

	@ObfuscatedName("rc.n")
	public int field1188;

	@ObfuscatedName("rc.o")
	public int field1189;

	@ObfuscatedName("rc.p")
	public boolean field1190 = false;

	@ObfuscatedName("rc.q")
	public int field1191 = -1;

	@ObfuscatedName("rc.a(ZLxb;)V")
	public static void method382(class50 arg0) {
		class38 var1 = new class38(arg0.method294("varp.dat", null), (byte) 1);
		field1179 = 0;
		field1177 = var1.method226();
		if (field1178 == null) {
			field1178 = new class70[field1177];
		}
		if (field1180 == null) {
			field1180 = new int[field1177];
		}
		for (int var2 = 0; var2 < field1177; var2++) {
			if (field1178[var2] == null) {
				field1178[var2] = new class70();
			}
			field1178[var2].method383(var1, field1176, var2);
		}
		if (var1.field709 != var1.field708.length) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(Llb;BI)V")
	public void method383(class38 arg0, byte arg1, int arg2) {
		if (arg1 != 6) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		while (true) {
			int var5 = arg0.method224();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.field1182 = arg0.method224();
			} else if (var5 == 2) {
				this.field1183 = arg0.method224();
			} else if (var5 == 3) {
				this.field1184 = true;
				field1180[field1179++] = arg2;
			} else if (var5 == 4) {
				this.field1185 = false;
			} else if (var5 == 5) {
				this.field1186 = arg0.method226();
			} else if (var5 == 6) {
				this.field1187 = true;
			} else if (var5 == 7) {
				this.field1188 = arg0.method229();
			} else if (var5 == 8) {
				this.field1189 = 1;
				this.field1190 = true;
			} else if (var5 == 10) {
				this.field1181 = arg0.method231();
			} else if (var5 == 11) {
				this.field1190 = true;
			} else if (var5 == 12) {
				this.field1191 = arg0.method229();
			} else if (var5 == 13) {
				this.field1189 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
