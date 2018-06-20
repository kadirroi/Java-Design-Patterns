package com.roi.desingpatterns.creational.singleton.billpugh;

public class TestRunnableClass implements Runnable {

	@Override
	public void run() {
	  
		System.out.println(Thread.currentThread().getName()+ " HashCode: " +SingletonBillPugh.getInstance().hashCode());
	}

}
