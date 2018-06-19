package com.roi.desingpatterns.structural.decorator;

public class UserOperationMessage  extends UserOperationDecorator {

	public UserOperationMessage(UserOperation userOperation) {
		super(userOperation);
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessage() {
		
		System.out.println("Message is sent to user");
	}

}
