package com.roi.desingpatterns.behavirol.template;

public class OperationUser  extends Operation{

	@Override
	public void insert() {
		System.out.println("User is inserted to database");
		
	}

	@Override
	public boolean isExist() {
		System.out.println("User is not exist into database");
		return false;
	}

}
