package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

public class ClientObj extends ModelSource {

	@ObfuscatedName("HRIUIFAV.m")
	public int field873;

	@ObfuscatedName("HRIUIFAV.n")
	public int field874;

	@ObfuscatedName("HRIUIFAV.o")
	public int field875;

	@ObfuscatedName("HRIUIFAV.a(B)LLZYQDKJV;")
	public final Model method239(byte arg0) {
		if (arg0 != 3) {
			this.field874 = -358;
		}
		ObjType var2 = ObjType.method221(this.field873);
		return var2.method229(this.field875);
	}
}
