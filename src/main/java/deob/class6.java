package deob;

@ObfuscatedName("f")
public final class class6 {

	@ObfuscatedName("f.a")
	public final int field145;

	@ObfuscatedName("f.b")
	public final int[] field146;

	@ObfuscatedName("f.c")
	public final int[][] field147;

	public class6(int arg0, class38 arg1) {
		this.field145 = arg1.method224();
		this.field146 = new int[this.field145];
		this.field147 = new int[this.field145][];
		for (int var3 = 0; var3 < this.field145; var3++) {
			this.field146[var3] = arg1.method224();
		}
		for (int var4 = 0; var4 < this.field145; var4++) {
			int var5 = arg1.method224();
			this.field147[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field147[var4][var6] = arg1.method224();
			}
		}
	}
}
