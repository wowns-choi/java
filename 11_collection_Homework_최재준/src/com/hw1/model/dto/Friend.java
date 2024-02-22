package com.hw1.model.dto;

public class Friend {
	
	private String name;
	
	
	public void pickLeader() {
		System.out.println(name + "가 떡잎방범대 대장이다!");
	}
	

	//기본생성자
	public Friend() {
		super();
	}
	
	//매개변수 생성자
	public Friend(String name) {
		super();
		this.name = name;
	}

	//getter setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
