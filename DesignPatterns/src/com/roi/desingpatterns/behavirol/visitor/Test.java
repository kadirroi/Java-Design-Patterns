package com.roi.desingpatterns.behavirol.visitor;

public class Test {

	public static void main(String[] args) {

		IPhone mobilePhone = new MobilePhone();
		IPhone telePhone = new TelePhone();

		mobilePhone.call("+90XXX****XXX");
		telePhone.call("+90XX***XXX");

		// new ability
		IVisitor messageModule = new MessageModule();
		mobilePhone.loadModule(messageModule);
		telePhone.loadModule(messageModule);

		//new ability
		IVisitor mmsModule = new MmsMdolue();
		mobilePhone.loadModule(mmsModule);
		telePhone.loadModule(mmsModule);

	}

}
