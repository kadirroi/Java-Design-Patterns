package com.roi.desingpatterns.structural.decorator;

public class Test {

	public static void main(String[] args) {

		UserOperation userOperation = new UserOperation();

		userOperation.insert();
		userOperation.delete();

		UserOperationMessage userOperationMessage = new UserOperationMessage(userOperation);

		userOperationMessage.insert();

		userOperationMessage.delete();

		userOperationMessage.sendMessage();

	}

}
