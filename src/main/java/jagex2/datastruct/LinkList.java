package jagex2.datastruct;

import deob.ObfuscatedName;

public class LinkList {

	@ObfuscatedName("BOHLFXVX.a")
	public int field90 = -48545;

	@ObfuscatedName("BOHLFXVX.c")
	public Linkable field92 = new Linkable();

	@ObfuscatedName("BOHLFXVX.b")
	public int field91;

	@ObfuscatedName("BOHLFXVX.d")
	public Linkable field93;

	public LinkList(boolean arg0) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		this.field92.field1770 = this.field92;
		this.field92.field1771 = this.field92;
	}

	@ObfuscatedName("BOHLFXVX.a(LZUOIJLRD;)V")
	public void method3(Linkable arg0) {
		if (arg0.field1771 != null) {
			arg0.method604();
		}
		arg0.field1771 = this.field92.field1771;
		arg0.field1770 = this.field92;
		arg0.field1771.field1770 = arg0;
		arg0.field1770.field1771 = arg0;
	}

	@ObfuscatedName("BOHLFXVX.a(BLZUOIJLRD;)V")
	public void method4(byte arg0, Linkable arg1) {
		if (arg0 != -57) {
			this.field91 = -23;
		}
		if (arg1.field1771 != null) {
			arg1.method604();
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
			var1.method604();
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
	public Linkable method7(boolean arg0) {
		Linkable var2 = this.field92.field1771;
		if (arg0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		if (this.field92 == var2) {
			this.field93 = null;
			return null;
		} else {
			this.field93 = var2.field1771;
			return var2;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(I)LZUOIJLRD;")
	public Linkable method8(int arg0) {
		Linkable var2 = this.field93;
		if (this.field92 == var2) {
			this.field93 = null;
			return null;
		}
		this.field93 = var2.field1770;
		if (arg0 != 1) {
			throw new NullPointerException();
		}
		return var2;
	}

	@ObfuscatedName("BOHLFXVX.b(I)LZUOIJLRD;")
	public Linkable method9(int arg0) {
		Linkable var2 = this.field93;
		if (arg0 <= 0) {
			throw new NullPointerException();
		} else if (this.field92 == var2) {
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
			var1.method604();
		}
	}
}
