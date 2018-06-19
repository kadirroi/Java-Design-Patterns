package com.roi.desingpatterns.behavirol.mediator;

public class Test {

	public static void main(String[] args) {
		ITower tower = new JFKAirportTower();
        
		Airplane thyTK001 = new ThyAirplane();
		thyTK001.setFlightNumber("ThyTK001");
		Airplane thyTK002 = new ThyAirplane();
		thyTK002.setFlightNumber("ThyTK002");
		Airplane usaUS001 = new UsaAirplane();
		usaUS001.setFlightNumber("UsaUS001");
		
		tower.airplaneRegistration(thyTK001);
		tower.airplaneRegistration(thyTK002);
		tower.airplaneRegistration(usaUS001);
		
		thyTK001.requestLandingPermit();
		thyTK002.requestLandingPermit();
		usaUS001.requestLandingPermit();
		System.out.println();
		
		thyTK001.setLandingPermit(false);
		thyTK002.setLandingPermit(false);
		usaUS001.requestLandingPermit();
		
		System.out.println();
		
		thyTK001.setLandingPermit(false);
		usaUS001.setLandingPermit(false);
		thyTK002.requestLandingPermit();
	
	}

}
