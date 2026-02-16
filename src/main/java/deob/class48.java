package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("vb")
public final class class48 {

	@ObfuscatedName("vb.a")
	public final boolean field847 = true;

	@ObfuscatedName("vb.b")
	public final int field848 = 29615;

	@ObfuscatedName("vb.c")
	public final int field849 = 7228;

	@ObfuscatedName("vb.d")
	public static final byte[] field850 = new byte[520];

	@ObfuscatedName("vb.e")
	public final RandomAccessFile field851;

	@ObfuscatedName("vb.f")
	public final RandomAccessFile field852;

	@ObfuscatedName("vb.g")
	public final int field853;

	@ObfuscatedName("vb.h")
	public int field854 = 65000;

	public class48(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3, int arg4) {
		this.field853 = arg3;
		this.field851 = arg0;
		if (this.field848 != 29615) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		this.field852 = arg2;
		this.field854 = 500000;
	}

	@ObfuscatedName("vb.a(BI)[B")
	public synchronized byte[] method286(int arg0) {
		try {
			this.method289(arg0 * 6, this.field852);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = this.field852.read(field850, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}
			int var4 = ((field850[0] & 0xFF) << 16) + ((field850[1] & 0xFF) << 8) + (field850[2] & 0xFF);
			int var5 = ((field850[3] & 0xFF) << 16) + ((field850[4] & 0xFF) << 8) + (field850[5] & 0xFF);
			if (var4 < 0 || var4 > this.field854) {
				return null;
			} else if (var5 > 0 && (long) var5 <= this.field851.length() / 520L) {
				byte[] var6 = new byte[var4];
				int var7 = 0;
				int var8 = 0;
				while (var7 < var4) {
					if (var5 == 0) {
						return null;
					}
					this.method289(var5 * 520, this.field851);
					int var9 = 0;
					int var10 = var4 - var7;
					if (var10 > 512) {
						var10 = 512;
					}
					while (var9 < var10 + 8) {
						int var11 = this.field851.read(field850, var9, var10 + 8 - var9);
						if (var11 == -1) {
							return null;
						}
						var9 += var11;
					}
					int var12 = ((field850[0] & 0xFF) << 8) + (field850[1] & 0xFF);
					int var13 = ((field850[2] & 0xFF) << 8) + (field850[3] & 0xFF);
					int var14 = ((field850[4] & 0xFF) << 16) + ((field850[5] & 0xFF) << 8) + (field850[6] & 0xFF);
					int var15 = field850[7] & 0xFF;
					if (var12 == arg0 && var13 == var8 && var15 == this.field853) {
						if (var14 >= 0 && (long) var14 <= this.field851.length() / 520L) {
							for (int var16 = 0; var16 < var10; var16++) {
								var6[var7++] = field850[var16 + 8];
							}
							var5 = var14;
							var8++;
							continue;
						}
						return null;
					}
					return null;
				}
				return var6;
			} else {
				return null;
			}
		} catch (IOException var17) {
			return null;
		}
	}

	@ObfuscatedName("vb.a(II[BB)Z")
	public synchronized boolean method287(int arg0, int arg1, byte[] arg2) {
		boolean var4 = this.method288(true, arg2, arg1, arg0);
		if (!var4) {
			var4 = this.method288(false, arg2, arg1, arg0);
		}
		return var4;
	}

	@ObfuscatedName("vb.a(Z[BIIB)Z")
	public synchronized boolean method288(boolean arg0, byte[] arg1, int arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				this.method289(arg2 * 6, this.field852);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = this.field852.read(field850, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}
				var7 = ((field850[3] & 0xFF) << 16) + ((field850[4] & 0xFF) << 8) + (field850[5] & 0xFF);
				if (var7 <= 0 || (long) var7 > this.field851.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((this.field851.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}
			field850[0] = (byte) (arg3 >> 16);
			field850[1] = (byte) (arg3 >> 8);
			field850[2] = (byte) arg3;
			field850[3] = (byte) (var7 >> 16);
			field850[4] = (byte) (var7 >> 8);
			field850[5] = (byte) var7;
			this.method289(arg2 * 6, this.field852);
			this.field852.write(field850, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg0) {
					this.method289(var7 * 520, this.field851);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = this.field851.read(field850, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}
					if (var11 == 8) {
						label106: {
							int var13 = ((field850[0] & 0xFF) << 8) + (field850[1] & 0xFF);
							int var14 = ((field850[2] & 0xFF) << 8) + (field850[3] & 0xFF);
							var10 = ((field850[4] & 0xFF) << 16) + ((field850[5] & 0xFF) << 8) + (field850[6] & 0xFF);
							int var15 = field850[7] & 0xFF;
							if (var13 == arg2 && var14 == var9 && var15 == this.field853) {
								if (var10 >= 0 && (long) var10 <= this.field851.length() / 520L) {
									break label106;
								}
								return false;
							}
							return false;
						}
					}
				}
				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((this.field851.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}
					if (var10 == var7) {
						var10++;
					}
				}
				if (arg3 - var8 <= 512) {
					var10 = 0;
				}
				field850[0] = (byte) (arg2 >> 8);
				field850[1] = (byte) arg2;
				field850[2] = (byte) (var9 >> 8);
				field850[3] = (byte) var9;
				field850[4] = (byte) (var10 >> 16);
				field850[5] = (byte) (var10 >> 8);
				field850[6] = (byte) var10;
				field850[7] = (byte) this.field853;
				this.method289(var7 * 520, this.field851);
				this.field851.write(field850, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}
				this.field851.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}
			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("vb.a(IZLjava/io/RandomAccessFile;)V")
	public synchronized void method289(int arg0, RandomAccessFile arg1) throws IOException {
		if (arg0 < 0 || arg0 > 62914560) {
			System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
			arg0 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}
		arg1.seek((long) arg0);
	}
}
