package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ZPGPWCCV.e")
	public byte[][] field1714 = new byte[4][];

	@ObfuscatedName("ZPGPWCCV.f")
	public boolean field1715 = false;

	@ObfuscatedName("ZPGPWCCV.g")
	public boolean field1716 = true;

	@ObfuscatedName("ZPGPWCCV.h")
	public LinkList field1717 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.l")
	public int[][] field1721 = new int[4][];

	@ObfuscatedName("ZPGPWCCV.o")
	public String field1724 = "";

	@ObfuscatedName("ZPGPWCCV.s")
	public LinkList field1728 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.v")
	public CRC32 field1731 = new CRC32();

	@ObfuscatedName("ZPGPWCCV.y")
	public LinkList field1734 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.z")
	public LinkList field1735 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.A")
	public byte[] field1736 = new byte[65000];

	@ObfuscatedName("ZPGPWCCV.F")
	public byte[] field1741 = new byte[500];

	@ObfuscatedName("ZPGPWCCV.K")
	public DoublyLinkList field1746 = new DoublyLinkList();

	@ObfuscatedName("ZPGPWCCV.P")
	public LinkList field1751 = new LinkList();

	@ObfuscatedName("ZPGPWCCV.S")
	public int[][] field1754 = new int[4][];

	@ObfuscatedName("ZPGPWCCV.b")
	public int field1711;

	@ObfuscatedName("ZPGPWCCV.i")
	public int field1718;

	@ObfuscatedName("ZPGPWCCV.j")
	public int field1719;

	@ObfuscatedName("ZPGPWCCV.k")
	public int field1720;

	@ObfuscatedName("ZPGPWCCV.p")
	public int field1725;

	@ObfuscatedName("ZPGPWCCV.r")
	public int field1727;

	@ObfuscatedName("ZPGPWCCV.u")
	public int field1730;

	@ObfuscatedName("ZPGPWCCV.C")
	public int field1738;

	@ObfuscatedName("ZPGPWCCV.D")
	public int field1739;

	@ObfuscatedName("ZPGPWCCV.Q")
	public int field1752;

	@ObfuscatedName("ZPGPWCCV.U")
	public int field1756;

	@ObfuscatedName("ZPGPWCCV.T")
	public long field1755;

	@ObfuscatedName("ZPGPWCCV.N")
	public OnDemandRequest field1749;

	@ObfuscatedName("ZPGPWCCV.O")
	public Client field1750;

	@ObfuscatedName("ZPGPWCCV.L")
	public InputStream field1747;

	@ObfuscatedName("ZPGPWCCV.q")
	public OutputStream field1726;

	@ObfuscatedName("ZPGPWCCV.w")
	public Socket field1732;

	@ObfuscatedName("ZPGPWCCV.c")
	public byte[] field1712;

	@ObfuscatedName("ZPGPWCCV.d")
	public int[] field1713;

	@ObfuscatedName("ZPGPWCCV.n")
	public int[] field1723;

	@ObfuscatedName("ZPGPWCCV.B")
	public int[] field1737;

	@ObfuscatedName("ZPGPWCCV.G")
	public int[] field1742;

	@ObfuscatedName("ZPGPWCCV.H")
	public int[] field1743;

	@ObfuscatedName("ZPGPWCCV.R")
	public int[] field1753;

	@ObfuscatedName("ZPGPWCCV.a(Z)V")
	public void method581() {
		try {
			int var2 = this.field1747.available();
			if (this.field1739 == 0 && var2 >= 6) {
				this.field1715 = true;
				for (int var3 = 0; var3 < 6; var3 += this.field1747.read(this.field1741, var3, 6 - var3)) {
				}
				int var4 = this.field1741[0] & 0xFF;
				int var5 = ((this.field1741[1] & 0xFF) << 8) + (this.field1741[2] & 0xFF);
				int var6 = ((this.field1741[3] & 0xFF) << 8) + (this.field1741[4] & 0xFF);
				int var7 = this.field1741[5] & 0xFF;
				this.field1749 = null;
				for (OnDemandRequest var8 = (OnDemandRequest) this.field1751.method6(); var8 != null; var8 = (OnDemandRequest) this.field1751.method8()) {
					if (var8.field1363 == var4 && var8.field1364 == var5) {
						this.field1749 = var8;
					}
					if (this.field1749 != null) {
						var8.field1365 = 0;
					}
				}
				if (this.field1749 != null) {
					this.field1730 = 0;
					if (var6 == 0) {
						signlink.reporterror("Rej: " + var4 + "," + var5);
						this.field1749.field1366 = null;
						if (this.field1749.field1367) {
							LinkList var9 = this.field1734;
							synchronized (this.field1734) {
								this.field1734.method3(this.field1749);
							}
						} else {
							this.field1749.method604();
						}
						this.field1749 = null;
					} else {
						if (this.field1749.field1366 == null && var7 == 0) {
							this.field1749.field1366 = new byte[var6];
						}
						if (this.field1749.field1366 == null && var7 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.field1738 = var7 * 500;
				this.field1739 = 500;
				if (this.field1739 > var6 - var7 * 500) {
					this.field1739 = var6 - var7 * 500;
				}
			}
			if (this.field1739 > 0 && var2 >= this.field1739) {
				this.field1715 = true;
				byte[] var10 = this.field1741;
				int var11 = 0;
				if (this.field1749 != null) {
					var10 = this.field1749.field1366;
					var11 = this.field1738;
				}
				for (int var12 = 0; var12 < this.field1739; var12 += this.field1747.read(var10, var11 + var12, this.field1739 - var12)) {
				}
				if (this.field1739 + this.field1738 >= var10.length && this.field1749 != null) {
					if (this.field1750.field524[0] != null) {
						this.field1750.field524[this.field1749.field1363 + 1].method326(var10.length, var10, this.field1749.field1364);
					}
					if (!this.field1749.field1367 && this.field1749.field1363 == 3) {
						this.field1749.field1367 = true;
						this.field1749.field1363 = 93;
					}
					if (this.field1749.field1367) {
						LinkList var13 = this.field1734;
						synchronized (this.field1734) {
							this.field1734.method3(this.field1749);
						}
					} else {
						this.field1749.method604();
					}
				}
				this.field1739 = 0;
			}
		} catch (IOException var18) {
			try {
				this.field1732.close();
			} catch (Exception var15) {
			}
			this.field1732 = null;
			this.field1747 = null;
			this.field1726 = null;
			this.field1739 = 0;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(II)I")
	public int method582(int arg0) {
		return this.field1712[arg0] & 0xFF;
	}

	@ObfuscatedName("ZPGPWCCV.a(I)V")
	public void method456(int arg0) {
		this.method586(0, arg0);
	}

	@ObfuscatedName("ZPGPWCCV.b(I)V")
	public void method583() {
		while (this.field1719 == 0) {
			if (this.field1720 >= 10 || this.field1718 == 0) {
				return;
			}
			LinkList var2 = this.field1735;
			OnDemandRequest var3;
			synchronized (this.field1735) {
				var3 = (OnDemandRequest) this.field1735.method5();
			}
			while (var3 != null) {
				if (this.field1714[var3.field1363][var3.field1364] != 0) {
					this.field1714[var3.field1363][var3.field1364] = 0;
					this.field1751.method3(var3);
					this.method599(var3);
					this.field1715 = true;
					if (this.field1711 < this.field1727) {
						this.field1711++;
					}
					this.field1724 = "Loading extra files - " + this.field1711 * 100 / this.field1727 + "%";
					this.field1720++;
					if (this.field1720 == 10) {
						return;
					}
				}
				LinkList var4 = this.field1735;
				synchronized (this.field1735) {
					var3 = (OnDemandRequest) this.field1735.method5();
				}
			}
			for (int var5 = 0; var5 < 4; var5++) {
				byte[] var6 = this.field1714[var5];
				int var7 = var6.length;
				for (int var8 = 0; var8 < var7; var8++) {
					if (var6[var8] == this.field1718) {
						var6[var8] = 0;
						OnDemandRequest var9 = new OnDemandRequest();
						var9.field1363 = var5;
						var9.field1364 = var8;
						var9.field1367 = false;
						this.field1751.method3(var9);
						this.method599(var9);
						this.field1715 = true;
						if (this.field1711 < this.field1727) {
							this.field1711++;
						}
						this.field1724 = "Loading extra files - " + this.field1711 * 100 / this.field1727 + "%";
						this.field1720++;
						if (this.field1720 == 10) {
							return;
						}
					}
				}
			}
			this.field1718--;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IIBI)V")
	public void method584(int arg1, byte arg2, int arg3) {
		if (this.field1750.field524[0] == null || this.field1754[arg1][arg3] == 0) {
			return;
		}
		byte[] var5 = this.field1750.field524[arg1 + 1].method325(arg3);
		if (this.method598(var5, this.field1754[arg1][arg3], this.field1721[arg1][arg3])) {
			return;
		}
		this.field1714[arg1][arg3] = arg2;
		if (arg2 > this.field1718) {
			this.field1718 = arg2;
		}
		this.field1727++;
	}

	@ObfuscatedName("ZPGPWCCV.a(IZ)Z")
	public boolean method585(int arg0) {
		return this.field1743[arg0] == 1;
	}

	@ObfuscatedName("ZPGPWCCV.b(II)V")
	public void method586(int arg0, int arg1) {
		if (arg0 < 0 || arg0 > this.field1754.length || arg1 < 0 || arg1 > this.field1754[arg0].length || this.field1754[arg0][arg1] == 0) {
			return;
		}
		DoublyLinkList var3 = this.field1746;
		synchronized (this.field1746) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.field1746.method182(); var4 != null; var4 = (OnDemandRequest) this.field1746.method183()) {
				if (var4.field1363 == arg0 && var4.field1364 == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.field1363 = arg0;
			var5.field1364 = arg1;
			var5.field1367 = true;
			LinkList var6 = this.field1717;
			synchronized (this.field1717) {
				this.field1717.method3(var5);
			}
			this.field1746.method180(var5);
		}
	}

	@ObfuscatedName("ZPGPWCCV.a()LQSLIGKQQ;")
	public OnDemandRequest method587() {
		LinkList var1 = this.field1734;
		OnDemandRequest var2;
		synchronized (this.field1734) {
			var2 = (OnDemandRequest) this.field1734.method5();
		}
		if (var2 == null) {
			return null;
		}
		DoublyLinkList var3 = this.field1746;
		synchronized (this.field1746) {
			var2.method185();
		}
		if (var2.field1366 == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1366));
			while (true) {
				if (this.field1736.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.field1736, var4, this.field1736.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.field1366 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1366[var7] = this.field1736[var7];
		}
		return var2;
	}

	public void run() {
		try {
			while (this.field1716) {
				this.field1725++;
				byte var1 = 20;
				if (this.field1718 == 0 && this.field1750.field524[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.field1715 = true;
				for (int var2 = 0; var2 < 100 && this.field1715; var2++) {
					this.field1715 = false;
					this.method595();
					this.method588();
					if (this.field1719 == 0 && var2 >= 5) {
						break;
					}
					this.method583();
					if (this.field1747 != null) {
						this.method581();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.field1751.method6(); var4 != null; var4 = (OnDemandRequest) this.field1751.method8()) {
					if (var4.field1367) {
						var3 = true;
						var4.field1365++;
						if (var4.field1365 > 50) {
							var4.field1365 = 0;
							this.method599(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.field1751.method6(); var5 != null; var5 = (OnDemandRequest) this.field1751.method8()) {
						var3 = true;
						var5.field1365++;
						if (var5.field1365 > 50) {
							var5.field1365 = 0;
							this.method599(var5);
						}
					}
				}
				if (var3) {
					this.field1730++;
					if (this.field1730 > 750) {
						try {
							this.field1732.close();
						} catch (Exception var8) {
						}
						this.field1732 = null;
						this.field1747 = null;
						this.field1726 = null;
						this.field1739 = 0;
					}
				} else {
					this.field1730 = 0;
					this.field1724 = "";
				}
				if (this.field1750.field433 && this.field1732 != null && this.field1726 != null && (this.field1718 > 0 || this.field1750.field524[0] == null)) {
					this.field1752++;
					if (this.field1752 > 500) {
						this.field1752 = 0;
						this.field1741[0] = 0;
						this.field1741[1] = 0;
						this.field1741[2] = 0;
						this.field1741[3] = 10;
						try {
							this.field1726.write(this.field1741, 0, 4);
						} catch (IOException var7) {
							this.field1730 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ZPGPWCCV.c(I)V")
	public void method588() {
		this.field1719 = 0;
		this.field1720 = 0;
		for (OnDemandRequest var2 = (OnDemandRequest) this.field1751.method6(); var2 != null; var2 = (OnDemandRequest) this.field1751.method8()) {
			if (var2.field1367) {
				this.field1719++;
			} else {
				this.field1720++;
			}
		}
		while (this.field1719 < 10) {
			OnDemandRequest var3 = (OnDemandRequest) this.field1728.method5();
			if (var3 == null) {
				break;
			}
			if (this.field1714[var3.field1363][var3.field1364] != 0) {
				this.field1711++;
			}
			this.field1714[var3.field1363][var3.field1364] = 0;
			this.field1751.method3(var3);
			this.field1719++;
			this.method599(var3);
			this.field1715 = true;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(ZB)V")
	public void method589(boolean arg0) {
		int var3 = this.field1723.length;
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg0 || this.field1713[var4] != 0) {
				this.method584(3, (byte) 2, this.field1742[var4]);
				this.method584(3, (byte) 2, this.field1737[var4]);
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.b()I")
	public int method590() {
		DoublyLinkList var1 = this.field1746;
		synchronized (this.field1746) {
			return this.field1746.method184();
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(IZ)Z")
	public boolean method591(int arg0) {
		for (int var3 = 0; var3 < this.field1723.length; var3++) {
			if (this.field1742[var3] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ZPGPWCCV.a(LATJMVOZR;Lclient;)V")
	public void method592(Jagfile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var26 = arg0.method2(var3[var4], null);
			int var27 = var26.length / 2;
			Packet var28 = new Packet(var26);
			this.field1754[var4] = new int[var27];
			this.field1714[var4] = new byte[var27];
			for (int var29 = 0; var29 < var27; var29++) {
				this.field1754[var4][var29] = var28.g2();
			}
		}
		String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var6 = 0; var6 < 4; var6++) {
			byte[] var22 = arg0.method2(var5[var6], null);
			int var23 = var22.length / 4;
			Packet var24 = new Packet(var22);
			this.field1721[var6] = new int[var23];
			for (int var25 = 0; var25 < var23; var25++) {
				this.field1721[var6][var25] = var24.g4();
			}
		}
		byte[] var7 = arg0.method2("model_index", null);
		int var8 = this.field1754[0].length;
		this.field1712 = new byte[var8];
		for (int var9 = 0; var9 < var8; var9++) {
			if (var9 < var7.length) {
				this.field1712[var9] = var7[var9];
			} else {
				this.field1712[var9] = 0;
			}
		}
		byte[] var10 = arg0.method2("map_index", null);
		Packet var11 = new Packet(var10);
		int var12 = var10.length / 7;
		this.field1723 = new int[var12];
		this.field1737 = new int[var12];
		this.field1742 = new int[var12];
		this.field1713 = new int[var12];
		for (int var13 = 0; var13 < var12; var13++) {
			this.field1723[var13] = var11.g2();
			this.field1737[var13] = var11.g2();
			this.field1742[var13] = var11.g2();
			this.field1713[var13] = var11.g1();
		}
		byte[] var14 = arg0.method2("anim_index", null);
		Packet var15 = new Packet(var14);
		int var16 = var14.length / 2;
		this.field1753 = new int[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			this.field1753[var17] = var15.g2();
		}
		byte[] var18 = arg0.method2("midi_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length;
		this.field1743 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.field1743[var21] = var19.g1();
		}
		this.field1750 = arg1;
		this.field1716 = true;
		this.field1750.method142(this, 2);
	}

	@ObfuscatedName("ZPGPWCCV.a(B)V")
	public void method593() {
		LinkList var2 = this.field1735;
		synchronized (this.field1735) {
			this.field1735.method10();
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IIB)V")
	public void method594(int arg0, int arg1) {
		if (this.field1750.field524[0] == null || (this.field1754[arg1][arg0] == 0 || (this.field1714[arg1][arg0] == 0 || this.field1718 == 0))) {
			return;
		}
		OnDemandRequest var4 = new OnDemandRequest();
		var4.field1363 = arg1;
		var4.field1364 = arg0;
		var4.field1367 = false;
		LinkList var5 = this.field1735;
		synchronized (this.field1735) {
			this.field1735.method3(var4);
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(Z)V")
	public void method595() {
		LinkList var2 = this.field1717;
		OnDemandRequest var3;
		synchronized (this.field1717) {
			var3 = (OnDemandRequest) this.field1717.method5();
		}
		while (var3 != null) {
			this.field1715 = true;
			byte[] var5 = null;
			if (this.field1750.field524[0] != null) {
				var5 = this.field1750.field524[var3.field1363 + 1].method325(var3.field1364);
			}
			if (!this.method598(var5, this.field1754[var3.field1363][var3.field1364], this.field1721[var3.field1363][var3.field1364])) {
				var5 = null;
			}
			LinkList var6 = this.field1717;
			synchronized (this.field1717) {
				if (var5 == null) {
					this.field1728.method3(var3);
				} else {
					var3.field1366 = var5;
					LinkList var7 = this.field1734;
					synchronized (this.field1734) {
						this.field1734.method3(var3);
					}
				}
				var3 = (OnDemandRequest) this.field1717.method5();
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.c()V")
	public void method596() {
		this.field1716 = false;
	}

	@ObfuscatedName("ZPGPWCCV.c(II)I")
	public int method597(int arg0) {
		return this.field1754[arg0].length;
	}

	@ObfuscatedName("ZPGPWCCV.a([BIII)Z")
	public boolean method598(byte[] arg0, int arg2, int arg3) {
		if (arg0 == null || arg0.length < 2) {
			return false;
		}
		int var6 = arg0.length - 2;
		int var7 = ((arg0[var6] & 0xFF) << 8) + (arg0[var6 + 1] & 0xFF);
		this.field1731.reset();
		this.field1731.update(arg0, 0, var6);
		int var8 = (int) this.field1731.getValue();
		if (arg2 == var7) {
			return arg3 == var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(ILQSLIGKQQ;)V")
	public void method599(OnDemandRequest arg1) {
		try {
			if (this.field1732 == null) {
				long var3 = System.currentTimeMillis();
				if (var3 - this.field1755 < 4000L) {
					return;
				}
				this.field1755 = var3;
				this.field1732 = this.field1750.method52(Client.field220 + 43594);
				this.field1747 = this.field1732.getInputStream();
				this.field1726 = this.field1732.getOutputStream();
				this.field1726.write(15);
				for (int var5 = 0; var5 < 8; var5++) {
					this.field1747.read();
				}
				this.field1730 = 0;
			}
			this.field1741[0] = (byte) arg1.field1363;
			this.field1741[1] = (byte) (arg1.field1364 >> 8);
			this.field1741[2] = (byte) arg1.field1364;
			if (arg1.field1367) {
				this.field1741[3] = 2;
			} else if (this.field1750.field433) {
				this.field1741[3] = 0;
			} else {
				this.field1741[3] = 1;
			}
			this.field1726.write(this.field1741, 0, 4);
			this.field1752 = 0;
			this.field1756 = -10000;
		} catch (IOException var8) {
			try {
				this.field1732.close();
			} catch (Exception var7) {
			}
			this.field1732 = null;
			this.field1747 = null;
			this.field1726 = null;
			this.field1739 = 0;
			this.field1756++;
		}
	}

	@ObfuscatedName("ZPGPWCCV.d(I)I")
	public int method600() {
		return this.field1753.length;
	}

	@ObfuscatedName("ZPGPWCCV.a(IIII)I")
	public int method601(int arg1, int arg2, int arg3) {
		int var5 = (arg1 << 8) + arg2;
		for (int var6 = 0; var6 < this.field1723.length; var6++) {
			if (this.field1723[var6] == var5) {
				if (arg3 == 0) {
					return this.field1737[var6];
				}
				return this.field1742[var6];
			}
		}
		return -1;
	}
}
