package com.roi.desingpatterns.behavirol.template;

public abstract class Operation {

	public void close() {

		System.out.println("Db connection is closed");
	}

	public void open() {

		System.out.println("Db conncetion is opened");
	}

	public abstract void insert();

	public abstract boolean isExist();

	public void templateInsert() {

		open();
		insert();
		close();
	}
	
	public void templateIsExist() {

		open();
		isExist();
		close();
	}
}
