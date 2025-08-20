package jagex2.datastruct;

import deob.ObfuscatedName;

public class LinkList {

	@ObfuscatedName("BOHLFXVX.c")
	public Linkable field92 = new Linkable();

	@ObfuscatedName("BOHLFXVX.d")
	public Linkable field93;

	public LinkList() {
		this.field92.field1770 = this.field92;
		this.field92.field1771 = this.field92;
	}

	@ObfuscatedName("BOHLFXVX.a(LZUOIJLRD;)V")
	public void method3(Linkable arg0) {
		if (arg0.field1771 != null) {
			arg0.unlink();
		}
		arg0.field1771 = this.field92.field1771;
		arg0.field1770 = this.field92;
		arg0.field1771.field1770 = arg0;
		arg0.field1770.field1771 = arg0;
	}

	@ObfuscatedName("BOHLFXVX.a(BLZUOIJLRD;)V")
	public void method4(Linkable arg1) {
		if (arg1.field1771 != null) {
			arg1.unlink();
		}
		arg1.field1771 = this.field92;
		arg1.field1770 = this.field92.field1770;
		arg1.field1771.field1770 = arg1;
		arg1.field1770.field1771 = arg1;
	}

	@ObfuscatedName("BOHLFXVX.a()LZUOIJLRD;")
	public Linkable method5() {
		Linkable var1 = this.field92.field1770;
		if (this.field92 == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.b()LZUOIJLRD;")
	public Linkable method6() {
		Linkable var1 = this.field92.field1770;
		if (this.field92 == var1) {
			this.field93 = null;
			return null;
		} else {
			this.field93 = var1.field1770;
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(Z)LZUOIJLRD;")
	public Linkable method7() {
		Linkable var2 = this.field92.field1771;
		if (this.field92 == var2) {
			this.field93 = null;
			return null;
		} else {
			this.field93 = var2.field1771;
			return var2;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(I)LZUOIJLRD;")
	public Linkable method8() {
		Linkable var2 = this.field93;
		if (this.field92 == var2) {
			this.field93 = null;
			return null;
		}
		this.field93 = var2.field1770;
		return var2;
	}

	@ObfuscatedName("BOHLFXVX.b(I)LZUOIJLRD;")
	public Linkable method9() {
		Linkable var2 = this.field93;
		if (this.field92 == var2) {
			this.field93 = null;
			return null;
		} else {
			this.field93 = var2.field1771;
			return var2;
		}
	}

	@ObfuscatedName("BOHLFXVX.c()V")
	public void method10() {
		if (this.field92.field1770 == this.field92) {
			return;
		}
		while (true) {
			Linkable var1 = this.field92.field1770;
			if (this.field92 == var1) {
				return;
			}
			var1.unlink();
		}
	}
}
