package com.roi.desingpatterns.creational.singleton.eager;

public class TestRunnableClass implements Runnable {

	@Override
	public void run() {
	  
		System.out.println(Thread.currentThread().getName()+ " HashCode: " +SingletonEagerInitialization.getInstance().hashCode());
	}

}
