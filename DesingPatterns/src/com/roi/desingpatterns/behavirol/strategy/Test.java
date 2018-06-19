package com.roi.desingpatterns.behavirol.strategy;

public class Test {

	public static void main(String[] args) {

		// ToDb
		LogWriter logWriter = new LogWriter(new LogToDb());
		logWriter.logInsert("log to database");

		// ToServerLogFile
		logWriter = new LogWriter(new LogToServer());
		logWriter.logInsert("log to server log file");

	}

}
