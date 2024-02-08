package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("숫자를 한 개 입력하세요");
		int num = sc.nextInt();
		
		if(num <0 ) {
			System.out.println("양수만 입력해주세요");
		} else if(num %2 == 0) {
			System.out.println("짝수입니다.");
		} else if(num%2 ==1 ) {
			System.out.println("홀수입니다.");
		}
	}
	
	public void practice2() {
		System.out.println("국어 점수를 입력해주세요");
		int kukScore = sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요");
		int engScore = sc.nextInt();
		
		System.out.println("수학 점수를 입력해주세요");
		int mathScore = sc.nextInt();
		
		if(kukScore >=40 && engScore >=40 && mathScore >=40) {
			if(kukScore + engScore + mathScore / 3 >= 60) {
				System.out.printf("합계 : %d \n", kukScore+engScore+mathScore);
				System.out.printf("평균 : %.1f \n", ((double)(kukScore+engScore+mathScore))/3);
				
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			}
			
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	
	public void practice3() {
		System.out.println("1~12 사이의 정수 입력 :");
		int month = sc.nextInt();
		
		switch (month) {
			
		case 1 :System.out.println("1월은 31일까지 있습니다");
		break;
		case 2 :System.out.println("2월은 29일까지 있습니다");
		break;
		case 3 :System.out.println("3월은 31일까지 있습니다");
		break;
		case 4 :System.out.println("4월은 30일까지 있습니다");
		break;
		case 5 :System.out.println("5월은 31일까지 있습니다");
		break;
		case 6 :System.out.println("6월은 30일까지 있습니다");
		break;
		case 7 :System.out.println("7월은 31일까지 있습니다");
		break;
		case 8 :System.out.println("8월은 31일까지 있습니다");
		break;
		case 9 :System.out.println("9월은 30일까지 있습니다");
		break;
		case 10: System.out.println("10월은 31일까지 있습니다");
		break;
		case 11: System.out.println("11월은 30일까지 있습니다");
		break;
		case 12: System.out.println("12월은 31일까지 있습니다");
		break;
		default: System.out.println(month +"월은 잘못 입력된 달입니다");
		
		
		}
		
		
		
	}
	
	public void practice4() {
		System.out.println("키(m)를 입력해주세요.");
		double key = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요.");
		double kg = sc.nextDouble();
		
		double BMI = kg/(key*key);
		
		System.out.printf("BMI 지수 : %.14f", BMI);
		
		if(BMI >= 30) {
			System.out.println("고도 비만");
		} else if (BMI >=25 && BMI<30) {
			System.out.println("비만");
		} else if (BMI >=23 && BMI < 25)
		{System.out.println("과체중");
		} else if (BMI >=18.5 && BMI < 23) {
			System.out.println("정상체중");
			} else if (BMI <18.5) {System.out.println("저체중");
		}
		
		
	}
	
	public void practice5() {
		System.out.println("중간 고사 점수 : ");
		int middle = sc.nextInt();
		double 환산점수 = (double)middle / 5;
		System.out.println(환산점수);
		
		
		System.out.println("기말 고사 점수 : ");
		int end = sc.nextInt();
		System.out.println(50*3/10);
		double 환산점수2 = (double)end*3/10;
		System.out.println("환산점수" + 환산점수2);
		
		System.out.println("과제 점수 : ");
		int report = sc.nextInt();
		double 환산점수3 = (double)report*3/10;
		System.out.println("환산점수3=" +환산점수3);
		
		System.out.println("출석 횟수 : ");
		int cullcheck = sc.nextInt();
		double 환산점수4 = (double)cullcheck/5;
		System.out.println("환산점수4=" +환산점수4);

		
	
		System.out.printf("중간 고사 점수(20) : %.1f \n", 환산점수);
		
		System.out.printf("기말 고사 점수(30) : %.1f \n", 환산점수2);
		
		System.out.printf("과제 점수(30) : %.1f \n", 환산점수3);
		
		System.out.printf("출석 점수(30) : %d \n", cullcheck);
	
		System.out.println("=================결과===============");
		
		if((20-cullcheck) > 20*3/10) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", cullcheck);
		} else if((환산점수 + 환산점수2 + 환산점수3 + cullcheck) <70) {
			System.out.printf("총점 : %.1f", 환산점수 + 환산점수2 + 환산점수3 + cullcheck );
			System.out.println("Fail [점수미달]");
		} else {
			System.out.printf("총점 : %.1f", (환산점수 + 환산점수2 + 환산점수3 + cullcheck) );
			System.out.println("PASS");
		}
		
		
		
		
	}
	
	
	
}
