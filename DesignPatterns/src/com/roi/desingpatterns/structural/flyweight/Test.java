package com.roi.desingpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Type> types = new ArrayList<>();
		types.add(Type.RECTANGLE);
		types.add(Type.SQUARE);
		types.add(Type.SQUARE);
		types.add(Type.SQUARE);

		Factory factory = new Factory();
		int i = 0;
		for (Type t : types) {
			System.out.println(factory.getShape(t).hashCode());

			factory.getShape(t).x = 10*i;
			factory.getShape(t).y = 20*i;
			factory.getShape(t).draw(factory.getShape(t).x, factory.getShape(t).y );
			i++;

		}

	}

}
