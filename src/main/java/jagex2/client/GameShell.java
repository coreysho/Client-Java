package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("a.a")
	public final boolean field1 = true;

	@ObfuscatedName("a.b")
	public final byte field2 = 7;

	@ObfuscatedName("a.c")
	public final int field3 = 2;

	@ObfuscatedName("a.d")
	public int field4 = 5;

	@ObfuscatedName("a.e")
	public final boolean field5 = false;

	@ObfuscatedName("a.f")
	public int state;

	@ObfuscatedName("a.g")
	public int deltime = 20;

	@ObfuscatedName("a.h")
	public int field8 = 1;

	@ObfuscatedName("a.i")
	public final long[] otim = new long[10];

	@ObfuscatedName("a.j")
	public int fps;

	@ObfuscatedName("a.k")
	public boolean debug = false;

	@ObfuscatedName("a.l")
	public int sHei;

	@ObfuscatedName("a.m")
	public int sWid;

	@ObfuscatedName("a.n")
	public Graphics graphics;

	@ObfuscatedName("a.o")
	public PixMap field15;

	@ObfuscatedName("a.p")
	public final Pix32[] field16 = new Pix32[6];

	@ObfuscatedName("a.q")
	public ViewBox frame;

	@ObfuscatedName("a.r")
	public boolean fullredraw = true;

	@ObfuscatedName("a.s")
	public boolean focus = true;

	@ObfuscatedName("a.t")
	public int idleTimer;

	@ObfuscatedName("a.u")
	public int mouseButton;

	@ObfuscatedName("a.v")
	public int mouseX;

	@ObfuscatedName("a.w")
	public int mouseY;

	@ObfuscatedName("a.x")
	public int nextMouseClickButton;

	@ObfuscatedName("a.y")
	public int nextMouseClickX;

	@ObfuscatedName("a.z")
	public int nextMouseClickY;

	@ObfuscatedName("a.F")
	public final int[] keyHeld = new int[128];

	@ObfuscatedName("a.G")
	public final int[] keyQueue = new int[128];

	@ObfuscatedName("a.B")
	public int mouseClickButton;

	@ObfuscatedName("a.C")
	public int mouseClickX;

	@ObfuscatedName("a.D")
	public int mouseClickY;

	@ObfuscatedName("a.H")
	public int keyQueueReadPos;

	@ObfuscatedName("a.I")
	public int keyQueueWritePos;

	@ObfuscatedName("a.A")
	public long nextMouseClickTime;

	@ObfuscatedName("a.E")
	public long mouseClickTime;

	@ObfuscatedName("a.a(ZII)V")
	public final void method1(boolean arg0, int arg1, int arg2) {
		this.setPreferredSize(new Dimension(arg1, arg2));
		this.sHei = arg1;
		this.sWid = arg2;
		this.frame = new ViewBox(this, this.sHei, this.sWid, 0);
		this.graphics = this.getBaseComponent(this.field2).getGraphics();
		this.field15 = new PixMap(this.sWid, this.field3, this.sHei, this.getBaseComponent(this.field2));
		this.startThread(this, 1);
	}

	@ObfuscatedName("a.a(IIB)V")
	public final void method2() {
		this.sHei = 765;
		this.sWid = 503;
		this.graphics = this.getBaseComponent(this.field2).getGraphics();
		this.field15 = new PixMap(this.sWid, this.field3, this.sHei, this.getBaseComponent(this.field2));
		this.startThread(this, 1);
	}

	@Override
	public void run() {
		this.getBaseComponent(this.field2).addMouseListener(this);
		this.getBaseComponent(this.field2).addMouseMotionListener(this);
		this.getBaseComponent(this.field2).addKeyListener(this);
		this.getBaseComponent(this.field2).addFocusListener(this);
		if (this.frame != null) {
			this.frame.addWindowListener(this);
		}
		this.messageBox("Loading...", 0);
		this.maininit();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.otim[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.state < 0) {
					if (this.state == -1) {
						this.shutdown();
					}
					return;
				}
				if (this.state > 0) {
					this.state--;
					if (this.state == 0) {
						this.shutdown();
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.otim[var1]) {
					var2 = (int) ((long) (this.deltime * 2560) / (var11 - this.otim[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.deltime - (var11 - this.otim[var1]) / 10L);
				}
				if (var3 > this.deltime) {
					var3 = this.deltime;
				}
				this.otim[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.otim[var13] != 0L) {
							this.otim[var13] += var3;
						}
					}
				}
				if (var3 < this.field8) {
					var3 = this.field8;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.mouseClickButton = this.nextMouseClickButton;
					this.mouseClickX = this.nextMouseClickX;
					this.mouseClickY = this.nextMouseClickY;
					this.mouseClickTime = this.nextMouseClickTime;
					this.nextMouseClickButton = 0;
					this.mainloop();
					this.keyQueueReadPos = this.keyQueueWritePos;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.deltime > 0) {
					this.fps = var2 * 1000 / (this.deltime * 256);
				}
				this.maindraw();
			} while (!this.debug);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + this.otim[var15]);
			}
			System.out.println("fps:" + this.fps + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.deltime + " mindel:" + this.field8);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.debug = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(I)V")
	public void shutdown() {
		this.state = -2;
		this.unload();
		if (this.frame == null) {
			return;
		}
		try {
			Thread.sleep(1000L);
		} catch (Exception var2) {
		}
		try {
			System.exit(0);
		} catch (Throwable var1) {
		}
	}

	@ObfuscatedName("a.a(II)V")
	public final void setFramerate() {
		this.deltime = 1000;
	}

	@Override
	public final void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	@Override
	public final void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltime;
		}
	}

	@Override
	public final void destroy() {
		this.state = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.state == -1) {
			this.shutdown();
		}
	}

	@Override
	public final void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.fullredraw = true;
		this.refresh();
	}

	@Override
	public final void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.fullredraw = true;
		this.refresh();
	}

	@Override
	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleTimer = 0;
		this.nextMouseClickX = var2;
		this.nextMouseClickY = var3;
		this.nextMouseClickTime = System.currentTimeMillis();
		if (arg0.getButton() == MouseEvent.BUTTON3) {
			this.nextMouseClickButton = 2;
			this.mouseButton = 2;
		} else {
			this.nextMouseClickButton = 1;
			this.mouseButton = 1;
		}
	}

	@Override
	public final void mouseReleased(MouseEvent arg0) {
		this.idleTimer = 0;
		this.mouseButton = 0;
	}

	@Override
	public final void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public final void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public final void mouseExited(MouseEvent arg0) {
		this.idleTimer = 0;
		this.mouseX = -1;
		this.mouseY = -1;
	}

	@Override
	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleTimer = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	@Override
	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleTimer = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	@Override
	public final void keyPressed(KeyEvent arg0) {
		this.idleTimer = 0;
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
			this.keyHeld[var3] = 1;
		}
		if (var3 > 4) {
			this.keyQueue[this.keyQueueWritePos] = var3;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}
	}

	@Override
	public final void keyReleased(KeyEvent arg0) {
		this.idleTimer = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < '\u001E') {
			var3 = '\u0000';
		}
		if (var2 == 37) {
			var3 = '\u0001';
		}
		if (var2 == 39) {
			var3 = '\u0002';
		}
		if (var2 == 38) {
			var3 = '\u0003';
		}
		if (var2 == 40) {
			var3 = '\u0004';
		}
		if (var2 == 17) {
			var3 = '\u0005';
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
		if (var3 > '\u0000' && var3 < '\u0080') {
			this.keyHeld[var3] = 0;
		}
	}

	@Override
	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.a(B)I")
	public final int pollKey() {
		int var1 = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			var1 = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return var1;
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		this.focus = true;
		this.fullredraw = true;
		this.refresh();
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		this.focus = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.keyHeld[var2] = 0;
		}
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("a.a()V")
	public void maininit() {
	}

	@ObfuscatedName("a.b(I)V")
	public void mainloop() {
	}

	@ObfuscatedName("a.c(I)V")
	public void unload() {
	}

	@ObfuscatedName("a.a(Z)V")
	public void maindraw() {
	}

	@ObfuscatedName("a.d(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.b(B)Ljava/awt/Component;")
	public Component getBaseComponent(byte arg0) {
		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(Ljava/lang/String;II)V")
	public void messageBox(String arg0, int arg1) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent(this.field2).getGraphics();
			try {
				this.getBaseComponent(this.field2).repaint();
			} catch (Exception var9) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}
		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = this.getBaseComponent(this.field2).getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		this.getBaseComponent(this.field2).getFontMetrics(var5);
		if (this.fullredraw) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.sHei, this.sWid);
			this.fullredraw = false;
		}
		Color var6 = new Color(140, 17, 17);
		int var7 = this.sWid / 2 - 18;
		this.graphics.setColor(var6);
		this.graphics.drawRect(this.sHei / 2 - 152, var7, 304, 34);
		this.graphics.fillRect(this.sHei / 2 - 150, var7 + 2, arg1 * 3, 30);
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(this.sHei / 2 + arg1 * 3 - 150, var7 + 2, 300 - arg1 * 3, 30);
		this.graphics.setFont(var3);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(arg0, (this.sHei - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
