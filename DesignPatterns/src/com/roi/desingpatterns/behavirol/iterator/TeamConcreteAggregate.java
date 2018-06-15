package com.roi.desingpatterns.behavirol.iterator;

import java.util.ArrayList;
import java.util.List;

public class TeamConcreteAggregate  implements ITeamAggregate {

	private List<Team> teams = new ArrayList<>();
	
	public void add(Team e) {
		teams.add(e); 
	} 
	
	public Team getItem(int index) {
		return  teams.get(index);
	}
	
	@Override
	public ITeamIterator getIterator() {
		
		return new TeamConcreteIterator(this);
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public int getSize() {
		return teams.size();
	}

}
