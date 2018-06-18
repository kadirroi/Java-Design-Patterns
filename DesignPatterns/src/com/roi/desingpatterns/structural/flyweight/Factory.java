package com.roi.desingpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	private Map<Type, Shape> map;

	public Factory() {

		map = new HashMap<>();
	}

	public Shape getShape(Type type) {

		if (map.containsKey(type)) {
			return map.get(type);
		} else {
			Shape shape = null;
			switch (type) {
			case RECTANGLE:
				shape = new Rectangle("rectangle");
				break;

			case SQUARE:
				shape = new Square("square");
				break;
			}

			map.put(type, shape);
			return shape;
		}
	}

	public int count() {

		return map.size();
	}

}
