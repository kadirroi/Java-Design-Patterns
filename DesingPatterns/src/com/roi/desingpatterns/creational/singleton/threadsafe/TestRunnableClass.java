package com.roi.desingpatterns.creational.singleton.threadsafe;

public class TestRunnableClass implements Runnable {

	@Override
	public void run() {
	  
		System.out.println(Thread.currentThread().getName()+ " HashCode: " +SingletonThreadSafe.getInstance().hashCode());
	}

}
