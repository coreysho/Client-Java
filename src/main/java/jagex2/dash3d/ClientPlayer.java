package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("ab")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ab.tb")
	public String field457;

	@ObfuscatedName("ab.ub")
	public boolean field458 = false;

	@ObfuscatedName("ab.vb")
	public int gender;

	@ObfuscatedName("ab.wb")
	public int headicons;

	@ObfuscatedName("ab.xb")
	public final int[] field461 = new int[12];

	@ObfuscatedName("ab.yb")
	public final int[] field462 = new int[5];

	@ObfuscatedName("ab.zb")
	public int field463;

	@ObfuscatedName("ab.Qb")
	public static LruCache field480 = new LruCache(260);

	@ObfuscatedName("ab.Nb")
	public boolean field477 = false;

	@ObfuscatedName("ab.Ob")
	public long field478 = -1L;

	@ObfuscatedName("ab.Ab")
	public int field464;

	@ObfuscatedName("ab.Cb")
	public int field466;

	@ObfuscatedName("ab.Db")
	public int field467;

	@ObfuscatedName("ab.Eb")
	public int field468;

	@ObfuscatedName("ab.Fb")
	public int field469;

	@ObfuscatedName("ab.Gb")
	public int field470;

	@ObfuscatedName("ab.Hb")
	public int field471;

	@ObfuscatedName("ab.Jb")
	public int field473;

	@ObfuscatedName("ab.Kb")
	public int field474;

	@ObfuscatedName("ab.Lb")
	public int field475;

	@ObfuscatedName("ab.Mb")
	public int field476;

	@ObfuscatedName("ab.Bb")
	public long field465;

	@ObfuscatedName("ab.Ib")
	public Model field472;

	@ObfuscatedName("ab.Pb")
	public NpcType field479;

	@ObfuscatedName("ab.a(Llb;I)V")
	public void method116(Packet arg0) {
		arg0.data = 0;
		gender = arg0.g1();
		headicons = arg0.g1();
		field479 = null;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				field461[var3] = 0;
			} else {
				int var5 = arg0.g1();
				field461[var3] = (var4 << 8) + var5;
				if (var3 == 0 && field461[0] == 65535) {
					field479 = NpcType.list(arg0.g2());
					break;
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.field1657[var6].length) {
				var7 = 0;
			}
			field462[var6] = var7;
		}
		super.field402 = arg0.g2();
		if (super.field402 == 65535) {
			super.field402 = -1;
		}
		super.field403 = arg0.g2();
		if (super.field403 == 65535) {
			super.field403 = -1;
		}
		super.field404 = arg0.g2();
		if (super.field404 == 65535) {
			super.field404 = -1;
		}
		super.field405 = arg0.g2();
		if (super.field405 == 65535) {
			super.field405 = -1;
		}
		super.field406 = arg0.g2();
		if (super.field406 == 65535) {
			super.field406 = -1;
		}
		super.field407 = arg0.g2();
		if (super.field407 == 65535) {
			super.field407 = -1;
		}
		super.field408 = arg0.g2();
		if (super.field408 == 65535) {
			super.field408 = -1;
		}
		field457 = JString.toScreenName(JString.toRawUsername(arg0.g8()));
		field463 = arg0.g1();
		field464 = arg0.g2();
		field458 = true;
		field465 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field465 <<= 0x4;
			if (field461[var8] >= 256) {
				field465 += field461[var8] - 256;
			}
		}
		if (field461[0] >= 256) {
			field465 += field461[0] - 256 >> 4;
		}
		if (field461[1] >= 256) {
			field465 += field461[1] - 256 >> 8;
		}
		for (int var9 = 0; var9 < 5; var9++) {
			field465 <<= 0x3;
			field465 += field462[var9];
		}
		field465 <<= 0x1;
		field465 += gender;
	}

	@ObfuscatedName("ab.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		if (!field458) {
			return null;
		}
		Model var2 = method117();
		if (var2 == null) {
			return null;
		}
		super.field443 = var2.minY;
		var2.useAABBMouseCheck = true;
		if (field477) {
			return var2;
		}
		if (super.field430 != -1 && super.field431 != -1) {
			SpotType var3 = SpotType.list[super.field430];
			Model var4 = var3.getTempModel2();
			if (var4 != null) {
				Model var5 = new Model(true, AnimFrame.animateTransparencies(super.field431), var4, false);
				var5.translate(0, -super.field434, 0);
				var5.prepareAnim();
				var5.animate(var3.seq.frames[super.field431]);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.resize(var3.resizeh, var3.resizeh, var3.resizev);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(true, var6, 2);
			}
		}
		if (field472 != null) {
			if (Client.loopCycle >= field468) {
				field472 = null;
			}
			if (Client.loopCycle >= field467 && Client.loopCycle < field468) {
				Model var7 = field472;
				var7.translate(field469 - super.field397, field470 - field466, field471 - super.field398);
				if (super.field444 == 512) {
					var7.rotate90();
					var7.rotate90();
					var7.rotate90();
				} else if (super.field444 == 1024) {
					var7.rotate90();
					var7.rotate90();
				} else if (super.field444 == 1536) {
					var7.rotate90();
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(true, var8, 2);
				if (super.field444 == 512) {
					var7.rotate90();
				} else if (super.field444 == 1024) {
					var7.rotate90();
					var7.rotate90();
				} else if (super.field444 == 1536) {
					var7.rotate90();
					var7.rotate90();
					var7.rotate90();
				}
				var7.translate(super.field397 - field469, field466 - field470, super.field398 - field471);
			}
		}
		var2.useAABBMouseCheck = true;
		return var2;
	}

	@ObfuscatedName("ab.c(Z)Leb;")
	public Model method117() {
		if (field479 != null) {
			int var3 = -1;
			if (super.field425 >= 0 && super.field428 == 0) {
				var3 = SeqType.list[super.field425].frames[super.field426];
			} else if (super.field422 >= 0) {
				var3 = SeqType.list[super.field422].frames[super.field423];
			}
			return field479.getTempModel(var3, -1, null);
		}
		long var5 = field465;
		int var7 = -1;
		int var8 = -1;
		int var9 = -1;
		int var10 = -1;
		if (super.field425 >= 0 && super.field428 == 0) {
			SeqType var11 = SeqType.list[super.field425];
			var7 = var11.frames[super.field426];
			if (super.field422 >= 0 && super.field422 != super.field402) {
				var8 = SeqType.list[super.field422].frames[super.field423];
			}
			if (var11.replaceheldleft >= 0) {
				var9 = var11.replaceheldleft;
				var5 += var9 - field461[5] << 8;
			}
			if (var11.replaceheldright >= 0) {
				var10 = var11.replaceheldright;
				var5 += var10 - field461[3] << 16;
			}
		} else if (super.field422 >= 0) {
			var7 = SeqType.list[super.field422].frames[super.field423];
		}
		Model var12 = (Model) field480.find(var5);
		if (var12 == null) {
			boolean var13 = false;
			for (int var14 = 0; var14 < 12; var14++) {
				int var15 = field461[var14];
				if (var10 >= 0 && var14 == 3) {
					var15 = var10;
				}
				if (var9 >= 0 && var14 == 5) {
					var15 = var9;
				}
				if (var15 >= 256 && var15 < 512 && !IdkType.list[var15 - 256].checkModel()) {
					var13 = true;
				}
				if (var15 >= 512 && !ObjType.list(var15 - 512).checkWearModel(gender)) {
					var13 = true;
				}
			}
			if (var13) {
				if (field478 != -1L) {
					var12 = (Model) field480.find(field478);
				}
				if (var12 == null) {
					return null;
				}
			}
		}
		if (var12 == null) {
			Model[] var16 = new Model[12];
			int var17 = 0;
			for (int var18 = 0; var18 < 12; var18++) {
				int var19 = field461[var18];
				if (var10 >= 0 && var18 == 3) {
					var19 = var10;
				}
				if (var9 >= 0 && var18 == 5) {
					var19 = var9;
				}
				if (var19 >= 256 && var19 < 512) {
					Model var20 = IdkType.list[var19 - 256].getModelNoCheck();
					if (var20 != null) {
						var16[var17++] = var20;
					}
				}
				if (var19 >= 512) {
					Model var21 = ObjType.list(var19 - 512).getWearModelNoCheck(gender);
					if (var21 != null) {
						var16[var17++] = var21;
					}
				}
			}
			var12 = new Model(var17, var16);
			for (int var22 = 0; var22 < 5; var22++) {
				if (field462[var22] != 0) {
					var12.recolour(Client.field1657[var22][0], Client.field1657[var22][field462[var22]]);
					if (var22 == 1) {
						var12.recolour(Client.field1550[0], Client.field1550[field462[var22]]);
					}
				}
			}
			var12.prepareAnim();
			var12.calculateNormals(64, 850, -30, -50, -30, true);
			field480.put(var5, var12);
			field478 = var5;
		}
		if (field477) {
			return var12;
		}
		Model var23 = Model.tempModel;
		var23.set(var12, AnimFrame.animateTransparencies(var7) & AnimFrame.animateTransparencies(var8));
		if (var7 != -1 && var8 != -1) {
			var23.maskAnimate(SeqType.list[super.field425].walkmerge, var7, var8);
		} else if (var7 != -1) {
			var23.animate(var7);
		}
		var23.calcBoundingCylinder();
		var23.labelFaces = null;
		var23.labelVertices = null;
		return var23;
	}

	@ObfuscatedName("ab.d(Z)Leb;")
	public Model method118() {
		if (!field458) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = field461[var3];
			if (var4 >= 256 && var4 < 512 && !IdkType.list[var4 - 256].checkHead()) {
				var2 = true;
			}
			if (var4 >= 512 && !ObjType.list(var4 - 512).checkHeadModel(gender)) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var5 = new Model[12];
		int var6 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var8 = field461[var7];
			if (var8 >= 256 && var8 < 512) {
				Model var9 = IdkType.list[var8 - 256].getHeadNoCheck();
				if (var9 != null) {
					var5[var6++] = var9;
				}
			}
			if (var8 >= 512) {
				Model var10 = ObjType.list(var8 - 512).getHeadModelNoCheck(gender);
				if (var10 != null) {
					var5[var6++] = var10;
				}
			}
		}
		Model var11 = new Model(var6, var5);
		for (int var12 = 0; var12 < 5; var12++) {
			if (field462[var12] != 0) {
				var11.recolour(Client.field1657[var12][0], Client.field1657[var12][field462[var12]]);
				if (var12 == 1) {
					var11.recolour(Client.field1550[0], Client.field1550[field462[var12]]);
				}
			}
		}
		return var11;
	}

	@ObfuscatedName("ab.a(I)Z")
	@Override
	public boolean method113() {
		return field458;
	}
}
