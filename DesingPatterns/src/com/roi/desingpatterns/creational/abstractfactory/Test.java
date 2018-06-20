package com.roi.desingpatterns.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {

		Factory factory = new Factory(new PcConcrete1());
		factory.combine();

		factory = new Factory(new PcConcrete2());
		factory.combine();
	}

}
