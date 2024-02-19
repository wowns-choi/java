package edu.kh.exception.test;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		//컴파일 에러 => 개발자가 코드 잘못 쓴 경우
		//Type mismatch: cannot convert from double to int 
		// 정수형 타입 변수에 실수를 넣었을 경우.
		//int a = 99.9; 
		int a = (int) 99.9; //코드로 수정 가능!
		
		//런타임 에러 => 프로그램 수행 중 발생하는 에러
						//주로 if 문으로 처리 가능하다. 
		
		int[] arr = new int[3];	//길이 3 : 인덱스 0,1,2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40; // 컴파일 에러가 아니기 때문에, 아무런 문제 없음. 
					//근데, 프로그램 실행시키면 ArrayIndexOutOfBoundsException
					//이런 런타임 예외가 뜸. 
	
		//if문으로 예외처리하기
		if( 3 >= arr.length) { //배열 인덱스 범위 초과 시
			System.out.println("배열 범위를 초과하셨습니다.");
		} else {
			arr[3] = 40;
			arr[4] = 50;
		}
	
	}

}
