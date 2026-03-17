package jagex2.dash3d;

import deob.*;
import jagex2.client.Client;
import jagex2.config.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("ab")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ab.qb")
	public int field454;

	@ObfuscatedName("ab.rb")
	public final int field455 = -12792;

	@ObfuscatedName("ab.sb")
	public final int field456 = -582;

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
	public static LruCache field480 = new LruCache(260, 0);

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
	public void method116(Packet arg0, int arg1) {
		arg0.data = 0;
		this.gender = arg0.g1();
		this.headicons = arg0.g1();
		this.field479 = null;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				this.field461[var3] = 0;
			} else {
				int var5 = arg0.g1();
				this.field461[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.field461[0] == 65535) {
					this.field479 = NpcType.list(arg0.g2());
					break;
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.field1657[var6].length) {
				var7 = 0;
			}
			this.field462[var6] = var7;
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
		this.field457 = JString.toScreenName(JString.toRawUsername(arg0.g8()));
		this.field463 = arg0.g1();
		this.field464 = arg0.g2();
		this.field458 = true;
		this.field465 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			this.field465 <<= 0x4;
			if (this.field461[var8] >= 256) {
				this.field465 += this.field461[var8] - 256;
			}
		}
		if (this.field461[0] >= 256) {
			this.field465 += this.field461[0] - 256 >> 4;
		}
		if (this.field461[1] >= 256) {
			this.field465 += this.field461[1] - 256 >> 8;
		}
		for (int var9 = 0; var9 < 5; var9++) {
			this.field465 <<= 0x3;
			this.field465 += this.field462[var9];
		}
		this.field465 <<= 0x1;
		this.field465 += this.gender;
	}

	@ObfuscatedName("ab.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		if (!this.field458) {
			return null;
		}
		Model var1 = this.method117();
		if (var1 == null) {
			return null;
		}
		super.field443 = var1.minY;
		var1.useAABBMouseCheck = true;
		if (this.field477) {
			return var1;
		}
		if (super.field430 != -1 && super.field431 != -1) {
			SpotType var2 = SpotType.list[super.field430];
			Model var3 = var2.getTempModel2();
			if (var3 != null) {
				Model var4 = new Model(true, AnimFrame.animateTransparencies(super.field431), var3, true, false);
				var4.translate(0, -super.field434, 0);
				var4.prepareAnim();
				var4.animate(var2.seq.frames[super.field431]);
				var4.labelFaces = null;
				var4.labelVertices = null;
				if (var2.resizeh != 128 || var2.resizev != 128) {
					var4.resize(var2.resizeh, var2.resizeh, var2.resizev);
				}
				var4.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var5 = new Model[] { var1, var4 };
				var1 = new Model(true, (byte) 72, var5, 2);
			}
		}
		if (this.field472 != null) {
			if (Client.field1218 >= this.field468) {
				this.field472 = null;
			}
			if (Client.field1218 >= this.field467 && Client.field1218 < this.field468) {
				Model var6 = this.field472;
				var6.translate(this.field469 - super.field397, this.field470 - this.field466, this.field471 - super.field398);
				if (super.field444 == 512) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				} else if (super.field444 == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.field444 == 1536) {
					var6.rotate90();
				}
				Model[] var7 = new Model[] { var1, var6 };
				var1 = new Model(true, (byte) 72, var7, 2);
				if (super.field444 == 512) {
					var6.rotate90();
				} else if (super.field444 == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.field444 == 1536) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				}
				var6.translate(super.field397 - this.field469, this.field466 - this.field470, super.field398 - this.field471);
			}
		}
		var1.useAABBMouseCheck = true;
		return var1;
	}

	@ObfuscatedName("ab.c(Z)Leb;")
	public Model method117() {
		if (this.field479 != null) {
			int var1 = -1;
			if (super.field425 >= 0 && super.field428 == 0) {
				var1 = SeqType.list[super.field425].frames[super.field426];
			} else if (super.field422 >= 0) {
				var1 = SeqType.list[super.field422].frames[super.field423];
			}
			return this.field479.getTempModel(var1, -1, null);
		}
		long var3 = this.field465;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (super.field425 >= 0 && super.field428 == 0) {
			SeqType var9 = SeqType.list[super.field425];
			var5 = var9.frames[super.field426];
			if (super.field422 >= 0 && super.field422 != super.field402) {
				var6 = SeqType.list[super.field422].frames[super.field423];
			}
			if (var9.replaceheldleft >= 0) {
				var7 = var9.replaceheldleft;
				var3 += var7 - this.field461[5] << 8;
			}
			if (var9.replaceheldright >= 0) {
				var8 = var9.replaceheldright;
				var3 += var8 - this.field461[3] << 16;
			}
		} else if (super.field422 >= 0) {
			var5 = SeqType.list[super.field422].frames[super.field423];
		}
		Model var10 = (Model) field480.find(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = this.field461[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}
				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}
				if (var13 >= 256 && var13 < 512 && !IdkType.list[var13 - 256].checkModel()) {
					var11 = true;
				}
				if (var13 >= 512 && !ObjType.list(var13 - 512).checkWearModel(this.gender)) {
					var11 = true;
				}
			}
			if (var11) {
				if (this.field478 != -1L) {
					var10 = (Model) field480.find(this.field478);
				}
				if (var10 == null) {
					return null;
				}
			}
		}
		if (var10 == null) {
			Model[] var14 = new Model[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = this.field461[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}
				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}
				if (var17 >= 256 && var17 < 512) {
					Model var18 = IdkType.list[var17 - 256].getModelNoCheck();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}
				if (var17 >= 512) {
					Model var19 = ObjType.list(var17 - 512).getWearModelNoCheck(this.gender);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}
			var10 = new Model(var15, -643, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field462[var20] != 0) {
					var10.recolour(Client.field1657[var20][0], Client.field1657[var20][this.field462[var20]]);
					if (var20 == 1) {
						var10.recolour(Client.field1550[0], Client.field1550[this.field462[var20]]);
					}
				}
			}
			var10.prepareAnim();
			var10.calculateNormals(64, 850, -30, -50, -30, true);
			field480.put(var3, var10);
			this.field478 = var3;
		}
		if (this.field477) {
			return var10;
		}
		Model var21 = Model.tempModel;
		var21.set(var10, AnimFrame.animateTransparencies(var5) & AnimFrame.animateTransparencies(var6));
		if (var5 != -1 && var6 != -1) {
			var21.maskAnimate(SeqType.list[super.field425].walkmerge, var5, var6);
		} else if (var5 != -1) {
			var21.animate(var5);
		}
		var21.calcBoundingCylinder();
		var21.labelFaces = null;
		var21.labelVertices = null;
		return var21;
	}

	@ObfuscatedName("ab.d(Z)Leb;")
	public Model method118() {
		if (!this.field458) {
			return null;
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field461[var2];
			if (var3 >= 256 && var3 < 512 && !IdkType.list[var3 - 256].checkHead()) {
				var1 = true;
			}
			if (var3 >= 512 && !ObjType.list(var3 - 512).checkHeadModel(this.gender)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		Model[] var4 = new Model[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field461[var6];
			if (var7 >= 256 && var7 < 512) {
				Model var8 = IdkType.list[var7 - 256].getHeadNoCheck();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				Model var9 = ObjType.list(var7 - 512).getHeadModelNoCheck(this.gender);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		Model var10 = new Model(var5, -643, var4);
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field462[var11] != 0) {
				var10.recolour(Client.field1657[var11][0], Client.field1657[var11][this.field462[var11]]);
				if (var11 == 1) {
					var10.recolour(Client.field1550[0], Client.field1550[this.field462[var11]]);
				}
			}
		}
		return var10;
	}

	@ObfuscatedName("ab.a(I)Z")
	@Override
	public boolean method113() {
		return this.field458;
	}
}
