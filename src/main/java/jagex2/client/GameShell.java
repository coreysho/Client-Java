package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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

	@ObfuscatedName("JWWAIQPI.g")
	public int field944 = 20;

	@ObfuscatedName("JWWAIQPI.h")
	public int mindel = 1;

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
	public int idleCycles;

	@ObfuscatedName("JWWAIQPI.u")
	public int mouseButton;

	@ObfuscatedName("JWWAIQPI.v")
	public int mouseX;

	@ObfuscatedName("JWWAIQPI.w")
	public int mouseY;

	@ObfuscatedName("JWWAIQPI.x")
	public int field961;

	@ObfuscatedName("JWWAIQPI.y")
	public int field962;

	@ObfuscatedName("JWWAIQPI.z")
	public int field963;

	@ObfuscatedName("JWWAIQPI.B")
	public int mouseClickButton;

	@ObfuscatedName("JWWAIQPI.C")
	public int mouseClickX;

	@ObfuscatedName("JWWAIQPI.D")
	public int mouseClickY;

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
	public Graphics graphics;

	@ObfuscatedName("JWWAIQPI.a(III)V")
	public void initApplication(int arg1, int arg2) {
		this.setPreferredSize(new Dimension(arg2, arg1));
		this.field949 = arg2;
		this.field950 = arg1;
		this.field954 = new ViewBox(this.field950, this, this.field949);
		this.graphics = this.getBaseComponent().getGraphics();
		this.field952 = new PixMap(this.field950, this.getBaseComponent(), this.field949);
		this.startThread(this, 1);
	}

	@ObfuscatedName("JWWAIQPI.b(III)V")
	public void method267(int arg0, int arg1) {
		this.setPreferredSize(new Dimension(arg0, arg1));
		this.field949 = arg0;
		this.field950 = arg1;
		this.graphics = this.getBaseComponent().getGraphics();
		this.field952 = new PixMap(this.field950, this.getBaseComponent(), this.field949);
		this.startThread(this, 1);
	}

	public void run() {
		this.getBaseComponent().addMouseListener(this);
		this.getBaseComponent().addMouseMotionListener(this);
		this.getBaseComponent().addKeyListener(this);
		this.getBaseComponent().addFocusListener(this);
		if (this.field954 != null) {
			this.field954.addWindowListener(this);
		}
		this.drawProgress(0, "Loading...");
		this.load();
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
						this.method268();
					}
					return;
				}
				if (this.field943 > 0) {
					this.field943--;
					if (this.field943 == 0) {
						this.method268();
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
				if (var3 < this.mindel) {
					var3 = this.mindel;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.mouseClickButton = this.field961;
					this.mouseClickX = this.field962;
					this.mouseClickY = this.field963;
					this.field968 = this.field964;
					this.field961 = 0;
					this.update();
					this.field971 = this.field972;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.field944 > 0) {
					this.field947 = var2 * 1000 / (this.field944 * 256);
				}
				this.draw();
			} while (!this.field948);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 - var14 - 1 + 20) % 10;
				System.out.println("otim" + var15 + ":" + this.field946[var15]);
			}
			System.out.println("fps:" + this.field947 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.field944 + " mindel:" + this.mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.field948 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("JWWAIQPI.a(Z)V")
	public void method268() {
		this.field943 = -2;
		this.unload();
		if (this.field954 == null) {
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
	public void method269(int arg1) {
		this.field944 = 1000 / arg1;
	}

	public void start() {
		if (this.field943 >= 0) {
			this.field943 = 0;
		}
	}

	public void stop() {
		if (this.field943 >= 0) {
			this.field943 = 4000 / this.field944;
		}
	}

	public void destroy() {
		this.field943 = -1;
		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}
		if (this.field943 == -1) {
			this.method268();
		}
	}

	public void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.field955 = true;
		this.refresh();
	}

	public void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.field955 = true;
		this.refresh();
	}

	public void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleCycles = 0;
		this.field962 = var2;
		this.field963 = var3;
		this.field964 = System.currentTimeMillis();

		try {
			// Java >8 no longer uses "isMetaDown" for right clicks
			if (arg0.getButton() == MouseEvent.BUTTON3) {
				this.field961 = 2;
				this.mouseButton = 2;
			} else {
				this.field961 = 1;
				this.mouseButton = 1;
			}
		} catch (NoSuchMethodError ex) {
			if (arg0.isMetaDown()) {
				this.field961 = 2;
				this.mouseButton = 2;
			} else {
				this.field961 = 1;
				this.mouseButton = 1;
			}
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseButton = 0;
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;
	}

	public void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	public void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	public void keyPressed(KeyEvent arg0) {
		this.idleCycles = 0;
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
	}

	public void keyReleased(KeyEvent arg0) {
		this.idleCycles = 0;
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

	public void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a(I)I")
	public int pollKey() {
		int var2 = -1;
		if (this.field972 != this.field971) {
			var2 = this.field970[this.field971];
			this.field971 = this.field971 + 1 & 0x7F;
		}
		return var2;
	}

	public void focusGained(FocusEvent arg0) {
		this.field956 = true;
		this.field955 = true;
		this.refresh();
	}

	public void focusLost(FocusEvent arg0) {
		this.field956 = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.field969[var2] = 0;
		}
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a()V")
	public void load() {
	}

	@ObfuscatedName("JWWAIQPI.a(B)V")
	public void update() {
	}

	@ObfuscatedName("JWWAIQPI.b(I)V")
	public void unload() {
	}

	@ObfuscatedName("JWWAIQPI.c(I)V")
	public void draw() {
	}

	@ObfuscatedName("JWWAIQPI.b(B)V")
	public void refresh() {
	}

	@ObfuscatedName("JWWAIQPI.d(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		return this;
	}

	@ObfuscatedName("JWWAIQPI.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("JWWAIQPI.a(IZLjava/lang/String;)V")
	public void drawProgress(int arg0, String arg2) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent().getGraphics();
			try {
				this.getBaseComponent().repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.getBaseComponent().getFontMetrics(var4);
		Font var6 = new Font("Helvetica", 0, 13);
		this.getBaseComponent().getFontMetrics(var6);
		if (this.field955) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.field949, this.field950);
			this.field955 = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.field950 / 2 - 18;
		this.graphics.setColor(var7);
		this.graphics.drawRect(this.field949 / 2 - 152, var8, 304, 34);
		this.graphics.fillRect(this.field949 / 2 - 150, var8 + 2, arg0 * 3, 30);
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(arg0 * 3 + (this.field949 / 2 - 150), var8 + 2, 300 - arg0 * 3, 30);
		this.graphics.setFont(var4);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(arg2, (this.field949 - var5.stringWidth(arg2)) / 2, var8 + 22);
	}
}
