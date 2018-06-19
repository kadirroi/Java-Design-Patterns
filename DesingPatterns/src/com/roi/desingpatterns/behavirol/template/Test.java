package com.roi.desingpatterns.behavirol.template;

public class Test {

	public static void main(String[] args) {
		
		Operation operation  = new OperationProduct();

		operation.templateInsert();
		operation.templateIsExist();
		 
		operation  = new OperationUser();
		operation.templateInsert();
		operation.templateIsExist();
	}

}
