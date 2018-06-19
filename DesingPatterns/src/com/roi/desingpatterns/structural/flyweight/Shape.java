package com.roi.desingpatterns.structural.flyweight;

public abstract class Shape {

	public String name;

	public int x;
	public int y;

	public abstract void draw(int x ,int y);

	public Shape(String name) {
		super();
		this.name = name;
	}

}
