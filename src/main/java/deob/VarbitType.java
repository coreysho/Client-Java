package deob;

@ObfuscatedName("qc")
public final class VarbitType {

	@ObfuscatedName("qc.a")
	public static final byte field1167 = 6;

	@ObfuscatedName("qc.b")
	public static final boolean field1168 = true;

	@ObfuscatedName("qc.c")
	public static int field1169;

	@ObfuscatedName("qc.d")
	public static VarbitType[] field1170;

	@ObfuscatedName("qc.e")
	public String field1171;

	@ObfuscatedName("qc.f")
	public int field1172;

	@ObfuscatedName("qc.g")
	public int field1173;

	@ObfuscatedName("qc.h")
	public int field1174;

	@ObfuscatedName("qc.a(ZLxb;)V")
	public static void method380(JagFile arg0) {
		Packet var1 = new Packet(arg0.method294("varbit.dat", null), (byte) 1);
		field1169 = var1.method226();
		if (field1170 == null) {
			field1170 = new VarbitType[field1169];
		}
		for (int var2 = 0; var2 < field1169; var2++) {
			if (field1170[var2] == null) {
				field1170[var2] = new VarbitType();
			}
			field1170[var2].method381(var1, field1167, var2);
		}
		if (var1.field709 != var1.field708.length) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(Llb;BI)V")
	public void method381(Packet arg0, byte arg1, int arg2) {
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
				this.field1172 = arg0.method226();
				this.field1173 = arg0.method224();
				this.field1174 = arg0.method224();
			} else if (var5 == 10) {
				this.field1171 = arg0.method231();
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
