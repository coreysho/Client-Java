package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public final class VarbitType {

	@ObfuscatedName("qc.a")
	public static final byte field1167 = 6;

	@ObfuscatedName("qc.b")
	public static final boolean field1168 = true;

	@ObfuscatedName("qc.c")
	public static int numDefinitions;

	@ObfuscatedName("qc.d")
	public static VarbitType[] list;

	@ObfuscatedName("qc.e")
	public String debugname;

	@ObfuscatedName("qc.f")
	public int basevar;

	@ObfuscatedName("qc.g")
	public int startbit;

	@ObfuscatedName("qc.h")
	public int endbit;

	@ObfuscatedName("qc.a(ZLxb;)V")
	public static void method380(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varbit.dat", null), (byte) 1);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarbitType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarbitType();
			}
			list[var2].decode(var1, field1167, var2);
		}
		if (var1.data != var1.pos.length) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(Llb;BI)V")
	public void decode(Packet arg0, byte arg1, int arg2) {
		if (arg1 != 6) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		while (true) {
			int var5 = arg0.g1();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.basevar = arg0.g2();
				this.startbit = arg0.g1();
				this.endbit = arg0.g1();
			} else if (var5 == 10) {
				this.debugname = arg0.gjstr();
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
