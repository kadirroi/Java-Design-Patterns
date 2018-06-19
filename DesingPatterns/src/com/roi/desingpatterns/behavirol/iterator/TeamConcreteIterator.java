package com.roi.desingpatterns.behavirol.iterator;

public class TeamConcreteIterator implements ITeamIterator {

	private TeamConcreteAggregate teamConcreteAggregate;
	private int index = 0;
	
	public TeamConcreteIterator(TeamConcreteAggregate teamConcreteAggregate) {
		this.teamConcreteAggregate = teamConcreteAggregate;
	}
	
	@Override
	public void  next() {
		index ++;
	}

	@Override
	public boolean isDone() {
		return index < teamConcreteAggregate.getSize();
	}

	@Override
	public Team currentTeam() {
		return teamConcreteAggregate.getItem(index);
	}

}
