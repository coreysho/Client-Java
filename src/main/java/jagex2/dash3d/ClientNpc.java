package jagex2.dash3d;

import deob.*;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;

@ObfuscatedName("z")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("z.qb")
	public final boolean field452 = true;

	@ObfuscatedName("z.rb")
	public NpcType field453;

	@ObfuscatedName("z.a(Z)Leb;")
	@Override
	public Model method109() {
		if (this.field453 == null) {
			return null;
		}
		Model var1 = this.method115();
		if (var1 == null) {
			return null;
		}
		super.field443 = var1.minY;
		if (super.field430 != -1 && super.field431 != -1) {
			SpotType var2 = SpotType.list[super.field430];
			Model var3 = var2.getTempModel2();
			if (var3 != null) {
				int var4 = var2.seq.frames[super.field431];
				Model var5 = new Model(true, AnimFrame.animateTransparencies(var4), var3, true, false);
				var5.translate(0, -super.field434, 0);
				var5.prepareAnim();
				var5.animate(var4);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var2.resizeh != 128 || var2.resizev != 128) {
					var5.resize(var2.resizeh, var2.resizeh, var2.resizev);
				}
				var5.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(true, (byte) 72, var6, 2);
			}
		}
		if (this.field453.size == 1) {
			var1.useAABBMouseCheck = true;
		}
		return var1;
	}

	@ObfuscatedName("z.c(Z)Leb;")
	public Model method115() {
		if (super.field425 < 0 || super.field428 != 0) {
			int var3 = -1;
			if (super.field422 >= 0) {
				var3 = SeqType.list[super.field422].frames[super.field423];
			}
			return this.field453.getTempModel(var3, -1, null);
		}
		int var1 = SeqType.list[super.field425].frames[super.field426];
		int var2 = -1;
		if (super.field422 >= 0 && super.field422 != super.field402) {
			var2 = SeqType.list[super.field422].frames[super.field423];
		}
		return this.field453.getTempModel(var1, var2, SeqType.list[super.field425].walkmerge);
	}

	@ObfuscatedName("z.a(I)Z")
	@Override
	public boolean method113() {
		return this.field453 != null;
	}
}
