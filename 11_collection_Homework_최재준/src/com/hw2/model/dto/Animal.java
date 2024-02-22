package com.hw2.model.dto;

public abstract class Animal {
	
	protected String name;

	//메서드
	public abstract void sound();

	//기본 생성자
	public Animal() {
		super();
	}
	
	//매개변수 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	
}
