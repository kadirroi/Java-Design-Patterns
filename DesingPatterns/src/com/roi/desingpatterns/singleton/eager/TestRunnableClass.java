package com.roi.desingpatterns.singleton.eager;

public class TestRunnableClass implements Runnable {

	@Override
	public void run() {
	  
		System.out.println(Thread.currentThread().getName()+ " HashCode: " +SingletonEagerInitialization.getInstance().hashCode());
	}

}
