package com.roi.desingpatterns.structural.composite;

public class WorkingChild extends WorkingPerson{

	public WorkingChild(String name, Position position) {
		super(name, position);
		
	}

	@Override
	public void displayHierarchy() {
		System.out.println("Position : "+super.getPosition().toString()+" ,Name : " +super.getName());
	}

}
