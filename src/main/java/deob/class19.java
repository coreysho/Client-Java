package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.a")
	public final int field345 = 7228;

	@ObfuscatedName("s.b")
	public final boolean field346 = false;

	@ObfuscatedName("s.c")
	public final boolean field347 = false;

	@ObfuscatedName("s.d")
	public int field348;

	@ObfuscatedName("s.e")
	public int field349;

	@ObfuscatedName("s.f")
	public final class23 field350 = new class23();

	@ObfuscatedName("s.g")
	public final int field351 = 50000;

	@ObfuscatedName("s.h")
	public int field352 = 50000;

	@ObfuscatedName("s.i")
	public final class20 field353 = new class20(1024, this.field345);

	@ObfuscatedName("s.j")
	public final class42 field354 = new class42((byte) 8);

	public class19(int arg0, int arg1) {
	}

	@ObfuscatedName("s.a(J)Lw;")
	public class23 method101(long arg0) {
		class23 var3 = (class23) this.field353.method104(arg0);
		if (var3 == null) {
			this.field348++;
		} else {
			this.field354.method248(var3);
			this.field349++;
		}
		return var3;
	}

	@ObfuscatedName("s.a(IJLw;)V")
	public void method102(long arg0, class23 arg1) {
		if (this.field352 == 0) {
			class23 var4 = this.field354.method249();
			var4.method106();
			var4.method107();
			if (var4 == this.field350) {
				class23 var5 = this.field354.method249();
				var5.method106();
				var5.method107();
			}
		} else {
			this.field352--;
		}
		this.field353.method105(arg0, arg1);
		this.field354.method248(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void method103() {
		while (true) {
			class23 var1 = this.field354.method249();
			if (var1 == null) {
				this.field352 = this.field351;
				return;
			}
			var1.method106();
			var1.method107();
		}
	}
}
