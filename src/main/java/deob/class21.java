package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.a")
	public final int field361 = 587;

	@ObfuscatedName("u.b")
	public long field362;

	@ObfuscatedName("u.c")
	public class21 field363;

	@ObfuscatedName("u.d")
	public class21 field364;

	@ObfuscatedName("u.a()V")
	public final void method106() {
		if (this.field364 != null) {
			this.field364.field363 = this.field363;
			this.field363.field364 = this.field364;
			this.field363 = null;
			this.field364 = null;
		}
	}
}
