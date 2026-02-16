package deob;

@ObfuscatedName("w")
public class Linkable2 extends Linkable {

	@ObfuscatedName("w.f")
	public Linkable2 field389;

	@ObfuscatedName("w.g")
	public Linkable2 field390;

	@ObfuscatedName("w.b()V")
	public final void method107() {
		if (this.field390 != null) {
			this.field390.field389 = this.field389;
			this.field389.field390 = this.field390;
			this.field389 = null;
			this.field390 = null;
		}
	}
}
