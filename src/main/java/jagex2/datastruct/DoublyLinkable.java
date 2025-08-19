package jagex2.datastruct;

import deob.ObfuscatedName;

public class DoublyLinkable extends Linkable {

	@ObfuscatedName("DPPNUUMQ.e")
	public DoublyLinkable field633;

	@ObfuscatedName("DPPNUUMQ.f")
	public DoublyLinkable field634;

	@ObfuscatedName("DPPNUUMQ.b()V")
	public void method185() {
		if (this.field634 != null) {
			this.field634.field633 = this.field633;
			this.field633.field634 = this.field634;
			this.field633 = null;
			this.field634 = null;
		}
	}
}
