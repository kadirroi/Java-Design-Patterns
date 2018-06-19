package com.roi.desingpatterns.structural.composite;

public abstract class WorkingPerson {

	private String name;
	private Position position;

	public WorkingPerson(String name, Position position) {
		super();
		this.name = name;
		this.position = position;
	}

	public abstract void displayHierarchy();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
