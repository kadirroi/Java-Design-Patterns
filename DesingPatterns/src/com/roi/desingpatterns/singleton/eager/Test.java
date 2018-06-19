package com.roi.desingpatterns.singleton.eager;

public class Test {

	public static void main(String[] args) {

		// First Instance Of HashCode: 2018699554
		// Second Instance Of HashCode: 2018699554
		System.out.println("First Instance Of HashCode: " + SingletonEagerInitialization.getInstance().hashCode());
		System.out.println("Second Instance Of HashCode: " + SingletonEagerInitialization.getInstance().hashCode());
	}

}
