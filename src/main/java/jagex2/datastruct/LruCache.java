package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("s")
public final class LruCache {

	@ObfuscatedName("s.a")
	public final int field345 = 7228;

	@ObfuscatedName("s.b")
	public final boolean field346 = false;

	@ObfuscatedName("s.c")
	public final boolean field347 = false;

	@ObfuscatedName("s.d")
	public int field348;

	@ObfuscatedName("s.e")
	public int field349;

	@ObfuscatedName("s.f")
	public final Linkable2 field350 = new Linkable2();

	@ObfuscatedName("s.g")
	public final int capacity = 50000;

	@ObfuscatedName("s.h")
	public int available = 50000;

	@ObfuscatedName("s.i")
	public final HashTable cache = new HashTable(1024, this.field345);

	@ObfuscatedName("s.j")
	public final LinkList2 order = new LinkList2((byte) 8);

	public LruCache(int arg0, int arg1) {
	}

	@ObfuscatedName("s.a(J)Lw;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 == null) {
			this.field348++;
		} else {
			this.order.push(var3);
			this.field349++;
		}
		return var3;
	}

	@ObfuscatedName("s.a(IJLw;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (this.available == 0) {
			Linkable2 var4 = this.order.popFront();
			var4.unlink();
			var4.unlink2();
			if (var4 == this.field350) {
				Linkable2 var5 = this.order.popFront();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			this.available--;
		}
		this.cache.put(arg0, arg1);
		this.order.push(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void clear() {
		while (true) {
			Linkable2 var1 = this.order.popFront();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
