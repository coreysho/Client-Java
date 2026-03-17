package jagex2.config;

import jagex2.datastruct.LruCache;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.Model;
import jagex2.io.JagFile;

@ObfuscatedName("pc")
public final class SpotType {

	@ObfuscatedName("pc.a")
	public final boolean field1152 = false;

	@ObfuscatedName("pc.b")
	public static int numDefinitions;

	@ObfuscatedName("pc.c")
	public static SpotType[] list;

	@ObfuscatedName("pc.d")
	public int id;

	@ObfuscatedName("pc.e")
	public int model;

	@ObfuscatedName("pc.f")
	public int anim = -1;

	@ObfuscatedName("pc.g")
	public SeqType seq;

	@ObfuscatedName("pc.h")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("pc.i")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("pc.j")
	public int resizeh = 128;

	@ObfuscatedName("pc.k")
	public int resizev = 128;

	@ObfuscatedName("pc.l")
	public int angle;

	@ObfuscatedName("pc.m")
	public int ambient;

	@ObfuscatedName("pc.n")
	public int contrast;

	@ObfuscatedName("pc.o")
	public static LruCache modelCache = new LruCache(30, 0);

	@ObfuscatedName("pc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("spotanim.dat", null), (byte) 1);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SpotType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SpotType();
			}
			list[var2].id = var2;
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("pc.a(BLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.model = arg0.g2();
			} else if (var2 == 2) {
				this.anim = arg0.g2();
				if (SeqType.list != null) {
					this.seq = SeqType.list[this.anim];
				}
			} else if (var2 == 4) {
				this.resizeh = arg0.g2();
			} else if (var2 == 5) {
				this.resizev = arg0.g2();
			} else if (var2 == 6) {
				this.angle = arg0.g2();
			} else if (var2 == 7) {
				this.ambient = arg0.g1();
			} else if (var2 == 8) {
				this.contrast = arg0.g1();
			} else if (var2 >= 40 && var2 < 50) {
				this.recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				this.recol_d[var2 - 50] = arg0.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public Model getTempModel2() {
		Model var1 = (Model) modelCache.find((long) this.id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.load(this.model);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.recol_s[0] != 0) {
				var2.recolour(this.recol_s[var3], this.recol_d[var3]);
			}
		}
		modelCache.put((long) this.id, var2);
		return var2;
	}
}
