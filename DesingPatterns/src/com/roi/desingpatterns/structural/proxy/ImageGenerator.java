package com.roi.desingpatterns.structural.proxy;

public class ImageGenerator implements IImageGenerator {

	@Override
	public void showImage() {
       System.out.println("Image is showing now!");
	}

}
