package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

//비즈니스 로직 처리하는 클래스
public class InheritanceService {
	
	// 상속 확인 예제
	public void ex1() {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		//Student 객체 생성
		Student std = new Student();
		
		//Student 만의 고유한 필드 : grade, classRoom
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드 확인해보자.
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		
		
		System.out.println("----------------------");
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("---------------------------");
		
		Employee emp = new Employee();
		//Employee 만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		//Person 클래스로부터 상속받은 메서드
		emp.setName("최재준");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		System.out.println("------------------------");
		
		p.breath();
		p.move();
		std.breath();
		std.move();
		emp.breath();
		emp.move();
		
		// 상속의 특징 : 코드 추가 및 수정에 용이함.
		// 				코드 길이 감소 및 중복 제거 효과.
		
	}
	
	//super() 생성자 이용방법
	public void ex2() {
		//Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
	}
	
	public void ex3() {
		Person p =new Person();
		Student std = new Student();
		Employee emp = new Employee();
		std.move(); //오버라이딩 안함
		System.out.println("-------------------");
		emp.move(); //오버라이딩 함.
		System.out.println("----------------------");
		p.move();
	}
	
	//toString override 확인 예제
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		System.out.println(p.toString());
		System.out.println(p); //왜 주소값이 나오지 않고, p.toString 한 값이 나올까?
		
//		Student std = new Student(3, 5);
//		System.out.println(std.toString());
		
		System.out.println("----------------------------");
		Student std = new Student("이백점", 18, "미국", 2, 6);
		
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동", 30, "한국", "삼성전자");
		
		System.out.println(emp);
		
		
	}
	
}
