package com.hw1.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	//메서드
	@Override
	public String information() {
		return super.information() + ", 학년 : " + grade + ", 전공 : " + major;
	}	
	
	//생성자
	public Student(int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	public Student() {
		super();
	}
	
	//getter setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
}
