package com.roi.desingpatterns.behavirol.template;

public class OperationProduct extends Operation {

	@Override
	public void insert() {
		System.out.println("Product is inserted");
	}

	@Override
	public boolean isExist() {
		System.out.println("Product is exist into db");
		return true;
	}

}
