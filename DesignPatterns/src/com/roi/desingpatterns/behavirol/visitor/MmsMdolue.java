package com.roi.desingpatterns.behavirol.visitor;

public class MmsMdolue implements IVisitor {

	@Override
	public void Visit(MobilePhone mobilePhone) {
		System.out.println("has ability that is sending mms");

	}

	@Override
	public void Visit(TelePhone telePhone) {

		System.out.println("has not ability that is sending mms");

	}

}
