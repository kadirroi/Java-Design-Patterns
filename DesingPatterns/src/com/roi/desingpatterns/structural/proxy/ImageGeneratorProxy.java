package com.roi.desingpatterns.structural.proxy;

import java.util.Timer;
import java.util.TimerTask;

public class ImageGeneratorProxy {

	private ImageGenerator imageGenerator;

	private boolean isLoadImage = false;

	public void showRealImage() {

		imageGenerator = new ImageGenerator();
		imageGenerator.showImage();
		isLoadImage = true;

	}

	public void showImage() {

		if (imageGenerator == null) {

			Timer timer = new Timer();
			timer.schedule(new TimerTask() {

				@Override
				public void run() {
					showRealImage();
				}
			}, 5000);

		}
		if (!isLoadImage) {
			System.out.println("Preview image is showing now!");
		}else {
			System.out.println("Image has already showed ");
		}

	}

}
