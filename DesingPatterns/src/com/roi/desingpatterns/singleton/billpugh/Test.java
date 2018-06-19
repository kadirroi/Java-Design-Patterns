package com.roi.desingpatterns.singleton.billpugh;

public class Test {

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
