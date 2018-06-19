package com.roi.desingpatterns.behavirol.command;

//this class has created  doing  database operations for user instance
//for example : adding ,deleting, listing etc.
public class ReceiverUser {

	private User user;

	public ReceiverUser(User user) {
		this.user = user;
	}

	public void create() {
		System.out.println(user.getUserName() + " is created as a user");
	}

	public void delete() {
		System.out.println(user.getUserName() + "is deleted from database");
	}

}
