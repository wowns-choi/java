package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	/* 배열(Array)
	 *  - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 *  - 묶여진 변수들은 하나의 배열명으로 불러지고
	 *    구분은 index를 이용함 (index 는 0 부터 시작하는 정수)
	 * 
	 * */

	public void ex1() {
		
		// 변수 vs 배열
			
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte 를 할당하고
		// 그 공간에 num이라는 이름을 부여했다.
		
		//변수 대입
		num = 10;
		// 생성된 num 이라는 변수 공간에 10 이라는 값(리터럴)을 대입한 것이다.
	
		//변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에서 저장된 값을 읽어와서 출력
		
		
		//-------------------------------------------------------
		
		// 배열 선언
		int[] arr; //int arr[];
		//Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr 이라는 이름을 부여했다.
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		// 		  Heap 메모리 영역에 새로운 공간(배열, 객체) 을 할당하는 것
		//아, new 연산자로 객체 만드면, 무조건 HEAP 영역에 객체가 만들어지는구나
		
		//int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		//new int[3] : heap 영역에 int 3칸짜리 int[] 을 생성(할당)
			//** 생성된 int[]에는 시작 주소가 지정된다 !! **
	
		// arr = new int[3];
		// (int[])  (int[])   -> 같은 자료형이기 때문에 대입 가능.
		
		//int[] arr2 = new double[5]; -> 다른 자료형이기 때문에 대입 불가능.
		
		//heap 영역에 생성된 int[]의 '시작주소'를
		//stack 영역에 생성된 arr 변수에 대입
		
		// -> arr 변수가 int[]을 참조하게 됨.
		// 그래서 arr을 참조형이라고 함.
		
		//힙 영역에 할당된 공간은 !절대! 비어있을 수 없다. 
		//-> 최초 할당 시 JVM 기본값이 자동 저장된다(BY 컴파일러(JAVAC))
		//예를들어, int double이면 0, 참조형은 null, boolean 은 false
	
		System.out.println("arr의 주소값 : " + arr); // [I@5577140b 로 나옴.
		
		//힙 영역에 할당된 공간은 !절대! 비어있을 수 없다고 했지.
		System.out.println(arr[0]); // 0
		System.out.println(arr[1]); // 0
		System.out.println(arr[2]); // 0
		
		//배열 요소 값 대입
		// arr 은 참조형 변수(int[]) 이지만
		// arr[0], arr[1], arr[2] 각각은 int 기본자료형이기 때문에 정수값을 대입할 수 있다.
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		System.out.println(arr[0]); // 10
		System.out.println(arr[1]); // 50
		System.out.println(arr[2]); // 1000
		
	}
	
	public void ex2() {
		
		//배열 선언 및 할당
		int[] arr = new int[4]; 
		// new 연산자에 의해 4칸짜리 배열이 생성된 것
		// arr 에는 만들어진 배열의 첫번째 자리의 주소값이 들어있음
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		// 배열의 길이 (몇 칸인가?) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		//배열과 for문
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
	
	}
	
	
	// -----------------------------------------------  이 밑으론 x
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		//평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		

		
		double[] height = new double[5];
		//double[] 자료형 참조변수 height 를 stack 영역에 생성하고
		// height 에 heap 영역에 새로 생성된 double 5칸 짜리 double[]의 시작 주소를 대입
		

		for(int i=0; i<height.length; i++) {
			System.out.println((i+1) + "번 키 입력 :");
			double key = sc.nextDouble();
			height[i] = key;
		}
		
		double sum  = 0;
		
		for(int i=0; i<height.length; i++) {
			sum += height[i];
		}
		
		System.out.printf("합계 : %.2f", sum/height.length );
		
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		//ex)
		//입력받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		//합계 : 290
		//평균 : 72.5
		//최고점 : 100
		//최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받을 인원 수 : ");
		int personNum= sc.nextInt();
		
		int[] score = new int[personNum];
		
		for(int i=0; i<personNum; i++) {
			System.out.println((i+1) + "번 점수 입력");
			score[i] = sc.nextInt();
		}
		
		//합계
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계 : " + sum);
		
		//평균
		System.out.println("평균 : " + sum/score.length);
		
		
		//최고점
		int best = score[0];
		for(int i=1; i<score.length; i++) {
			if(score[i]>best) {
				best = score[i];
			} 
		}
		System.out.println("최고점 = " + best);
		
		//최저점
		int lower = score[0];
		for(int i=1; i<score.length; i++) {
			if(score[i] <lower) {
				lower = score[i];
			}
		}
		System.out.println("최저점 = " + lower);
		
		
	}
	
	public void ex5() {
		//배열 선언과 동시에 초기화 하기
		
		char[] arr = new char[5];
		//heap 영역에 5칸짜리 배열을 만든거고, 
		//arr 이라는 스택영역 안 변수가 이 배열의 첫번째 주소값을 가지고 있음
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
		}

		//위의 과정이 아래 한줄에 응집되어 있는거임
		//배열 선언과 동시에(할당 및) 초기화
		char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
		//{} (중괄호) 는 배열의 리터럴 표기법
		
		
		
		//** Arrays 클래스
		//-> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		//Arrays.toString(배열명) : 배열 안 모든 요소 값을 출력
		System.out.println(Arrays.toString(arr)); //[A, B, C, D ,E] 이렇게 []꺽새 안에 담겨 나옴
		
		System.out.println(Arrays.toString(arr5)); 	


	}

	
	public void ex6() {
		//점심 메뉴 뽑기 프로그램
		
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "파스타"};
		
		//랜덤으로 뽑을 것
		System.out.println("오늘 점심 메뉴 : " + arr[(int)(Math.random() * 6)]);
		
		// 0.0 <= x < 1.0
		// 0부터 5까지여야 함.
		

	}
	
	
	public void ex7() {
		//배열을 이용한 검색
		
		//입력 받은 정수가 배열에 있는지 없는지 확인
		//만약 있다면 몇번 인덱스에 존재하는지 출력
		//int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		//ex)
		//정수 입력 : 200
		//1번째 인덱스에 존재
		
		//정수 입력 : 5
		//존재하지 않음
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력");
		int num = sc.nextInt();
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==num) {
				System.out.println(i+ "번째 인덱스에 존재");	
				flag = true;
			} 
		}
		
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void ex8() {
		
		//입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		//없으면 "존재하지 않음" 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스에 존재
		 * 
		 * 과일 입력 : 수박
		 * 존재하지 않음
		 * */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 입력 : ");
		String fruit = sc.next();
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(fruit)) {
				System.out.println(i + "번 인덱스에 존재");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void ex9() {
	
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열 안에 몇 개 존재하는지 확인
		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String inputString = sc.next();
		
		char[] ch = new char[inputString.length()];
		
		for(int i = 0; i<inputString.length(); i++) {
			ch[i] = inputString.charAt(i);
		}
		
		System.out.println("검색할 문자 입력 : ");
		String searchChar= sc.next();
		char cha = searchChar.charAt(0);
		boolean flag = false;
		int count =0;
		for(int i =0; i<inputString.length(); i++) {
			
			if(ch[i] ==cha) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = true;
				count++;
			}
		}

		System.out.println(count + "개 존재합니다");

		
		if(flag==false) {
			System.out.println("존재하지 않습니다");
		}
		
		
	}
	
	
	
}
