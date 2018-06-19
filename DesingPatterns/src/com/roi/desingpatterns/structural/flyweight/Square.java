package com.roi.desingpatterns.structural.flyweight;

public class Square extends Shape {

	public Square(String name) {
		super(name);
	}

	@Override
	public void draw(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Square is drawing x: " + x + " y : " + y);
	}

}
