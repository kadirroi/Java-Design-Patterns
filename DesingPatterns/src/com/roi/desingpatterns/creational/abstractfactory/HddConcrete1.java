package com.roi.desingpatterns.creational.abstractfactory;

public class HddConcrete1 extends HddAbstract {

	@Override
	public void hddProcessing() {

		System.out.println("HddConcrete1 is combined");
	}

	@Override
	public String hddType() {

		return "The hhd type is hddConcrete1";
	}

}
