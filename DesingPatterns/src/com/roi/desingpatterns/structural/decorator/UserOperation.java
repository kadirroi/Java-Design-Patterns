package com.roi.desingpatterns.structural.decorator;

public class UserOperation implements IUserOperation {

	@Override
	public void insert() {

		System.out.println("User is inserted to database");

	}

	@Override
	public void delete() {
		System.out.println("User is deleted from database");

	}

}
