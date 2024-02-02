package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		double hangle = sc.nextDouble();
		
		System.out.println("영어 점수를 입력해주세요");
		double english = sc.nextDouble();
		
		System.out.println("수학 점수를 입력해주세요");
		double mathmatic = sc.nextDouble();
		
		System.out.printf("국어: %.2f 점, 영어: %.2f 점, 수학: %.2f 점 \n", hangle, english, mathmatic );
		System.out.printf("총점 = %d\n", (int)(hangle + english+mathmatic) );
		System.out.printf("평균 = %d\n", (int)(hangle+english+mathmatic)/3 );
		
		
	}

	
	public void ex3() {
		//sc.next() 와 sc.nextLine() 의 차이
		
		//공통점 : 둘 다 문자열을 입력받는다.
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분자로 생각해서 각각 저장함.
		// nextLine() : 띄어쓰기 입력 가능, 줄구분까지 저장함

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 1 : ");
		String input1 =  sc.nextLine(); //안녕 하세요 를 쓰면, "안녕 하세요"
		
		System.out.println("문자열 입력 2 : ");
		String input2 =  sc.next(); //안녕 핫[여 를 쓰면, "안녕" 만 나옴.
		
		System.out.printf("%s %s", input1, input2);
		
		
		
		
	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.println(input1);
		
		sc.nextLine(); //입력버퍼에 남은 개행문자 제거
		
		System.out.println("문자열 입력 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
	}
}
