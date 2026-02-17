package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public final GameShell field37;

	public ViewBox(GameShell arg0, int arg1, int arg2, int arg3) {
		this.field37 = arg0;
		this.setTitle("Jagex");
		this.setResizable(false);
		this.resize(arg1 + 8, arg2 + 28);
		this.show();
		this.toFront();
		if (arg3 != 0) {
			throw new NullPointerException();
		}
		this.resize(arg1 + 8, arg2 + 28);
	}

	@Override
	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	@Override
	public void update(Graphics arg0) {
		this.field37.update(arg0);
	}

	@Override
	public void paint(Graphics arg0) {
		this.field37.paint(arg0);
	}
}
