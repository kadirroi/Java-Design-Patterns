package com.roi.desingpatterns.behavirol.command;

public class ConcreteCommandUserDelete extends CommandUser {

	public ConcreteCommandUserDelete(ReceiverUser receiverUser) {
		super(receiverUser);
	}

	@Override
	public void execute() {
		receiverUser.delete();
	}
}
