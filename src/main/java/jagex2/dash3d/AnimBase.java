package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public final class AnimBase {

	@ObfuscatedName("f.a")
	public final int size;

	@ObfuscatedName("f.b")
	public final int[] type;

	@ObfuscatedName("f.c")
	public final int[][] labels;

	public AnimBase(int arg0, Packet arg1) {
		this.size = arg1.g1();
		this.type = new int[this.size];
		this.labels = new int[this.size][];
		for (int var3 = 0; var3 < this.size; var3++) {
			this.type[var3] = arg1.g1();
		}
		for (int var4 = 0; var4 < this.size; var4++) {
			int var5 = arg1.g1();
			this.labels[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.labels[var4][var6] = arg1.g1();
			}
		}
	}
}
