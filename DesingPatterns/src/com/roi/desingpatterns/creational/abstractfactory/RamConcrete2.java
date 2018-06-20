package com.roi.desingpatterns.creational.abstractfactory;

public class RamConcrete2 extends RamAbstract {

	@Override
	public void ramProcessing() {
		System.out.println("RamConcrete2 is combined");

	}

	@Override
	public String ramType() {

		return "The ram type is ramconcrete2";
	}

}
