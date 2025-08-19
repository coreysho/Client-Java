package jagex2.graphics;

import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("ISZGOOMR.c")
	public int field879;

	@ObfuscatedName("ISZGOOMR.d")
	public int field880;

	@ObfuscatedName("ISZGOOMR.b")
	public int[] field878;

	@ObfuscatedName("ISZGOOMR.e")
	public ColorModel field881;

	@ObfuscatedName("ISZGOOMR.g")
	public Image field883;

	@ObfuscatedName("ISZGOOMR.f")
	public ImageConsumer field882;

	public PixMap(int arg0, Component arg2, int arg3) {
		this.field879 = arg3;
		this.field880 = arg0;
		this.field878 = new int[arg0 * arg3];
		this.field881 = new DirectColorModel(32, 16711680, 65280, 255);
		this.field883 = arg2.createImage(this);
		this.method242();
		arg2.prepareImage(this.field883, this);
		this.method242();
		arg2.prepareImage(this.field883, this);
		this.method242();
		arg2.prepareImage(this.field883, this);
		this.method240();
	}

	@ObfuscatedName("ISZGOOMR.a(Z)V")
	public void method240() {
		Pix2D.method332(this.field879, this.field880, this.field878);
	}

	@ObfuscatedName("ISZGOOMR.a(IILjava/awt/Graphics;Z)V")
	public void method241(int arg0, int arg1, Graphics arg2) {
		this.method242();
		arg2.drawImage(this.field883, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field882 = arg0;
		arg0.setDimensions(this.field879, this.field880);
		arg0.setProperties(null);
		arg0.setColorModel(this.field881);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field882 == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field882 == arg0) {
			this.field882 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ISZGOOMR.a()V")
	public synchronized void method242() {
		if (this.field882 != null) {
			this.field882.setPixels(0, 0, this.field879, this.field880, this.field881, this.field878, 0, this.field879);
			this.field882.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
