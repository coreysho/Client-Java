package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class SeqType {

	@ObfuscatedName("FHWCLIAS.b")
	public boolean field773 = false;

	@ObfuscatedName("FHWCLIAS.i")
	public int field780 = -1;

	@ObfuscatedName("FHWCLIAS.k")
	public boolean field782 = false;

	@ObfuscatedName("FHWCLIAS.l")
	public int field783 = 5;

	@ObfuscatedName("FHWCLIAS.m")
	public int field784 = -1;

	@ObfuscatedName("FHWCLIAS.n")
	public int field785 = -1;

	@ObfuscatedName("FHWCLIAS.o")
	public int field786 = 99;

	@ObfuscatedName("FHWCLIAS.p")
	public int field787 = -1;

	@ObfuscatedName("FHWCLIAS.q")
	public int field788 = -1;

	@ObfuscatedName("FHWCLIAS.r")
	public int field789 = 2;

	@ObfuscatedName("FHWCLIAS.a")
	public static byte field772 = 6;

	@ObfuscatedName("FHWCLIAS.c")
	public static int field774;

	@ObfuscatedName("FHWCLIAS.e")
	public int field776;

	@ObfuscatedName("FHWCLIAS.s")
	public int field790;

	@ObfuscatedName("FHWCLIAS.t")
	public static int field791;

	@ObfuscatedName("FHWCLIAS.f")
	public int[] field777;

	@ObfuscatedName("FHWCLIAS.g")
	public int[] field778;

	@ObfuscatedName("FHWCLIAS.h")
	public int[] field779;

	@ObfuscatedName("FHWCLIAS.j")
	public int[] field781;

	@ObfuscatedName("FHWCLIAS.d")
	public static SeqType[] field775;

	@ObfuscatedName("FHWCLIAS.a(LATJMVOZR;I)V")
	public static void method213(Jagfile arg0, int arg1) {
		Packet var2 = new Packet(true, arg0.method2("seq.dat", null));
		field774 = var2.method400();
		if (field775 == null) {
			field775 = new SeqType[field774];
		}
		for (int var3 = 0; var3 < field774; var3++) {
			if (field775[var3] == null) {
				field775[var3] = new SeqType();
			}
			field775[var3].method215(field772, var2);
		}
		if (arg1 == 36135) {
			;
		}
	}

	@ObfuscatedName("FHWCLIAS.a(II)I")
	public int method214(int arg0, int arg1) {
		int var3 = this.field779[arg1];
		if (arg0 != 0) {
			return 1;
		}
		if (var3 == 0) {
			AnimFrame var4 = AnimFrame.method264(this.field777[arg1]);
			if (var4 != null) {
				var3 = this.field779[arg1] = var4.field930;
			}
		}
		if (var3 == 0) {
			var3 = 1;
		}
		return var3;
	}

	@ObfuscatedName("FHWCLIAS.a(BLMFMVIYHT;)V")
	public void method215(byte arg0, Packet arg1) {
		if (arg0 == 6) {
			boolean var3 = false;
		} else {
			this.field773 = !this.field773;
		}
		while (true) {
			while (true) {
				int var4 = arg1.method398();
				if (var4 == 0) {
					if (this.field776 == 0) {
						this.field776 = 1;
						this.field777 = new int[1];
						this.field777[0] = -1;
						this.field778 = new int[1];
						this.field778[0] = -1;
						this.field779 = new int[1];
						this.field779[0] = -1;
					}
					if (this.field787 == -1) {
						if (this.field781 == null) {
							this.field787 = 0;
						} else {
							this.field787 = 2;
						}
					}
					if (this.field788 == -1) {
						if (this.field781 != null) {
							this.field788 = 2;
							return;
						}
						this.field788 = 0;
						return;
					}
					return;
				}
				if (var4 == 1) {
					this.field776 = arg1.method398();
					this.field777 = new int[this.field776];
					this.field778 = new int[this.field776];
					this.field779 = new int[this.field776];
					for (int var5 = 0; var5 < this.field776; var5++) {
						this.field777[var5] = arg1.method400();
						this.field778[var5] = arg1.method400();
						if (this.field778[var5] == 65535) {
							this.field778[var5] = -1;
						}
						this.field779[var5] = arg1.method400();
					}
				} else if (var4 == 2) {
					this.field780 = arg1.method400();
				} else if (var4 == 3) {
					int var6 = arg1.method398();
					this.field781 = new int[var6 + 1];
					for (int var7 = 0; var7 < var6; var7++) {
						this.field781[var7] = arg1.method398();
					}
					this.field781[var6] = 9999999;
				} else if (var4 == 4) {
					this.field782 = true;
				} else if (var4 == 5) {
					this.field783 = arg1.method398();
				} else if (var4 == 6) {
					this.field784 = arg1.method400();
				} else if (var4 == 7) {
					this.field785 = arg1.method400();
				} else if (var4 == 8) {
					this.field786 = arg1.method398();
				} else if (var4 == 9) {
					this.field787 = arg1.method398();
				} else if (var4 == 10) {
					this.field788 = arg1.method398();
				} else if (var4 == 11) {
					this.field789 = arg1.method398();
				} else if (var4 == 12) {
					this.field790 = arg1.method403();
				} else {
					System.out.println("Error unrecognised seq config code: " + var4);
				}
			}
		}
	}
}
