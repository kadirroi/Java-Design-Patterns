package com.roi.desingpatterns.singleton.lazy;

public class Test {

	public static void main(String[] args) {
		
		//First Instance HashCode : 2018699554
		//Second Instance HashCode : 2018699554
		System.out.println("First Instance HashCode : " 
				+ SingletonLazyInitialization.getInsatance().hashCode());
		System.out.println("Second Instance HashCode : " 
				+ SingletonLazyInitialization.getInsatance().hashCode());
	}
}
