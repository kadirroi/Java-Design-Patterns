package com.roi.desingpatterns.behavirol.iterator;

public class Test {
	
	public static void main(String[] args) {
	
		TeamConcreteAggregate  teamConcreteAggregate  = new TeamConcreteAggregate();
		Team team = new Team();
		team.setName("Fc Barcelona");
		team.setPoint(10);
		Team team2 = new Team();
		team2.setName("Real Madrid");
		team2.setPoint(15);
		teamConcreteAggregate.add(team);
		teamConcreteAggregate.add(team2);
		
		ITeamIterator itr =  teamConcreteAggregate.getIterator();
		
		while (itr.isDone()) {
			 System.out.println("Team Name : " +itr.currentTeam().getName());
			 System.out.println("Team Point : " +itr.currentTeam().getPoint());
			 itr.next();
		}
		
	}
}
