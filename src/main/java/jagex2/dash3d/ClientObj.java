package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.m")
	public final boolean field493 = false;

	@ObfuscatedName("cb.n")
	public int field494;

	@ObfuscatedName("cb.o")
	public int field495;

	@ObfuscatedName("cb.a(Z)Leb;")
	@Override
	public Model method109() {
		ObjType var1 = ObjType.list(this.field494);
		return var1.getModelLit(this.field495);
	}
}
