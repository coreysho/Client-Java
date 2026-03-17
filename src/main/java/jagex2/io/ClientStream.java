package jagex2.io;

import jagex2.client.GameShell;
import deob.ObfuscatedName;

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
	public final InputStream in;

	@ObfuscatedName("e.e")
	public final OutputStream out;

	@ObfuscatedName("e.f")
	public final Socket socket;

	@ObfuscatedName("e.g")
	public boolean dummy = false;

	@ObfuscatedName("e.h")
	public final GameShell shell;

	@ObfuscatedName("e.i")
	public byte[] data;

	@ObfuscatedName("e.j")
	public int tcycl;

	@ObfuscatedName("e.k")
	public int tnum;

	@ObfuscatedName("e.l")
	public boolean writer = false;

	@ObfuscatedName("e.m")
	public boolean ioerror = false;

	public ClientStream(int arg0, Socket arg1, GameShell arg2) throws IOException {
		this.shell = arg2;
		this.socket = arg1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void close() {
		this.dummy = true;
		try {
			if (this.in != null) {
				this.in.close();
			}
			if (this.out != null) {
				this.out.close();
			}
			if (this.socket != null) {
				this.socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.writer = false;
		synchronized (this) {
			this.notify();
		}
		this.data = null;
	}

	@ObfuscatedName("e.b()I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("e.c()I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.a(II[BI)V")
	public void write(int arg0, byte[] arg1) throws IOException {
		if (this.dummy) {
			return;
		}
		if (this.ioerror) {
			this.ioerror = false;
			throw new IOException("Error in writer thread");
		}
		if (this.data == null) {
			this.data = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg0; var4++) {
				this.data[this.tnum] = arg1[var4];
				this.tnum = (this.tnum + 1) % 5000;
				if (this.tnum == (this.tcycl + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.writer) {
				this.writer = true;
				this.shell.startThread(this, 3);
			}
			this.notify();
		}
		if (this.field133 != -2584) {
			this.field132 = -158;
		}
	}

	@Override
	public void run() {
		while (this.writer) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.tnum == this.tcycl) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.writer) {
					return;
				}
				var2 = this.tcycl;
				if (this.tnum >= this.tcycl) {
					var3 = this.tnum - this.tcycl;
				} else {
					var3 = 5000 - this.tcycl;
				}
			}
			if (var3 > 0) {
				try {
					this.out.write(this.data, var2, var3);
				} catch (IOException var5) {
					this.ioerror = true;
				}
				this.tcycl = (this.tcycl + var3) % 5000;
				try {
					if (this.tnum == this.tcycl) {
						this.out.flush();
					}
				} catch (IOException var4) {
					this.ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(Z)V")
	public void method43() {
		System.out.println("dummy:" + this.dummy);
		System.out.println("tcycl:" + this.tcycl);
		System.out.println("tnum:" + this.tnum);
		System.out.println("writer:" + this.writer);
		System.out.println("ioerror:" + this.ioerror);
		try {
			System.out.println("available:" + this.available());
		} catch (IOException var1) {
		}
	}
}
