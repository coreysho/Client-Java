package jagex2.dash3d;

import deob.*;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("eb")
public final class Model extends ModelSource {

	@ObfuscatedName("eb.m")
	public boolean field522 = true;

	@ObfuscatedName("eb.n")
	public final byte field523 = 7;

	@ObfuscatedName("eb.o")
	public final byte field524 = 72;

	@ObfuscatedName("eb.p")
	public static final int field525 = 2;

	@ObfuscatedName("eb.q")
	public final int field526 = -643;

	@ObfuscatedName("eb.r")
	public final int field527 = 368;

	@ObfuscatedName("eb.s")
	public final boolean field528 = false;

	@ObfuscatedName("eb.t")
	public static int field529;

	@ObfuscatedName("eb.u")
	public static int field530;

	@ObfuscatedName("eb.v")
	public static final Model field531 = new Model((byte) 7);

	@ObfuscatedName("eb.w")
	public static int[] field532 = new int[2000];

	@ObfuscatedName("eb.x")
	public static int[] field533 = new int[2000];

	@ObfuscatedName("eb.y")
	public static int[] field534 = new int[2000];

	@ObfuscatedName("eb.z")
	public static int[] field535 = new int[2000];

	@ObfuscatedName("eb.ab")
	public int field562;

	@ObfuscatedName("eb.bb")
	public int field563;

	@ObfuscatedName("eb.cb")
	public int objRaise;

	@ObfuscatedName("eb.db")
	public int[] field565;

	@ObfuscatedName("eb.eb")
	public int[] field566;

	@ObfuscatedName("eb.fb")
	public int[][] labelVertices;

	@ObfuscatedName("eb.gb")
	public int[][] labelFaces;

	@ObfuscatedName("eb.hb")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("eb.ib")
	public PointNormal[] field570;

	@ObfuscatedName("eb.jb")
	public static Metadata[] field571;

	@ObfuscatedName("eb.kb")
	public static OnDemandProvider field572;

	@ObfuscatedName("eb.lb")
	public static boolean[] field573 = new boolean[4096];

	@ObfuscatedName("eb.mb")
	public static boolean[] field574 = new boolean[4096];

	@ObfuscatedName("eb.nb")
	public static int[] field575 = new int[4096];

	@ObfuscatedName("eb.ob")
	public static int[] field576 = new int[4096];

	@ObfuscatedName("eb.pb")
	public static int[] field577 = new int[4096];

	@ObfuscatedName("eb.qb")
	public static int[] field578 = new int[4096];

	@ObfuscatedName("eb.rb")
	public static int[] field579 = new int[4096];

	@ObfuscatedName("eb.sb")
	public static int[] field580 = new int[4096];

	@ObfuscatedName("eb.tb")
	public static int[] field581 = new int[1500];

	@ObfuscatedName("eb.ub")
	public static int[][] field582 = new int[1500][512];

	@ObfuscatedName("eb.vb")
	public static int[] field583 = new int[12];

	@ObfuscatedName("eb.wb")
	public static int[][] field584 = new int[12][2000];

	@ObfuscatedName("eb.xb")
	public static int[] field585 = new int[2000];

	@ObfuscatedName("eb.yb")
	public static int[] field586 = new int[2000];

	@ObfuscatedName("eb.zb")
	public static int[] field587 = new int[12];

	@ObfuscatedName("eb.Ab")
	public static final int[] field588 = new int[10];

	@ObfuscatedName("eb.Bb")
	public static final int[] field589 = new int[10];

	@ObfuscatedName("eb.Cb")
	public static final int[] field590 = new int[10];

	@ObfuscatedName("eb.Kb")
	public static final int[] field598 = new int[1000];

	@ObfuscatedName("eb.Lb")
	public static int[] field599 = Pix3D.sinTable;

	@ObfuscatedName("eb.Mb")
	public static int[] field600 = Pix3D.cosTable;

	@ObfuscatedName("eb.Nb")
	public static int[] field601 = Pix3D.colourTable;

	@ObfuscatedName("eb.Ob")
	public static int[] field602 = Pix3D.divTable2;

	@ObfuscatedName("eb.A")
	public int numPoints;

	@ObfuscatedName("eb.E")
	public int field540;

	@ObfuscatedName("eb.Q")
	public int field552;

	@ObfuscatedName("eb.B")
	public int[] pointX;

	@ObfuscatedName("eb.C")
	public int[] pointY;

	@ObfuscatedName("eb.D")
	public int[] pointZ;

	@ObfuscatedName("eb.F")
	public int[] field541;

	@ObfuscatedName("eb.G")
	public int[] field542;

	@ObfuscatedName("eb.H")
	public int[] field543;

	@ObfuscatedName("eb.R")
	public int[] field553;

	@ObfuscatedName("eb.S")
	public int[] field554;

	@ObfuscatedName("eb.T")
	public int[] field555;

	@ObfuscatedName("eb.L")
	public int[] field547;

	@ObfuscatedName("eb.M")
	public int[] field548;

	@ObfuscatedName("eb.P")
	public int field551;

	@ObfuscatedName("eb.N")
	public int[] field549;

	@ObfuscatedName("eb.O")
	public int[] field550;

	@ObfuscatedName("eb.I")
	public int[] field544;

	@ObfuscatedName("eb.J")
	public int[] field545;

	@ObfuscatedName("eb.K")
	public int[] field546;

	@ObfuscatedName("eb.Z")
	public int field561;

	@ObfuscatedName("eb.Y")
	public int field560;

	@ObfuscatedName("eb.U")
	public int field556;

	@ObfuscatedName("eb.W")
	public int field558;

	@ObfuscatedName("eb.X")
	public int field559;

	@ObfuscatedName("eb.V")
	public int field557;

	@ObfuscatedName("eb.Db")
	public static int field591;

	@ObfuscatedName("eb.Eb")
	public static int field592;

	@ObfuscatedName("eb.Fb")
	public static int field593;

	@ObfuscatedName("eb.Hb")
	public static int field595;

	@ObfuscatedName("eb.Ib")
	public static int field596;

	@ObfuscatedName("eb.Jb")
	public static int field597;

	@ObfuscatedName("eb.Gb")
	public static boolean field594;

	@ObfuscatedName("eb.a(B)V")
	public static void method121() {
		field571 = null;
		field573 = null;
		field574 = null;
		field575 = null;
		field576 = null;
		field577 = null;
		field578 = null;
		field579 = null;
		field580 = null;
		field581 = null;
		field582 = null;
		field583 = null;
		field584 = null;
		field585 = null;
		field586 = null;
		field587 = null;
		field599 = null;
		field600 = null;
		field601 = null;
		field602 = null;
	}

	@ObfuscatedName("eb.a(ILtb;)V")
	public static void method122(int arg0, OnDemandProvider arg1) {
		field571 = new Metadata[arg0];
		field572 = arg1;
	}

	@ObfuscatedName("eb.a(I[BI)V")
	public static void method123(int arg0, byte[] arg1) {
		if (arg1 == null) {
			Metadata var2 = field571[arg0] = new Metadata();
			var2.field206 = 0;
			var2.field207 = 0;
			var2.field208 = 0;
			return;
		}
		Packet var3 = new Packet(arg1, (byte) 1);
		var3.data = arg1.length - 18;
		Metadata var4 = field571[arg0] = new Metadata();
		var4.field205 = arg1;
		var4.field206 = var3.g2();
		var4.field207 = var3.g2();
		var4.field208 = var3.g1();
		int var5 = var3.g1();
		int var6 = var3.g1();
		int var7 = var3.g1();
		int var8 = var3.g1();
		int var9 = var3.g1();
		int var10 = var3.g2();
		int var11 = var3.g2();
		int var12 = var3.g2();
		int var13 = var3.g2();
		var4.field209 = 0;
		int var14 = var4.field206;
		var4.field215 = var14;
		int var15 = var14 + var4.field207;
		var4.field218 = var15;
		if (var6 == 255) {
			var15 += var4.field207;
		} else {
			var4.field218 = -var6 - 1;
		}
		var4.field220 = var15;
		if (var8 == 1) {
			var15 += var4.field207;
		} else {
			var4.field220 = -1;
		}
		var4.field217 = var15;
		if (var5 == 1) {
			var15 += var4.field207;
		} else {
			var4.field217 = -1;
		}
		var4.field213 = var15;
		if (var9 == 1) {
			var15 += var4.field206;
		} else {
			var4.field213 = -1;
		}
		var4.field219 = var15;
		if (var7 == 1) {
			var15 += var4.field207;
		} else {
			var4.field219 = -1;
		}
		var4.field214 = var15;
		int var16 = var15 + var13;
		var4.field216 = var16;
		int var17 = var16 + var4.field207 * 2;
		var4.field221 = var17;
		int var18 = var17 + var4.field208 * 6;
		var4.field210 = var18;
		int var19 = var18 + var10;
		var4.field211 = var19;
		int var20 = var19 + var11;
		var4.field212 = var20;
	}

	@ObfuscatedName("eb.a(II)V")
	public static void method124(int arg0) {
		field571[arg0] = null;
	}

	@ObfuscatedName("eb.b(II)Leb;")
	public static Model load(int arg0) {
		if (field571 == null) {
			return null;
		}
		Metadata var1 = field571[arg0];
		if (var1 == null) {
			field572.requestModel(arg0);
			return null;
		} else {
			return new Model(arg0, field525);
		}
	}

	@ObfuscatedName("eb.a(I)Z")
	public static boolean requestDownload(int arg0) {
		if (field571 == null) {
			return false;
		}
		Metadata var1 = field571[arg0];
		if (var1 == null) {
			field572.requestModel(arg0);
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("eb.a(III)I")
	public static int method144(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		int var4 = arg1 * (arg0 & 0x7F) >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	public Model(byte arg0) {
		if (arg0 != this.field523) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	public Model(int arg0, int arg1) {
		field530++;
		Metadata var3 = field571[arg0];
		this.numPoints = var3.field206;
		this.field540 = var3.field207;
		this.field552 = var3.field208;
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.field541 = new int[this.field540];
		this.field542 = new int[this.field540];
		this.field543 = new int[this.field540];
		this.field553 = new int[this.field552];
		this.field554 = new int[this.field552];
		this.field555 = new int[this.field552];
		if (var3.field213 >= 0) {
			this.field565 = new int[this.numPoints];
		}
		if (var3.field217 >= 0) {
			this.field547 = new int[this.field540];
		}
		if (var3.field218 >= 0) {
			this.field548 = new int[this.field540];
		} else {
			this.field551 = -var3.field218 - 1;
		}
		if (var3.field219 >= 0) {
			this.field549 = new int[this.field540];
		}
		if (var3.field220 >= 0) {
			this.field566 = new int[this.field540];
		}
		this.field550 = new int[this.field540];
		Packet var4 = new Packet(var3.field205, (byte) 1);
		var4.data = var3.field209;
		Packet var5 = new Packet(var3.field205, (byte) 1);
		var5.data = var3.field210;
		Packet var6 = new Packet(var3.field205, (byte) 1);
		var6.data = var3.field211;
		Packet var7 = new Packet(var3.field205, (byte) 1);
		var7.data = var3.field212;
		Packet var8 = new Packet(var3.field205, (byte) 1);
		var8.data = var3.field213;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < this.numPoints; var12++) {
			int var13 = var4.g1();
			int var14 = 0;
			if ((var13 & 0x1) != 0) {
				var14 = var5.gsmarts();
			}
			int var15 = 0;
			if ((var13 & 0x2) != 0) {
				var15 = var6.gsmarts();
			}
			int var16 = 0;
			if ((var13 & 0x4) != 0) {
				var16 = var7.gsmarts();
			}
			this.pointX[var12] = var9 + var14;
			this.pointY[var12] = var10 + var15;
			this.pointZ[var12] = var11 + var16;
			var9 = this.pointX[var12];
			var10 = this.pointY[var12];
			var11 = this.pointZ[var12];
			if (this.field565 != null) {
				this.field565[var12] = var8.g1();
			}
		}
		var4.data = var3.field216;
		var5.data = var3.field217;
		var6.data = var3.field218;
		var7.data = var3.field219;
		var8.data = var3.field220;
		for (int var17 = 0; var17 < this.field540; var17++) {
			this.field550[var17] = var4.g2();
			if (this.field547 != null) {
				this.field547[var17] = var5.g1();
			}
			if (this.field548 != null) {
				this.field548[var17] = var6.g1();
			}
			if (this.field549 != null) {
				this.field549[var17] = var7.g1();
			}
			if (this.field566 != null) {
				this.field566[var17] = var8.g1();
			}
		}
		var4.data = var3.field214;
		var5.data = var3.field215;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		if (arg1 < 2 || arg1 > 2) {
			for (int var22 = 1; var22 > 0; var22++) {
			}
		}
		for (int var23 = 0; var23 < this.field540; var23++) {
			int var24 = var5.g1();
			if (var24 == 1) {
				var18 = var4.gsmarts() + var21;
				var19 = var4.gsmarts() + var18;
				var20 = var4.gsmarts() + var19;
				var21 = var20;
				this.field541[var23] = var18;
				this.field542[var23] = var19;
				this.field543[var23] = var20;
			}
			if (var24 == 2) {
				var18 = var18;
				var19 = var20;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				this.field541[var23] = var18;
				this.field542[var23] = var19;
				this.field543[var23] = var20;
			}
			if (var24 == 3) {
				var18 = var20;
				var19 = var19;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				this.field541[var23] = var18;
				this.field542[var23] = var19;
				this.field543[var23] = var20;
			}
			if (var24 == 4) {
				int var25 = var18;
				var18 = var19;
				var19 = var25;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				this.field541[var23] = var18;
				this.field542[var23] = var25;
				this.field543[var23] = var20;
			}
		}
		var4.data = var3.field221;
		for (int var26 = 0; var26 < this.field552; var26++) {
			this.field553[var26] = var4.g2();
			this.field554[var26] = var4.g2();
			this.field555[var26] = var4.g2();
		}
	}

	public Model(int arg0, int arg1, Model[] arg2) {
		field530++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.numPoints = 0;
		this.field540 = 0;
		this.field552 = 0;
		this.field551 = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var9 = arg2[var8];
			if (var9 != null) {
				this.numPoints += var9.numPoints;
				this.field540 += var9.field540;
				this.field552 += var9.field552;
				var4 |= var9.field547 != null;
				if (var9.field548 == null) {
					if (this.field551 == -1) {
						this.field551 = var9.field551;
					}
					if (this.field551 != var9.field551) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var9.field549 != null;
				var7 |= var9.field566 != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.field565 = new int[this.numPoints];
		this.field541 = new int[this.field540];
		this.field542 = new int[this.field540];
		this.field543 = new int[this.field540];
		this.field553 = new int[this.field552];
		this.field554 = new int[this.field552];
		this.field555 = new int[this.field552];
		if (var4) {
			this.field547 = new int[this.field540];
		}
		if (var5) {
			this.field548 = new int[this.field540];
		}
		if (var6) {
			this.field549 = new int[this.field540];
		}
		if (var7) {
			this.field566 = new int[this.field540];
		}
		this.field550 = new int[this.field540];
		this.numPoints = 0;
		this.field540 = 0;
		this.field552 = 0;
		for (int var10 = 0; var10 < arg0; var10++) {
			Model var11 = arg2[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.field540; var12++) {
					if (var4) {
						if (var11.field547 == null) {
							this.field547[this.field540] = 0;
						} else {
							this.field547[this.field540] = var11.field547[var12];
						}
					}
					if (var5) {
						if (var11.field548 == null) {
							this.field548[this.field540] = var11.field551;
						} else {
							this.field548[this.field540] = var11.field548[var12];
						}
					}
					if (var6) {
						if (var11.field549 == null) {
							this.field549[this.field540] = 0;
						} else {
							this.field549[this.field540] = var11.field549[var12];
						}
					}
					if (var7 && var11.field566 != null) {
						this.field566[this.field540] = var11.field566[var12];
					}
					this.field550[this.field540] = var11.field550[var12];
					this.field541[this.field540] = this.method128(var11, var11.field541[var12]);
					this.field542[this.field540] = this.method128(var11, var11.field542[var12]);
					this.field543[this.field540] = this.method128(var11, var11.field543[var12]);
					this.field540++;
				}
				for (int var13 = 0; var13 < var11.field552; var13++) {
					this.field553[this.field552] = this.method128(var11, var11.field553[var13]);
					this.field554[this.field552] = this.method128(var11, var11.field554[var13]);
					this.field555[this.field552] = this.method128(var11, var11.field555[var13]);
					this.field552++;
				}
			}
		}
	}

	public Model(boolean arg0, byte arg1, Model[] arg2, int arg3) {
		field530++;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.numPoints = 0;
		this.field540 = 0;
		this.field552 = 0;
		this.field551 = -1;
		if (this.field524 != 72) {
			throw new NullPointerException();
		}
		for (int var9 = 0; var9 < 2; var9++) {
			Model var10 = arg2[var9];
			if (var10 != null) {
				this.numPoints += var10.numPoints;
				this.field540 += var10.field540;
				this.field552 += var10.field552;
				var5 |= var10.field547 != null;
				if (var10.field548 == null) {
					if (this.field551 == -1) {
						this.field551 = var10.field551;
					}
					if (this.field551 != var10.field551) {
						var6 = true;
					}
				} else {
					var6 = true;
				}
				var7 |= var10.field549 != null;
				var8 |= var10.field550 != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.field541 = new int[this.field540];
		this.field542 = new int[this.field540];
		this.field543 = new int[this.field540];
		this.field544 = new int[this.field540];
		this.field545 = new int[this.field540];
		this.field546 = new int[this.field540];
		this.field553 = new int[this.field552];
		this.field554 = new int[this.field552];
		this.field555 = new int[this.field552];
		if (var5) {
			this.field547 = new int[this.field540];
		}
		if (var6) {
			this.field548 = new int[this.field540];
		}
		if (var7) {
			this.field549 = new int[this.field540];
		}
		if (var8) {
			this.field550 = new int[this.field540];
		}
		this.numPoints = 0;
		this.field540 = 0;
		this.field552 = 0;
		for (int var11 = 0; var11 < 2; var11++) {
			Model var12 = arg2[var11];
			if (var12 != null) {
				int var13 = this.numPoints;
				for (int var14 = 0; var14 < var12.numPoints; var14++) {
					this.pointX[this.numPoints] = var12.pointX[var14];
					this.pointY[this.numPoints] = var12.pointY[var14];
					this.pointZ[this.numPoints] = var12.pointZ[var14];
					this.numPoints++;
				}
				for (int var15 = 0; var15 < var12.field540; var15++) {
					this.field541[this.field540] = var12.field541[var15] + var13;
					this.field542[this.field540] = var12.field542[var15] + var13;
					this.field543[this.field540] = var12.field543[var15] + var13;
					this.field544[this.field540] = var12.field544[var15];
					this.field545[this.field540] = var12.field545[var15];
					this.field546[this.field540] = var12.field546[var15];
					if (var5) {
						if (var12.field547 == null) {
							this.field547[this.field540] = 0;
						} else {
							this.field547[this.field540] = var12.field547[var15];
						}
					}
					if (var6) {
						if (var12.field548 == null) {
							this.field548[this.field540] = var12.field551;
						} else {
							this.field548[this.field540] = var12.field548[var15];
						}
					}
					if (var7) {
						if (var12.field549 == null) {
							this.field549[this.field540] = 0;
						} else {
							this.field549[this.field540] = var12.field549[var15];
						}
					}
					if (var8 && var12.field550 != null) {
						this.field550[this.field540] = var12.field550[var15];
					}
					this.field540++;
				}
				for (int var16 = 0; var16 < var12.field552; var16++) {
					this.field553[this.field552] = var12.field553[var16] + var13;
					this.field554[this.field552] = var12.field554[var16] + var13;
					this.field555[this.field552] = var12.field555[var16] + var13;
					this.field552++;
				}
			}
		}
		this.calcBoundingCylinder();
	}

	public Model(boolean arg0, boolean arg1, Model arg2, boolean arg3, boolean arg4) {
		field530++;
		this.numPoints = arg2.numPoints;
		this.field540 = arg2.field540;
		this.field552 = arg2.field552;
		if (arg4) {
			this.pointX = arg2.pointX;
			this.pointY = arg2.pointY;
			this.pointZ = arg2.pointZ;
		} else {
			this.pointX = new int[this.numPoints];
			this.pointY = new int[this.numPoints];
			this.pointZ = new int[this.numPoints];
			for (int var6 = 0; var6 < this.numPoints; var6++) {
				this.pointX[var6] = arg2.pointX[var6];
				this.pointY[var6] = arg2.pointY[var6];
				this.pointZ[var6] = arg2.pointZ[var6];
			}
		}
		if (arg0) {
			this.field550 = arg2.field550;
		} else {
			this.field550 = new int[this.field540];
			for (int var7 = 0; var7 < this.field540; var7++) {
				this.field550[var7] = arg2.field550[var7];
			}
		}
		if (arg1) {
			this.field549 = arg2.field549;
		} else {
			this.field549 = new int[this.field540];
			if (arg2.field549 == null) {
				for (int var8 = 0; var8 < this.field540; var8++) {
					this.field549[var8] = 0;
				}
			} else {
				for (int var9 = 0; var9 < this.field540; var9++) {
					this.field549[var9] = arg2.field549[var9];
				}
			}
		}
		this.field565 = arg2.field565;
		this.field566 = arg2.field566;
		this.field547 = arg2.field547;
		this.field541 = arg2.field541;
		this.field542 = arg2.field542;
		this.field543 = arg2.field543;
		this.field548 = arg2.field548;
		this.field551 = arg2.field551;
		this.field553 = arg2.field553;
		this.field554 = arg2.field554;
		this.field555 = arg2.field555;
	}

	public Model(boolean arg0, byte arg1, Model arg2, boolean arg3) {
		field530++;
		this.numPoints = arg2.numPoints;
		this.field540 = arg2.field540;
		this.field552 = arg2.field552;
		if (arg3) {
			this.pointY = new int[this.numPoints];
			for (int var5 = 0; var5 < this.numPoints; var5++) {
				this.pointY[var5] = arg2.pointY[var5];
			}
		} else {
			this.pointY = arg2.pointY;
		}
		if (arg0) {
			this.field544 = new int[this.field540];
			this.field545 = new int[this.field540];
			this.field546 = new int[this.field540];
			for (int var6 = 0; var6 < this.field540; var6++) {
				this.field544[var6] = arg2.field544[var6];
				this.field545[var6] = arg2.field545[var6];
				this.field546[var6] = arg2.field546[var6];
			}
			this.field547 = new int[this.field540];
			if (arg2.field547 == null) {
				for (int var7 = 0; var7 < this.field540; var7++) {
					this.field547[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < this.field540; var8++) {
					this.field547[var8] = arg2.field547[var8];
				}
			}
			super.field393 = new PointNormal[this.numPoints];
			for (int var9 = 0; var9 < this.numPoints; var9++) {
				PointNormal var10 = super.field393[var9] = new PointNormal();
				PointNormal var11 = arg2.field393[var9];
				var10.field240 = var11.field240;
				var10.field241 = var11.field241;
				var10.field242 = var11.field242;
				var10.field243 = var11.field243;
			}
			this.field570 = arg2.field570;
		} else {
			this.field544 = arg2.field544;
			this.field545 = arg2.field545;
			this.field546 = arg2.field546;
			this.field547 = arg2.field547;
		}
		this.pointX = arg2.pointX;
		this.pointZ = arg2.pointZ;
		this.field550 = arg2.field550;
		this.field549 = arg2.field549;
		this.field548 = arg2.field548;
		this.field551 = arg2.field551;
		this.field541 = arg2.field541;
		this.field542 = arg2.field542;
		this.field543 = arg2.field543;
		this.field553 = arg2.field553;
		this.field554 = arg2.field554;
		if (this.field524 != 72) {
			this.field522 = !this.field522;
		}
		this.field555 = arg2.field555;
		super.minY = arg2.minY;
		this.field561 = arg2.field561;
		this.field560 = arg2.field560;
		this.field563 = arg2.field563;
		this.field562 = arg2.field562;
		this.field556 = arg2.field556;
		this.field558 = arg2.field558;
		this.field559 = arg2.field559;
		this.field557 = arg2.field557;
	}

	@ObfuscatedName("eb.a(ILeb;Z)V")
	public void set(Model arg0, boolean arg1) {
		this.numPoints = arg0.numPoints;
		this.field540 = arg0.field540;
		this.field552 = arg0.field552;
		if (field532.length < this.numPoints) {
			field532 = new int[this.numPoints + 100];
			field533 = new int[this.numPoints + 100];
			field534 = new int[this.numPoints + 100];
		}
		this.pointX = field532;
		this.pointY = field533;
		this.pointZ = field534;
		for (int var3 = 0; var3 < this.numPoints; var3++) {
			this.pointX[var3] = arg0.pointX[var3];
			this.pointY[var3] = arg0.pointY[var3];
			this.pointZ[var3] = arg0.pointZ[var3];
		}
		if (arg1) {
			this.field549 = arg0.field549;
		} else {
			if (field535.length < this.field540) {
				field535 = new int[this.field540 + 100];
			}
			this.field549 = field535;
			if (arg0.field549 == null) {
				for (int var4 = 0; var4 < this.field540; var4++) {
					this.field549[var4] = 0;
				}
			} else {
				for (int var5 = 0; var5 < this.field540; var5++) {
					this.field549[var5] = arg0.field549[var5];
				}
			}
		}
		this.field547 = arg0.field547;
		this.field550 = arg0.field550;
		this.field548 = arg0.field548;
		this.field551 = arg0.field551;
		this.labelFaces = arg0.labelFaces;
		this.labelVertices = arg0.labelVertices;
		this.field541 = arg0.field541;
		this.field542 = arg0.field542;
		this.field543 = arg0.field543;
		this.field544 = arg0.field544;
		this.field545 = arg0.field545;
		this.field546 = arg0.field546;
		this.field553 = arg0.field553;
		this.field554 = arg0.field554;
		this.field555 = arg0.field555;
	}

	@ObfuscatedName("eb.a(Leb;I)I")
	public int method128(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < this.numPoints; var7++) {
			if (var4 == this.pointX[var7] && var5 == this.pointY[var7] && var6 == this.pointZ[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.pointX[this.numPoints] = var4;
			this.pointY[this.numPoints] = var5;
			this.pointZ[this.numPoints] = var6;
			if (arg0.field565 != null) {
				this.field565[this.numPoints] = arg0.field565[arg1];
			}
			var3 = this.numPoints++;
		}
		return var3;
	}

	@ObfuscatedName("eb.b(I)V")
	public void calcBoundingCylinder() {
		super.minY = 0;
		this.field560 = 0;
		this.field561 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			int var3 = this.pointY[var1];
			int var4 = this.pointZ[var1];
			if (-var3 > super.minY) {
				super.minY = -var3;
			}
			if (var3 > this.field561) {
				this.field561 = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > this.field560) {
				this.field560 = var5;
			}
		}
		this.field560 = (int) (Math.sqrt((double) this.field560) + 0.99D);
		this.field563 = (int) (Math.sqrt((double) (this.field560 * this.field560 + super.minY * super.minY)) + 0.99D);
		this.field562 = this.field563 + (int) (Math.sqrt((double) (this.field560 * this.field560 + this.field561 * this.field561)) + 0.99D);
	}

	@ObfuscatedName("eb.c(I)V")
	public void recalcBoundingCylinder() {
		super.minY = 0;
		this.field561 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointY[var1];
			if (-var2 > super.minY) {
				super.minY = -var2;
			}
			if (var2 > this.field561) {
				this.field561 = var2;
			}
		}
		this.field563 = (int) (Math.sqrt((double) (this.field560 * this.field560 + super.minY * super.minY)) + 0.99D);
		this.field562 = this.field563 + (int) (Math.sqrt((double) (this.field560 * this.field560 + this.field561 * this.field561)) + 0.99D);
	}

	@ObfuscatedName("eb.d(I)V")
	public void method131() {
		super.minY = 0;
		this.field560 = 0;
		this.field561 = 0;
		this.field556 = 999999;
		this.field557 = -999999;
		this.field558 = -99999;
		this.field559 = 99999;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			int var3 = this.pointY[var1];
			int var4 = this.pointZ[var1];
			if (var2 < this.field556) {
				this.field556 = var2;
			}
			if (var2 > this.field557) {
				this.field557 = var2;
			}
			if (var4 < this.field559) {
				this.field559 = var4;
			}
			if (var4 > this.field558) {
				this.field558 = var4;
			}
			if (-var3 > super.minY) {
				super.minY = -var3;
			}
			if (var3 > this.field561) {
				this.field561 = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > this.field560) {
				this.field560 = var5;
			}
		}
		this.field560 = (int) Math.sqrt((double) this.field560);
		this.field563 = (int) Math.sqrt((double) (this.field560 * this.field560 + super.minY * super.minY));
		this.field562 = this.field563 + (int) Math.sqrt((double) (this.field560 * this.field560 + this.field561 * this.field561));
	}

	@ObfuscatedName("eb.e(I)V")
	public void prepareAnim() {
		int var10002;
		if (this.field565 != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < this.numPoints; var3++) {
				int var4 = this.field565[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.labelVertices = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				this.labelVertices[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.numPoints) {
				int var7 = this.field565[var6];
				this.labelVertices[var7][var1[var7]++] = var6++;
			}
			this.field565 = null;
		}
		if (this.field566 == null) {
			return;
		}
		int[] var8 = new int[256];
		int var9 = 0;
		for (int var10 = 0; var10 < this.field540; var10++) {
			int var11 = this.field566[var10];
			var10002 = var8[var11]++;
			if (var11 > var9) {
				var9 = var11;
			}
		}
		this.labelFaces = new int[var9 + 1][];
		for (int var12 = 0; var12 <= var9; var12++) {
			this.labelFaces[var12] = new int[var8[var12]];
			var8[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.field540) {
			int var14 = this.field566[var13];
			this.labelFaces[var14][var8[var14]++] = var13++;
		}
		this.field566 = null;
	}

	@ObfuscatedName("eb.c(II)V")
	public void animate(int arg0) {
		if (this.labelVertices == null || arg0 == -1) {
			return;
		}
		AnimFrame var2 = AnimFrame.get(arg0);
		if (var2 == null) {
			return;
		}
		AnimBase var3 = var2.base;
		field591 = 0;
		field592 = 0;
		field593 = 0;
		for (int var4 = 0; var4 < var2.size; var4++) {
			int var5 = var2.ti[var4];
			this.method135(var3.type[var5], var3.labels[var5], var2.tx[var4], var2.ty[var4], var2.tz[var4]);
		}
	}

	@ObfuscatedName("eb.a(I[III)V")
	public void maskAnimate(int[] arg0, int arg1, int arg2) {
		if (arg1 == -1) {
			return;
		}
		if (arg0 == null || arg2 == -1) {
			this.animate(arg1);
			return;
		}
		AnimFrame var4 = AnimFrame.get(arg1);
		if (var4 == null) {
			return;
		}
		AnimFrame var5 = AnimFrame.get(arg2);
		if (var5 == null) {
			this.animate(arg1);
			return;
		}
		AnimBase var6 = var4.base;
		field591 = 0;
		field592 = 0;
		field593 = 0;
		byte var7 = 0;
		int var15 = var7 + 1;
		int var8 = arg0[0];
		for (int var9 = 0; var9 < var4.size; var9++) {
			int var10 = var4.ti[var9];
			while (var10 > var8) {
				var8 = arg0[var15++];
			}
			if (var10 != var8 || var6.type[var10] == 0) {
				this.method135(var6.type[var10], var6.labels[var10], var4.tx[var9], var4.ty[var9], var4.tz[var9]);
			}
		}
		field591 = 0;
		field592 = 0;
		field593 = 0;
		byte var11 = 0;
		int var16 = var11 + 1;
		int var12 = arg0[0];
		for (int var13 = 0; var13 < var5.size; var13++) {
			int var14 = var5.ti[var13];
			while (var14 > var12) {
				var12 = arg0[var16++];
			}
			if (var14 == var12 || var6.type[var14] == 0) {
				this.method135(var6.type[var14], var6.labels[var14], var5.tx[var13], var5.ty[var13], var5.tz[var13]);
			}
		}
	}

	@ObfuscatedName("eb.a(I[IIII)V")
	public void method135(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field591 = 0;
			field592 = 0;
			field593 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.labelVertices.length) {
					int[] var10 = this.labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field591 += this.pointX[var12];
						field592 += this.pointY[var12];
						field593 += this.pointZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field591 = field591 / var7 + arg2;
				field592 = field592 / var7 + arg3;
				field593 = field593 / var7 + arg4;
			} else {
				field591 = arg2;
				field592 = arg3;
				field593 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.labelVertices.length) {
					int[] var15 = this.labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.pointX[var17] += arg2;
						this.pointY[var17] += arg3;
						this.pointZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.labelVertices.length) {
					int[] var20 = this.labelVertices[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.pointX[var22] -= field591;
						this.pointY[var22] -= field592;
						this.pointZ[var22] -= field593;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = field599[var25];
							int var27 = field600[var25];
							int var28 = this.pointY[var22] * var26 + this.pointX[var22] * var27 >> 16;
							this.pointY[var22] = this.pointY[var22] * var27 - this.pointX[var22] * var26 >> 16;
							this.pointX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = field599[var23];
							int var30 = field600[var23];
							int var31 = this.pointY[var22] * var30 - this.pointZ[var22] * var29 >> 16;
							this.pointZ[var22] = this.pointY[var22] * var29 + this.pointZ[var22] * var30 >> 16;
							this.pointY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = field599[var24];
							int var33 = field600[var24];
							int var34 = this.pointZ[var22] * var32 + this.pointX[var22] * var33 >> 16;
							this.pointZ[var22] = this.pointZ[var22] * var33 - this.pointX[var22] * var32 >> 16;
							this.pointX[var22] = var34;
						}
						this.pointX[var22] += field591;
						this.pointY[var22] += field592;
						this.pointZ[var22] += field593;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.labelVertices.length) {
					int[] var37 = this.labelVertices[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.pointX[var39] -= field591;
						this.pointY[var39] -= field592;
						this.pointZ[var39] -= field593;
						this.pointX[var39] = this.pointX[var39] * arg2 / 128;
						this.pointY[var39] = this.pointY[var39] * arg3 / 128;
						this.pointZ[var39] = this.pointZ[var39] * arg4 / 128;
						this.pointX[var39] += field591;
						this.pointY[var39] += field592;
						this.pointZ[var39] += field593;
					}
				}
			}
		} else if (arg0 == 5 && (this.labelFaces != null && this.field549 != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.labelFaces.length) {
					int[] var42 = this.labelFaces[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						this.field549[var44] += arg2 * 8;
						if (this.field549[var44] < 0) {
							this.field549[var44] = 0;
						}
						if (this.field549[var44] > 255) {
							this.field549[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.b(B)V")
	public void rotate90() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			this.pointX[var1] = this.pointZ[var1];
			this.pointZ[var1] = -var2;
		}
	}

	@ObfuscatedName("eb.a(BI)V")
	public void method137(int arg0) {
		int var2 = field599[arg0];
		int var3 = field600[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var3 - this.pointZ[var4] * var2 >> 16;
			this.pointZ[var4] = this.pointY[var4] * var2 + this.pointZ[var4] * var3 >> 16;
			this.pointY[var4] = var5;
		}
	}

	@ObfuscatedName("eb.a(IIBI)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] += arg0;
			this.pointY[var4] += arg1;
			this.pointZ[var4] += arg2;
		}
	}

	@ObfuscatedName("eb.d(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field540; var3++) {
			if (this.field550[var3] == arg0) {
				this.field550[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("eb.f(I)V")
	public void mirror() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointZ[var1] = -this.pointZ[var1];
		}
		for (int var2 = 0; var2 < this.field540; var2++) {
			int var3 = this.field541[var2];
			this.field541[var2] = this.field543[var2];
			this.field543[var2] = var3;
		}
	}

	@ObfuscatedName("eb.a(IIII)V")
	public void resize(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] = this.pointX[var4] * arg1 / 128;
			this.pointY[var4] = this.pointY[var4] * arg2 / 128;
			this.pointZ[var4] = this.pointZ[var4] * arg0 / 128;
		}
	}

	@ObfuscatedName("eb.a(IIIIIZ)V")
	public void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int var8 = arg1 * var7 >> 8;
		if (this.field544 == null) {
			this.field544 = new int[this.field540];
			this.field545 = new int[this.field540];
			this.field546 = new int[this.field540];
		}
		if (super.field393 == null) {
			super.field393 = new PointNormal[this.numPoints];
			for (int var9 = 0; var9 < this.numPoints; var9++) {
				super.field393[var9] = new PointNormal();
			}
		}
		for (int var10 = 0; var10 < this.field540; var10++) {
			int var11 = this.field541[var10];
			int var12 = this.field542[var10];
			int var13 = this.field543[var10];
			int var14 = this.pointX[var12] - this.pointX[var11];
			int var15 = this.pointY[var12] - this.pointY[var11];
			int var16 = this.pointZ[var12] - this.pointZ[var11];
			int var17 = this.pointX[var13] - this.pointX[var11];
			int var18 = this.pointY[var13] - this.pointY[var11];
			int var19 = this.pointZ[var13] - this.pointZ[var11];
			int var20 = var15 * var19 - var18 * var16;
			int var21 = var16 * var17 - var19 * var14;
			int var22;
			for (var22 = var14 * var18 - var17 * var15; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 0x1) {
				var20 >>= 0x1;
				var21 >>= 0x1;
			}
			int var23 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + var22 * var22));
			if (var23 <= 0) {
				var23 = 1;
			}
			int var24 = var20 * 256 / var23;
			int var25 = var21 * 256 / var23;
			int var26 = var22 * 256 / var23;
			if (this.field547 == null || (this.field547[var10] & 0x1) == 0) {
				PointNormal var27 = super.field393[var11];
				var27.field240 += var24;
				var27.field241 += var25;
				var27.field242 += var26;
				var27.field243++;
				PointNormal var28 = super.field393[var12];
				var28.field240 += var24;
				var28.field241 += var25;
				var28.field242 += var26;
				var28.field243++;
				PointNormal var29 = super.field393[var13];
				var29.field240 += var24;
				var29.field241 += var25;
				var29.field242 += var26;
				var29.field243++;
			} else {
				int var30 = arg0 + (arg2 * var24 + arg3 * var25 + arg4 * var26) / (var8 + var8 / 2);
				this.field544[var10] = method144(this.field550[var10], var30, this.field547[var10]);
			}
		}
		if (arg5) {
			this.method143(arg0, var8, arg2, arg3, arg4);
		} else {
			this.field570 = new PointNormal[this.numPoints];
			for (int var31 = 0; var31 < this.numPoints; var31++) {
				PointNormal var32 = super.field393[var31];
				PointNormal var33 = this.field570[var31] = new PointNormal();
				var33.field240 = var32.field240;
				var33.field241 = var32.field241;
				var33.field242 = var32.field242;
				var33.field243 = var32.field243;
			}
		}
		if (arg5) {
			this.calcBoundingCylinder();
		} else {
			this.method131();
		}
	}

	@ObfuscatedName("eb.a(IIIII)V")
	public void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.field540; var6++) {
			int var7 = this.field541[var6];
			int var8 = this.field542[var6];
			int var9 = this.field543[var6];
			if (this.field547 == null) {
				int var10 = this.field550[var6];
				PointNormal var11 = super.field393[var7];
				int var12 = arg0 + (arg2 * var11.field240 + arg3 * var11.field241 + arg4 * var11.field242) / (arg1 * var11.field243);
				this.field544[var6] = method144(var10, var12, 0);
				PointNormal var13 = super.field393[var8];
				int var14 = arg0 + (arg2 * var13.field240 + arg3 * var13.field241 + arg4 * var13.field242) / (arg1 * var13.field243);
				this.field545[var6] = method144(var10, var14, 0);
				PointNormal var15 = super.field393[var9];
				int var16 = arg0 + (arg2 * var15.field240 + arg3 * var15.field241 + arg4 * var15.field242) / (arg1 * var15.field243);
				this.field546[var6] = method144(var10, var16, 0);
			} else if ((this.field547[var6] & 0x1) == 0) {
				int var17 = this.field550[var6];
				int var18 = this.field547[var6];
				PointNormal var19 = super.field393[var7];
				int var20 = arg0 + (arg2 * var19.field240 + arg3 * var19.field241 + arg4 * var19.field242) / (arg1 * var19.field243);
				this.field544[var6] = method144(var17, var20, var18);
				PointNormal var21 = super.field393[var8];
				int var22 = arg0 + (arg2 * var21.field240 + arg3 * var21.field241 + arg4 * var21.field242) / (arg1 * var21.field243);
				this.field545[var6] = method144(var17, var22, var18);
				PointNormal var23 = super.field393[var9];
				int var24 = arg0 + (arg2 * var23.field240 + arg3 * var23.field241 + arg4 * var23.field242) / (arg1 * var23.field243);
				this.field546[var6] = method144(var17, var24, var18);
			}
		}
		super.field393 = null;
		this.field570 = null;
		this.field565 = null;
		this.field566 = null;
		if (this.field547 != null) {
			for (int var25 = 0; var25 < this.field540; var25++) {
				if ((this.field547[var25] & 0x2) == 2) {
					return;
				}
			}
		}
		this.field550 = null;
	}

	@ObfuscatedName("eb.a(IIIIIII)V")
	public void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int var9 = field599[0];
		int var10 = field600[0];
		int var11 = field599[arg0];
		int var12 = field600[arg0];
		int var13 = field599[arg1];
		int var14 = field600[arg1];
		int var15 = field599[arg2];
		int var16 = field600[arg2];
		int var17 = arg4 * var15 + arg5 * var16 >> 16;
		for (int var18 = 0; var18 < this.numPoints; var18++) {
			int var19 = this.pointX[var18];
			int var20 = this.pointY[var18];
			int var21 = this.pointZ[var18];
			if (arg1 != 0) {
				int var22 = var20 * var13 + var19 * var14 >> 16;
				var20 = var20 * var14 - var19 * var13 >> 16;
				var19 = var22;
			}
			if (arg0 != 0) {
				int var23 = var21 * var11 + var19 * var12 >> 16;
				var21 = var21 * var12 - var19 * var11 >> 16;
				var19 = var23;
			}
			int var24 = var19 + arg3;
			int var25 = var20 + arg4;
			int var26 = var21 + arg5;
			int var27 = var25 * var16 - var26 * var15 >> 16;
			int var28 = var25 * var15 + var26 * var16 >> 16;
			field577[var18] = var28 - var17;
			field575[var18] = var7 + (var24 << 9) / var28;
			field576[var18] = var8 + (var27 << 9) / var28;
			if (this.field552 > 0) {
				field578[var18] = var24;
				field579[var18] = var27;
				field580[var18] = var28;
			}
		}
		try {
			this.method146(false, false, 0);
		} catch (Exception var29) {
		}
	}

	@ObfuscatedName("eb.a(IIIIIIIII)V")
	@Override
	public void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var11 = arg6 * arg1 + var10 * arg2 >> 16;
		int var12 = this.field560 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg7 * arg3 + arg5 * arg4 >> 16;
		int var15 = var14 - this.field560 << 9;
		if (var15 / var13 >= Pix2D.maxX) {
			return;
		}
		int var16 = var14 + this.field560 << 9;
		if (var16 / var13 <= -Pix2D.maxX) {
			return;
		}
		int var17 = arg6 * arg2 - var10 * arg1 >> 16;
		int var18 = this.field560 * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= -Pix2D.maxY) {
			return;
		}
		int var20 = var18 + (super.minY * arg2 >> 16);
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix2D.maxY) {
			return;
		}
		int var22 = var12 + (super.minY * arg1 >> 16);
		boolean var23 = false;
		if (var11 - var22 <= 50) {
			var23 = true;
		}
		boolean var24 = false;
		if (arg8 > 0 && field594) {
			int var25 = var11 - var12;
			if (var25 <= 50) {
				var25 = 50;
			}
			int var26;
			int var27;
			if (var14 > 0) {
				var26 = var15 / var13;
				var27 = var16 / var25;
			} else {
				var27 = var16 / var13;
				var26 = var15 / var25;
			}
			int var28;
			int var29;
			if (var17 > 0) {
				var28 = var21 / var13;
				var29 = var19 / var25;
			} else {
				var29 = var19 / var13;
				var28 = var21 / var25;
			}
			int var30 = field595 - Pix3D.originX;
			int var31 = field596 - Pix3D.originY;
			if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
				if (this.useAABBMouseCheck) {
					field598[field597++] = arg8;
				} else {
					var24 = true;
				}
			}
		}
		int var32 = Pix3D.originX;
		int var33 = Pix3D.originY;
		int var34 = 0;
		int var35 = 0;
		if (arg0 != 0) {
			var34 = field599[arg0];
			var35 = field600[arg0];
		}
		for (int var36 = 0; var36 < this.numPoints; var36++) {
			int var37 = this.pointX[var36];
			int var38 = this.pointY[var36];
			int var39 = this.pointZ[var36];
			if (arg0 != 0) {
				int var40 = var39 * var34 + var37 * var35 >> 16;
				var39 = var39 * var35 - var37 * var34 >> 16;
				var37 = var40;
			}
			int var41 = var37 + arg5;
			int var42 = var38 + arg6;
			int var43 = var39 + arg7;
			int var44 = var43 * arg3 + var41 * arg4 >> 16;
			int var45 = var43 * arg4 - var41 * arg3 >> 16;
			int var47 = var42 * arg2 - var45 * arg1 >> 16;
			int var48 = var42 * arg1 + var45 * arg2 >> 16;
			field577[var36] = var48 - var11;
			if (var48 >= 50) {
				field575[var36] = var32 + (var44 << 9) / var48;
				field576[var36] = var33 + (var47 << 9) / var48;
			} else {
				field575[var36] = -5000;
				var23 = true;
			}
			if (var23 || this.field552 > 0) {
				field578[var36] = var44;
				field579[var36] = var47;
				field580[var36] = var48;
			}
		}
		try {
			this.method146(var23, var24, arg8);
		} catch (Exception var49) {
		}
	}

	@ObfuscatedName("eb.a(ZZI)V")
	public void method146(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < this.field562; var4++) {
			field581[var4] = 0;
		}
		for (int var5 = 0; var5 < this.field540; var5++) {
			if (this.field547 == null || this.field547[var5] != -1) {
				int var6 = this.field541[var5];
				int var7 = this.field542[var5];
				int var8 = this.field543[var5];
				int var9 = field575[var6];
				int var10 = field575[var7];
				int var11 = field575[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					field574[var5] = true;
					int var12 = (field577[var6] + field577[var7] + field577[var8]) / 3 + this.field563;
					field582[var12][field581[var12]++] = var5;
				} else {
					if (arg1 && this.method149(field595, field596, field576[var6], field576[var7], field576[var8], var9, var10, var11)) {
						field598[field597++] = arg2;
						arg1 = false;
					}
					if ((var9 - var10) * (field576[var8] - field576[var7]) - (field576[var6] - field576[var7]) * (var11 - var10) > 0) {
						field574[var5] = false;
						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.sizeX && var10 <= Pix2D.sizeX && var11 <= Pix2D.sizeX) {
							field573[var5] = false;
						} else {
							field573[var5] = true;
						}
						int var13 = (field577[var6] + field577[var7] + field577[var8]) / 3 + this.field563;
						field582[var13][field581[var13]++] = var5;
					}
				}
			}
		}
		if (this.field548 == null) {
			for (int var14 = this.field562 - 1; var14 >= 0; var14--) {
				int var15 = field581[var14];
				if (var15 > 0) {
					int[] var16 = field582[var14];
					for (int var17 = 0; var17 < var15; var17++) {
						this.method147(var16[var17]);
					}
				}
			}
			return;
		}
		for (int var18 = 0; var18 < 12; var18++) {
			field583[var18] = 0;
			field587[var18] = 0;
		}
		for (int var19 = this.field562 - 1; var19 >= 0; var19--) {
			int var20 = field581[var19];
			if (var20 > 0) {
				int[] var21 = field582[var19];
				for (int var22 = 0; var22 < var20; var22++) {
					int var23 = var21[var22];
					int var24 = this.field548[var23];
					int var25 = field583[var24]++;
					field584[var24][var25] = var23;
					if (var24 < 10) {
						field587[var24] += var19;
					} else if (var24 == 10) {
						field585[var25] = var19;
					} else {
						field586[var25] = var19;
					}
				}
			}
		}
		int var26 = 0;
		if (field583[1] > 0 || field583[2] > 0) {
			var26 = (field587[1] + field587[2]) / (field583[1] + field583[2]);
		}
		int var27 = 0;
		if (field583[3] > 0 || field583[4] > 0) {
			var27 = (field587[3] + field587[4]) / (field583[3] + field583[4]);
		}
		int var28 = 0;
		if (field583[6] > 0 || field583[8] > 0) {
			var28 = (field587[6] + field587[8]) / (field583[6] + field583[8]);
		}
		int var29 = 0;
		int var30 = field583[10];
		int[] var31 = field584[10];
		int[] var32 = field585;
		if (var30 == 0) {
			var29 = 0;
			var30 = field583[11];
			var31 = field584[11];
			var32 = field586;
		}
		int var33;
		if (var30 > 0) {
			var33 = var32[0];
		} else {
			var33 = -1000;
		}
		for (int var34 = 0; var34 < 10; var34++) {
			while (var34 == 0 && var33 > var26) {
				this.method147(var31[var29++]);
				if (var29 == var30 && var31 != field584[11]) {
					var29 = 0;
					var30 = field583[11];
					var31 = field584[11];
					var32 = field586;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 3 && var33 > var27) {
				this.method147(var31[var29++]);
				if (var29 == var30 && var31 != field584[11]) {
					var29 = 0;
					var30 = field583[11];
					var31 = field584[11];
					var32 = field586;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 5 && var33 > var28) {
				this.method147(var31[var29++]);
				if (var29 == var30 && var31 != field584[11]) {
					var29 = 0;
					var30 = field583[11];
					var31 = field584[11];
					var32 = field586;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			int var35 = field583[var34];
			int[] var36 = field584[var34];
			for (int var37 = 0; var37 < var35; var37++) {
				this.method147(var36[var37]);
			}
		}
		while (var33 != -1000) {
			this.method147(var31[var29++]);
			if (var29 == var30 && var31 != field584[11]) {
				var29 = 0;
				var31 = field584[11];
				var30 = field583[11];
				var32 = field586;
			}
			if (var29 < var30) {
				var33 = var32[var29];
			} else {
				var33 = -1000;
			}
		}
	}

	@ObfuscatedName("eb.g(I)V")
	public void method147(int arg0) {
		if (field574[arg0]) {
			this.method148(arg0);
			return;
		}
		int var2 = this.field541[arg0];
		int var3 = this.field542[arg0];
		int var4 = this.field543[arg0];
		Pix3D.hclip = field573[arg0];
		if (this.field549 == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = this.field549[arg0];
		}
		int var5;
		if (this.field547 == null) {
			var5 = 0;
		} else {
			var5 = this.field547[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.gouraudTriangle(field576[var2], field576[var3], field576[var4], field575[var2], field575[var3], field575[var4], this.field544[arg0], this.field545[arg0], this.field546[arg0]);
		} else if (var5 == 1) {
			Pix3D.flatTriangle(field576[var2], field576[var3], field576[var4], field575[var2], field575[var3], field575[var4], field601[this.field544[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.field547[arg0] >> 2;
			int var7 = this.field553[var6];
			int var8 = this.field554[var6];
			int var9 = this.field555[var6];
			Pix3D.textureTriangle(field576[var2], field576[var3], field576[var4], field575[var2], field575[var3], field575[var4], this.field544[arg0], this.field545[arg0], this.field546[arg0], field578[var7], field578[var8], field578[var9], field579[var7], field579[var8], field579[var9], field580[var7], field580[var8], field580[var9], this.field550[arg0]);
		} else if (var5 == 3) {
			int var10 = this.field547[arg0] >> 2;
			int var11 = this.field553[var10];
			int var12 = this.field554[var10];
			int var13 = this.field555[var10];
			Pix3D.textureTriangle(field576[var2], field576[var3], field576[var4], field575[var2], field575[var3], field575[var4], this.field544[arg0], this.field544[arg0], this.field544[arg0], field578[var11], field578[var12], field578[var13], field579[var11], field579[var12], field579[var13], field580[var11], field580[var12], field580[var13], this.field550[arg0]);
		}
	}

	@ObfuscatedName("eb.h(I)V")
	public void method148(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = this.field541[arg0];
		int var6 = this.field542[arg0];
		int var7 = this.field543[arg0];
		int var8 = field580[var5];
		int var9 = field580[var6];
		int var10 = field580[var7];
		if (var8 >= 50) {
			field588[0] = field575[var5];
			field589[0] = field576[var5];
			var4++;
			field590[0] = this.field544[arg0];
		} else {
			int var11 = field578[var5];
			int var12 = field579[var5];
			int var13 = this.field544[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field602[var10 - var8];
				field588[0] = var2 + (var11 + ((field578[var7] - var11) * var14 >> 16) << 9) / 50;
				field589[0] = var3 + (var12 + ((field579[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				field590[0] = var13 + ((this.field546[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field602[var9 - var8];
				field588[var4] = var2 + (var11 + ((field578[var6] - var11) * var15 >> 16) << 9) / 50;
				field589[var4] = var3 + (var12 + ((field579[var6] - var12) * var15 >> 16) << 9) / 50;
				field590[var4++] = var13 + ((this.field545[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			field588[var4] = field575[var6];
			field589[var4] = field576[var6];
			field590[var4++] = this.field545[arg0];
		} else {
			int var16 = field578[var6];
			int var17 = field579[var6];
			int var18 = this.field545[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field602[var8 - var9];
				field588[var4] = var2 + (var16 + ((field578[var5] - var16) * var19 >> 16) << 9) / 50;
				field589[var4] = var3 + (var17 + ((field579[var5] - var17) * var19 >> 16) << 9) / 50;
				field590[var4++] = var18 + ((this.field544[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field602[var10 - var9];
				field588[var4] = var2 + (var16 + ((field578[var7] - var16) * var20 >> 16) << 9) / 50;
				field589[var4] = var3 + (var17 + ((field579[var7] - var17) * var20 >> 16) << 9) / 50;
				field590[var4++] = var18 + ((this.field546[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			field588[var4] = field575[var7];
			field589[var4] = field576[var7];
			field590[var4++] = this.field546[arg0];
		} else {
			int var21 = field578[var7];
			int var22 = field579[var7];
			int var23 = this.field546[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field602[var9 - var10];
				field588[var4] = var2 + (var21 + ((field578[var6] - var21) * var24 >> 16) << 9) / 50;
				field589[var4] = var3 + (var22 + ((field579[var6] - var22) * var24 >> 16) << 9) / 50;
				field590[var4++] = var23 + ((this.field545[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field602[var8 - var10];
				field588[var4] = var2 + (var21 + ((field578[var5] - var21) * var25 >> 16) << 9) / 50;
				field589[var4] = var3 + (var22 + ((field579[var5] - var22) * var25 >> 16) << 9) / 50;
				field590[var4++] = var23 + ((this.field544[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = field588[0];
		int var27 = field588[1];
		int var28 = field588[2];
		int var29 = field589[0];
		int var30 = field589[1];
		int var31 = field589[2];
		if ((var26 - var27) * (var31 - var30) - (var29 - var30) * (var28 - var27) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX) {
				Pix3D.hclip = true;
			}
			int var32;
			if (this.field547 == null) {
				var32 = 0;
			} else {
				var32 = this.field547[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, field590[0], field590[1], field590[2]);
			} else if (var32 == 1) {
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, field601[this.field544[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.field547[arg0] >> 2;
				int var34 = this.field553[var33];
				int var35 = this.field554[var33];
				int var36 = this.field555[var33];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, field590[0], field590[1], field590[2], field578[var34], field578[var35], field578[var36], field579[var34], field579[var35], field579[var36], field580[var34], field580[var35], field580[var36], this.field550[arg0]);
			} else if (var32 == 3) {
				int var37 = this.field547[arg0] >> 2;
				int var38 = this.field553[var37];
				int var39 = this.field554[var37];
				int var40 = this.field555[var37];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.field544[arg0], this.field544[arg0], this.field544[arg0], field578[var38], field578[var39], field578[var40], field579[var38], field579[var39], field579[var40], field580[var38], field580[var39], field580[var40], this.field550[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX || field588[3] < 0 || field588[3] > Pix2D.sizeX) {
			Pix3D.hclip = true;
		}
		int var41;
		if (this.field547 == null) {
			var41 = 0;
		} else {
			var41 = this.field547[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, field590[0], field590[1], field590[2]);
			Pix3D.gouraudTriangle(var29, var31, field589[3], var26, var28, field588[3], field590[0], field590[2], field590[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = field601[this.field544[arg0]];
			Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.flatTriangle(var29, var31, field589[3], var26, var28, field588[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.field547[arg0] >> 2;
			int var44 = this.field553[var43];
			int var45 = this.field554[var43];
			int var46 = this.field555[var43];
			Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, field590[0], field590[1], field590[2], field578[var44], field578[var45], field578[var46], field579[var44], field579[var45], field579[var46], field580[var44], field580[var45], field580[var46], this.field550[arg0]);
			Pix3D.textureTriangle(var29, var31, field589[3], var26, var28, field588[3], field590[0], field590[2], field590[3], field578[var44], field578[var45], field578[var46], field579[var44], field579[var45], field579[var46], field580[var44], field580[var45], field580[var46], this.field550[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.field547[arg0] >> 2;
		int var48 = this.field553[var47];
		int var49 = this.field554[var47];
		int var50 = this.field555[var47];
		Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.field544[arg0], this.field544[arg0], this.field544[arg0], field578[var48], field578[var49], field578[var50], field579[var48], field579[var49], field579[var50], field580[var48], field580[var49], field580[var50], this.field550[arg0]);
		Pix3D.textureTriangle(var29, var31, field589[3], var26, var28, field588[3], this.field544[arg0], this.field544[arg0], this.field544[arg0], field578[var48], field578[var49], field578[var50], field579[var48], field579[var49], field579[var50], field580[var48], field580[var49], field580[var50], this.field550[arg0]);
	}

	@ObfuscatedName("eb.a(IIIIIIII)Z")
	public boolean method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}
}
