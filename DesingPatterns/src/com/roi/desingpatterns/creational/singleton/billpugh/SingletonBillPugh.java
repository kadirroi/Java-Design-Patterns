package com.roi.desingpatterns.creational.singleton.billpugh;

public class SingletonBillPugh {

	private SingletonBillPugh() {
	}

	private static class SingletonHelper {

		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {

		return SingletonHelper.INSTANCE;
	}

}
