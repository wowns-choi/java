package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main (String[] args) {
		/*자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드) , 차(char) 이(2)
		 * */
		
		//변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것.
		//변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		//* 카멜 표기법 
		//연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기
		
		
		boolean booleanData;
		//메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		//할당된 공간을 booleanData 라는 이름으로 부르겠다.
		
		booleanData = true;
		
		System.out.println(booleanData); //booleanData 변수에 true 값을 집어 넣기
		
		
		byte byteNumber = 127; //128 넣는 순간 에러남.
		//메모리에 정수 값을 저장할 공간을 1byte 할당하고 
		//할당된 공간을 byteNumber라고 부르겠다.
		//선언된 byteNumber변수에 처음으로 127을 넣음.
		//--> 초기화 : 처음 변수에 값을 대입
		
		System.out.println(byteNumber);
		
		short shortNumber = 32767;
		
		//정수 자료형 기본형! (short, byte 는 옛날 코드 잔재)
		int intNumber = 2147483647;
	// 자료형 변수명 = 리터럴;
		
		//프로그래밍에서는 대입되는 이 데이터(값자체)를 리터럴 이라는 단어로도 표현함.
		
		//** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L;
		
		//변수 명명 규칙
		
		//1. 대소문자 구분, 길이제한 X
		int abcdefg123456789;
		int abcdefG123456789; //G 다름
		
		//2. 예약어 사용 X
		//double final 
		
		//3 숫자로 시작 X
		//char 1abc;
		
		//4. 특수문자 중에 $ _ 만 사용가능하다. 그러나 쓰지 않는걸로 한다. 
		int $intNumber; //문제는 없지만 개발자가 직접 이렇게 작성 안함
		int int_Number; //자바는 카멜표기법 사용하므로 이렇게 안함. // 스네이크 스타일은 db에서 사용
		
		//5. 카멜표기법 을 쓴다.
		char helloWorldAppleBananaTomato;
		
		//6. 영어로 안써도 인식은 하는데, 영어로 써라 그냥
		
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.33222; //에러! 재대입 불가!
		
		/*상수(항상 같은 수)
		 * - 변수 한 종류
		 * - 한번 값이 대입되면 다른값을 재대입 할 수 없음!
		 * - 자료형 앞에 final 키워드를 작성한다.
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우
		 * 	1) 변하면 안되는 고정된 값을 저장할 때
		 * 	2) 특정한 값에 의미를 부여하는 경우 
		 * 
		 * */
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		System.out.println(1+1.3); 
		
		//정수형 + 실수형인데도 2.3으로 잘 나오네?
		//왜? 1을 내부적으로 1.0으로 변경해서, 실수형 + 실수형으로 바꾼거임.
		//이걸 "자동 형 변환" 이라고 함.
		
	}
}
