package com.roi.desingpatterns.behavirol.strategy;

public class LogWriter {

	private ILogStrategy logStrategy;

	public LogWriter(ILogStrategy logStrategy) {
		super();
		this.logStrategy = logStrategy;
	}
    
	public void logInsert(String logValue) {
		
		logStrategy.insertLog(logValue);
		
	}

}
