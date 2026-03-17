package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public final class HashTable {

	@ObfuscatedName("t.a")
	public int field355 = 7;

	@ObfuscatedName("t.b")
	public final int field356 = 7228;

	@ObfuscatedName("t.c")
	public final byte field357 = 0;

	@ObfuscatedName("t.d")
	public final boolean field358 = false;

	@ObfuscatedName("t.e")
	public final int bucketCount = 1024;

	@ObfuscatedName("t.f")
	public final Linkable[] buckets;

	public HashTable(int arg0, int arg1) {
		if (arg1 != this.field356) {
			this.field355 = 236;
		}
		this.buckets = new Linkable[1024];
		for (int var3 = 0; var3 < 1024; var3++) {
			Linkable var4 = this.buckets[var3] = new Linkable();
			var4.next = var4;
			var4.prev = var4;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public Linkable find(long arg0) {
		Linkable var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("t.a(ZJLu;)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		Linkable var4 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		arg1.prev = var4.prev;
		arg1.next = var4;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
		arg1.key = arg0;
	}
}
