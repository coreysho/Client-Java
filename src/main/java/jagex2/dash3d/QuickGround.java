package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("o")
public final class QuickGround {

	@ObfuscatedName("o.a")
	public final int colourSW;

	@ObfuscatedName("o.b")
	public final int field245;

	@ObfuscatedName("o.c")
	public final int colourNE;

	@ObfuscatedName("o.d")
	public final int field247;

	@ObfuscatedName("o.e")
	public final int texture;

	@ObfuscatedName("o.f")
	public boolean flat = true;

	@ObfuscatedName("o.g")
	public final int minimapRgb;

	public QuickGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		colourSW = arg0;
		field245 = arg1;
		colourNE = arg2;
		field247 = arg3;
		texture = arg4;
		minimapRgb = arg5;
		flat = arg6;
	}
}
