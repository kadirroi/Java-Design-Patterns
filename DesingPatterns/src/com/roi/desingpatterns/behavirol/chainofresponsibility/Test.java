package com.roi.desingpatterns.behavirol.chainofresponsibility;

public class Test {
    //it is used %40
	public static void main(String[] args) {

		PlayerHandler playerHandlerMp4 = new ConcreteHandlerMp4();
		PlayerHandler playerHandlerMp3 = new ConcreteHandlerMp3();
		PlayerHandler playerHandlerAvi = new ConcreteHandlerAvi();
        
		//we have defined like chain
		playerHandlerMp4.nextPlayerHandler = playerHandlerMp3;
		playerHandlerMp3.nextPlayerHandler = playerHandlerAvi;

		playerHandlerMp4.play("file.mp3");
		playerHandlerMp4.play("file.avi");
		playerHandlerMp4.play("file.mp4");
		playerHandlerMp4.play("file.swf");
	

	}

}
