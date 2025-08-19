package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class SpotAnimType {

	@ObfuscatedName("MNZYLKNY.c")
	public int field1295 = -214;

	@ObfuscatedName("MNZYLKNY.h")
	public int field1300 = -1;

	@ObfuscatedName("MNZYLKNY.j")
	public int[] field1302 = new int[6];

	@ObfuscatedName("MNZYLKNY.k")
	public int[] field1303 = new int[6];

	@ObfuscatedName("MNZYLKNY.l")
	public int field1304 = 128;

	@ObfuscatedName("MNZYLKNY.m")
	public int field1305 = 128;

	@ObfuscatedName("MNZYLKNY.a")
	public static byte field1293 = 6;

	@ObfuscatedName("MNZYLKNY.b")
	public static boolean field1294 = true;

	@ObfuscatedName("MNZYLKNY.q")
	public static LruCache field1309 = new LruCache(30, -572);

	@ObfuscatedName("MNZYLKNY.d")
	public static int field1296;

	@ObfuscatedName("MNZYLKNY.f")
	public int field1298;

	@ObfuscatedName("MNZYLKNY.g")
	public int field1299;

	@ObfuscatedName("MNZYLKNY.n")
	public int field1306;

	@ObfuscatedName("MNZYLKNY.o")
	public int field1307;

	@ObfuscatedName("MNZYLKNY.p")
	public int field1308;

	@ObfuscatedName("MNZYLKNY.i")
	public SeqType field1301;

	@ObfuscatedName("MNZYLKNY.e")
	public static SpotAnimType[] field1297;

	@ObfuscatedName("MNZYLKNY.a(LATJMVOZR;I)V")
	public static void method437(Jagfile arg0, int arg1) {
		Packet var2 = new Packet(true, arg0.method2("spotanim.dat", null));
		field1296 = var2.g2();
		if (arg1 != 36135) {
			field1294 = !field1294;
		}
		if (field1297 == null) {
			field1297 = new SpotAnimType[field1296];
		}
		for (int var3 = 0; var3 < field1296; var3++) {
			if (field1297[var3] == null) {
				field1297[var3] = new SpotAnimType();
			}
			field1297[var3].field1298 = var3;
			field1297[var3].method438(field1293, var2);
		}
	}

	@ObfuscatedName("MNZYLKNY.a(BLMFMVIYHT;)V")
	public void method438(byte arg0, Packet arg1) {
		if (arg0 == 6) {
			boolean var3 = false;
		} else {
			this.field1295 = 458;
		}
		while (true) {
			while (true) {
				int var4 = arg1.g1();
				if (var4 == 0) {
					return;
				}
				if (var4 == 1) {
					this.field1299 = arg1.g2();
				} else if (var4 == 2) {
					this.field1300 = arg1.g2();
					if (SeqType.field775 != null) {
						this.field1301 = SeqType.field775[this.field1300];
					}
				} else if (var4 == 4) {
					this.field1304 = arg1.g2();
				} else if (var4 == 5) {
					this.field1305 = arg1.g2();
				} else if (var4 == 6) {
					this.field1306 = arg1.g2();
				} else if (var4 == 7) {
					this.field1307 = arg1.g1();
				} else if (var4 == 8) {
					this.field1308 = arg1.g1();
				} else if (var4 >= 40 && var4 < 50) {
					this.field1302[var4 - 40] = arg1.g2();
				} else if (var4 >= 50 && var4 < 60) {
					this.field1303[var4 - 50] = arg1.g2();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var4);
				}
			}
		}
	}

	@ObfuscatedName("MNZYLKNY.a()LLZYQDKJV;")
	public Model method439() {
		Model var1 = (Model) field1309.method458((long) this.field1298);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.method359(this.field1299);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.field1302[0] != 0) {
				var2.method373(this.field1302[var3], this.field1303[var3]);
			}
		}
		field1309.method459(var2, (long) this.field1298, 5);
		return var2;
	}
}
