package deob;

@ObfuscatedName("fc")
public final class class58 implements Runnable {

	@ObfuscatedName("fc.a")
	public boolean field989 = true;

	@ObfuscatedName("fc.b")
	public final client field990;

	@ObfuscatedName("fc.c")
	public boolean field991 = true;

	@ObfuscatedName("fc.d")
	public final Object field992 = new Object();

	@ObfuscatedName("fc.e")
	public int field993;

	@ObfuscatedName("fc.f")
	public final int[] field994 = new int[500];

	@ObfuscatedName("fc.g")
	public final int[] field995 = new int[500];

	public class58(int arg0, client arg1) {
		this.field990 = arg1;
		if (arg0 != -39788) {
			this.field989 = !this.field989;
		}
	}

	@Override
	public void run() {
		while (this.field991) {
			Object var1 = this.field992;
			synchronized (this.field992) {
				if (this.field993 < 500) {
					this.field994[this.field993] = this.field990.field22;
					this.field995[this.field993] = this.field990.field23;
					this.field993++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
