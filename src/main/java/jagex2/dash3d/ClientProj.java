package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("db")
public final class ClientProj extends ModelSource {

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

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg9, int arg10, int arg11) {
		field498 = SpotType.list[arg7];
		field499 = arg6;
		field500 = arg0;
		field501 = arg11;
		field502 = arg9;
		field504 = arg5;
		field505 = arg3;
		field506 = arg4;
		field507 = arg1;
		field508 = arg10;
		field503 = arg2;
		field509 = false;
	}

	@ObfuscatedName("db.a(IIIBI)V")
	public void method119(int arg0, int arg1, int arg2, int arg4) {
		if (!field509) {
			double var6 = (double) (arg2 - field500);
			double var8 = (double) (arg4 - field501);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			field510 = (double) field500 + var6 * (double) field507 / var10;
			field511 = (double) field501 + var8 * (double) field507 / var10;
			field512 = field502;
		}
		double var12 = (double) (field505 + 1 - arg0);
		field513 = ((double) arg2 - field510) / var12;
		field514 = ((double) arg4 - field511) / var12;
		field515 = Math.sqrt(field513 * field513 + field514 * field514);
		if (!field509) {
			field516 = -field515 * Math.tan((double) field506 * 0.02454369D);
		}
		field517 = ((double) arg1 - field512 - field516 * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("db.a(IZ)V")
	public void method120(int arg0) {
		field509 = true;
		field510 += field513 * (double) arg0;
		field511 += field514 * (double) arg0;
		field512 += field516 * (double) arg0 + field517 * 0.5D * (double) arg0 * (double) arg0;
		field516 += field517 * (double) arg0;
		field518 = (int) (Math.atan2(field513, field514) * 325.949D) + 1024 & 0x7FF;
		field519 = (int) (Math.atan2(field516, field515) * 325.949D) & 0x7FF;
		if (field498.seq == null) {
			return;
		}
		field521 += arg0;
		while (field521 > field498.seq.getDelay(field520)) {
			field521 -= field498.seq.getDelay(field520) + 1;
			field520++;
			if (field520 >= field498.seq.numFrames) {
				field520 = 0;
			}
		}
	}

	@ObfuscatedName("db.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		Model var2 = field498.getTempModel2();
		if (var2 == null) {
			return null;
		}
		int var3 = -1;
		if (field498.seq != null) {
			var3 = field498.seq.frames[field520];
		}
		Model var4 = new Model(true, AnimFrame.animateTransparencies(var3), var2, false);
		if (var3 != -1) {
			var4.prepareAnim();
			var4.animate(var3);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (field498.resizeh != 128 || field498.resizev != 128) {
			var4.resize(field498.resizeh, field498.resizeh, field498.resizev);
		}
		var4.rotateXAxis(field519);
		var4.calculateNormals(field498.ambient + 64, field498.contrast + 850, -30, -50, -30, true);
		return var4;
	}
}
