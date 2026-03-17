package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;

@ObfuscatedName("z")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("z.rb")
	public NpcType field453;

	@ObfuscatedName("z.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		if (field453 == null) {
			return null;
		}
		Model var3 = method115();
		if (var3 == null) {
			return null;
		}
		super.field443 = var3.minY;
		if (super.field430 != -1 && super.field431 != -1) {
			SpotType var4 = SpotType.list[super.field430];
			Model var5 = var4.getTempModel2();
			if (var5 != null) {
				int var6 = var4.seq.frames[super.field431];
				Model var7 = new Model(true, AnimFrame.animateTransparencies(var6), var5, false);
				var7.translate(0, -super.field434, 0);
				var7.prepareAnim();
				var7.animate(var6);
				var7.labelFaces = null;
				var7.labelVertices = null;
				if (var4.resizeh != 128 || var4.resizev != 128) {
					var7.resize(var4.resizeh, var4.resizeh, var4.resizev);
				}
				var7.calculateNormals(var4.ambient + 64, var4.contrast + 850, -30, -50, -30, true);
				Model[] var8 = new Model[] { var3, var7 };
				var3 = new Model(true, var8, 2);
			}
		}
		if (field453.size == 1) {
			var3.useAABBMouseCheck = true;
		}
		return var3;
	}

	@ObfuscatedName("z.c(Z)Leb;")
	public Model method115() {
		if (super.field425 >= 0 && super.field428 == 0) {
			int var2 = SeqType.list[super.field425].frames[super.field426];
			int var3 = -1;
			if (super.field422 >= 0 && super.field422 != super.field402) {
				var3 = SeqType.list[super.field422].frames[super.field423];
			}
			return field453.getTempModel(var2, var3, SeqType.list[super.field425].walkmerge);
		}
		int var4 = -1;
		if (super.field422 >= 0) {
			var4 = SeqType.list[super.field422].frames[super.field423];
		}
		return field453.getTempModel(var4, -1, null);
	}

	@ObfuscatedName("z.a(I)Z")
	@Override
	public boolean method113() {
		return field453 != null;
	}
}
