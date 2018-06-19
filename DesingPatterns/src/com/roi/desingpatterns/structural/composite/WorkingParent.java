package com.roi.desingpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WorkingParent  extends WorkingPerson{

	
	private List<WorkingPerson> workingPersons;
	public WorkingParent(String name, Position position) {
		super(name, position);
         workingPersons = new ArrayList<>();      
	}
    
	public void add(WorkingPerson workingPerson) {
		
		workingPersons.add(workingPerson);
	}
	
	@Override
	public void displayHierarchy() {
		System.out.println("Position : "+super.getPosition().toString() +" ,Name : "+super.getName());
		for (WorkingPerson workingPerson : workingPersons) {
			workingPerson.displayHierarchy();
		}
		
	}

}
