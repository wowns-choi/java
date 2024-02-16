package com.hw1.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	//메서드
	public String information() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight;
		
	}
	
	
	
	//생성자
	public Person() {
		super();
	}

	public Person(int age, double height, double weight) {
		super();
		
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	//getter setter
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
}
