package com.hw2.model.dto;

public class Monkey extends Animal{

	@Override
	public void sound() {
		//여기서의 name 은 Monkey 안에 있는 Animal 객체안에 있는 name 필드이다.
		System.out.println(name +"가 우끼끼 소리를 냅니다");
	}
	
	//기본생성자
	public Monkey() {
	
	}

	//매개변수 생성자
	public Monkey(String name) {
		super(name);
	}
	
	
	
	
	
}
