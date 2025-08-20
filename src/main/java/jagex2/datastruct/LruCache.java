package jagex2.datastruct;

import deob.ObfuscatedName;

public class LruCache {

	@ObfuscatedName("RHNYLZZL.d")
	public DoublyLinkable field1374 = new DoublyLinkable();

	@ObfuscatedName("RHNYLZZL.h")
	public DoublyLinkList field1378 = new DoublyLinkList();

	@ObfuscatedName("RHNYLZZL.e")
	public int field1375;

	@ObfuscatedName("RHNYLZZL.f")
	public int field1376;

	@ObfuscatedName("RHNYLZZL.g")
	public HashTable field1377;

	@ObfuscatedName("RHNYLZZL.b")
	public int field1372;

	@ObfuscatedName("RHNYLZZL.c")
	public int field1373;

	public LruCache(int arg0) {
		this.field1375 = arg0;
		this.field1376 = arg0;
		this.field1377 = new HashTable(1024);
	}

	@ObfuscatedName("RHNYLZZL.a(J)LDPPNUUMQ;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.field1377.method259(arg0);
		if (var3 == null) {
			this.field1372++;
		} else {
			this.field1378.method180(var3);
			this.field1373++;
		}
		return var3;
	}

	@ObfuscatedName("RHNYLZZL.a(LDPPNUUMQ;JI)V")
	public void put(DoublyLinkable arg0, long arg1) {
		if (this.field1376 == 0) {
			DoublyLinkable var5 = this.field1378.method181();
			var5.unlink();
			var5.method185();
			if (this.field1374 == var5) {
				DoublyLinkable var6 = this.field1378.method181();
				var6.unlink();
				var6.method185();
			}
		} else {
			this.field1376--;
		}
		this.field1377.method260(arg0, arg1);
		this.field1378.method180(arg0);
	}

	@ObfuscatedName("RHNYLZZL.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable var1 = this.field1378.method181();
			if (var1 == null) {
				this.field1376 = this.field1375;
				return;
			}
			var1.unlink();
			var1.method185();
		}
	}
}
