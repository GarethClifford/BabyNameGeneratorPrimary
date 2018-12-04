package com.qa.persistence.domain;

public class BabyName {
	
	private String babyName;
	
	public BabyName() {
		
	}

	public String getName() {
		return babyName;
	}

	public void setName(String name) {
		this.babyName = name;
	}

	@Override
	public String toString() {
		return "BabyName [name=" + babyName + "]";
	}

}
