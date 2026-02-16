package deob;

@ObfuscatedName("z")
public final class class26 extends class25 {

	@ObfuscatedName("z.qb")
	public final boolean field452 = true;

	@ObfuscatedName("z.rb")
	public class59 field453;

	@ObfuscatedName("z.a(Z)Leb;")
	@Override
	public class31 method109() {
		if (this.field453 == null) {
			return null;
		}
		class31 var1 = this.method115();
		if (var1 == null) {
			return null;
		}
		super.field443 = var1.field394;
		if (super.field430 != -1 && super.field431 != -1) {
			class68 var2 = class68.field1154[super.field430];
			class31 var3 = var2.method379();
			if (var3 != null) {
				int var4 = var2.field1158.field1135[super.field431];
				class31 var5 = new class31(true, class7.method48(var4), var3, true, false);
				var5.method138(0, -super.field434, 0);
				var5.method132();
				var5.method133(var4);
				var5.field568 = null;
				var5.field567 = null;
				if (var2.field1161 != 128 || var2.field1162 != 128) {
					var5.method141(var2.field1161, var2.field1161, var2.field1162);
				}
				var5.method142(var2.field1164 + 64, var2.field1165 + 850, -30, -50, -30, true);
				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, (byte) 72, var6, 2);
			}
		}
		if (this.field453.field1006 == 1) {
			var1.field569 = true;
		}
		return var1;
	}

	@ObfuscatedName("z.c(Z)Leb;")
	public class31 method115() {
		if (super.field425 < 0 || super.field428 != 0) {
			int var3 = -1;
			if (super.field422 >= 0) {
				var3 = class66.field1133[super.field422].field1135[super.field423];
			}
			return this.field453.method337(var3, -1, null);
		}
		int var1 = class66.field1133[super.field425].field1135[super.field426];
		int var2 = -1;
		if (super.field422 >= 0 && super.field422 != super.field402) {
			var2 = class66.field1133[super.field422].field1135[super.field423];
		}
		return this.field453.method337(var1, var2, class66.field1133[super.field425].field1139);
	}

	@ObfuscatedName("z.a(I)Z")
	@Override
	public boolean method113() {
		return this.field453 != null;
	}
}
