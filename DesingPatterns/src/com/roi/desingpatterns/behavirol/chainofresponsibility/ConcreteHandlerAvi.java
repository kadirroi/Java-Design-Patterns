package com.roi.desingpatterns.behavirol.chainofresponsibility;

public class ConcreteHandlerAvi extends PlayerHandler {

	@Override
	public void play(String filePath) {

		if (filePath != null && filePath.endsWith(".avi")) {
			System.out.println("Avi file is playing now  : " + filePath);
		} else {

			if (nextPlayerHandler != null) {
				nextPlayerHandler.play(filePath);
			}else {
				System.out.println("it does not support "+ filePath);
			}
		}

	}

}
