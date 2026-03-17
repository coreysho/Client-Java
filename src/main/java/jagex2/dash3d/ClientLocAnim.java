package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("bb")
public final class ClientLocAnim extends ModelSource {

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

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg6, int arg7, int arg8, int arg9) {
		field483 = arg3;
		field484 = arg0;
		field485 = arg1;
		field486 = arg9;
		field487 = arg7;
		field488 = arg4;
		field489 = arg8;
		field490 = SeqType.list[arg2];
		field491 = 0;
		field492 = Client.loopCycle;
		if (arg6 && field490.loops != -1) {
			field491 = (int) (Math.random() * (double) field490.numFrames);
			field492 -= (int) (Math.random() * (double) field490.getDelay(field491));
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	@Override
	public Model getTempModel() {
		if (field490 != null) {
			int var2 = Client.loopCycle - field492;
			if (var2 > 100 && field490.loops > 0) {
				var2 = 100;
			}
			label42: {
				do {
					do {
						if (var2 <= field490.getDelay(field491)) {
							break label42;
						}
						var2 -= field490.getDelay(field491);
						field491++;
					} while (field491 < field490.numFrames);
					field491 -= field490.loops;
				} while (field491 >= 0 && field491 < field490.numFrames);
				field490 = null;
			}
			field492 = Client.loopCycle - var2;
		}
		int var3 = -1;
		if (field490 != null) {
			var3 = field490.frames[field491];
		}
		LocType var4 = LocType.list(field483);
		return var4.getModel(field484, field485, field486, field487, field488, field489, var3);
	}
}
