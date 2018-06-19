package com.roi.desingpatterns.behavirol.chainofresponsibility;

public abstract class PlayerHandler {

	protected PlayerHandler nextPlayerHandler;

	public PlayerHandler getNextPlayerHandler() {
		return nextPlayerHandler;
	}

	public void setNextPlayerHandler(PlayerHandler nextPlayerHandler) {
		this.nextPlayerHandler = nextPlayerHandler;
	}

	public abstract void play(String filePath);
}
