package edu.kh.variable.ex2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// java.util 패키지에서 Scanner 라는 클래스(설계도)를 수입해온 것

public class ScannerExample {

	public static void main (String[] args) {
		
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		//Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 행위
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1 입력 : ");
		
		int input1 = sc.nextInt(); //입력받은 정수를 변수에 대입
		//nextInt() : 다음 입력된 정수를 읽어옴(키보드로 입력된 정수를 읽어옴)
		
		System.out.println("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
	}
}
