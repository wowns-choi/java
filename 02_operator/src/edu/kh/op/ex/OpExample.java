package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample {
	
	// ex1() method : 객체 지향 프로그래밍에서 OpExample 객체와 관련된 함수
	// -> OpExample 이 가지고 있는 기능 중 ex1() 이라는 기능을 뜻함.
	public void ex1() {
		System.out.println("ex1() 호출 중");
		
		//증감(증가, 감소) 연산자 : ++ , --
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; //iNum1 증가
		iNum2--; //iNum2 감소
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		//전위연산
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		System.out.println(a); // 4
		System.out.println(b); // 4
		System.out.println(c); // 7
		
		// 3++ + --5
		// 3++ + 4
		// c = 7
		// 3++ ==> 4
	}
	
	public void ex2() {
		// 비교 연산자 : > , < , >= , <= , == , !=
		// 비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		System.out.println((a == b) == false); //true
		
		int c = 4;
		int d = 5;
		
		System.out.println( (++c != d) == (--c != d) );
							//false    ==  true => false
	}
	
	public void ex3() {
		//논리 연산자 : &&(AND), ||(OR)
		
		//&& : 둘 다 true 여야 true. 나머지는 false
			//와, 그리고, ~면서, ~이면서, ~부터 ~까지, ~사이
			int a = 101;
			
			// a 는 100 이상 이면서 짝수인가?
			System.out.println( (a >= 100) && (a % 2 == 0)); //false 나옴. 짝수가 아니기에
			
			int b = 5;
			
			// b는 1부터 10까지 숫자 범위에 포함되어 있는가? 
			System.out.println(b>=1 && b<=10); //true
		
		System.out.println("------------------------------------");
		
		//|| : 둘 다 false 여야 false. 나머지는 true
			//또는, ~거나, ~이거나
		
			int c = 10;
			
			// c 는 10을 초과하거나 짝수인가?
			System.out.println( ( c > 10 ) || ( c % 2 == 0 ));
		
	
	
	}
	
	public void ex4() {
		//삼항 연산자 : 조건식 ? A : B
		//true 면 A가, false 면 B가 나오게 된다.
		
		int num = 30;
		
		// 만약에 num이 30을 초과하면, "num 은 30보다 큰 수이다" 
		// 아니면, "num 은 30 이하의 수이다" 출력
		
		System.out.println(num > 30 ? "num 은 30보다 큰 수이다" : "num 은 30 이하의 수이다");
	
		System.out.println("--------------------------");
		
		//입력 받은 정수가 음수인지 양수인지 구분해라
		//단, 0은 양수로 처리해라
		
		// ex) 
		// 정수 입력 : 4
		// 양수입니다. 출력
		
		// 정수 입력 : -5
		// 음수입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		
		int input1 = sc.nextInt();
		System.out.println(input1>=0 ? "양수입니다" : "음수입니다");
		
	
	}
	
}
