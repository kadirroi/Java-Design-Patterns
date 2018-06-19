package com.roi.desingpatterns.structural.flyweight;

public enum Type {

	SQUARE(1), RECTANGLE(1);

	private int type;

	Type(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
