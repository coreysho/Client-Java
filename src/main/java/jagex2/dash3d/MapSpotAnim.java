package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("fb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("fb.m")
	public final SpotType field603;

	@ObfuscatedName("fb.n")
	public final int field604;

	@ObfuscatedName("fb.o")
	public final int field605;

	@ObfuscatedName("fb.p")
	public final int field606;

	@ObfuscatedName("fb.q")
	public final int field607;

	@ObfuscatedName("fb.r")
	public final int field608;

	@ObfuscatedName("fb.s")
	public int field609;

	@ObfuscatedName("fb.t")
	public int field610;

	@ObfuscatedName("fb.u")
	public boolean field611 = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		field603 = SpotType.list[arg6];
		if (arg4 != 0) {
			throw new NullPointerException();
		}
		field605 = arg3;
		field606 = arg2;
		field607 = arg1;
		field608 = arg5;
		field604 = arg7 + arg0;
		field611 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public void method150(int arg0, int arg1) {
		field610 += arg1;
		if (arg0 != 0) {
			return;
		}
		while (true) {
			do {
				do {
					if (field610 <= field603.seq.getDelay(field609)) {
						return;
					}
					field610 -= field603.seq.getDelay(field609) + 1;
					field609++;
				} while (field609 < field603.seq.numFrames);
			} while (field609 >= 0 && field609 < field603.seq.numFrames);
			field609 = 0;
			field611 = true;
		}
	}

	@ObfuscatedName("fb.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		Model var2 = field603.getTempModel2();
		if (var2 == null) {
			return null;
		} else {
			int var3 = field603.seq.frames[field609];
			Model var4 = new Model(true, AnimFrame.animateTransparencies(var3), var2, false);
			if (!field611) {
				var4.prepareAnim();
				var4.animate(var3);
				var4.labelFaces = null;
				var4.labelVertices = null;
			}
			if (field603.resizeh != 128 || field603.resizev != 128) {
				var4.resize(field603.resizeh, field603.resizeh, field603.resizev);
			}
			if (field603.angle != 0) {
				if (field603.angle == 90) {
					var4.rotate90();
				}
				if (field603.angle == 180) {
					var4.rotate90();
					var4.rotate90();
				}
				if (field603.angle == 270) {
					var4.rotate90();
					var4.rotate90();
					var4.rotate90();
				}
			}
			var4.calculateNormals(field603.ambient + 64, field603.contrast + 850, -30, -50, -30, true);
			return var4;
		}
	}
}
