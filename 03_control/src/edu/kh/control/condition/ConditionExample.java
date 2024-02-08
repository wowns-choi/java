package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {

		//if 문 : 조건식이 true일 때만 내부 코드 수행
		//작성법 : if(조건식){ 조건식이 true일 때 수행할 코드 }
		
		//입력받은 정수가 양수인지 검사
		//양수라면, "양수입니다" 출력
		
		System.out.println("정수를 입력해주세요");
		int input = sc.nextInt();
		if(input >= 0) {
			System.out.println("양수입니다");
		}
		if(input<0) {
			System.out.println("음수입니다");
		}

	}
	public void ex2() {
		//if - else 문
		//조건식 결과가 true면 if문 실행, 
		// else면 else 구문이 실행됨
		
		/*
		 * [작성법]
		 * if(조건식){ 조건식이 true일 때 수행될 코드 } else{
		 * 		조건식이 false일 때 수행될 코드
		 * } 
		 * */
		
		
		//홀짝 검사
		//입력받은 정수값이 홀수이면 "홀수입니다" 출력
		//짝수면 "짝수입니다" 출력
		//0이면 "0입니다" 사용
		
		System.out.println("정수를 입력해주세요");
		int input = sc.nextInt();
		if(input == 0 ) {
			System.out.println("0입니다");
		}else {
			if(input%2==0) {
				System.out.println("짝수입니다");
			}
			else {
				System.out.println("홀수입니다");
			}
		}
		
		
	}
	public void ex3() {
		//양수 , 음수 , 0 인지 판별
		//if -else if -else 사용해서.
		
		System.out.println("정수를 입력해주세요");
		int input = sc.nextInt();
		
		if(input>0) {
			System.out.println("양수입니다");
		} else if(input <0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
	}
	public void ex4() {
		//사용자에게 달(month)을 입력받아 해당 달에 맞는 계절 출력
		//단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12 이하 "한파 주의보"
		//여름일 때 온도가 35도 이상이면 "폭염 경보", 33도 이상 "폭염 주의보"
		//1~12월 사이가 아닐 때에는 "해당하는 계절이 없습니다" 출력
		//12 1 2 겨울
		//3 4 5 봄
		//6 7 8 여름
		//9 10 11 가을
		
		System.out.println("달(month)을 입력해주세요");
		
		int month = sc.nextInt();
		
		System.out.println("현재 온도를 입력해주세요");
		int temperature = sc.nextInt();
		
		
		if(month > 12 || month < 1) {
			System.out.println("해당하는 계절이 없습니다");
		} else if(month>11 || month<3) {
			System.out.println("겨울입니다");
			if(temperature <-15) {
				System.out.println("한파 경보");
			} else if(temperature < -13) {
				System.out.println("한파 주의보");
			}
		} else if (month>2 && month<6) {
			System.out.println("봄입니다.");
		} else if(month>5 && month<9) {
			System.out.println("여름입니다");
			if(temperature >=35) {
				System.out.println("폭염경보");
			} else if(temperature >=33) {
				System.out.println("폭염 주의보");
			}
		} else if(month>8 && month<12) {
			System.out.println("가을 입니다");
		}
		
	}
	
	public void ex5() {
		//나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age>13 && age<=19) {
			System.out.println("청소년 입니다");
		} else if(age>19) {
			System.out.println("성인 입니다");
		}
		
	}
	
	public void ex6() {
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();
		
		if(score <0 || score >100) {
			System.out.println("잘못 입력하셨습니다");
		} else if(score >=90) {
			System.out.println("A");
		} else if(score>=80 && score<90) {
			System.out.println("B");
		} else if(score>=70 && score<80) {
			System.out.println("C");
		} else if(score>=60 && score<70) {
			System.out.println("D");
		} else if(score>0 && score<60) {
			System.out.println("F");
		}
		
	}
	
	
	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		double key = sc.nextDouble();
		
		if(age<0 || age>100) {
			System.out.println("잘못 입력 하셨습니다");
		} else if(age <12) {
			System.out.println("적정 연령이 아닙니다.");
		} else if(age > 12 && age<100) {
			if(key<140.00) {
				System.out.println("적정 키가 아닙니다");
			}else if(key >= 140) {
				System.out.println("탑승가능하십니다");
			}
		}
	}
	
	
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		double key = sc.nextDouble();
		
		if(age >100 || age <0) {
			System.out.println("나이를 잘못 입력 하셨습니다");
		} else if(key >250.0 || key < 0 ) {
			System.out.println("키를 잘못 입력 하셨습니다.");
		} else if(age >=12 && key>=140) {
			System.out.println("탑승가능");
		} else if(age<12 && key <140) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else if(age<12 && key >=140) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		} else if(age >=12 && key <140) {
			System.out.println("나이는 적절하나, 키는 적절치 않음");
		}
		
		
		
	}
	
	
}
