package deob;

@ObfuscatedName("pb")
public final class LinkList2 {

	@ObfuscatedName("pb.a")
	public boolean field744 = true;

	@ObfuscatedName("pb.b")
	public final Linkable2 field745 = new Linkable2();

	@ObfuscatedName("pb.c")
	public Linkable2 field746;

	public LinkList2(byte arg0) {
		this.field745.field389 = this.field745;
		this.field745.field390 = this.field745;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void method248(Linkable2 arg0) {
		if (arg0.field390 != null) {
			arg0.method107();
		}
		arg0.field390 = this.field745.field390;
		arg0.field389 = this.field745;
		arg0.field390.field389 = arg0;
		arg0.field389.field390 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public Linkable2 method249() {
		Linkable2 var1 = this.field745.field389;
		if (var1 == this.field745) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lw;")
	public Linkable2 method250() {
		Linkable2 var1 = this.field745.field389;
		if (var1 == this.field745) {
			this.field746 = null;
			return null;
		} else {
			this.field746 = var1.field389;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lw;")
	public Linkable2 method251(byte arg0) {
		Linkable2 var2 = this.field746;
		if (var2 == this.field745) {
			this.field746 = null;
			return null;
		}
		this.field746 = var2.field389;
		if (arg0 != 0) {
			this.field744 = !this.field744;
		}
		return var2;
	}

	@ObfuscatedName("pb.c()I")
	public int method252() {
		int var1 = 0;
		for (Linkable2 var2 = this.field745.field389; var2 != this.field745; var2 = var2.field389) {
			var1++;
		}
		return var1;
	}
}
