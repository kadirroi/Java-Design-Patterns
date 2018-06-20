package com.roi.desingpatterns.creational.singleton.threadsafe;

public class SingletonThreadSafeDoublecheckedLocking {

	private SingletonThreadSafeDoublecheckedLocking instance;

	private SingletonThreadSafeDoublecheckedLocking() {

	}
    //th2 HashCode: 85553908
	//th1 HashCode: 85553908
	//thread safe with double checked locking
	public SingletonThreadSafeDoublecheckedLocking getInstance() {
		
		if (instance == null) {
			synchronized (SingletonThreadSafeDoublecheckedLocking.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeDoublecheckedLocking();
				}
			}
		}
		return instance;
	}

}
