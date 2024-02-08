package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		// 1 2 3 4 5
		
		for(int i=1; i<=10; i++) {
			if(i>5) {
				break;
			}
			System.out.print(i +" ");
		}
	}
	
	public void ex2() {
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; //빈 문자열로 초기화
		
		while(true) {
			
			System.out.println("문자열 입력(exit@ 입력시 종료) : ");
			String input = sc.nextLine();
			if(input.equals("exit@")) {
				//String 자료형은 비교연산자(==)로 같은 문자열인지 판별할 수 없다.
				//비교연산자(==) 는 보통 기본자료형끼리의 연산에서만 사용 가능함.
				//-> String 은 기본자료형이 아닌 참조형
				//**해결방법 : 문자열1.equals("문자열2"); 으로 비교 가능 **
				break;
			} else {
				str += input + "\n";
			}
			
		}
		System.out.println(str);
		
	}
	
	public void ex3() {
		//continue : 다음 반복으로 넘어감
		
		//1~10 까지 1씩 증가하며 출력
		//단, 3의 배수 제외
		
		for(int i=1; i<=10; i++) {
			if(i%3 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
	
	public void ex4() {
		//1~100 까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고,
		//증가하는 값이 40이 되었을 때 반복을 멈춤

		//1
		//2
		//3
		//...
		//39
		
		for(int i = 1; i<= 100; i++) {

			if(i==40) {
				break;
			}
			
			if(i%5 == 0) {
				continue;
			}

			System.out.print(i + " ");
		}
		
		
		
	}
	
	public void RSPGame() {
		//가위바위보 게임을 할건데,
		//몇 판 할지 입력받음.
		//입력받은 판 수 만큼 게임을 반복
		//상대는 컴퓨터. Math.random() : 0.0이상 ~ 1.0미만의 난수 생성
		//int random = (int)(Math.random() * 3 + 1);
		//1) 1~3 사이 난수 생성
		//2) 1이면 가위, 2이면 바위, 3이면 보 지정(이때는 switch 구문 써라)
		//3) 가위 바위 보 중 하나를 유저가 입력할 것
		//4) 컴퓨터와 승패를 가림
		//5) 한판 할 때마다 플레이어 승! or 졌습니다 ㅠㅠ 출력
		//6) 매 판마다 끝나면, 현재 기록 : 2승 1무 0패 이런식으로 출력하도록.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇판 하실래요?");
		int totalGameCount = sc.nextInt();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		
		for(int i=1; i<=totalGameCount; i++) {
			int random = (int)(Math.random() * 3 + 1);
			String computerRCP = null;
			//null : 아무것도 참조하고 있지 않음.
			switch(random) {
			case 1 : computerRCP = "가위";
			break;
			case 2 : computerRCP = "바위";
			break;
			case 3 : computerRCP = "보";
			break;
			}
			
			System.out.println("가위, 바위, 보 중 하나를 입력해주세요");
			String userRCP = sc.next();
			
			if(computerRCP.equals("가위")) {
				if(userRCP.equals("가위")) {
					System.out.println("비겻습니다");
					draw += 1;
				} else if(userRCP.equals("바위")) {
					System.out.println("승리");
					win += 1;
				}else if(userRCP.equals("보")) {
					System.out.println("패배");
					lose += 1;
				}		
			}
			if(computerRCP.equals("바위")) {
				if(userRCP.equals("바위")) {
					System.out.println("비겻습니다");
					draw += 1;
				} else if(userRCP.equals("보")) {
					System.out.println("승리");
					win += 1;
				}else if(userRCP.equals("가위")) {
					System.out.println("패배");
					lose += 1;
				}		
			}
			if(computerRCP.equals("보")) {
				if(userRCP.equals("보")) {
					System.out.println("비겻습니다");
					draw += 1;
				} else if(userRCP.equals("가위")) {
					System.out.println("승리");
					win += 1;
				}else if(userRCP.equals("바위")) {
					System.out.println("패배");
					lose += 1;
				}		
			}
			System.out.printf("현재기록 : %d승 %d무 %d패", win, draw, lose);
			
		}
		
		

		
		

		
		
	}
	

}
