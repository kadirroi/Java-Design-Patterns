package com.roi.desingpatterns.behavirol.command;

public class ConcreteCommandUserAdd extends CommandUser {

	public ConcreteCommandUserAdd(ReceiverUser receiverUser) {
		super(receiverUser);
	}

	@Override
	public void execute() {
		receiverUser.create();
	}
}
