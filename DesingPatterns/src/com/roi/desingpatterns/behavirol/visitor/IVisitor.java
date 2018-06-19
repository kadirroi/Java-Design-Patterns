package com.roi.desingpatterns.behavirol.visitor;

public interface IVisitor {

	void Visit(MobilePhone mobilePhone);
	void Visit(TelePhone telePhone);
}
