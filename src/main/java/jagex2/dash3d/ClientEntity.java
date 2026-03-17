package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("y")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("y.m")
	public final boolean field396 = true;

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
	public final void method110(int arg0, boolean arg1, int arg2) {
		if (this.field425 != -1 && SeqType.list[this.field425].postanim_move == 1) {
			this.field425 = -1;
		}
		if (!arg1) {
			int var4 = arg0 - this.field447[0];
			int var5 = arg2 - this.field448[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (this.field446 < 9) {
					this.field446++;
				}
				for (int var6 = this.field446; var6 > 0; var6--) {
					this.field447[var6] = this.field447[var6 - 1];
					this.field448[var6] = this.field448[var6 - 1];
					this.field449[var6] = this.field449[var6 - 1];
				}
				this.field447[0] = arg0;
				this.field448[0] = arg2;
				this.field449[0] = false;
				return;
			}
		}
		this.field446 = 0;
		this.field451 = 0;
		this.field450 = 0;
		this.field447[0] = arg0;
		this.field448[0] = arg2;
		this.field397 = this.field447[0] * 128 + this.field401 * 64;
		this.field398 = this.field448[0] * 128 + this.field401 * 64;
	}

	@ObfuscatedName("y.a(ZIZ)V")
	public final void method111(int arg0, boolean arg1) {
		int var3 = this.field447[0];
		int var4 = this.field448[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}
		if (arg0 == 1) {
			var4++;
		}
		if (arg0 == 2) {
			var3++;
			var4++;
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var3++;
			var4--;
		}
		if (this.field425 != -1 && SeqType.list[this.field425].postanim_move == 1) {
			this.field425 = -1;
		}
		if (this.field446 < 9) {
			this.field446++;
		}
		for (int var5 = this.field446; var5 > 0; var5--) {
			this.field447[var5] = this.field447[var5 - 1];
			this.field448[var5] = this.field448[var5 - 1];
			this.field449[var5] = this.field449[var5 - 1];
		}
		this.field447[0] = var3;
		this.field448[0] = var4;
		this.field449[0] = arg1;
	}

	@ObfuscatedName("y.b(Z)V")
	public final void method112() {
		this.field446 = 0;
		this.field451 = 0;
	}

	@ObfuscatedName("y.a(I)Z")
	public boolean method113() {
		return false;
	}

	@ObfuscatedName("y.a(IBII)V")
	public final void method114(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.field415[var4] <= arg0) {
				this.field413[var4] = arg1;
				this.field414[var4] = arg2;
				this.field415[var4] = arg0 + 70;
				return;
			}
		}
	}
}
