package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("qb")
public final class class43 implements ImageProducer, ImageObserver {

	@ObfuscatedName("qb.a")
	public final boolean field747 = true;

	@ObfuscatedName("qb.b")
	public final int field748 = 2;

	@ObfuscatedName("qb.c")
	public final int[] field749;

	@ObfuscatedName("qb.d")
	public final int field750;

	@ObfuscatedName("qb.e")
	public final int field751;

	@ObfuscatedName("qb.f")
	public final ColorModel field752;

	@ObfuscatedName("qb.g")
	public ImageConsumer field753;

	@ObfuscatedName("qb.h")
	public final Image field754;

	public class43(int arg0, int arg1, int arg2, Component arg3) {
		this.field750 = arg2;
		this.field751 = arg0;
		this.field749 = new int[arg2 * arg0];
		this.field752 = new DirectColorModel(32, 16711680, 65280, 255);
		if (arg1 < this.field748 || arg1 > this.field748) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		this.field754 = arg3.createImage(this);
		this.method255();
		arg3.prepareImage(this.field754, this);
		this.method255();
		arg3.prepareImage(this.field754, this);
		this.method255();
		arg3.prepareImage(this.field754, this);
		this.method253(this.field747);
	}

	@ObfuscatedName("qb.a(Z)V")
	public void method253(boolean arg0) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		class33.method151(this.field750, this.field751, this.field749);
	}

	@ObfuscatedName("qb.a(ILjava/awt/Graphics;BI)V")
	public void method254(int arg0, Graphics arg1, int arg2) {
		this.method255();
		arg1.drawImage(this.field754, arg0, arg2, this);
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field753 = arg0;
		arg0.setDimensions(this.field750, this.field751);
		arg0.setProperties(null);
		arg0.setColorModel(this.field752);
		arg0.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field753 == arg0;
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field753 == arg0) {
			this.field753 = null;
		}
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method255() {
		if (this.field753 != null) {
			this.field753.setPixels(0, 0, this.field750, this.field751, this.field752, this.field749, 0, this.field750);
			this.field753.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
