package com.roi.desingpatterns.singleton.threadsafe;

//Below implementation  works fine 
//and provides thread safety
//but  this implementation reduces performance
//because of cost associated with the synchronized
//method  so wee need synchronized method at first time of creating instance
//when we had instance from singleton class ,we do not need to use synchronized method  any more
//so we have used double checked locking pattern for handling performance
public class SingletonThreadSafe {

	private static  SingletonThreadSafe instance;
	
	private SingletonThreadSafe() {
		
	}
    //th1 HashCode: 74231151
	//th2 HashCode: 85553908
	//Not thread safe method
	
	/*public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}
		return instance;
	}*/
	
	//th2 HashCode: 85553908
	//th1 HashCode: 85553908
	//this method is thread safe so when this method is called by thread1 and thread 2
	//,this method is returned same instance.
	public static synchronized SingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}
		return instance;
	}

}
