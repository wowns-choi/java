package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners = null;
	
	private int prisonerCount = 0;
	
	//생성자
	public Prison(int size) {
		//size 로 뭐하라는 거야?
		this.prisoners = new Prisoner[size];
	}
	
	//오버라이딩 메서드
	@Override
	public void addPerson(Person person) {
		boolean flag = false;
		int index = 0;
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i] == null) {
				flag=true;
				index = i;
				break;
			}
		}
		
		if(person instanceof Prisoner && flag ==true) {
			prisoners[index] = (Prisoner) person;
			
			Prisoner pri = (Prisoner) person;		
			prisoners[index] = pri;
			System.out.println("수감자가 추가되었습니다 - " + pri.getInfo());
		}
		
		if(flag ==false) {
			System.out.println("인원이 모두 충원되었습니다");
		}
		
	}

	@Override
	public void removePerson(String id) {

		boolean flag= false;
		
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i] != null) {
				if(prisoners[i].getId().equals(id)) {
					flag= true;
					System.out.println("직원이 삭제되었습니다 - " + prisoners[i].getInfo());
					
					prisoners[i] = null;
				}

			}
		}
		
		if(flag ==false) {
			System.out.println("일치하는 id를 가진 직원을 찾을 수 없다");
		}
		
	}

	@Override
	public void displayAllPersons() {
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i] !=null) {
				System.out.println(prisoners[i].getInfo());
			}

		}		
	}
	
	//-----------------------------------
	//getter setter
	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}


}
