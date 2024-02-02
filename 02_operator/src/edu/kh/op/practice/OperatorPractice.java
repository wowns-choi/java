package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요");
		int people = sc.nextInt();
		
		System.out.println("사탕개수를 입력해주세요");
		int satangNumber =  sc.nextInt();
		
		System.out.printf("1인당 사탕 몇개씩 가져감? %d\n", satangNumber/people);
		System.out.printf("남은 사탕은 몇 개임? %d\n", satangNumber % people);
	}

	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		
		System.out.println("학년을 입력해주세요");
		int hakneon = sc.nextInt();
		
		System.out.println("반을 입력해주세요");
		int classWhat = sc.nextInt();
		
		System.out.println("번호를 입력해주세요");
		int studentNumber = sc.nextInt();
		
		System.out.println("성별을 입력해주세요");
		String gender = sc.next();

		System.out.println("성적을 입력해주세요");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다", hakneon, classWhat, studentNumber,name, gender, score );
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		int korean = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int english = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int math = sc.nextInt();
		
		System.out.printf("합계 : %d \n", korean + english + math);
		System.out.printf("평균 : %.2f", (float)(korean + english + math)/3);
		
	}
}
