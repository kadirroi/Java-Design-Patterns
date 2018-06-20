package com.roi.desingpatterns.creational.abstractfactory;

public class PcConcrete2 extends PcFactory {

	@Override
	public HddAbstract createHddAbstract() {

		return new HddConcrete2();
	}

	@Override
	public RamAbstract createRamAbstract() {

		return new RamConcrete2();
	}

}
