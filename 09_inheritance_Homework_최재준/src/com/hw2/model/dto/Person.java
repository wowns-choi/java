package com.hw2.model.dto;

public abstract class Person {
	public abstract String getInfo(); //Person 정보를 문자열로 리턴
	
	protected String id;
	protected String name;
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//------------------------------
	//getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
