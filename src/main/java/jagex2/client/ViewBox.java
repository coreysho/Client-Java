package jagex2.client;

import deob.ObfuscatedName;
import sign.signlink;

import java.awt.*;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public final GameShell shell;

	public ViewBox(GameShell arg0, int arg1, int arg2, int arg3) {
		this.shell = arg0;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(this.shell, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
	}

	@Override
	public void update(Graphics arg0) {
		this.shell.update(arg0);
	}

	@Override
	public void paint(Graphics arg0) {
		this.shell.paint(arg0);
	}
}
