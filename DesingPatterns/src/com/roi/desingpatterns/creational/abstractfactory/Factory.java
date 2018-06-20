package com.roi.desingpatterns.creational.abstractfactory;

public class Factory {

	private PcFactory pcFactory;

	private HddAbstract hddAbstract;

	private RamAbstract ramAbstract;

	public Factory(PcFactory pcFactory) {
		super();
		this.pcFactory = pcFactory;

		hddAbstract = this.pcFactory.createHddAbstract();
		ramAbstract = this.pcFactory.createRamAbstract();

	}

	public void combine() {

		hddAbstract.hddProcessing();
		ramAbstract.ramProcessing();
	}

}
