package com.roi.desingpatterns.creational.singleton.eager;

//singleton class is created at the time of class loading 
//this is the easiest way to create  a singleton class but 
//it has a drawback that the instance is created even though the client app
//may not  be using it.
//Also this method does not provide any options for exception handling  
public class SingletonEagerInitialization {
   
	private static final SingletonEagerInitialization  instance = new SingletonEagerInitialization();
	
	//We have to create private constructor to avoid client
	//applications  to use this constructor by other class 
	private SingletonEagerInitialization() {

	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	} 
}
