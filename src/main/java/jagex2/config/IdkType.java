package jagex2.config;

import jagex2.io.JagFile;
import jagex2.dash3d.Model;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public final class IdkType {

	@ObfuscatedName("lc.a")
	public final byte field1110 = 0;

	@ObfuscatedName("lc.b")
	public boolean field1111 = false;

	@ObfuscatedName("lc.c")
	public static int numDefinitions;

	@ObfuscatedName("lc.d")
	public static IdkType[] list;

	@ObfuscatedName("lc.e")
	public int part = -1;

	@ObfuscatedName("lc.f")
	public int[] model;

	@ObfuscatedName("lc.g")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("lc.h")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("lc.i")
	public final int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean disable = false;

	@ObfuscatedName("lc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("idk.dat", null), (byte) 1);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new IdkType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new IdkType();
			}
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("lc.a(BLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.part = arg0.g1();
			} else if (var2 == 2) {
				int var3 = arg0.g1();
				this.model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.model[var4] = arg0.g2();
				}
			} else if (var2 == 3) {
				this.disable = true;
			} else if (var2 >= 40 && var2 < 50) {
				this.recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				this.recol_d[var2 - 50] = arg0.g2();
			} else if (var2 >= 60 && var2 < 70) {
				this.head[var2 - 60] = arg0.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean checkModel() {
		if (this.model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.model.length; var2++) {
			if (!Model.requestDownload(this.model[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.a(B)Leb;")
	public Model getModelNoCheck() {
		if (this.field1110 != 0) {
			this.field1111 = !this.field1111;
		}
		if (this.model == null) {
			return null;
		}
		Model[] var1 = new Model[this.model.length];
		for (int var2 = 0; var2 < this.model.length; var2++) {
			var1[var2] = Model.load(this.model[var2]);
		}
		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1.length, -643, var1);
		}
		for (int var4 = 0; var4 < 6 && this.recol_s[var4] != 0; var4++) {
			var3.recolour(this.recol_s[var4], this.recol_d[var4]);
		}
		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean checkHead() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.head[var2] != -1 && !Model.requestDownload(this.head[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.b(B)Leb;")
	public Model getHeadNoCheck() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.head[var3] != -1) {
				var1[var2++] = Model.load(this.head[var3]);
			}
		}
		Model var4 = new Model(var2, -643, var1);
		for (int var5 = 0; var5 < 6 && this.recol_s[var5] != 0; var5++) {
			var4.recolour(this.recol_s[var5], this.recol_d[var5]);
		}
		return var4;
	}
}
