package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("ub")
public final class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ub.a")
	public boolean field804 = true;

	@ObfuscatedName("ub.b")
	public int field805;

	@ObfuscatedName("ub.c")
	public final byte field806 = 0;

	@ObfuscatedName("ub.d")
	public final int field807 = 477;

	@ObfuscatedName("ub.e")
	public final int[][] field808 = new int[4][];

	@ObfuscatedName("ub.f")
	public final int[][] field809 = new int[4][];

	@ObfuscatedName("ub.g")
	public final byte[][] field810 = new byte[4][];

	@ObfuscatedName("ub.h")
	public int field811;

	@ObfuscatedName("ub.i")
	public byte[] field812;

	@ObfuscatedName("ub.j")
	public int[] field813;

	@ObfuscatedName("ub.k")
	public int[] field814;

	@ObfuscatedName("ub.l")
	public int[] field815;

	@ObfuscatedName("ub.m")
	public int[] field816;

	@ObfuscatedName("ub.n")
	public int[] field817;

	@ObfuscatedName("ub.o")
	public int[] field818;

	@ObfuscatedName("ub.p")
	public boolean field819 = true;

	@ObfuscatedName("ub.q")
	public Client field820;

	@ObfuscatedName("ub.r")
	public final CRC32 field821 = new CRC32();

	@ObfuscatedName("ub.s")
	public boolean field822 = false;

	@ObfuscatedName("ub.t")
	public int field823;

	@ObfuscatedName("ub.u")
	public int field824;

	@ObfuscatedName("ub.v")
	public final LinkList2 field825 = new LinkList2((byte) 8);

	@ObfuscatedName("ub.w")
	public final LinkList field826 = new LinkList(-822);

	@ObfuscatedName("ub.x")
	public final LinkList field827 = new LinkList(-822);

	@ObfuscatedName("ub.y")
	public final LinkList field828 = new LinkList(-822);

	@ObfuscatedName("ub.z")
	public final LinkList field829 = new LinkList(-822);

	@ObfuscatedName("ub.A")
	public final LinkList field830 = new LinkList(-822);

	@ObfuscatedName("ub.B")
	public String field831 = "";

	@ObfuscatedName("ub.L")
	public final byte[] field841 = new byte[500];

	@ObfuscatedName("ub.M")
	public final byte[] field842 = new byte[65000];

	@ObfuscatedName("ub.C")
	public int field832;

	@ObfuscatedName("ub.D")
	public int field833;

	@ObfuscatedName("ub.H")
	public int field837;

	@ObfuscatedName("ub.J")
	public int field839;

	@ObfuscatedName("ub.K")
	public int field840;

	@ObfuscatedName("ub.N")
	public int field843;

	@ObfuscatedName("ub.O")
	public int field844;

	@ObfuscatedName("ub.Q")
	public int field846;

	@ObfuscatedName("ub.P")
	public long field845;

	@ObfuscatedName("ub.I")
	public OnDemandRequest field838;

	@ObfuscatedName("ub.F")
	public InputStream field835;

	@ObfuscatedName("ub.G")
	public OutputStream field836;

	@ObfuscatedName("ub.E")
	public Socket field834;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public void method265(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method294(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5, (byte) 1);
			this.field808[var4] = new int[var6];
			this.field810[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				this.field808[var4][var8] = var7.g2();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method294(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11, (byte) 1);
			this.field809[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				this.field809[var10][var14] = var13.g4();
			}
		}
		byte[] var15 = arg0.method294("model_index", null);
		int var16 = this.field808[0].length;
		this.field812 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				this.field812[var17] = var15[var17];
			} else {
				this.field812[var17] = 0;
			}
		}
		byte[] var18 = arg0.method294("map_index", null);
		Packet var19 = new Packet(var18, (byte) 1);
		int var20 = var18.length / 7;
		this.field813 = new int[var20];
		this.field814 = new int[var20];
		this.field815 = new int[var20];
		this.field816 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.field813[var21] = var19.g2();
			this.field814[var21] = var19.g2();
			this.field815[var21] = var19.g2();
			this.field816[var21] = var19.g1();
		}
		byte[] var22 = arg0.method294("anim_index", null);
		Packet var23 = new Packet(var22, (byte) 1);
		int var24 = var22.length / 2;
		this.field817 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.field817[var25] = var23.g2();
		}
		byte[] var26 = arg0.method294("midi_index", null);
		Packet var27 = new Packet(var26, (byte) 1);
		int var28 = var26.length;
		this.field818 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.field818[var29] = var27.g1();
		}
		this.field820 = arg1;
		this.field819 = true;
		this.field820.method12(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public void method266() {
		this.field819 = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public int method267(int arg0, int arg1) {
		if (arg0 != 0) {
			this.field804 = !this.field804;
		}
		return this.field808[arg1].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public int method268() {
		return this.field817.length;
	}

	@ObfuscatedName("ub.a(IIZI)I")
	public int method269(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < this.field813.length; var5++) {
			if (this.field813[var5] == var4) {
				if (arg0 == 0) {
					return this.field814[var5];
				}
				return this.field815[var5];
			}
		}
		return -1;
	}

	@ObfuscatedName("ub.a(ZI)V")
	public void method270(boolean arg0) {
		int var2 = this.field813.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || this.field816[var3] != 0) {
				this.method277(this.field815[var3], 3, (byte) 2);
				this.method277(this.field814[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("ub.b(II)Z")
	public boolean method271(int arg0) {
		for (int var2 = 0; var2 < this.field813.length; var2++) {
			if (this.field815[var2] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ub.a(IB)I")
	public int getModelUse(int arg0) {
		return this.field812[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.a(IZ)Z")
	public boolean method273(int arg0) {
		return this.field818[arg0] == 1;
	}

	@ObfuscatedName("ub.a(I)V")
	@Override
	public void method264(int arg0) {
		this.request(0, arg0);
	}

	@ObfuscatedName("ub.c(II)V")
	public void request(int arg0, int arg1) {
		if (arg0 > this.field808.length || arg1 < 0 || arg1 > this.field808[arg0].length || this.field808[arg0][arg1] == 0) {
			return;
		}
		LinkList2 var3 = this.field825;
		synchronized (this.field825) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.field825.method250(); var4 != null; var4 = (OnDemandRequest) this.field825.method251(this.field806)) {
				if (var4.field722 == arg0 && var4.field723 == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.field722 = arg0;
			var5.field723 = arg1;
			var5.field726 = true;
			LinkList var6 = this.field826;
			synchronized (this.field826) {
				this.field826.method240(var5);
			}
			this.field825.method248(var5);
		}
	}

	@ObfuscatedName("ub.b()I")
	public int method275() {
		LinkList2 var1 = this.field825;
		synchronized (this.field825) {
			return this.field825.method252();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public OnDemandRequest method276() {
		LinkList var1 = this.field829;
		OnDemandRequest var2;
		synchronized (this.field829) {
			var2 = (OnDemandRequest) this.field829.method242();
		}
		if (var2 == null) {
			return null;
		}
		LinkList2 var3 = this.field825;
		synchronized (this.field825) {
			var2.method107();
		}
		if (var2.field724 == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field724));
			while (true) {
				if (var4 == this.field842.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.field842, var4, this.field842.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.field724 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field724[var7] = this.field842[var7];
		}
		return var2;
	}

	@ObfuscatedName("ub.a(BIIB)V")
	public void method277(int arg0, int arg1, byte arg2) {
		if (this.field820.field1641[0] == null || this.field808[arg1][arg0] == 0) {
			return;
		}
		byte[] var4 = this.field820.field1641[arg1 + 1].method286(arg0);
		if (this.method284(this.field809[arg1][arg0], this.field808[arg1][arg0], var4)) {
			return;
		}
		this.field810[arg1][arg0] = arg2;
		if (arg2 > this.field811) {
			this.field811 = arg2;
		}
		this.field833++;
	}

	@ObfuscatedName("ub.a(B)V")
	public void method278() {
		LinkList var1 = this.field830;
		synchronized (this.field830) {
			this.field830.method247();
		}
	}

	@ObfuscatedName("ub.a(III)V")
	public void method279(int arg0, int arg1) {
		if (this.field820.field1641[0] == null || (this.field808[arg0][arg1] == 0 || (this.field810[arg0][arg1] == 0 || this.field811 == 0))) {
			return;
		}
		OnDemandRequest var3 = new OnDemandRequest();
		var3.field722 = arg0;
		var3.field723 = arg1;
		var3.field726 = false;
		LinkList var4 = this.field830;
		synchronized (this.field830) {
			this.field830.method240(var3);
		}
	}

	@Override
	public void run() {
		try {
			while (this.field819) {
				this.field846++;
				byte var1 = 20;
				if (this.field811 == 0 && this.field820.field1641[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.field822 = true;
				for (int var2 = 0; var2 < 100 && this.field822; var2++) {
					this.field822 = false;
					this.method280();
					this.method281();
					if (this.field823 == 0 && var2 >= 5) {
						break;
					}
					this.method282();
					if (this.field835 != null) {
						this.method283();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.field828.method243(); var4 != null; var4 = (OnDemandRequest) this.field828.method245(this.field806)) {
					if (var4.field726) {
						var3 = true;
						var4.field725++;
						if (var4.field725 > 50) {
							var4.field725 = 0;
							this.method285(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.field828.method243(); var5 != null; var5 = (OnDemandRequest) this.field828.method245(this.field806)) {
						var3 = true;
						var5.field725++;
						if (var5.field725 > 50) {
							var5.field725 = 0;
							this.method285(var5);
						}
					}
				}
				if (var3) {
					this.field843++;
					if (this.field843 > 750) {
						try {
							this.field834.close();
						} catch (Exception var8) {
						}
						this.field834 = null;
						this.field835 = null;
						this.field836 = null;
						this.field840 = 0;
					}
				} else {
					this.field843 = 0;
					this.field831 = "";
				}
				if (this.field820.field1321 && this.field834 != null && this.field836 != null && (this.field811 > 0 || this.field820.field1641[0] == null)) {
					this.field844++;
					if (this.field844 > 500) {
						this.field844 = 0;
						this.field841[0] = 0;
						this.field841[1] = 0;
						this.field841[2] = 0;
						this.field841[3] = 10;
						try {
							this.field836.write(this.field841, 0, 4);
						} catch (IOException var7) {
							this.field843 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.b(B)V")
	public void method280() {
		LinkList var1 = this.field826;
		OnDemandRequest var2;
		synchronized (this.field826) {
			var2 = (OnDemandRequest) this.field826.method242();
		}
		while (var2 != null) {
			this.field822 = true;
			byte[] var3 = null;
			if (this.field820.field1641[0] != null) {
				var3 = this.field820.field1641[var2.field722 + 1].method286(var2.field723);
			}
			if (!this.method284(this.field809[var2.field722][var2.field723], this.field808[var2.field722][var2.field723], var3)) {
				var3 = null;
			}
			LinkList var4 = this.field826;
			synchronized (this.field826) {
				if (var3 == null) {
					this.field827.method240(var2);
				} else {
					var2.field724 = var3;
					LinkList var5 = this.field829;
					synchronized (this.field829) {
						this.field829.method240(var2);
					}
				}
				var2 = (OnDemandRequest) this.field826.method242();
			}
		}
	}

	@ObfuscatedName("ub.a(Z)V")
	public void method281() {
		this.field823 = 0;
		this.field824 = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) this.field828.method243(); var1 != null; var1 = (OnDemandRequest) this.field828.method245(this.field806)) {
			if (var1.field726) {
				this.field823++;
			} else {
				this.field824++;
			}
		}
		while (this.field823 < 10) {
			OnDemandRequest var2 = (OnDemandRequest) this.field827.method242();
			if (var2 == null) {
				break;
			}
			if (this.field810[var2.field722][var2.field723] != 0) {
				this.field832++;
			}
			this.field810[var2.field722][var2.field723] = 0;
			this.field828.method240(var2);
			this.field823++;
			this.method285(var2);
			this.field822 = true;
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public void method282() {
		while (this.field823 == 0) {
			if (this.field824 >= 10 || this.field811 == 0) {
				return;
			}
			LinkList var1 = this.field830;
			OnDemandRequest var2;
			synchronized (this.field830) {
				var2 = (OnDemandRequest) this.field830.method242();
			}
			while (var2 != null) {
				if (this.field810[var2.field722][var2.field723] != 0) {
					this.field810[var2.field722][var2.field723] = 0;
					this.field828.method240(var2);
					this.method285(var2);
					this.field822 = true;
					if (this.field832 < this.field833) {
						this.field832++;
					}
					this.field831 = "Loading extra files - " + this.field832 * 100 / this.field833 + "%";
					this.field824++;
					if (this.field824 == 10) {
						return;
					}
				}
				LinkList var3 = this.field830;
				synchronized (this.field830) {
					var2 = (OnDemandRequest) this.field830.method242();
				}
			}
			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = this.field810[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == this.field811) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.field722 = var4;
						var8.field723 = var7;
						var8.field726 = false;
						this.field828.method240(var8);
						this.method285(var8);
						this.field822 = true;
						if (this.field832 < this.field833) {
							this.field832++;
						}
						this.field831 = "Loading extra files - " + this.field832 * 100 / this.field833 + "%";
						this.field824++;
						if (this.field824 == 10) {
							return;
						}
					}
				}
			}
			this.field811--;
		}
	}

	@ObfuscatedName("ub.d(I)V")
	public void method283() {
		try {
			int var1 = this.field835.available();
			if (this.field840 == 0 && var1 >= 6) {
				this.field822 = true;
				for (int var2 = 0; var2 < 6; var2 += this.field835.read(this.field841, var2, 6 - var2)) {
				}
				int var3 = this.field841[0] & 0xFF;
				int var4 = ((this.field841[1] & 0xFF) << 8) + (this.field841[2] & 0xFF);
				int var5 = ((this.field841[3] & 0xFF) << 8) + (this.field841[4] & 0xFF);
				int var6 = this.field841[5] & 0xFF;
				this.field838 = null;
				for (OnDemandRequest var7 = (OnDemandRequest) this.field828.method243(); var7 != null; var7 = (OnDemandRequest) this.field828.method245(this.field806)) {
					if (var7.field722 == var3 && var7.field723 == var4) {
						this.field838 = var7;
					}
					if (this.field838 != null) {
						var7.field725 = 0;
					}
				}
				if (this.field838 != null) {
					this.field843 = 0;
					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						this.field838.field724 = null;
						if (this.field838.field726) {
							LinkList var8 = this.field829;
							synchronized (this.field829) {
								this.field829.method240(this.field838);
							}
						} else {
							this.field838.method106();
						}
						this.field838 = null;
					} else {
						if (this.field838.field724 == null && var6 == 0) {
							this.field838.field724 = new byte[var5];
						}
						if (this.field838.field724 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.field839 = var6 * 500;
				this.field840 = 500;
				if (this.field840 > var5 - var6 * 500) {
					this.field840 = var5 - var6 * 500;
				}
			}
			if (this.field840 > 0 && var1 >= this.field840) {
				this.field822 = true;
				byte[] var9 = this.field841;
				int var10 = 0;
				if (this.field838 != null) {
					var9 = this.field838.field724;
					var10 = this.field839;
				}
				for (int var11 = 0; var11 < this.field840; var11 += this.field835.read(var9, var11 + var10, this.field840 - var11)) {
				}
				if (this.field840 + this.field839 >= var9.length && this.field838 != null) {
					if (this.field820.field1641[0] != null) {
						this.field820.field1641[this.field838.field722 + 1].method287(var9.length, this.field838.field723, var9);
					}
					if (!this.field838.field726 && this.field838.field722 == 3) {
						this.field838.field726 = true;
						this.field838.field722 = 93;
					}
					if (this.field838.field726) {
						LinkList var12 = this.field829;
						synchronized (this.field829) {
							this.field829.method240(this.field838);
						}
					} else {
						this.field838.method106();
					}
				}
				this.field840 = 0;
			}
		} catch (IOException var17) {
			try {
				this.field834.close();
			} catch (Exception var14) {
			}
			this.field834 = null;
			this.field835 = null;
			this.field836 = null;
			this.field840 = 0;
		}
	}

	@ObfuscatedName("ub.a(BII[B)Z")
	public boolean method284(int arg0, int arg1, byte[] arg2) {
		if (arg2 == null || arg2.length < 2) {
			return false;
		}
		int var4 = arg2.length - 2;
		int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
		this.field821.reset();
		this.field821.update(arg2, 0, var4);
		int var6 = (int) this.field821.getValue();
		if (var5 == arg1) {
			return var6 == arg0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ub.a(Lmb;I)V")
	public void method285(OnDemandRequest arg0) {
		try {
			if (this.field834 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - this.field845 < 4000L) {
					return;
				}
				this.field845 = var2;
				this.field834 = this.field820.method480(Client.field1654 + 43594);
				this.field835 = this.field834.getInputStream();
				this.field836 = this.field834.getOutputStream();
				this.field836.write(15);
				for (int var4 = 0; var4 < 8; var4++) {
					this.field835.read();
				}
				this.field843 = 0;
			}
			this.field841[0] = (byte) arg0.field722;
			this.field841[1] = (byte) (arg0.field723 >> 8);
			this.field841[2] = (byte) arg0.field723;
			if (arg0.field726) {
				this.field841[3] = 2;
			} else if (this.field820.field1321) {
				this.field841[3] = 0;
			} else {
				this.field841[3] = 1;
			}
			this.field836.write(this.field841, 0, 4);
			this.field844 = 0;
			this.field837 = -10000;
		} catch (IOException var7) {
			try {
				this.field834.close();
			} catch (Exception var6) {
			}
			this.field834 = null;
			this.field835 = null;
			this.field836 = null;
			this.field840 = 0;
			this.field837++;
		}
	}
}
