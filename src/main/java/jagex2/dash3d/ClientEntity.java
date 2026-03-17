package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("y")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("y.m")
	public boolean field396 = true;

	@ObfuscatedName("y.n")
	public int field397;

	@ObfuscatedName("y.o")
	public int field398;

	@ObfuscatedName("y.p")
	public int field399;

	@ObfuscatedName("y.q")
	public boolean field400 = false;

	@ObfuscatedName("y.r")
	public int field401 = 1;

	@ObfuscatedName("y.s")
	public int field402 = -1;

	@ObfuscatedName("y.t")
	public int field403 = -1;

	@ObfuscatedName("y.u")
	public int field404 = -1;

	@ObfuscatedName("y.v")
	public int field405 = -1;

	@ObfuscatedName("y.w")
	public int field406 = -1;

	@ObfuscatedName("y.x")
	public int field407 = -1;

	@ObfuscatedName("y.y")
	public int field408 = -1;

	@ObfuscatedName("y.z")
	public String field409;

	@ObfuscatedName("y.ab")
	public int field436;

	@ObfuscatedName("y.bb")
	public int field437;

	@ObfuscatedName("y.cb")
	public int field438;

	@ObfuscatedName("y.db")
	public int field439;

	@ObfuscatedName("y.eb")
	public int field440;

	@ObfuscatedName("y.fb")
	public int field441;

	@ObfuscatedName("y.gb")
	public int field442;

	@ObfuscatedName("y.hb")
	public int field443 = 200;

	@ObfuscatedName("y.ib")
	public int field444;

	@ObfuscatedName("y.jb")
	public int field445 = 32;

	@ObfuscatedName("y.kb")
	public int field446;

	@ObfuscatedName("y.lb")
	public final int[] field447 = new int[10];

	@ObfuscatedName("y.mb")
	public final int[] field448 = new int[10];

	@ObfuscatedName("y.nb")
	public final boolean[] field449 = new boolean[10];

	@ObfuscatedName("y.ob")
	public int field450;

	@ObfuscatedName("y.pb")
	public int field451;

	@ObfuscatedName("y.A")
	public int field410 = 100;

	@ObfuscatedName("y.D")
	public final int[] field413 = new int[4];

	@ObfuscatedName("y.E")
	public final int[] field414 = new int[4];

	@ObfuscatedName("y.F")
	public final int[] field415 = new int[4];

	@ObfuscatedName("y.G")
	public int field416 = -1000;

	@ObfuscatedName("y.J")
	public int field419 = -1;

	@ObfuscatedName("y.M")
	public int field422 = -1;

	@ObfuscatedName("y.P")
	public int field425 = -1;

	@ObfuscatedName("y.U")
	public int field430 = -1;

	@ObfuscatedName("y.B")
	public int field411;

	@ObfuscatedName("y.C")
	public int field412;

	@ObfuscatedName("y.H")
	public int field417;

	@ObfuscatedName("y.I")
	public int field418;

	@ObfuscatedName("y.K")
	public int field420;

	@ObfuscatedName("y.L")
	public int field421;

	@ObfuscatedName("y.N")
	public int field423;

	@ObfuscatedName("y.O")
	public int field424;

	@ObfuscatedName("y.Q")
	public int field426;

	@ObfuscatedName("y.R")
	public int field427;

	@ObfuscatedName("y.S")
	public int field428;

	@ObfuscatedName("y.T")
	public int field429;

	@ObfuscatedName("y.V")
	public int field431;

	@ObfuscatedName("y.W")
	public int field432;

	@ObfuscatedName("y.X")
	public int field433;

	@ObfuscatedName("y.Y")
	public int field434;

	@ObfuscatedName("y.Z")
	public int field435;

	@ObfuscatedName("y.a(IZZI)V")
	public final void method110(int arg0, boolean arg1, boolean arg2, int arg3) {
		if (field425 != -1 && SeqType.list[field425].postanim_move == 1) {
			field425 = -1;
		}
		if (!arg1) {
			int var5 = arg0 - field447[0];
			int var6 = arg3 - field448[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (field446 < 9) {
					field446++;
				}
				for (int var7 = field446; var7 > 0; var7--) {
					field447[var7] = field447[var7 - 1];
					field448[var7] = field448[var7 - 1];
					field449[var7] = field449[var7 - 1];
				}
				field447[0] = arg0;
				field448[0] = arg3;
				field449[0] = false;
				return;
			}
		}
		field446 = 0;
		field451 = 0;
		field450 = 0;
		field447[0] = arg0;
		if (arg2) {
			field396 = !field396;
		}
		field448[0] = arg3;
		field397 = field447[0] * 128 + field401 * 64;
		field398 = field448[0] * 128 + field401 * 64;
	}

	@ObfuscatedName("y.a(ZIZ)V")
	public final void method111(boolean arg0, int arg1, boolean arg2) {
		int var4 = field447[0];
		int var5 = field448[0];
		if (arg1 == 0) {
			var4--;
			var5++;
		}
		if (arg1 == 1) {
			var5++;
		}
		if (arg1 == 2) {
			var4++;
			var5++;
		}
		if (arg1 == 3) {
			var4--;
		}
		if (arg1 == 4) {
			var4++;
		}
		if (arg1 == 5) {
			var4--;
			var5--;
		}
		if (arg1 == 6) {
			var5--;
		}
		if (arg1 == 7) {
			var4++;
			var5--;
		}
		if (field425 != -1 && SeqType.list[field425].postanim_move == 1) {
			field425 = -1;
		}
		if (field446 < 9) {
			field446++;
		}
		for (int var6 = field446; var6 > 0; var6--) {
			field447[var6] = field447[var6 - 1];
			field448[var6] = field448[var6 - 1];
			field449[var6] = field449[var6 - 1];
		}
		field447[0] = var4;
		if (!arg0) {
			field396 = !field396;
		}
		field448[0] = var5;
		field449[0] = arg2;
	}

	@ObfuscatedName("y.b(Z)V")
	public final void method112() {
		field446 = 0;
		field451 = 0;
	}

	@ObfuscatedName("y.a(I)Z")
	public boolean method113() {
		return false;
	}

	@ObfuscatedName("y.a(IBII)V")
	public final void method114(int arg0, int arg2, int arg3) {
		for (int var5 = 0; var5 < 4; var5++) {
			if (field415[var5] <= arg0) {
				field413[var5] = arg2;
				field414[var5] = arg3;
				field415[var5] = arg0 + 70;
				return;
			}
		}
	}
}
