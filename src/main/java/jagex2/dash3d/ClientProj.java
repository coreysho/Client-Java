package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("db")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("db.m")
	public int field496;

	@ObfuscatedName("db.n")
	public boolean field497 = false;

	@ObfuscatedName("db.o")
	public final SpotType field498;

	@ObfuscatedName("db.p")
	public final int field499;

	@ObfuscatedName("db.q")
	public final int field500;

	@ObfuscatedName("db.r")
	public final int field501;

	@ObfuscatedName("db.s")
	public final int field502;

	@ObfuscatedName("db.t")
	public final int field503;

	@ObfuscatedName("db.u")
	public final int field504;

	@ObfuscatedName("db.v")
	public final int field505;

	@ObfuscatedName("db.w")
	public final int field506;

	@ObfuscatedName("db.x")
	public final int field507;

	@ObfuscatedName("db.y")
	public final int field508;

	@ObfuscatedName("db.z")
	public boolean field509 = false;

	@ObfuscatedName("db.A")
	public double field510;

	@ObfuscatedName("db.B")
	public double field511;

	@ObfuscatedName("db.C")
	public double field512;

	@ObfuscatedName("db.D")
	public double field513;

	@ObfuscatedName("db.E")
	public double field514;

	@ObfuscatedName("db.F")
	public double field515;

	@ObfuscatedName("db.G")
	public double field516;

	@ObfuscatedName("db.H")
	public double field517;

	@ObfuscatedName("db.I")
	public int field518;

	@ObfuscatedName("db.J")
	public int field519;

	@ObfuscatedName("db.K")
	public int field520;

	@ObfuscatedName("db.L")
	public int field521;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
		this.field498 = SpotType.list[arg7];
		this.field499 = arg6;
		this.field500 = arg0;
		this.field501 = arg11;
		this.field502 = arg9;
		this.field504 = arg5;
		this.field505 = arg3;
		this.field506 = arg4;
		this.field507 = arg1;
		this.field508 = arg10;
		this.field503 = arg2;
		this.field509 = false;
		if (!arg8) {
			this.field497 = !this.field497;
		}
	}

	@ObfuscatedName("db.a(IIIBI)V")
	public void method119(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field509) {
			double var5 = (double) (arg2 - this.field500);
			double var7 = (double) (arg3 - this.field501);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field510 = (double) this.field500 + var5 * (double) this.field507 / var9;
			this.field511 = (double) this.field501 + var7 * (double) this.field507 / var9;
			this.field512 = this.field502;
		}
		double var11 = (double) (this.field505 + 1 - arg0);
		this.field513 = ((double) arg2 - this.field510) / var11;
		this.field514 = ((double) arg3 - this.field511) / var11;
		this.field515 = Math.sqrt(this.field513 * this.field513 + this.field514 * this.field514);
		if (!this.field509) {
			this.field516 = -this.field515 * Math.tan((double) this.field506 * 0.02454369D);
		}
		this.field517 = ((double) arg1 - this.field512 - this.field516 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(IZ)V")
	public void method120(int arg0) {
		this.field509 = true;
		this.field510 += this.field513 * (double) arg0;
		this.field511 += this.field514 * (double) arg0;
		this.field512 += this.field516 * (double) arg0 + this.field517 * 0.5D * (double) arg0 * (double) arg0;
		this.field516 += this.field517 * (double) arg0;
		this.field518 = (int) (Math.atan2(this.field513, this.field514) * 325.949D) + 1024 & 0x7FF;
		this.field519 = (int) (Math.atan2(this.field516, this.field515) * 325.949D) & 0x7FF;
		if (this.field498.seq == null) {
			return;
		}
		this.field521 += arg0;
		while (this.field521 > this.field498.seq.getDelay(this.field520)) {
			this.field521 -= this.field498.seq.getDelay(this.field520) + 1;
			this.field520++;
			if (this.field520 >= this.field498.seq.numFrames) {
				this.field520 = 0;
			}
		}
	}

	@ObfuscatedName("db.a(Z)Leb;")
	@Override
	public Model method109() {
		Model var1 = this.field498.getTempModel2();
		if (var1 == null) {
			return null;
		}
		int var2 = -1;
		if (this.field498.seq != null) {
			var2 = this.field498.seq.frames[this.field520];
		}
		Model var3 = new Model(true, AnimFrame.animateTransparencies(var2), var1, true, false);
		if (var2 != -1) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (this.field498.resizeh != 128 || this.field498.resizev != 128) {
			var3.resize(this.field498.resizeh, this.field498.resizeh, this.field498.resizev);
		}
		var3.method137(this.field519);
		var3.calculateNormals(this.field498.ambient + 64, this.field498.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
