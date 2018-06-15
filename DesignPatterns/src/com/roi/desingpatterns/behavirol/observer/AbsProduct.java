package com.roi.desingpatterns.behavirol.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class AbsProduct {

	private String name;

	private BigDecimal price;

	private List<IUser> list = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		if (this.price != null && this.price.compareTo(price) == 1) {
			this.price = price;
			notifyProduct();
		}else {
			this.price = price;
		}

	}

	public void notifyProduct() {
		for (IUser user : list) {
			user.update(this);
		}
	}

	public List<IUser> getList() {
		return list;
	}

	public void setList(List<IUser> list) {
		this.list = list;
	}

}
