package com.roi.desingpatterns.creational.singleton.staticblock;


//Static Block initialization implementation is similar to eager initialization 
//except that instance of class is created in  the static block 
//that provides option for exception handling
//Both eager initialization and static block initialization creates
//the instances even before it is being used it and that is not best practices
//to use
public class SingletonStaticBlockInitialization {

	private static  SingletonStaticBlockInitialization instance;
    //As I said before in eager initialization why I defined this class constructor
	//with private key
	private SingletonStaticBlockInitialization() {

	}
	
	static {
		try {
			instance = new SingletonStaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Excepiton has occured in creating singleton instance");
		}
	}

	public static SingletonStaticBlockInitialization getInstance() {
		return instance;
	}
}
