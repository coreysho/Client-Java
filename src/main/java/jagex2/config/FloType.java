package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("kc")
public final class FloType {

	@ObfuscatedName("kc.a")
	public final boolean field1095 = true;

	@ObfuscatedName("kc.b")
	public final int field1096 = -186;

	@ObfuscatedName("kc.c")
	public static int numDefinitions;

	@ObfuscatedName("kc.d")
	public static FloType[] list;

	@ObfuscatedName("kc.e")
	public int colour;

	@ObfuscatedName("kc.f")
	public int texture = -1;

	@ObfuscatedName("kc.g")
	public boolean overlay = false;

	@ObfuscatedName("kc.h")
	public boolean occlude = true;

	@ObfuscatedName("kc.i")
	public String debugname;

	@ObfuscatedName("kc.j")
	public int hue;

	@ObfuscatedName("kc.k")
	public int saturation;

	@ObfuscatedName("kc.l")
	public int lightness;

	@ObfuscatedName("kc.m")
	public int underlayHue;

	@ObfuscatedName("kc.n")
	public int chroma;

	@ObfuscatedName("kc.o")
	public int overlayHsl;

	@ObfuscatedName("kc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("flo.dat", null), (byte) 1);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new FloType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new FloType();
			}
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("kc.a(BLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.colour = arg0.g3();
				this.getHsl(this.colour);
			} else if (var2 == 2) {
				this.texture = arg0.g1();
			} else if (var2 == 3) {
				this.overlay = true;
			} else if (var2 == 5) {
				this.occlude = false;
			} else if (var2 == 6) {
				this.debugname = arg0.gjstr();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void getHsl(int rgb) {
		double var2 = (double) (rgb >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (rgb >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (rgb & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.hue = (int) (var18 * 256.0D);
		this.saturation = (int) (var14 * 256.0D);
		this.lightness = (int) (var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var16 > 0.5D) {
			this.chroma = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.chroma = (int) (var16 * var14 * 512.0D);
		}
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.underlayHue = (int) (var18 * (double) this.chroma);
		int var20 = this.hue + (int) (Math.random() * 16.0D) - 8;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}
		int var21 = this.saturation + (int) (Math.random() * 48.0D) - 24;
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		int var22 = this.lightness + (int) (Math.random() * 48.0D) - 24;
		if (var22 < 0) {
			var22 = 0;
		} else if (var22 > 255) {
			var22 = 255;
		}
		this.overlayHsl = this.getTable(var20, var21, var22);
	}

	@ObfuscatedName("kc.a(III)I")
	public int getTable(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
