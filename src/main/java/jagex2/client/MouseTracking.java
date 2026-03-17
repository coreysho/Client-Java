package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public boolean field989 = true;

	@ObfuscatedName("fc.b")
	public final Client app;

	@ObfuscatedName("fc.c")
	public boolean active = true;

	@ObfuscatedName("fc.d")
	public final Object lock = new Object();

	@ObfuscatedName("fc.e")
	public int length;

	@ObfuscatedName("fc.f")
	public final int[] x = new int[500];

	@ObfuscatedName("fc.g")
	public final int[] y = new int[500];

	public MouseTracking(int arg0, Client arg1) {
		this.app = arg1;
		if (arg0 != -39788) {
			this.field989 = !this.field989;
		}
	}

	@Override
	public void run() {
		while (this.active) {
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.y[this.length] = this.app.mouseY;
					this.length++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
