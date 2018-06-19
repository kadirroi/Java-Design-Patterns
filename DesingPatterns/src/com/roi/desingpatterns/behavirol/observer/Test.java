package com.roi.desingpatterns.behavirol.observer;

import java.math.BigDecimal;

public class Test {
  
	public static void main(String[] args) {
		
		AbsProduct product = new Product();
		product.setName("book");
		product.setPrice(new BigDecimal("50"));
		product.getList().add(new User("example@gmail.com"));
		product.getList().add(new User("example@hotmail.com"));
		product.getList().add(new User("example@yahoo.com"));
		
		product.setPrice(new BigDecimal("40"));
		
		product.setPrice(new BigDecimal("30"));
		
		
		
		
		
		
	}
}
