package com.roi.desingpatterns.creational.abstractfactory;

public class RamConcrete1 extends RamAbstract {

	@Override
	public void ramProcessing() {

		System.out.println("RamConcrete1 is combined");
	}

	@Override
	public String ramType() {

		return "Ram type is ramconcrete1";
	}

}
