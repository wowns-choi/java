package com.hw2.model.dto;

public class Prisoner extends Person{
	@Override
	public String getInfo() {
		return "아이디 : " + id + ", 이름 : " + name + ",죄목 : " + crime;
	}
	
	
	private String crime;

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}	
	
	//---------------------------------
	//getter setter
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}
	
	
	
}
