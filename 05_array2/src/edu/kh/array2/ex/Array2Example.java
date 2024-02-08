package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * 
	 * */
	
	public void ex1() {
		//2차원 배열 선언
		//int 2차원 배열을 참조하는 참조변수 arr 선언
		//참조변수 == 참조형 == reference변수 == reference
		int[][] arr; //int arr[][] , int[] arr[] 

		//2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		//heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		// 2) 2중 for문을 이용한 초기화
		
		int num = 10; //배열 요소 초기화에 사용할 변수
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k] = num;
				num += 10;
			}
		}
		
		//Arrays.toString(배열명) : 참조하고 있는 1차원 배열 값을 문자열로 반환
		//System.out.println(Arrays.toString(arr)); 이라고 하면, arr[0] 과 arr[1] 이 참조값을 가지고 있기에, 참조값이 문자열로 반환되는 것임.
		
		//그럼 어떻게 2차원 배열 요소 값을 볼 수 있을까?
		//Arrays.deepToString(배열명)
		// -참조하고 있는 배열의 데이터가 나오는 부분까지 파고 들어가서
		// 모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr));
		
	}

	
	public void ex2() {
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1 ~ 9 까지 초기화
		
		int[][] arr = { {1 ,2, 3}, 
						{4, 5, 6}, 
						{7, 8, 9} };
		
		//행 별로 합 출력
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int k=0; k<arr[i].length; k++) {
				sum += arr[i][k];
			}
			System.out.println(i + "행의 합 : " + sum);
		}	
		
		
		//열 별로 합 출력
		
		int firstColumn = 0;
		int secondColumn = 0;
		int thirdColumn = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				if(k==0) {
					firstColumn += arr[i][k];
				} else if(k==1) {
					secondColumn += arr[i][k];
				} else if (k==2) {
					thirdColumn += arr[i][k];
				}
			}
			
			
		}
		System.out.println("첫번째 컬럼 : " + firstColumn);
		System.out.println("두번째 컬럼 : " + secondColumn);
		System.out.println("세번째 컬럼 : " + thirdColumn);
		
	}
	
	
	public void ex3() {
		//가변 배열
		// - 2차원 배열 생성시 마지막 배열 차수(열)를 지정하지 않고
		// 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
	
		char[][] arr = new char[4][]; //가변 배열
			//char 2차원 배열 생성시 행 부분만 생성
		
		arr[0] = new char[3]; //0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[4]; //1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; //2행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; //3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		
		for(int row =0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				arr[row][col] =ch++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
