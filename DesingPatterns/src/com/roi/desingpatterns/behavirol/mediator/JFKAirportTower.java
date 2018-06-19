package com.roi.desingpatterns.behavirol.mediator;

import java.util.ArrayList;
import java.util.List;

public class JFKAirportTower implements ITower {

	// Related Airplane List with tower
	private List<Airplane> airplaneList = new ArrayList<>();

	@Override
	public void airplaneRegistration(Airplane airplane) {

		airplaneList.add(airplane);
		airplane.setRelatedTower(this);
	}

	@Override
	public void responseLandingPermit(String flightNumber) {

		boolean landingPermit = true;
		for (Airplane airplane : airplaneList) {
			if (airplane.isLandingPermit()) {
				landingPermit = false;
				break;
			}
		}
		for (Airplane airplane : airplaneList) {
			if (airplane.getFlightNumber() == flightNumber) {
				if (landingPermit) {
				    System.out.println(flightNumber+" : Landing permit was granted");	
				}else {
					System.out.println(flightNumber +": Landing permit was rejected");	
				}
				airplane.setLandingPermit(landingPermit);
				break;
			}
		}
	}

}
