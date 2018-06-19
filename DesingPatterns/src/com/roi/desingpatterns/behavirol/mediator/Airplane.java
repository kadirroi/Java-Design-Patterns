package com.roi.desingpatterns.behavirol.mediator;

public abstract class Airplane {

	private String flightNumber;

	private boolean landingPermit;
	
	private ITower relatedTower;

	public void requestLandingPermit() {
       relatedTower.responseLandingPermit(flightNumber);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public boolean isLandingPermit() {
		return landingPermit;
	}

	public void setLandingPermit(boolean landingPermit) {
		this.landingPermit = landingPermit;
	}

	public ITower getRelatedTower() {
		return relatedTower;
	}

	public void setRelatedTower(ITower relatedTower) {
		this.relatedTower = relatedTower;
	}
}
