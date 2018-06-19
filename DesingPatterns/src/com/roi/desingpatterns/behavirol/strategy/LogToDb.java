package com.roi.desingpatterns.behavirol.strategy;

public class LogToDb  implements  ILogStrategy {

	@Override
	public void insertLog(String logValue) {
		
		System.out.println("Log is wrote to database");
		
	}

}
