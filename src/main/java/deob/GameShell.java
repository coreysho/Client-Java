package deob;

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
	public int field6;

	@ObfuscatedName("a.g")
	public int field7 = 20;

	@ObfuscatedName("a.h")
	public int field8 = 1;

	@ObfuscatedName("a.i")
	public final long[] field9 = new long[10];

	@ObfuscatedName("a.j")
	public int field10;

	@ObfuscatedName("a.k")
	public boolean field11 = false;

	@ObfuscatedName("a.l")
	public int field12;

	@ObfuscatedName("a.m")
	public int field13;

	@ObfuscatedName("a.n")
	public Graphics field14;

	@ObfuscatedName("a.o")
	public PixMap field15;

	@ObfuscatedName("a.p")
	public final Pix32[] field16 = new Pix32[6];

	@ObfuscatedName("a.q")
	public ViewBox field17;

	@ObfuscatedName("a.r")
	public boolean field18 = true;

	@ObfuscatedName("a.s")
	public boolean field19 = true;

	@ObfuscatedName("a.t")
	public int field20;

	@ObfuscatedName("a.u")
	public int field21;

	@ObfuscatedName("a.v")
	public int field22;

	@ObfuscatedName("a.w")
	public int field23;

	@ObfuscatedName("a.x")
	public int field24;

	@ObfuscatedName("a.y")
	public int field25;

	@ObfuscatedName("a.z")
	public int field26;

	@ObfuscatedName("a.F")
	public final int[] field32 = new int[128];

	@ObfuscatedName("a.G")
	public final int[] field33 = new int[128];

	@ObfuscatedName("a.B")
	public int field28;

	@ObfuscatedName("a.C")
	public int field29;

	@ObfuscatedName("a.D")
	public int field30;

	@ObfuscatedName("a.H")
	public int field34;

	@ObfuscatedName("a.I")
	public int field35;

	@ObfuscatedName("a.A")
	public long field27;

	@ObfuscatedName("a.E")
	public long field31;

	@ObfuscatedName("a.a(ZII)V")
	public final void method1(boolean arg0, int arg1, int arg2) {
		this.setPreferredSize(new Dimension(arg1, arg2));
		this.field12 = arg1;
		this.field13 = arg2;
		this.field17 = new ViewBox(this, this.field12, this.field13, 0);
		this.field14 = this.method11(this.field2).getGraphics();
		this.field15 = new PixMap(this.field13, this.field3, this.field12, this.method11(this.field2));
		this.method12(this, 1);
	}

	@ObfuscatedName("a.a(IIB)V")
	public final void method2() {
		this.field12 = 765;
		this.field13 = 503;
		this.field14 = this.method11(this.field2).getGraphics();
		this.field15 = new PixMap(this.field13, this.field3, this.field12, this.method11(this.field2));
		this.method12(this, 1);
	}

	@Override
	public void run() {
		this.method11(this.field2).addMouseListener(this);
		this.method11(this.field2).addMouseMotionListener(this);
		this.method11(this.field2).addKeyListener(this);
		this.method11(this.field2).addFocusListener(this);
		if (this.field17 != null) {
			this.field17.addWindowListener(this);
		}
		this.method13("Loading...", 0);
		this.method6();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.field9[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.field6 < 0) {
					if (this.field6 == -1) {
						this.method3();
					}
					return;
				}
				if (this.field6 > 0) {
					this.field6--;
					if (this.field6 == 0) {
						this.method3();
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.field9[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.field9[var1]) {
					var2 = (int) ((long) (this.field7 * 2560) / (var11 - this.field9[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.field7 - (var11 - this.field9[var1]) / 10L);
				}
				if (var3 > this.field7) {
					var3 = this.field7;
				}
				this.field9[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.field9[var13] != 0L) {
							this.field9[var13] += var3;
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
					this.field28 = this.field24;
					this.field29 = this.field25;
					this.field30 = this.field26;
					this.field31 = this.field27;
					this.field24 = 0;
					this.method7();
					this.field34 = this.field35;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.field7 > 0) {
					this.field10 = var2 * 1000 / (this.field7 * 256);
				}
				this.method9();
			} while (!this.field11);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + this.field9[var15]);
			}
			System.out.println("fps:" + this.field10 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.field7 + " mindel:" + this.field8);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.field11 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(I)V")
	public void method3() {
		this.field6 = -2;
		this.method8();
		if (this.field17 == null) {
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
	public final void method4() {
		this.field7 = 1000;
	}

	@Override
	public final void start() {
		if (this.field6 >= 0) {
			this.field6 = 0;
		}
	}

	@Override
	public final void stop() {
		if (this.field6 >= 0) {
			this.field6 = 4000 / this.field7;
		}
	}

	@Override
	public final void destroy() {
		this.field6 = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.field6 == -1) {
			this.method3();
		}
	}

	@Override
	public final void update(Graphics arg0) {
		if (this.field14 == null) {
			this.field14 = arg0;
		}
		this.field18 = true;
		this.method10();
	}

	@Override
	public final void paint(Graphics arg0) {
		if (this.field14 == null) {
			this.field14 = arg0;
		}
		this.field18 = true;
		this.method10();
	}

	@Override
	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.field20 = 0;
		this.field25 = var2;
		this.field26 = var3;
		this.field27 = System.currentTimeMillis();
		if (arg0.getButton() == MouseEvent.BUTTON3) {
			this.field24 = 2;
			this.field21 = 2;
		} else {
			this.field24 = 1;
			this.field21 = 1;
		}
	}

	@Override
	public final void mouseReleased(MouseEvent arg0) {
		this.field20 = 0;
		this.field21 = 0;
	}

	@Override
	public final void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public final void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public final void mouseExited(MouseEvent arg0) {
		this.field20 = 0;
		this.field22 = -1;
		this.field23 = -1;
	}

	@Override
	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.field20 = 0;
		this.field22 = var2;
		this.field23 = var3;
	}

	@Override
	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.field20 = 0;
		this.field22 = var2;
		this.field23 = var3;
	}

	@Override
	public final void keyPressed(KeyEvent arg0) {
		this.field20 = 0;
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
			this.field32[var3] = 1;
		}
		if (var3 > 4) {
			this.field33[this.field35] = var3;
			this.field35 = this.field35 + 1 & 0x7F;
		}
	}

	@Override
	public final void keyReleased(KeyEvent arg0) {
		this.field20 = 0;
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
			this.field32[var3] = 0;
		}
	}

	@Override
	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.a(B)I")
	public final int method5() {
		int var1 = -1;
		if (this.field35 != this.field34) {
			var1 = this.field33[this.field34];
			this.field34 = this.field34 + 1 & 0x7F;
		}
		return var1;
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		this.field19 = true;
		this.field18 = true;
		this.method10();
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		this.field19 = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.field32[var2] = 0;
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
	public void method6() {
	}

	@ObfuscatedName("a.b(I)V")
	public void method7() {
	}

	@ObfuscatedName("a.c(I)V")
	public void method8() {
	}

	@ObfuscatedName("a.a(Z)V")
	public void method9() {
	}

	@ObfuscatedName("a.d(I)V")
	public void method10() {
	}

	@ObfuscatedName("a.b(B)Ljava/awt/Component;")
	public Component method11(byte arg0) {
		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(Ljava/lang/String;II)V")
	public void method13(String arg0, int arg1) {
		while (this.field14 == null) {
			this.field14 = this.method11(this.field2).getGraphics();
			try {
				this.method11(this.field2).repaint();
			} catch (Exception var9) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}
		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = this.method11(this.field2).getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		this.method11(this.field2).getFontMetrics(var5);
		if (this.field18) {
			this.field14.setColor(Color.black);
			this.field14.fillRect(0, 0, this.field12, this.field13);
			this.field18 = false;
		}
		Color var6 = new Color(140, 17, 17);
		int var7 = this.field13 / 2 - 18;
		this.field14.setColor(var6);
		this.field14.drawRect(this.field12 / 2 - 152, var7, 304, 34);
		this.field14.fillRect(this.field12 / 2 - 150, var7 + 2, arg1 * 3, 30);
		this.field14.setColor(Color.black);
		this.field14.fillRect(this.field12 / 2 + arg1 * 3 - 150, var7 + 2, 300 - arg1 * 3, 30);
		this.field14.setFont(var3);
		this.field14.setColor(Color.white);
		this.field14.drawString(arg0, (this.field12 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
