package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.m")
	public final class68 field603;

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

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field603 = class68.field1154[arg6];
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
					if (this.field610 <= this.field603.field1158.method375(this.field609)) {
						return;
					}
					this.field610 -= this.field603.field1158.method375(this.field609) + 1;
					this.field609++;
				} while (this.field609 < this.field603.field1158.field1134);
			} while (this.field609 >= 0 && this.field609 < this.field603.field1158.field1134);
			this.field609 = 0;
			this.field611 = true;
		}
	}

	@ObfuscatedName("fb.a(Z)Leb;")
	@Override
	public class31 method109() {
		class31 var1 = this.field603.method379();
		if (var1 == null) {
			return null;
		}
		int var2 = this.field603.field1158.field1135[this.field609];
		class31 var3 = new class31(true, class7.method48(var2), var1, true, false);
		if (!this.field611) {
			var3.method132();
			var3.method133(var2);
			var3.field568 = null;
			var3.field567 = null;
		}
		if (this.field603.field1161 != 128 || this.field603.field1162 != 128) {
			var3.method141(this.field603.field1161, this.field603.field1161, this.field603.field1162);
		}
		if (this.field603.field1163 != 0) {
			if (this.field603.field1163 == 90) {
				var3.method136();
			}
			if (this.field603.field1163 == 180) {
				var3.method136();
				var3.method136();
			}
			if (this.field603.field1163 == 270) {
				var3.method136();
				var3.method136();
				var3.method136();
			}
		}
		var3.method142(this.field603.field1164 + 64, this.field603.field1165 + 850, -30, -50, -30, true);
		return var3;
	}
}
