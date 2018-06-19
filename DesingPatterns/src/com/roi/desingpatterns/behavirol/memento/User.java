package com.roi.desingpatterns.behavirol.memento;

public class User {

	private String name;
	private String surname;
	private int age;

	public User(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserMemento createMemento() {

		return new UserMemento(name, surname, age);

	}

	public void bindUserMemento(UserMemento userMemento) {
		this.name = userMemento.getName();
		this.surname = userMemento.getSurname();
		this.age = userMemento.getAge();
	}

}
