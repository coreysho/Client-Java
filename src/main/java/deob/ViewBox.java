package deob;

import sign.signlink;

import java.awt.*;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public final GameShell field37;

	public ViewBox(GameShell arg0, int arg1, int arg2, int arg3) {
		this.field37 = arg0;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(this.field37, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
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
