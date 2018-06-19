package com.roi.desingpatterns.structural.flyweight;

public class Rectangle extends Shape {

	public Rectangle(String name) {
		super(name);
	}

	@Override
	public void draw(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Rectangle is drawing x : " + x +" y : "+y);
	}

}
