package com.roi.desingpatterns.structural.decorator;

public abstract class UserOperationDecorator implements IUserOperation {

	private UserOperation userOperation;

	public UserOperationDecorator(UserOperation userOperation) {
		super();
		this.userOperation = userOperation;
	}

	@Override
	public void insert() {

		this.userOperation.insert();

	}

	@Override
	public void delete() {

		this.userOperation.delete();
	}

}
