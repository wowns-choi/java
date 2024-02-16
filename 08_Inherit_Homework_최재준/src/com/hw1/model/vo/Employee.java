package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	@Override
	public String information() {
		return super.information() + ", 봉급 : " + salary + ", 부서 : " + dept;
	}
	
	//생성자
	public Employee() {
		super();
	}
	
	public Employee(int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	
	//getter setter


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

}
