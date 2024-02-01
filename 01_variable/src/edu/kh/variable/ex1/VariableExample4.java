package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main (String[] args) {
		
		/* 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 
		 * 1) 타입에 들어올 수 있는 값의 범위가 큰 자료형을 작은 자료형으로 변환할 때 사용
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때 사용한다.
		 * 
		 * * 강제 형변환 방법
		 * - 자료형을 변환 시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		 * 
		 * 	ex) double temp = 3.14;
		 * 	int num = (int)temp;
		 * 
		 * */
	
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println("temp : " +temp);
		System.out.println("num :" +num); //int로 강제형변환되서 소수점 짤리고, 3만 남음(데이터손실)
		
		//int -> byte 강제 형변환
		int iNum = 290;
		byte bNum = (byte)iNum; // Type mismatch : cannot convert from int to bye.
	
	
		System.out.println(iNum); //290
		System.out.println(bNum); //34 //같은 정수형 끼리의 변환 시에도 값의 범위 차이 때문에 데이터 손실이 발생
		//같은 정수형 끼리의 변환 시에도
		//값의 범위 차이 때문에 데이터 손실이 발생
		
		//char -> int 강제 형변환
		char ch = 'A'; 
		
		int iNum2 =ch; //자동 형변환 이용
		System.out.println(iNum2); //65
		
		//강제형변환 이용
		System.out.println((int)ch); //65
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할 수가 없다. 
		// -> 개발자가 미리 예측해야함.
		int i6 = 2147483647; //  int 의 최댓값
		int result6 = i6 + 1; //에러를 인식할 수 없다.
		System.out.println(result6); //-2147483648 이 됨. 이를 오버플로우 현상이라고 함.
		
		
	}
}