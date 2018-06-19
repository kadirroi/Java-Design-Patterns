package com.roi.desingpatterns.structural.proxy;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		ImageGeneratorProxy imageGeneratorProxy = new ImageGeneratorProxy();
		imageGeneratorProxy.showImage();
		
        Thread.sleep(7000);
        
        imageGeneratorProxy.showImage();
        
        System.out.println("Main thread is finished");
        
		
	}

}
