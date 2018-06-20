package com.roi.desingpatterns.creational.abstractfactory;

public class HddConcrete2 extends HddAbstract {

	@Override
	public void hddProcessing() {

		System.out.println("HddConcrete2 is combined");

	}

	@Override
	public String hddType() {

		return "The hdd type is HddConcrete2";
	}

}
