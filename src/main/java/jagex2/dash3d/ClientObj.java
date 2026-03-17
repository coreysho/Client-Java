package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.n")
	public int field494;

	@ObfuscatedName("cb.o")
	public int field495;

	@ObfuscatedName("cb.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		ObjType var2 = ObjType.list(field494);
		return var2.getModelLit(field495);
	}
}
