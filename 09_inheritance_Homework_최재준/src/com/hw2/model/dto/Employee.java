package com.hw2.model.dto;

public class Employee extends Person{
	@Override
	public String getInfo() {
		return "ID : " + id + ", 이름 :" + name + ", 포지션 :" + position;
	}
	
	private String position;

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}
	//---------------------------------
	
	//getter setter
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	

}
