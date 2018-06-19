package com.roi.desingpatterns.structural.composite;

public class Test {

	public static void main(String[] args) {

		WorkingParent president = new WorkingParent("Jack", Position.President);

		WorkingParent director = new WorkingParent("Max", Position.Director);

		president.add(director);
		
		WorkingParent directorOfDepartment = new WorkingParent("Jessy", Position.DirectorOfDepartment);
		director.add(directorOfDepartment);
		
		directorOfDepartment.add(new WorkingChild("Joe", Position.Employee));
		
		president.displayHierarchy();
		

	}

}
