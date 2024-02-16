package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class RUN {
	
//	employee
//	private int age;
//	private double height;
//	private double weight;
//
//	+ 
//	private int salary;
//	private String dept;
	
	//-----------------------
	////	employee
//	private int age;
//	private double height;
//	private double weight;
	//	private int grade;
	//private String major;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stdArr = new Student[3];
		
		Student std1 = new Student(20, 178.2, 70.0, 1, "정보시스템공학과");
		Student std2 = new Student(21, 187.3, 80.0, 2, "경영학과");		
		Student std3 = new Student(23, 167.0, 45.0, 4, "정보통신공학과");

		
		std1.setName("홍길동");
		std2.setName("김말똥");
		std3.setName("강개순");
		
		stdArr[0] = std1;
		stdArr[1] = std2;
		stdArr[2] = std3;
		
		for(int i =0; i<stdArr.length; i++) {
			System.out.println( stdArr[i].information());
		}

		
		System.out.println("---------------------------------");
		
		Employee[] empArr = new Employee[10];
		int a = 0;
		
		while(true) {
			if(a <11) {
			System.out.println("=====사원 입력 시스템=====");			
			System.out.println("이름을 입력해주세요");
			String name = sc.next();
			
			System.out.println("나이가 어떻게 되세요?");
			int age = sc.nextInt();
			System.out.println("키가 몇이세요? ex) xx.x");
			double key = sc.nextDouble();
			System.out.println("몇 kg? ex) xx.x");
			double kg = sc.nextDouble();
			System.out.println("월급 얼마임?");
			int salary = sc.nextInt();
			System.out.println("어떤 부서?");
			String dept = sc.next();
			
			Employee emp = new Employee(age, key, kg, salary, dept);
			emp.setName(name);
			
			int nullIndex = 0;
			
			for(int i=0; i<empArr.length; i++) {
				if(empArr[i] == null) {
					nullIndex = i;
					break;
				} 
			}
			
			empArr[nullIndex] = emp;
			
			
			a++;
			
			System.out.println("계속 입력하시겠어요? (y/n)");
			String input = sc.next();
			
			if(input.charAt(0) == 'n' || input.charAt(0) == 'N') {
				break;
			} 
			
			} else {
				System.out.println("10명 꽉찼어요");
				break;
			}
			
		}
		
		//여기다가 배열 안 모든 객체 information() 돌리는 거 해주면 됨.
		for(int i =0; i<empArr.length; i++) {
			if(empArr[i]  != null) {System.out.println(empArr[i].information());}

		}
		

	}

}
