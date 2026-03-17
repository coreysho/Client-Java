package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public final class Envelope {

	@ObfuscatedName("ac.a")
	public final int field880 = 1;

	@ObfuscatedName("ac.b")
	public final boolean field881 = false;

	@ObfuscatedName("ac.c")
	public int length;

	@ObfuscatedName("ac.d")
	public int[] shapeDelta;

	@ObfuscatedName("ac.e")
	public int[] shapePeak;

	@ObfuscatedName("ac.f")
	public int start;

	@ObfuscatedName("ac.g")
	public int end;

	@ObfuscatedName("ac.h")
	public int form;

	@ObfuscatedName("ac.i")
	public int threshold;

	@ObfuscatedName("ac.j")
	public int position;

	@ObfuscatedName("ac.k")
	public int delta;

	@ObfuscatedName("ac.l")
	public int amplitude;

	@ObfuscatedName("ac.m")
	public int ticks;

	@ObfuscatedName("ac.a(BLlb;)V")
	public void load(Packet arg0) {
		this.form = arg0.g1();
		this.start = arg0.g4();
		this.end = arg0.g4();
		this.loadPoints(arg0);
	}

	@ObfuscatedName("ac.a(Llb;I)V")
	public void loadPoints(Packet arg0) {
		this.length = arg0.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			this.shapeDelta[var2] = arg0.g2();
			this.shapePeak[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public void genInit() {
		this.threshold = 0;
		this.position = 0;
		this.delta = 0;
		this.amplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("ac.a(BI)I")
	public int genNext(int arg0) {
		if (this.ticks >= this.threshold) {
			this.amplitude = this.shapePeak[this.position++] << 15;
			if (this.position >= this.length) {
				this.position = this.length - 1;
			}
			this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) arg0);
			if (this.threshold > this.ticks) {
				this.delta = ((this.shapePeak[this.position] << 15) - this.amplitude) / (this.threshold - this.ticks);
			}
		}
		this.amplitude += this.delta;
		this.ticks++;
		return this.amplitude - this.delta >> 15;
	}
}
