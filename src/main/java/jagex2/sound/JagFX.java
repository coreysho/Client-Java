package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public final class JagFX {

	@ObfuscatedName("cc.a")
	public int field905;

	@ObfuscatedName("cc.b")
	public final byte field906 = 5;

	@ObfuscatedName("cc.c")
	public static boolean field907;

	@ObfuscatedName("cc.d")
	public static final JagFX[] synth = new JagFX[1000];

	@ObfuscatedName("cc.e")
	public static final int[] delays = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] waveBytes;

	@ObfuscatedName("cc.g")
	public static Packet waveBuffer;

	@ObfuscatedName("cc.h")
	public final Tone[] tones = new Tone[10];

	@ObfuscatedName("cc.i")
	public int loopBegin;

	@ObfuscatedName("cc.j")
	public int loopEnd;

	@ObfuscatedName("cc.a(ZLlb;)V")
	public static void unpack(Packet arg0) {
		waveBytes = new byte[441000];
		waveBuffer = new Packet(waveBytes, (byte) 1);
		Tone.init();
		while (true) {
			int var1 = arg0.g2();
			if (var1 == 65535) {
				return;
			}
			synth[var1] = new JagFX(-46900);
			synth[var1].load(arg0);
			delays[var1] = synth[var1].optimiseStart();
		}
	}

	@ObfuscatedName("cc.a(IIB)Llb;")
	public static Packet generate(int arg0, int arg1) {
		if (synth[arg0] == null) {
			return null;
		} else {
			JagFX var2 = synth[arg0];
			return var2.getWave(arg1);
		}
	}

	public JagFX(int arg0) {
	}

	@ObfuscatedName("cc.a(BLlb;)V")
	public void load(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.data--;
				this.tones[var2] = new Tone();
				this.tones[var2].load(arg0);
			}
		}
		this.loopBegin = arg0.g2();
		this.loopEnd = arg0.g2();
	}

	@ObfuscatedName("cc.a(I)I")
	public int optimiseStart() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.tones[var2] != null && this.tones[var2].start / 20 < var1) {
				var1 = this.tones[var2].start / 20;
			}
		}
		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var1) {
			var1 = this.loopBegin / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null) {
				this.tones[var3].start -= var1 * 20;
			}
		}
		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= var1 * 20;
			this.loopEnd -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("cc.a(IB)Llb;")
	public Packet getWave(int arg0) {
		int var2 = this.makeSound(arg0);
		waveBuffer.data = 0;
		waveBuffer.p4(1380533830);
		waveBuffer.ip4(var2 + 36);
		waveBuffer.p4(1463899717);
		waveBuffer.p4(1718449184);
		waveBuffer.ip4(16);
		waveBuffer.ip2(1);
		waveBuffer.ip2(1);
		waveBuffer.ip4(22050);
		waveBuffer.ip4(22050);
		waveBuffer.ip2(1);
		waveBuffer.ip2(8);
		waveBuffer.p4(1684108385);
		waveBuffer.ip4(var2);
		if (this.field906 != 5) {
			throw new NullPointerException();
		}
		waveBuffer.data += var2;
		return waveBuffer;
	}

	@ObfuscatedName("cc.b(I)I")
	public int makeSound(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].length + this.tones[var3].start > var2) {
				var2 = this.tones[var3].length + this.tones[var3].start;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.loopBegin * 22050 / 1000;
		int var6 = this.loopEnd * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = var4 + (var6 - var5) * (arg0 - 1);
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			waveBytes[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.tones[var9] != null) {
				int var10 = this.tones[var9].length * 22050 / 1000;
				int var11 = this.tones[var9].start * 22050 / 1000;
				int[] var12 = this.tones[var9].generate(var10, this.tones[var9].length);
				for (int var13 = 0; var13 < var10; var13++) {
					waveBytes[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				waveBytes[var15 + var14] = waveBytes[var15];
			}
			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					waveBytes[var18 + var17] = waveBytes[var18];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
