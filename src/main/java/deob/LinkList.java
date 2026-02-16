package deob;

@ObfuscatedName("ob")
public final class LinkList {

	@ObfuscatedName("ob.a")
	public final boolean field739 = true;

	@ObfuscatedName("ob.b")
	public boolean field740 = true;

	@ObfuscatedName("ob.c")
	public final int field741 = -676;

	@ObfuscatedName("ob.d")
	public final Linkable field742 = new Linkable();

	@ObfuscatedName("ob.e")
	public Linkable field743;

	public LinkList(int arg0) {
		this.field742.field363 = this.field742;
		this.field742.field364 = this.field742;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method240(Linkable arg0) {
		if (arg0.field364 != null) {
			arg0.method106();
		}
		arg0.field364 = this.field742.field364;
		arg0.field363 = this.field742;
		arg0.field364.field363 = arg0;
		arg0.field363.field364 = arg0;
	}

	@ObfuscatedName("ob.a(ZLu;)V")
	public void method241(Linkable arg0) {
		if (arg0.field364 != null) {
			arg0.method106();
		}
		arg0.field364 = this.field742;
		arg0.field363 = this.field742.field363;
		arg0.field364.field363 = arg0;
		arg0.field363.field364 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public Linkable method242() {
		Linkable var1 = this.field742.field363;
		if (var1 == this.field742) {
			return null;
		} else {
			var1.method106();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public Linkable method243() {
		Linkable var1 = this.field742.field363;
		if (var1 == this.field742) {
			this.field743 = null;
			return null;
		} else {
			this.field743 = var1.field363;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public Linkable method244() {
		Linkable var1 = this.field742.field364;
		if (var1 == this.field742) {
			this.field743 = null;
			return null;
		} else {
			this.field743 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public Linkable method245(byte arg0) {
		Linkable var2 = this.field743;
		if (var2 == this.field742) {
			this.field743 = null;
			return null;
		}
		this.field743 = var2.field363;
		if (arg0 != 0) {
			this.field740 = !this.field740;
		}
		return var2;
	}

	@ObfuscatedName("ob.b(Z)Lu;")
	public Linkable method246() {
		Linkable var1 = this.field743;
		if (var1 == this.field742) {
			this.field743 = null;
			return null;
		} else {
			this.field743 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method247() {
		if (this.field742.field363 == this.field742) {
			return;
		}
		while (true) {
			Linkable var1 = this.field742.field363;
			if (var1 == this.field742) {
				return;
			}
			var1.method106();
		}
	}
}
