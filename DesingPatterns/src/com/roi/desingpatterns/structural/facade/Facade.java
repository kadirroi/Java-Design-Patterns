package com.roi.desingpatterns.structural.facade;

public class Facade {

	SubSystem1 subSystem1 = new SubSystem1();
	SubSystem2 subSystem2 = new SubSystem2();
	SubSystem3 subSystem3 = new SubSystem3();

	public void addMember(String uniqueId) {

		if (!subSystem1.blackListCheck(uniqueId) && subSystem3.chekMemberUniqueId(uniqueId)) {
			subSystem2.addMember(uniqueId);
		}
	}

}
