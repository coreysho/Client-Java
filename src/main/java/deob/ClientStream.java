package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class ClientStream implements Runnable {

	@ObfuscatedName("e.a")
	public int field132 = 416;

	@ObfuscatedName("e.b")
	public final int field133 = -2584;

	@ObfuscatedName("e.c")
	public final boolean field134 = false;

	@ObfuscatedName("e.d")
	public final InputStream field135;

	@ObfuscatedName("e.e")
	public final OutputStream field136;

	@ObfuscatedName("e.f")
	public final Socket field137;

	@ObfuscatedName("e.g")
	public boolean field138 = false;

	@ObfuscatedName("e.h")
	public final GameShell field139;

	@ObfuscatedName("e.i")
	public byte[] field140;

	@ObfuscatedName("e.j")
	public int field141;

	@ObfuscatedName("e.k")
	public int field142;

	@ObfuscatedName("e.l")
	public boolean field143 = false;

	@ObfuscatedName("e.m")
	public boolean field144 = false;

	public ClientStream(int arg0, Socket arg1, GameShell arg2) throws IOException {
		this.field139 = arg2;
		this.field137 = arg1;
		this.field137.setSoTimeout(30000);
		this.field137.setTcpNoDelay(true);
		this.field135 = this.field137.getInputStream();
		this.field136 = this.field137.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		this.field138 = true;
		try {
			if (this.field135 != null) {
				this.field135.close();
			}
			if (this.field136 != null) {
				this.field136.close();
			}
			if (this.field137 != null) {
				this.field137.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.field143 = false;
		synchronized (this) {
			this.notify();
		}
		this.field140 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		return this.field138 ? 0 : this.field135.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		return this.field138 ? 0 : this.field135.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field138) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field135.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.a(II[BI)V")
	public void method42(int arg0, byte[] arg1) throws IOException {
		if (this.field138) {
			return;
		}
		if (this.field144) {
			this.field144 = false;
			throw new IOException("Error in writer thread");
		}
		if (this.field140 == null) {
			this.field140 = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg0; var4++) {
				this.field140[this.field142] = arg1[var4];
				this.field142 = (this.field142 + 1) % 5000;
				if (this.field142 == (this.field141 + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.field143) {
				this.field143 = true;
				this.field139.method12(this, 3);
			}
			this.notify();
		}
		if (this.field133 != -2584) {
			this.field132 = -158;
		}
	}

	@Override
	public void run() {
		while (this.field143) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.field142 == this.field141) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.field143) {
					return;
				}
				var2 = this.field141;
				if (this.field142 >= this.field141) {
					var3 = this.field142 - this.field141;
				} else {
					var3 = 5000 - this.field141;
				}
			}
			if (var3 > 0) {
				try {
					this.field136.write(this.field140, var2, var3);
				} catch (IOException var5) {
					this.field144 = true;
				}
				this.field141 = (this.field141 + var3) % 5000;
				try {
					if (this.field142 == this.field141) {
						this.field136.flush();
					}
				} catch (IOException var4) {
					this.field144 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(Z)V")
	public void method43() {
		System.out.println("dummy:" + this.field138);
		System.out.println("tcycl:" + this.field141);
		System.out.println("tnum:" + this.field142);
		System.out.println("writer:" + this.field143);
		System.out.println("ioerror:" + this.field144);
		try {
			System.out.println("available:" + this.method40());
		} catch (IOException var1) {
		}
	}
}
