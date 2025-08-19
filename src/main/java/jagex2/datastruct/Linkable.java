package jagex2.datastruct;

import deob.ObfuscatedName;

public class Linkable {

	@ObfuscatedName("ZUOIJLRD.a")
	public long field1769;

	@ObfuscatedName("ZUOIJLRD.b")
	public Linkable field1770;

	@ObfuscatedName("ZUOIJLRD.c")
	public Linkable field1771;

	@ObfuscatedName("ZUOIJLRD.a()V")
	public void method604() {
		if (this.field1771 != null) {
			this.field1771.field1770 = this.field1770;
			this.field1770.field1771 = this.field1771;
			this.field1770 = null;
			this.field1771 = null;
		}
	}
}
