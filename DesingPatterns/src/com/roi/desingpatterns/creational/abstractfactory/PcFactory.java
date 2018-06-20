package com.roi.desingpatterns.creational.abstractfactory;

public abstract class PcFactory {

	public abstract HddAbstract createHddAbstract();
	
	public abstract RamAbstract createRamAbstract();
}
