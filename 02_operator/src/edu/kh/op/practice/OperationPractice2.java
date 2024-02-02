package edu.kh.op.practice;

import java.util.Scanner;

public class OperationPractice2 {
	

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		
		int age = sc.nextInt();
		
		
		System.out.println(age>=20?"저는 성인입니다":"저는 미성년입니다");
		System.out.printf("청소년입니까? %b\n",age>=13&&age<=19 ? true : false);
		System.out.printf("노인이거나 어린이 입니까? %b", age>=65||age<=12 ? true: false);
		
		
	}
	

}
