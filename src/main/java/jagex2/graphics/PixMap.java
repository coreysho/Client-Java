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

@ObfuscatedName("qb")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("qb.a")
	public final boolean field747 = true;

	@ObfuscatedName("qb.b")
	public final int field748 = 2;

	@ObfuscatedName("qb.c")
	public final int[] data;

	@ObfuscatedName("qb.d")
	public final int width;

	@ObfuscatedName("qb.e")
	public final int height;

	@ObfuscatedName("qb.f")
	public final ColorModel colorModel;

	@ObfuscatedName("qb.g")
	public ImageConsumer imageConsumer;

	@ObfuscatedName("qb.h")
	public final Image image;

	public PixMap(int arg0, int arg1, int arg2, Component arg3) {
		this.width = arg2;
		this.height = arg0;
		this.data = new int[arg2 * arg0];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		if (arg1 < this.field748 || arg1 > this.field748) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		this.image = arg3.createImage(this);
		this.consumerSetPixels();
		arg3.prepareImage(this.image, this);
		this.consumerSetPixels();
		arg3.prepareImage(this.image, this);
		this.consumerSetPixels();
		arg3.prepareImage(this.image, this);
		this.setPixels(this.field747);
	}

	@ObfuscatedName("qb.a(Z)V")
	public void setPixels(boolean arg0) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Pix2D.setPixels(this.width, this.height, this.data);
	}

	@ObfuscatedName("qb.a(ILjava/awt/Graphics;BI)V")
	public void draw(int arg0, Graphics arg1, int arg2) {
		this.consumerSetPixels();
		arg1.drawImage(this.image, arg0, arg2, this);
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.imageConsumer = arg0;
		arg0.setDimensions(this.width, this.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.imageConsumer == arg0;
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.imageConsumer == arg0) {
			this.imageConsumer = null;
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
	public synchronized void consumerSetPixels() {
		if (this.imageConsumer != null) {
			this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.data, 0, this.width);
			this.imageConsumer.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
