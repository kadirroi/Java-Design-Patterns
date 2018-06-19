package com.roi.desingpatterns.behavirol.iterator;

public interface ITeamIterator {

	void next();

	boolean isDone();

	Team  currentTeam();
}
