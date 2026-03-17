package jagex2.dash3d;

import deob.*;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("bb")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("bb.m")
	public int field481;

	@ObfuscatedName("bb.n")
	public final boolean field482 = false;

	@ObfuscatedName("bb.o")
	public final int field483;

	@ObfuscatedName("bb.p")
	public final int field484;

	@ObfuscatedName("bb.q")
	public final int field485;

	@ObfuscatedName("bb.r")
	public final int field486;

	@ObfuscatedName("bb.s")
	public final int field487;

	@ObfuscatedName("bb.t")
	public final int field488;

	@ObfuscatedName("bb.u")
	public final int field489;

	@ObfuscatedName("bb.v")
	public SeqType field490;

	@ObfuscatedName("bb.w")
	public int field491;

	@ObfuscatedName("bb.x")
	public int field492;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
		this.field483 = arg3;
		this.field484 = arg0;
		this.field485 = arg1;
		this.field486 = arg9;
		this.field487 = arg7;
		this.field488 = arg4;
		this.field489 = arg8;
		this.field490 = SeqType.list[arg2];
		this.field491 = 0;
		this.field492 = Client.field1218;
		if (arg5 != 0) {
			this.field481 = 429;
		}
		if (arg6 && this.field490.loops != -1) {
			this.field491 = (int) (Math.random() * (double) this.field490.numFrames);
			this.field492 -= (int) (Math.random() * (double) this.field490.getDelay(this.field491));
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		if (this.field490 != null) {
			int var1 = Client.field1218 - this.field492;
			if (var1 > 100 && this.field490.loops > 0) {
				var1 = 100;
			}
			label33: {
				do {
					do {
						if (var1 <= this.field490.getDelay(this.field491)) {
							break label33;
						}
						var1 -= this.field490.getDelay(this.field491);
						this.field491++;
					} while (this.field491 < this.field490.numFrames);
					this.field491 -= this.field490.loops;
				} while (this.field491 >= 0 && this.field491 < this.field490.numFrames);
				this.field490 = null;
			}
			this.field492 = Client.field1218 - var1;
		}
		int var2 = -1;
		if (this.field490 != null) {
			var2 = this.field490.frames[this.field491];
		}
		LocType var3 = LocType.list(this.field483);
		return var3.getModel(this.field484, this.field485, this.field486, this.field487, this.field488, this.field489, var2);
	}
}
