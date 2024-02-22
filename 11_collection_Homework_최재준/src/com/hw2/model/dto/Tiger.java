package com.hw2.model.dto;

public class Tiger extends Animal{

	@Override
	public void sound() {
		System.out.println(name +"가 어흥하며 포효합니다.");		
	}
	
	//기본생성자
	public Tiger() {}

	//매개변수 생성자
	public Tiger(String name) {
		super(name);
	}
	
}
