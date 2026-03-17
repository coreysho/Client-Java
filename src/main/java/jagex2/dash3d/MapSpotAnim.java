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
		this.field603 = SpotType.list[arg6];
		this.field605 = arg3;
		this.field606 = arg2;
		this.field607 = arg1;
		this.field608 = arg5;
		this.field604 = arg7 + arg0;
		this.field611 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public void method150(int arg0) {
		this.field610 += arg0;
		while (true) {
			do {
				do {
					if (this.field610 <= this.field603.seq.getDelay(this.field609)) {
						return;
					}
					this.field610 -= this.field603.seq.getDelay(this.field609) + 1;
					this.field609++;
				} while (this.field609 < this.field603.seq.numFrames);
			} while (this.field609 >= 0 && this.field609 < this.field603.seq.numFrames);
			this.field609 = 0;
			this.field611 = true;
		}
	}

	@ObfuscatedName("fb.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		Model var1 = this.field603.getTempModel2();
		if (var1 == null) {
			return null;
		}
		int var2 = this.field603.seq.frames[this.field609];
		Model var3 = new Model(true, AnimFrame.animateTransparencies(var2), var1, true, false);
		if (!this.field611) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (this.field603.resizeh != 128 || this.field603.resizev != 128) {
			var3.resize(this.field603.resizeh, this.field603.resizeh, this.field603.resizev);
		}
		if (this.field603.angle != 0) {
			if (this.field603.angle == 90) {
				var3.rotate90();
			}
			if (this.field603.angle == 180) {
				var3.rotate90();
				var3.rotate90();
			}
			if (this.field603.angle == 270) {
				var3.rotate90();
				var3.rotate90();
				var3.rotate90();
			}
		}
		var3.calculateNormals(this.field603.ambient + 64, this.field603.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
