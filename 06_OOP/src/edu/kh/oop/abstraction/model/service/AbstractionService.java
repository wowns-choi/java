package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {

	public void ex1() {
		//국민 객체 만들기
		//자동 import : ctrl + shift + o
		People p1 = new People();
		//People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		//new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다. 
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고도 한다 !! **
		
		p1.setName("홍길동");
		p1.setGender('남'); //char 자료형은 홑따옴표
		p1.setpNo("200303-1234567");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		
		p1.setPhone("010-1234-1234");
		p1.setAge(10);
		
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getAddress());
		System.out.println("p1의 age : " + p1.getAge());
		p1.tax();
		p1.vote();
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		People jaejun = new People();
		jaejun.setName("최재준");
		jaejun.setGender('남');
		jaejun.setpNo("안알려줌");
		jaejun.setAddress("서울시 수유3동 더 이상 안알려줌");
		jaejun.setPhone("010-6701-5246");
		jaejun.setAge(31);

		
		System.out.println("jaejun의 name : " + jaejun.getName());
		System.out.println("jaejun의 gender : " + jaejun.getGender());
		System.out.println("jaejun의 pNo : " + jaejun.getpNo());
		System.out.println("jaejun의 address : " + jaejun.getAddress());
		System.out.println("jaejun의 phone : " + jaejun.getAddress());
		System.out.println("jaejun의 age : " + jaejun.getAge());
		jaejun.tax();
		jaejun.vote();
		
	}
	
	
}
