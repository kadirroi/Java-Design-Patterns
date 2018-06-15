package com.roi.desingpatterns.behavirol.observer;

public class User implements IUser {

	private String email;

	public User(String email) {
		super();
		this.email = email;
	}

	@Override
	public void update(AbsProduct product) {
		System.out.println(
				"Price of " + product.getName() + " was  " + product.getPrice() + " ," + "it is sent to" + this.email);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
