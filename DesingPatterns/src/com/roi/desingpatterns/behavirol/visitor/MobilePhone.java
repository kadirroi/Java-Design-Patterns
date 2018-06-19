package com.roi.desingpatterns.behavirol.visitor;

public class MobilePhone implements IPhone {

	@Override
	public void call(String phoneNumber) {
		System.out.println("it can call this "+phoneNumber);
	}

	@Override
	public void loadModule(IVisitor visitor) {
		visitor.Visit(this);
	}

}
