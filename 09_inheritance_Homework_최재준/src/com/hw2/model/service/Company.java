package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	
	private Employee[] employee = null;
	private int emplyeeCount = 0;
	
	//생성자인데, 뭐하라고 하는지 파악 못함.
	public Company(int size) {
		this.employee = new Employee[size];
	}

	//오버라이딩 메서드
	@Override
	public void addPerson(Person person) {
		boolean flag = false;
		int index = 0;
		for(int i=0; i<employee.length; i++) {
			if(employee[i] == null) {
				flag=true;
				index = i;
				break;
			}
		}
		
		if(person instanceof Employee && flag ==true) {
			Employee emp = (Employee) person;		
			employee[index] = emp;
			System.out.println("직원이 추가되었습니다 - " + emp.getInfo());
		}
		
		if(flag ==false) {
			System.out.println("인원이 모두 충원되었습니다");
		}
	}

	@Override
	public void removePerson(String id) {
		boolean flag= false;

		
		for(int i=0; i<employee.length; i++) {
			if(employee[i] != null) {
				if(employee[i].getId().equals(id)) {
					flag= true;
					System.out.println("직원이 삭제되었습니다 - " + employee[i].getInfo());
					employee[i] = null;
				}
			}
		}
		
		if(flag ==false) {
			System.out.println("일치하는 id를 가진 직원을 찾을 수 없다");
		}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		for(int i=0; i<employee.length; i++) {
			if(employee[i] != null) {
				System.out.println(employee[i].getInfo());
			}

		}
	}
	
	//-----------------------------------
	//getter setter
	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public int getEmplyeeCount() {
		return emplyeeCount;
	}

	public void setEmplyeeCount(int emplyeeCount) {
		this.emplyeeCount = emplyeeCount;
	}

}
