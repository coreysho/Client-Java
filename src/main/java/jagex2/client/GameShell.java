package jagex2.client;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("JWWAIQPI.a")
	public int field938 = 8;

	@ObfuscatedName("JWWAIQPI.b")
	public boolean field939 = false;

	@ObfuscatedName("JWWAIQPI.c")
	public boolean field940 = false;

	@ObfuscatedName("JWWAIQPI.d")
	public int field941 = 3;

	@ObfuscatedName("JWWAIQPI.g")
	public int field944 = 20;

	@ObfuscatedName("JWWAIQPI.h")
	public int field945 = 1;

	@ObfuscatedName("JWWAIQPI.i")
	public long[] field946 = new long[10];

	@ObfuscatedName("JWWAIQPI.k")
	public boolean field948 = false;

	@ObfuscatedName("JWWAIQPI.p")
	public Pix32[] field953 = new Pix32[6];

	@ObfuscatedName("JWWAIQPI.r")
	public boolean field955 = true;

	@ObfuscatedName("JWWAIQPI.s")
	public boolean field956 = true;

	@ObfuscatedName("JWWAIQPI.F")
	public int[] field969 = new int[128];

	@ObfuscatedName("JWWAIQPI.G")
	public int[] field970 = new int[128];

	@ObfuscatedName("JWWAIQPI.e")
	public int field942;

	@ObfuscatedName("JWWAIQPI.f")
	public int field943;

	@ObfuscatedName("JWWAIQPI.j")
	public int field947;

	@ObfuscatedName("JWWAIQPI.l")
	public int field949;

	@ObfuscatedName("JWWAIQPI.m")
	public int field950;

	@ObfuscatedName("JWWAIQPI.t")
	public int field957;

	@ObfuscatedName("JWWAIQPI.u")
	public int field958;

	@ObfuscatedName("JWWAIQPI.v")
	public int field959;

	@ObfuscatedName("JWWAIQPI.w")
	public int field960;

	@ObfuscatedName("JWWAIQPI.x")
	public int field961;

	@ObfuscatedName("JWWAIQPI.y")
	public int field962;

	@ObfuscatedName("JWWAIQPI.z")
	public int field963;

	@ObfuscatedName("JWWAIQPI.B")
	public int field965;

	@ObfuscatedName("JWWAIQPI.C")
	public int field966;

	@ObfuscatedName("JWWAIQPI.D")
	public int field967;

	@ObfuscatedName("JWWAIQPI.H")
	public int field971;

	@ObfuscatedName("JWWAIQPI.I")
	public int field972;

	@ObfuscatedName("JWWAIQPI.J")
	public static int field973;

	@ObfuscatedName("JWWAIQPI.A")
	public long field964;

	@ObfuscatedName("JWWAIQPI.E")
	public long field968;

	@ObfuscatedName("JWWAIQPI.q")
	public ViewBox field954;

	@ObfuscatedName("JWWAIQPI.o")
	public PixMap field952;

	@ObfuscatedName("JWWAIQPI.n")
	public Graphics field951;

	@ObfuscatedName("JWWAIQPI.a(III)V")
	public final void method266(int arg0, int arg1, int arg2) {
		this.field949 = arg2;
		this.field950 = arg1;
		this.field954 = new ViewBox(this.field941, this.field950, this, this.field949);
		if (arg0 < 0) {
			this.field951 = this.method164(-756).getGraphics();
			this.field952 = new PixMap(this.field950, (byte) -12, this.method164(-756), this.field949);
			this.method142(this, 1);
		}
	}

	@ObfuscatedName("JWWAIQPI.b(III)V")
	public final void method267(int arg0, int arg1, int arg2) {
		this.field949 = arg0;
		if (arg2 == 2) {
			this.field950 = arg1;
			this.field951 = this.method164(-756).getGraphics();
			this.field952 = new PixMap(this.field950, (byte) -12, this.method164(-756), this.field949);
			this.method142(this, 1);
		}
	}

	public void run() {
		this.method164(-756).addMouseListener(this);
		this.method164(-756).addMouseMotionListener(this);
		this.method164(-756).addKeyListener(this);
		this.method164(-756).addFocusListener(this);
		if (this.field954 != null) {
			this.field954.addWindowListener(this);
		}
		this.method165(0, true, "Loading...");
		this.method86();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.field946[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.field943 < 0) {
					if (this.field943 == -1) {
						this.method268(this.field939);
					}
					return;
				}
				if (this.field943 > 0) {
					this.field943--;
					if (this.field943 == 0) {
						this.method268(this.field939);
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.field946[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.field946[var1]) {
					var2 = (int) ((long) (this.field944 * 2560) / (var11 - this.field946[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.field944 - (var11 - this.field946[var1]) / 10L);
				}
				if (var3 > this.field944) {
					var3 = this.field944;
				}
				this.field946[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.field946[var13] != 0L) {
							this.field946[var13] += var3;
						}
					}
				}
				if (var3 < this.field945) {
					var3 = this.field945;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.field965 = this.field961;
					this.field966 = this.field962;
					this.field967 = this.field963;
					this.field968 = this.field964;
					this.field961 = 0;
					this.method113((byte) -111);
					this.field971 = this.field972;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.field944 > 0) {
					this.field947 = var2 * 1000 / (this.field944 * 256);
				}
				this.method152(818);
			} while (!this.field948);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 - var14 - 1 + 20) % 10;
				System.out.println("otim" + var15 + ":" + this.field946[var15]);
			}
			System.out.println("fps:" + this.field947 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.field944 + " mindel:" + this.field945);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.field948 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("JWWAIQPI.a(Z)V")
	public final void method268(boolean arg0) {
		this.field943 = -2;
		this.method40(277);
		if (arg0 || this.field954 == null) {
			return;
		}
		try {
			Thread.sleep(1000L);
		} catch (Exception var3) {
		}
		try {
			System.exit(0);
		} catch (Throwable var2) {
		}
	}

	@ObfuscatedName("JWWAIQPI.a(BI)V")
	public final void method269(byte arg0, int arg1) {
		if (arg0 != 103) {
			this.field938 = 388;
		}
		this.field944 = 1000 / arg1;
	}

	public final void start() {
		if (this.field943 >= 0) {
			this.field943 = 0;
		}
	}

	public final void stop() {
		if (this.field943 >= 0) {
			this.field943 = 4000 / this.field944;
		}
	}

	public final void destroy() {
		this.field943 = -1;
		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}
		if (this.field943 == -1) {
			this.method268(this.field939);
		}
	}

	public final void update(Graphics arg0) {
		if (this.field951 == null) {
			this.field951 = arg0;
		}
		this.field955 = true;
		this.method82((byte) -99);
	}

	public final void paint(Graphics arg0) {
		if (this.field951 == null) {
			this.field951 = arg0;
		}
		this.field955 = true;
		this.method82((byte) -99);
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field954 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field957 = 0;
		this.field962 = var2;
		this.field963 = var3;
		this.field964 = System.currentTimeMillis();

		try {
			// Java >8 no longer uses "isMetaDown" for right clicks
			if (arg0.getButton() == MouseEvent.BUTTON3) {
				this.field961 = 2;
				this.field958 = 2;
			} else {
				this.field961 = 1;
				this.field958 = 1;
			}
		} catch (NoSuchMethodError ex) {
			if (arg0.isMetaDown()) {
				this.field961 = 2;
				this.field958 = 2;
			} else {
				this.field961 = 1;
				this.field958 = 1;
			}
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.field957 = 0;
		this.field958 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		this.field957 = 0;
		this.field959 = -1;
		this.field960 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field954 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field957 = 0;
		this.field959 = var2;
		this.field960 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field954 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field957 = 0;
		this.field959 = var2;
		this.field960 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		this.field957 = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = 8;
		}
		if (var2 == 127) {
			var3 = 8;
		}
		if (var2 == 9) {
			var3 = 9;
		}
		if (var2 == 10) {
			var3 = 10;
		}
		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}
		if (var2 == 36) {
			var3 = 1000;
		}
		if (var2 == 35) {
			var3 = 1001;
		}
		if (var2 == 33) {
			var3 = 1002;
		}
		if (var2 == 34) {
			var3 = 1003;
		}
		if (var3 > 0 && var3 < 128) {
			this.field969[var3] = 1;
		}
		if (var3 > 4) {
			this.field970[this.field972] = var3;
			this.field972 = this.field972 + 1 & 0x7F;
		}
		if (Linkable.field1772) {
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		this.field957 = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = '\b';
		}
		if (var2 == 127) {
			var3 = '\b';
		}
		if (var2 == 9) {
			var3 = '\t';
		}
		if (var2 == 10) {
			var3 = '\n';
		}
		if (var3 > 0 && var3 < 128) {
			this.field969[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a(I)I")
	public final int method270(int arg0) {
		while (arg0 >= 0) {
			this.field942 = -9;
		}
		int var2 = -1;
		if (this.field972 != this.field971) {
			var2 = this.field970[this.field971];
			this.field971 = this.field971 + 1 & 0x7F;
		}
		return var2;
	}

	public final void focusGained(FocusEvent arg0) {
		this.field956 = true;
		this.field955 = true;
		this.method82((byte) -99);
	}

	public final void focusLost(FocusEvent arg0) {
		this.field956 = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.field969[var2] = 0;
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a()V")
	public void method86() {
	}

	@ObfuscatedName("JWWAIQPI.a(B)V")
	public void method113(byte arg0) {
		if (arg0 != -111) {
			this.field942 = -400;
		}
	}

	@ObfuscatedName("JWWAIQPI.b(I)V")
	public void method40(int arg0) {
		int var2 = 41 / arg0;
	}

	@ObfuscatedName("JWWAIQPI.c(I)V")
	public void method152(int arg0) {
		if (arg0 > 0) {
			;
		}
	}

	@ObfuscatedName("JWWAIQPI.b(B)V")
	public void method82(byte arg0) {
		if (arg0 == -99) {
			;
		}
	}

	@ObfuscatedName("JWWAIQPI.d(I)Ljava/awt/Component;")
	public Component method164(int arg0) {
		if (arg0 >= 0) {
			this.field941 = 329;
		}
		return this.field954 == null ? this : this.field954;
	}

	@ObfuscatedName("JWWAIQPI.a(Ljava/lang/Runnable;I)V")
	public void method142(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("JWWAIQPI.a(IZLjava/lang/String;)V")
	public void method165(int arg0, boolean arg1, String arg2) {
		while (this.field951 == null) {
			this.field951 = this.method164(-756).getGraphics();
			try {
				this.method164(-756).repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.method164(-756).getFontMetrics(var4);
		if (!arg1) {
			this.field938 = -145;
		}
		Font var6 = new Font("Helvetica", 0, 13);
		this.method164(-756).getFontMetrics(var6);
		if (this.field955) {
			this.field951.setColor(Color.black);
			this.field951.fillRect(0, 0, this.field949, this.field950);
			this.field955 = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.field950 / 2 - 18;
		this.field951.setColor(var7);
		this.field951.drawRect(this.field949 / 2 - 152, var8, 304, 34);
		this.field951.fillRect(this.field949 / 2 - 150, var8 + 2, arg0 * 3, 30);
		this.field951.setColor(Color.black);
		this.field951.fillRect(arg0 * 3 + (this.field949 / 2 - 150), var8 + 2, 300 - arg0 * 3, 30);
		this.field951.setFont(var4);
		this.field951.setColor(Color.white);
		this.field951.drawString(arg2, (this.field949 - var5.stringWidth(arg2)) / 2, var8 + 22);
	}
}
