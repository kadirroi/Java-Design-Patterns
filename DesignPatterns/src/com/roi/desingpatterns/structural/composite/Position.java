package com.roi.desingpatterns.structural.composite;

public enum Position {

	President(1), Director(2), DirectorOfDepartment(3), Employee(4);

	private int number;

	private Position(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
