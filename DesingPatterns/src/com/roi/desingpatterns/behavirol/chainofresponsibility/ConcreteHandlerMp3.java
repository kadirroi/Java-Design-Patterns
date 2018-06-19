package com.roi.desingpatterns.behavirol.chainofresponsibility;

public class ConcreteHandlerMp3 extends PlayerHandler {

	@Override
	public void play(String filePath) {
	     if (filePath != null && filePath.endsWith(".mp3")) {
			System.out.println("Mp3 file is palying now : " +filePath);
		}else {
			//if the end of file path is not finished with mp3 suffix
			//then we will send request to nextHandler
			if (nextPlayerHandler !=  null) {
				nextPlayerHandler.play(filePath);
			} 
			
		}
	}
}
