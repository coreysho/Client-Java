package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class Linkable {

	@ObfuscatedName("u.a")
	public final int field361 = 587;

	@ObfuscatedName("u.b")
	public long key;

	@ObfuscatedName("u.c")
	public Linkable next;

	@ObfuscatedName("u.d")
	public Linkable prev;

	@ObfuscatedName("u.a()V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
