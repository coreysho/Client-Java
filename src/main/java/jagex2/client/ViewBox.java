package jagex2.client;

import deob.ObfuscatedName;
import java.awt.*;

public class ViewBox extends Frame {

	@ObfuscatedName("IEJCKZCR.a")
	public GameShell field876;

	public Insets insets;

	public ViewBox(int arg1, GameShell arg2, int arg3) {
		this.field876 = arg2;
		this.setTitle("Jagex");
		this.setResizable(false);

		// macOS needs a size set before the window is shown
		this.resize(arg3 + 8, arg1 + 28);
		this.show();
		this.toFront();

		this.insets = this.getInsets();
		this.resize(arg3 + this.insets.left + this.insets.bottom, arg1 + this.insets.top + this.insets.bottom);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		if (this.insets != null) {
			var1.translate(this.insets.left, this.insets.top);
		}
		return var1;
	}

	public void update(Graphics arg0) {
		this.field876.update(arg0);
	}

	public void paint(Graphics arg0) {
		this.field876.paint(arg0);
	}
}
