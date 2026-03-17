package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("xb")
public final class JagFile {

	@ObfuscatedName("xb.a")
	public final int field861 = 9;

	@ObfuscatedName("xb.b")
	public final int field862 = 29615;

	@ObfuscatedName("xb.c")
	public final boolean field863 = true;

	@ObfuscatedName("xb.d")
	public byte[] data;

	@ObfuscatedName("xb.e")
	public int fileCount;

	@ObfuscatedName("xb.f")
	public int[] fileHash;

	@ObfuscatedName("xb.g")
	public int[] fileUnpackedSize;

	@ObfuscatedName("xb.h")
	public int[] filePackedSize;

	@ObfuscatedName("xb.i")
	public int[] fileOffset;

	@ObfuscatedName("xb.j")
	public boolean unpacked;

	public JagFile(int arg0, byte[] arg1) {
		this.unpack(arg1);
	}

	@ObfuscatedName("xb.a(I[B)V")
	public void unpack(byte[] arg0) {
		Packet var2 = new Packet(arg0, (byte) 1);
		int var3 = var2.g3();
		int var4 = var2.g3();
		if (var4 == var3) {
			this.data = arg0;
			this.unpacked = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.decompress(var5, var3, arg0, var4, 6);
			this.data = var5;
			var2 = new Packet(this.data, (byte) 1);
			this.unpacked = true;
		}
		this.fileCount = var2.g2();
		this.fileHash = new int[this.fileCount];
		this.fileUnpackedSize = new int[this.fileCount];
		this.filePackedSize = new int[this.fileCount];
		this.fileOffset = new int[this.fileCount];
		int var6 = var2.data + this.fileCount * 10;
		for (int var7 = 0; var7 < this.fileCount; var7++) {
			this.fileHash[var7] = var2.g4();
			this.fileUnpackedSize[var7] = var2.g3();
			this.filePackedSize[var7] = var2.g3();
			this.fileOffset[var7] = var6;
			var6 += this.filePackedSize[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.fileCount; var6++) {
			if (this.fileHash[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.fileUnpackedSize[var6]];
				}
				if (this.unpacked) {
					for (int var7 = 0; var7 < this.fileUnpackedSize[var6]; var7++) {
						arg1[var7] = this.data[this.fileOffset[var6] + var7];
					}
				} else {
					BZip2.decompress(arg1, this.fileUnpackedSize[var6], this.data, this.filePackedSize[var6], this.fileOffset[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
