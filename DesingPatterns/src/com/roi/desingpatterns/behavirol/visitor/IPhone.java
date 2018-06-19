package com.roi.desingpatterns.behavirol.visitor;

public interface IPhone {
	void call(String phoneNumber);

	void loadModule(IVisitor visitor);

}
