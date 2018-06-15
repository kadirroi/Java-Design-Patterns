package com.roi.desingpatterns.behavirol.command;

public abstract class CommandUser {

	protected ReceiverUser receiverUser;

	public CommandUser(ReceiverUser receiverUser) {
		this.receiverUser = receiverUser;
	}

	public abstract void execute();
}
