package com.roi.desingpatterns.creational.abstractfactory;

public class PcConcrete1 extends PcFactory {

	@Override
	public HddAbstract createHddAbstract() {
		return new HddConcrete1();
	}

	@Override
	public RamAbstract createRamAbstract() {
		return new RamConcrete1();
	}

}
