package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		for (int i=0; i<10; i++) {
			System.out.println(i+1);
			
		}
	}
	
	public void ex2() {
		//1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// ABCDE FGHIJ KLMNO PQRST UVWXY Z
		for(int i=65; i<91; i++) {
			System.out.print((char)i);
		}
	}
	
	public void ex4() {
		//정수 5개를 입력 받아서, 합계 구하기 
		//ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50

		int sum = 0;
		
		for(int i =1; i<=5; i++) {
			System.out.println("입력" + i + " :");
			int a = sc.nextInt();
			sum += a;
		}
		
		System.out.printf("합계 : %d", sum);
		
	
	}
	
	public void ex5() {
		//1부터 20까지 1씩 증가하면서 출력
		//단, 입력받은 수의 배수는 양쪽에 () 표시
		
		//ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 ... 20
		
		
		System.out.println("1~20 사이 정수 하나만 입력해주세요");
		int num = sc.nextInt();

		
		
		for(int i=1; i<=20; i++) {
			if(i%num == 0) {
				System.out.print("("+i+")");
			}else {
				System.out.print(i);
			}
		}
	}
	
	public void ex6() {
		//구구단 출력
		//2~9 사이 수를 하나 입력받아
		//해당 단을 출력
		//단, 입력받은 수가 2~9사이가 아니면,
		//"잘못 입력하셨습니다" 출력
		
		System.out.println("2~9단 중 하나를 선택해주세요");
		int dan = sc.nextInt();
		
		if(dan>9 || dan<2) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
				
			}
			
		}
		
		
	}
	
	
	public void ex7() {
		//구구단 모두 출력하기
		
		
		for(int i=1; i<=9; i++) {
			
			for(int k=1; k<=9; k++) {
				System.out.printf("%d X %d = %2d  ", i, k, i*k);
			}
			System.out.println();
		}
		System.out.println("==========================역순출력==================================");

		

		for (int m=9; m>=2; m--) {
			
			for(int b=1; b<=9; b++) {
				System.out.printf("%d X %d = %2d  ", m, b, m*b);
			}
			System.out.println();
		}
		
		
	}
	
	public void ex8() {
		
		//숫자 세기 count
		
		//1부터 20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//배수 입력 : 3
		//3 6 9 12 15 18 : 6개
		//3의 배수 합계 : 63
		
		System.out.println("배수 입력 : ");
		Integer num = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=20; i++) {
			
			if(num * i > 20) {
				System.out.printf(" : %d 개\n", count);
				System.out.printf("%d 의 배수 합계 : %d", num, sum);
				return;
			}
			count += 1;
			sum += num*i;
			System.out.printf("%3d ", num*i);
		}

		
		
		
		
	}

}
