package jagex2.datastruct;

import deob.ObfuscatedName;

public class DoublyLinkList {

	@ObfuscatedName("CZYJUOKA.a")
	public boolean field630 = true;

	@ObfuscatedName("CZYJUOKA.b")
	public DoublyLinkable field631 = new DoublyLinkable();

	@ObfuscatedName("CZYJUOKA.c")
	public DoublyLinkable field632;

	public DoublyLinkList(boolean arg0) {
		this.field631.field633 = this.field631;
		this.field631.field634 = this.field631;
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	@ObfuscatedName("CZYJUOKA.a(LDPPNUUMQ;)V")
	public void method180(DoublyLinkable arg0) {
		if (arg0.field634 != null) {
			arg0.method185();
		}
		arg0.field634 = this.field631.field634;
		arg0.field633 = this.field631;
		arg0.field634.field633 = arg0;
		arg0.field633.field634 = arg0;
	}

	@ObfuscatedName("CZYJUOKA.a()LDPPNUUMQ;")
	public DoublyLinkable method181() {
		DoublyLinkable var1 = this.field631.field633;
		if (this.field631 == var1) {
			return null;
		} else {
			var1.method185();
			return var1;
		}
	}

	@ObfuscatedName("CZYJUOKA.b()LDPPNUUMQ;")
	public DoublyLinkable method182() {
		DoublyLinkable var1 = this.field631.field633;
		if (this.field631 == var1) {
			this.field632 = null;
			return null;
		} else {
			this.field632 = var1.field633;
			return var1;
		}
	}

	@ObfuscatedName("CZYJUOKA.a(I)LDPPNUUMQ;")
	public DoublyLinkable method183(int arg0) {
		DoublyLinkable var2 = this.field632;
		if (this.field631 == var2) {
			this.field632 = null;
			return null;
		}
		this.field632 = var2.field633;
		if (arg0 < 1 || arg0 > 1) {
			this.field630 = !this.field630;
		}
		return var2;
	}

	@ObfuscatedName("CZYJUOKA.c()I")
	public int method184() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.field631.field633; var2 != this.field631; var2 = var2.field633) {
			var1++;
		}
		return var1;
	}
}
