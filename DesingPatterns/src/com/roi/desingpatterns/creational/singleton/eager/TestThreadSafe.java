package com.roi.desingpatterns.creational.singleton.eager;

import com.roi.desingpatterns.creational.singleton.billpugh.TestRunnableClass;

public class TestThreadSafe {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new TestRunnableClass(),"th1");
		Thread th2 = new Thread(new TestRunnableClass(),"th2");

		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
