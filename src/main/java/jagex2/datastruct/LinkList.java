package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ob")
public final class LinkList {

	@ObfuscatedName("ob.a")
	public final boolean field739 = true;

	@ObfuscatedName("ob.b")
	public boolean field740 = true;

	@ObfuscatedName("ob.c")
	public final int field741 = -676;

	@ObfuscatedName("ob.d")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("ob.e")
	public Linkable cursor;

	public LinkList(int arg0) {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a(ZLu;)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel;
		arg0.next = this.sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public Linkable popFront() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public Linkable head() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public Linkable tail() {
		Linkable var1 = this.sentinel.prev;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public Linkable next(byte arg0) {
		Linkable var2 = this.cursor;
		if (var2 == this.sentinel) {
			this.cursor = null;
			return null;
		}
		this.cursor = var2.next;
		if (arg0 != 0) {
			this.field740 = !this.field740;
		}
		return var2;
	}

	@ObfuscatedName("ob.b(Z)Lu;")
	public Linkable prev() {
		Linkable var1 = this.cursor;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void clear() {
		if (this.sentinel.next == this.sentinel) {
			return;
		}
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (var1 == this.sentinel) {
				return;
			}
			var1.unlink();
		}
	}
}
