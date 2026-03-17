package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList2 {

	@ObfuscatedName("pb.a")
	public boolean field744 = true;

	@ObfuscatedName("pb.b")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("pb.c")
	public Linkable2 cursor;

	public LinkList2(byte arg0) {
		this.sentinel.next2 = this.sentinel;
		this.sentinel.prev2 = this.sentinel;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel.prev2;
		arg0.next2 = this.sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public Linkable2 popFront() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lw;")
	public Linkable2 head() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lw;")
	public Linkable2 next(byte arg0) {
		Linkable2 var2 = this.cursor;
		if (var2 == this.sentinel) {
			this.cursor = null;
			return null;
		}
		this.cursor = var2.next2;
		if (arg0 != 0) {
			this.field744 = !this.field744;
		}
		return var2;
	}

	@ObfuscatedName("pb.c()I")
	public int size() {
		int var1 = 0;
		for (Linkable2 var2 = this.sentinel.next2; var2 != this.sentinel; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
