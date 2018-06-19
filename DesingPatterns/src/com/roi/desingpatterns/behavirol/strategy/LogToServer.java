package com.roi.desingpatterns.behavirol.strategy;

public class LogToServer implements ILogStrategy {

	@Override
	public void insertLog(String logValue) {

		System.out.println("Log is wrote to server log file");

	}

}
