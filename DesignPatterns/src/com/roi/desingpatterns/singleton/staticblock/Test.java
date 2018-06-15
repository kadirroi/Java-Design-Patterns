package com.roi.desingpatterns.singleton.staticblock;

public class Test {

	public static void main(String[] args) {

		//First Instance hashcode: 2018699554
		//Second Instance hashcode: 2018699554
		System.out.println("First Instance hashcode: " 
				+ SingletonStaticBlockInitialization.getInstance().hashCode());
		System.out.println("Second Instance hashcode: " 
				+ SingletonStaticBlockInitialization.getInstance().hashCode());
	}

}
