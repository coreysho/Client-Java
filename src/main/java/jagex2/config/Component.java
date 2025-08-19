package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import jagex2.jstring.JString;

public class Component {

	@ObfuscatedName("EWIXBTLV.K")
	public static int field728 = -1;

	@ObfuscatedName("EWIXBTLV.T")
	public static int field737 = -1;

	@ObfuscatedName("EWIXBTLV.cb")
	public static LruCache field746 = new LruCache(30);

	@ObfuscatedName("EWIXBTLV.pb")
	public static int field759 = -1;

	@ObfuscatedName("EWIXBTLV.k")
	public byte field702;

	@ObfuscatedName("EWIXBTLV.f")
	public int field697;

	@ObfuscatedName("EWIXBTLV.i")
	public int field700;

	@ObfuscatedName("EWIXBTLV.m")
	public int field704;

	@ObfuscatedName("EWIXBTLV.p")
	public int field707;

	@ObfuscatedName("EWIXBTLV.q")
	public int field708;

	@ObfuscatedName("EWIXBTLV.r")
	public int field709;

	@ObfuscatedName("EWIXBTLV.s")
	public int field710;

	@ObfuscatedName("EWIXBTLV.v")
	public int field713;

	@ObfuscatedName("EWIXBTLV.z")
	public int field717;

	@ObfuscatedName("EWIXBTLV.A")
	public int field718;

	@ObfuscatedName("EWIXBTLV.C")
	public int field720;

	@ObfuscatedName("EWIXBTLV.E")
	public int field722;

	@ObfuscatedName("EWIXBTLV.F")
	public int field723;

	@ObfuscatedName("EWIXBTLV.G")
	public int field724;

	@ObfuscatedName("EWIXBTLV.H")
	public static int field725;

	@ObfuscatedName("EWIXBTLV.I")
	public int field726;

	@ObfuscatedName("EWIXBTLV.M")
	public int field730;

	@ObfuscatedName("EWIXBTLV.P")
	public int field733;

	@ObfuscatedName("EWIXBTLV.Q")
	public int field734;

	@ObfuscatedName("EWIXBTLV.R")
	public int field735;

	@ObfuscatedName("EWIXBTLV.S")
	public int field736;

	@ObfuscatedName("EWIXBTLV.X")
	public int field741;

	@ObfuscatedName("EWIXBTLV.Y")
	public int field742;

	@ObfuscatedName("EWIXBTLV.Z")
	public int field743;

	@ObfuscatedName("EWIXBTLV.bb")
	public int field745;

	@ObfuscatedName("EWIXBTLV.eb")
	public int field748;

	@ObfuscatedName("EWIXBTLV.fb")
	public int field749;

	@ObfuscatedName("EWIXBTLV.sb")
	public static int field762;

	@ObfuscatedName("EWIXBTLV.vb")
	public int field765;

	@ObfuscatedName("EWIXBTLV.wb")
	public int field766;

	@ObfuscatedName("EWIXBTLV.xb")
	public int field767;

	@ObfuscatedName("EWIXBTLV.yb")
	public int field768;

	@ObfuscatedName("EWIXBTLV.zb")
	public int field769;

	@ObfuscatedName("EWIXBTLV.Bb")
	public int field771;

	@ObfuscatedName("EWIXBTLV.e")
	public static Jagfile field696;

	@ObfuscatedName("EWIXBTLV.c")
	public Pix32 field694;

	@ObfuscatedName("EWIXBTLV.J")
	public Pix32 field727;

	@ObfuscatedName("EWIXBTLV.B")
	public PixFont field719;

	@ObfuscatedName("EWIXBTLV.O")
	public static LruCache field732;

	@ObfuscatedName("EWIXBTLV.b")
	public String field693;

	@ObfuscatedName("EWIXBTLV.u")
	public String field712;

	@ObfuscatedName("EWIXBTLV.N")
	public String field731;

	@ObfuscatedName("EWIXBTLV.gb")
	public String field750;

	@ObfuscatedName("EWIXBTLV.tb")
	public String field763;

	@ObfuscatedName("EWIXBTLV.h")
	public boolean field699;

	@ObfuscatedName("EWIXBTLV.j")
	public boolean field701;

	@ObfuscatedName("EWIXBTLV.t")
	public boolean field711;

	@ObfuscatedName("EWIXBTLV.x")
	public boolean field715;

	@ObfuscatedName("EWIXBTLV.D")
	public boolean field721;

	@ObfuscatedName("EWIXBTLV.L")
	public boolean field729;

	@ObfuscatedName("EWIXBTLV.kb")
	public boolean field754;

	@ObfuscatedName("EWIXBTLV.mb")
	public boolean field756;

	@ObfuscatedName("EWIXBTLV.Ab")
	public boolean field770;

	@ObfuscatedName("EWIXBTLV.d")
	public int[] field695;

	@ObfuscatedName("EWIXBTLV.l")
	public int[] field703;

	@ObfuscatedName("EWIXBTLV.o")
	public int[] field706;

	@ObfuscatedName("EWIXBTLV.w")
	public int[] field714;

	@ObfuscatedName("EWIXBTLV.U")
	public int[] field738;

	@ObfuscatedName("EWIXBTLV.W")
	public int[] field740;

	@ObfuscatedName("EWIXBTLV.hb")
	public int[] field751;

	@ObfuscatedName("EWIXBTLV.lb")
	public int[] field755;

	@ObfuscatedName("EWIXBTLV.ob")
	public int[] field758;

	@ObfuscatedName("EWIXBTLV.db")
	public Pix32[] field747;

	@ObfuscatedName("EWIXBTLV.g")
	public static Component[] field698;

	@ObfuscatedName("EWIXBTLV.n")
	public static PixFont[] field705;

	@ObfuscatedName("EWIXBTLV.ab")
	public String[] field744;

	@ObfuscatedName("EWIXBTLV.ub")
	public static byte[][] field764;

	@ObfuscatedName("EWIXBTLV.y")
	public int[][] field716;

	@ObfuscatedName("EWIXBTLV.a(ILjava/lang/String;I)LEPQDEJTO;")
	public static Pix32 method203(int arg0, String arg1) {
		long var3 = (JString.method346(arg1) << 8) + (long) arg0;
		Pix32 var5 = (Pix32) field732.method458(var3);
		if (var5 != null) {
			return var5;
		} else if (field696 == null) {
			return null;
		}
		try {
			Pix32 var6 = new Pix32(field696, arg1, arg0);
			field732.method459(var6, var3);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("EWIXBTLV.a(I)LEWIXBTLV;")
	public static Component method204(int arg0) {
		if (field698[arg0] == null) {
			Packet var1 = new Packet(field764[arg0]);
			int var2 = var1.g2();
			field698[arg0] = method207(var2, var1, arg0);
		}
		return field698[arg0];
	}

	@ObfuscatedName("EWIXBTLV.a(III)V")
	public void method205(int arg0, int arg2) {
		int var4 = this.field751[arg2];
		this.field751[arg2] = this.field751[arg0];
		this.field751[arg0] = var4;
		int var5 = this.field706[arg2];
		this.field706[arg2] = this.field706[arg0];
		this.field706[arg0] = var5;
	}

	@ObfuscatedName("EWIXBTLV.a(II)LLZYQDKJV;")
	public Model method206(int arg0, int arg1) {
		ObjType var3 = null;
		if (arg0 == 4) {
			var3 = ObjType.method221(arg1);
			field762 += var3.field836;
			field725 += var3.field840;
		}
		Model var4 = (Model) field746.method458((long) ((arg0 << 16) + arg1));
		if (var4 != null) {
			return var4;
		}
		if (arg0 == 1) {
			var4 = Model.method359(arg1);
		}
		if (arg0 == 2) {
			var4 = NpcType.method477(arg1).method472();
		}
		if (arg0 == 3) {
			var4 = Client.field463.method572();
		}
		if (arg0 == 4) {
			var4 = var3.method226(50);
		}
		if (arg0 == 5) {
			var4 = null;
		}
		if (var4 != null) {
			field746.method459(var4, (long) ((arg0 << 16) + arg1));
		}
		return var4;
	}

	@ObfuscatedName("EWIXBTLV.a(ILMFMVIYHT;II)LEWIXBTLV;")
	public static Component method207(int arg0, Packet arg1, int arg3) {
		Component var4 = new Component();
		var4.field697 = arg3;
		var4.field730 = arg0;
		var4.field718 = arg1.g1();
		var4.field771 = arg1.g1();
		var4.field724 = arg1.g2();
		var4.field723 = arg1.g2();
		var4.field720 = arg1.g2();
		var4.field702 = (byte) arg1.g1();
		var4.field736 = arg1.g1();
		if (var4.field736 == 0) {
			var4.field736 = -1;
		} else {
			var4.field736 = (var4.field736 - 1 << 8) + arg1.g1();
		}
		if (var4.field724 == 600) {
			field728 = arg0;
		}
		if (var4.field724 == 650) {
			field737 = arg0;
		}
		if (var4.field724 == 655) {
			field759 = arg0;
		}
		int var5 = arg1.g1();
		if (var5 > 0) {
			var4.field755 = new int[var5];
			var4.field738 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				var4.field755[var6] = arg1.g1();
				var4.field738[var6] = arg1.g2();
			}
		}
		int var7 = arg1.g1();
		if (var7 > 0) {
			var4.field716 = new int[var7][];
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.g2();
				var4.field716[var8] = new int[var9];
				for (int var10 = 0; var10 < var9; var10++) {
					var4.field716[var8][var10] = arg1.g2();
				}
			}
		}
		if (var4.field718 == 0) {
			var4.field767 = arg1.g2();
			var4.field701 = arg1.g1() == 1;
			int var11 = arg1.g2();
			var4.field740 = new int[var11];
			var4.field714 = new int[var11];
			var4.field758 = new int[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				var4.field740[var12] = arg1.g2();
				var4.field714[var12] = arg1.g2b();
				var4.field758[var12] = arg1.g2b();
			}
		}
		if (var4.field718 == 1) {
			var4.field707 = arg1.g2();
			var4.field715 = arg1.g1() == 1;
		}
		if (var4.field718 == 2) {
			var4.field751 = new int[var4.field723 * var4.field720];
			var4.field706 = new int[var4.field723 * var4.field720];
			var4.field756 = arg1.g1() == 1;
			var4.field711 = arg1.g1() == 1;
			var4.field770 = arg1.g1() == 1;
			var4.field699 = arg1.g1() == 1;
			var4.field745 = arg1.g1();
			var4.field726 = arg1.g1();
			var4.field703 = new int[20];
			var4.field695 = new int[20];
			var4.field747 = new Pix32[20];
			for (int var13 = 0; var13 < 20; var13++) {
				int var15 = arg1.g1();
				if (var15 == 1) {
					var4.field703[var13] = arg1.g2b();
					var4.field695[var13] = arg1.g2b();
					String var16 = arg1.gjstr();
					if (var16.length() > 0) {
						int var17 = var16.lastIndexOf(",");
						var4.field747[var13] = method203(Integer.parseInt(var16.substring(var17 + 1)), var16.substring(0, var17));
					}
				}
			}
			var4.field744 = new String[5];
			for (int var14 = 0; var14 < 5; var14++) {
				var4.field744[var14] = arg1.gjstr();
				if (var4.field744[var14].length() == 0) {
					var4.field744[var14] = null;
				}
			}
		}
		if (var4.field718 == 3) {
			var4.field721 = arg1.g1() == 1;
		}
		if (var4.field718 == 4 || var4.field718 == 1) {
			var4.field754 = arg1.g1() == 1;
			int var18 = arg1.g1();
			if (field705 != null) {
				var4.field719 = field705[var18];
			}
			var4.field729 = arg1.g1() == 1;
		}
		if (var4.field718 == 4) {
			var4.field712 = arg1.gjstr();
			var4.field731 = arg1.gjstr();
		}
		if (var4.field718 == 1 || var4.field718 == 3 || var4.field718 == 4) {
			var4.field722 = arg1.g4();
		}
		if (var4.field718 == 3 || var4.field718 == 4) {
			var4.field742 = arg1.g4();
			var4.field743 = arg1.g4();
			var4.field708 = arg1.g4();
		}
		if (var4.field718 == 5) {
			String var19 = arg1.gjstr();
			if (var19.length() > 0) {
				int var20 = var19.lastIndexOf(",");
				var4.field694 = method203(Integer.parseInt(var19.substring(var20 + 1)), var19.substring(0, var20));
			}
			String var21 = arg1.gjstr();
			if (var21.length() > 0) {
				int var22 = var21.lastIndexOf(",");
				var4.field727 = method203(Integer.parseInt(var21.substring(var22 + 1)), var21.substring(0, var22));
			}
		}
		if (var4.field718 == 6) {
			int var23 = arg1.g1();
			if (var23 != 0) {
				var4.field765 = 1;
				var4.field766 = (var23 - 1 << 8) + arg1.g1();
			}
			int var24 = arg1.g1();
			if (var24 != 0) {
				var4.field748 = 1;
				var4.field749 = (var24 - 1 << 8) + arg1.g1();
			}
			int var25 = arg1.g1();
			if (var25 == 0) {
				var4.field768 = -1;
			} else {
				var4.field768 = (var25 - 1 << 8) + arg1.g1();
			}
			int var26 = arg1.g1();
			if (var26 == 0) {
				var4.field769 = -1;
			} else {
				var4.field769 = (var26 - 1 << 8) + arg1.g1();
			}
			var4.field733 = arg1.g2();
			var4.field734 = arg1.g2();
			var4.field735 = arg1.g2();
		}
		if (var4.field718 == 7) {
			var4.field751 = new int[var4.field723 * var4.field720];
			var4.field706 = new int[var4.field723 * var4.field720];
			var4.field754 = arg1.g1() == 1;
			int var27 = arg1.g1();
			if (field705 != null) {
				var4.field719 = field705[var27];
			}
			var4.field729 = arg1.g1() == 1;
			var4.field722 = arg1.g4();
			var4.field745 = arg1.g2b();
			var4.field726 = arg1.g2b();
			var4.field711 = arg1.g1() == 1;
			var4.field744 = new String[5];
			for (int var28 = 0; var28 < 5; var28++) {
				var4.field744[var28] = arg1.gjstr();
				if (var4.field744[var28].length() == 0) {
					var4.field744[var28] = null;
				}
			}
		}
		if (var4.field718 == 8) {
			var4.field712 = arg1.gjstr();
		}
		if (var4.field771 == 2 || var4.field718 == 2) {
			var4.field763 = arg1.gjstr();
			var4.field693 = arg1.gjstr();
			var4.field704 = arg1.g2();
		}
		if (var4.field771 == 1 || var4.field771 == 4 || var4.field771 == 5 || var4.field771 == 6) {
			var4.field750 = arg1.gjstr();
			if (var4.field750.length() == 0) {
				if (var4.field771 == 1) {
					var4.field750 = "Ok";
				}
				if (var4.field771 == 4) {
					var4.field750 = "Select";
				}
				if (var4.field771 == 5) {
					var4.field750 = "Select";
				}
				if (var4.field771 == 6) {
					var4.field750 = "Continue";
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("EWIXBTLV.a(I[LJDPYRDAS;LATJMVOZR;LATJMVOZR;)V")
	public static void method208(PixFont[] arg1, Jagfile arg2, Jagfile arg3) {
		field732 = new LruCache(50000);
		field696 = arg3;
		field705 = arg1;
		int var4 = -1;
		Packet var5 = new Packet(arg2.method2("data", null));
		int var6 = var5.g2();
		field698 = new Component[var6];
		field764 = new byte[var6][];
		while (var5.pos < var5.data.length) {
			int var7 = var5.g2();
			if (var7 == 65535) {
				var4 = var5.g2();
				var7 = var5.g2();
			}
			int var8 = var5.pos;
			Component var9 = method207(var4, var5, var7);
			byte[] var10 = field764[var9.field697] = new byte[var5.pos - var8 + 2];
			for (int var11 = var8; var11 < var5.pos; var11++) {
				var10[var11 - var8 + 2] = var5.data[var11];
			}
			var10[0] = (byte) (var4 >> 8);
			var10[1] = (byte) var4;
		}
		field696 = null;
	}

	@ObfuscatedName("EWIXBTLV.a(ZI)V")
	public static void method209(int arg1) {
		if (arg1 == -1) {
			return;
		}
		for (int var2 = 0; var2 < field698.length; var2++) {
			if (field698[var2] != null && field698[var2].field730 == arg1 && field698[var2].field718 != 2) {
				field698[var2] = null;
			}
		}
	}

	@ObfuscatedName("EWIXBTLV.a(ILLZYQDKJV;II)V")
	public static void method210(int arg0, Model arg1, int arg2) {
		field746.method460();
		if (arg1 != null && arg0 != 4) {
			field746.method459(arg1, (long) ((arg0 << 16) + arg2));
		}
	}

	@ObfuscatedName("EWIXBTLV.a(Z)V")
	public static void method211() {
		field698 = null;
		field696 = null;
		field732 = null;
		field705 = null;
		field764 = null;
	}

	@ObfuscatedName("EWIXBTLV.a(IIIZ)LLZYQDKJV;")
	public Model method212(int arg0, int arg1, boolean arg3) {
		field762 = 64;
		field725 = 768;
		Model var5;
		if (arg3) {
			var5 = this.method206(this.field748, this.field749);
		} else {
			var5 = this.method206(this.field765, this.field766);
		}
		if (var5 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var5.field1209 == null) {
			return var5;
		}
		Model var6 = new Model(false, false, true, var5, AnimFrame.method265(arg0) & AnimFrame.method265(arg1));
		if (arg0 != -1 || arg1 != -1) {
			var6.method366();
		}
		if (arg0 != -1) {
			var6.method367(arg0);
		}
		if (arg1 != -1) {
			var6.method367(arg1);
		}
		var6.method376(field762, field725, -50, -10, -50, true);
		return var6;
	}
}
