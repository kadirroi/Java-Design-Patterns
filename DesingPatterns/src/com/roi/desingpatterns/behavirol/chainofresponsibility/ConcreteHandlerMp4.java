package com.roi.desingpatterns.behavirol.chainofresponsibility;

public class ConcreteHandlerMp4 extends PlayerHandler {

	@Override
	public void play(String filePath) {
		
		if (filePath != null && filePath.endsWith(".mp4")) {
			System.out.println("Mp4 file is playing now: "+filePath);
		}else {
		 //if the end of  file path is not finished with mp4 suffix
		 // then we will  send request to nextHandler
			if (nextPlayerHandler != null) {
				nextPlayerHandler.play(filePath);
			}
		}
		
	}

}
