package com.roi.desingpatterns.behavirol.memento;

public class Test {

	public static void main(String[] args) {
		
		User user = new User("Max" ,"kennedy", 26);
		
		//cloning to usermemento
		UserMemento userMemento = user.createMemento();
		
		UserMemory userMemory = new UserMemory();
		userMemory.setUserMemento(userMemento);
		
		user.setName("Johy");
		
		System.out.println(user.getName());
		
		user.bindUserMemento(userMemory.getUserMemento());
		
		System.out.println(user.getName());
		
	}

}
