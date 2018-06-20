package com.roi.desingpatterns.creational.singleton.lazy;


//Lazy initialization  method to implementation singleton  design pattern 
//creates the instance in the global access method.
//Below the implementation singleton works fines
//in case of single thread environment but it comes to multithreaded
//systems ,it can cause issues if multithreaded inside if loop at the same time
//it will destroy singleton pattern 
//and both threads will get the different instances of singleton class

public class SingletonLazyInitialization {
	
	private static SingletonLazyInitialization  insatance;
	
	private SingletonLazyInitialization() {
		
	}

	public static SingletonLazyInitialization getInsatance() {
		
		if (insatance == null) {
			insatance = new SingletonLazyInitialization(); 
		}
		return insatance;
	}

}
