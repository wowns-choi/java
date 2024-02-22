package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaAPIService {
	
	/*
	 * Wrapper Class
	 * 
	 *  - wrap : 감싸다, 포장하다
	 *  
	 *  - 기본 자료형을 객체로 감싸는 클래스
	 *  -> 기본자료형의 객체화
	 * 		왜, 기본자료형을 객체화 시켜야 하는가?
	 * 	-> 컬렉션처럼 객체만 취급하는 상황에서
	 * 		기본 자료형도 취급 가능한 형태로 바꾸기 위해서이다.
	 * 
	 * 			--> Boxing
	 * 	UnBoxing <--
	 * 
	 *  boolean <--> Boolean
	 *  byte <--> Byte
	 *  short <--> Short
	 *  int <--> Integer
	 *  long <--> Long
	 *  float <--> Float
	 *  double <--> Double
	 *  char <--> Character
	 * 
	 * * Boxing, Unboxing 을 자동으로 수행되도록 구현되어 있음
	 * -> Auto Boxing, Auto Unboxing
	 * 
	 * 
	 * */
	
	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		
		int num1 = 100; // int 
		
		// int -> Integer
		//Integer wrap1 = new Integer(num1); 예전 방법. 더 이상 이렇게 사용하면 안됨.
		Integer wrap1 = num1; //요즘 방식. 이렇게 해라. 
							//컴파일러가 자동으로 Auto Boxing 수행 코드((int) num1 -> (Integer) num1)를 추가해준다.
		
		int num2 = wrap1; //컴파일러가 Auto Unboxing 수행코드((Integer) wrap1 -> (int) wrap1)를 추가해준다. 
		
		long num3 = 10_000_000_000L; //100억
		Long wrap2 = num3; //Auto Boxing
		long num4 = wrap2; //Auto Unboxing
		
		// Integer 객체만 저장하는 List
		List<Integer> list = new ArrayList<Integer>();
		list.add(1000); // (int) 1000 -> (Integer) 1000 / Auto Boxing
		list.add(2000);
		list.add(3000);
		
		System.out.println(list.get(0)); // 원래 객체를 syso 찍으면, 참조값이나, toString을 오버라이딩했다면, toString이 나오겠지.
										// 근데, 1000이 나옴. 왜? Auto Unboxing 이 자동으로 되서, int값으로 변환되었기 때문이다.
		System.out.println(list.get(0) + list.get(1) + list.get(2));
		
		
	}
	
	/**
	 * Wrapper Class 가 제공하는 필드, 메소드
	 * -> 대부분이 static !!!
	 * 	-> 클래스명.필드명 / 클래스명.메서드명() 사용
	 * 
	 */
	public void method2() {
		
		// 정수형, 실수형 공통 (BYTE, SHORT, INT, LONG, DOUBLE, FLOAT 모두 공통)
		System.out.println("byte 의 용량 : " + Byte.BYTES); // 1
		System.out.println("byte 의 용량 : " + Byte.SIZE + "비트"); // 1
		System.out.println("byte 의 최대값 : " + Byte.MAX_VALUE ); // 127
		System.out.println("byte 의 최솟값 : " + Byte.MIN_VALUE ); // -128
		
		// 실수형만 사용 가능
		System.out.println(Double.NaN); //NaN : Not a Number , 숫자가 아니다.
		System.out.println(Double.NEGATIVE_INFINITY); //-Infinity
		System.out.println(Double.POSITIVE_INFINITY); //Infinity
		
		// Boolean(논리형)은 true/false 밖에 없음
		System.out.println(Boolean.FALSE); //false 가 리턴됨
		System.out.println(Boolean.TRUE); //true 가 리턴됨
		
		System.out.println("------------------------------");	
		
		System.out.println("[String -> 기본 자료형 변환]");
		
		// HTML 연결 시 (요청 데이터 처리) 많이 사용
		// -> HTML 에 관련된 모든 값은 String
		
		// 단, char(Character) 는 별도로 존재하지 않음.
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); //중요
		long l = Long.parseLong("4"); //중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); //중요
		boolean bool = Boolean.parseBoolean("true");
		
		System.out.println("------------------------------");
		
		System.out.println("[기본자료형 -> String 변환]");
		
		// String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음(속도 down, 메모리 소모 up)
		long test1 = 12345678910L;
		String change1 = test1 + ""; //숫자 + 문자열 이니까 문자열로 바뀜. 
		
		//Wrapper Class를 이용한 방법
		// -> 코드는 좀 긴데, 효율이 좋음
		int test2 = 400;
		String change2 = Integer.valueOf(test2).toString();
		
		double test3 = 4.321;
		String change3 = Double.valueOf(test3).toString();
		
		
	}
	
	/**
	 * String 의 불변성 확인
	 * 선생님이 말하시기로는, String 타입 변수에 새로운 값을 대입할 경우, 기존에 있던 메모리공간에 새로운값이 들어가는게 아니라,
	 * 새로운 메모리공간에 값이 할당되고 그 새로운 메모리공간을 변수가 가리킨다고 함.
	 * 
	 * String의 불변성(immutable, 변하지 않는 성질 == 상수)
	 * - 문자열이 수정되면 새로운 String 객체가 생성됨
	 * 
	 * 
	 */
	public void method3() {
		
		//System.identityHashCode(str)
		// -> 메모리 주소 값을 이용해서 만든 해시코드(식별번호)
		// -> 같은 객체 저장된 값이 변했다면 주소는 일정해야 한다.
		// identityHashCode 도 일정해야한다.
		
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //1651191114

		str = "world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //1586600255
		
		// 어때? 메모리 주소값이 변한 걸 볼 수 있지.
		
		str += "!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //943010986
		
		//그럼 상수풀에 남아있던 hello 라는 String 객체와 world 라는 String객체는? 가비지컬렉터에 의해 삭제됨
		//상수풀은 힙영역에 있나? 아니.
			
	}
	
	/**
	 * String 리터럴("") 로 생성된 객체 활용하기
	 * - 동일한 리터럴을 이용해 String 객체를 생성한 경우
	 * 		추가적으로 객체를 생성하지 않고
	 * 		기존에 존재하는 String 객체의 주소를 반환(재활용)
	 * 
	 */
	public void method4() {
		
		String temp1 = "Hello!!";
		String temp2 = "Hello!!";
		
		System.out.println(System.identityHashCode(temp1)); //1865127310
		System.out.println(System.identityHashCode(temp2)); //1865127310

		
	}
	
	/**
	 * 사용자(개발자) 가 관리하는 String 객체를 생성
	 * - "" 리터럴로 생성된 String -> 상수풀 JVM 관리
	 * - new 연산자로 생성된 String -> Heap 영역 (사용자 관리)
	 * 
	 */
	public void method5() {
		
		String temp1 = "abcd"; //리터럴로 생성 -> 상수풀에 생성
		String temp2 = new String("abcd"); // new 연산자로 생성 -> 힙영역에 생성
		String temp3 = new String("abcd"); // new 연산자로 생성 -> 힙영역에 생성. 위의 객체와 다른 객체로서 생성
		
		System.out.println(System.identityHashCode(temp1)); //1865127310
		System.out.println(System.identityHashCode(temp2)); //1586600255
		System.out.println(System.identityHashCode(temp3)); //474675244

		// 즉 3개 모두 다른 메모리 공간을 가지고 있음.
		
		// 셋 다 주소가 다름 == "abcd" 를 재활용하지 않음.
		// -> 값은 같지만 전부 다른 객체!
		
		temp2 += "efg";
		System.out.println(System.identityHashCode(temp2)); //1807837413 기존 temp2와 메모리주소값 다름.
	
	}
	
	//이렇게 String 의 불변성이라는 특성 때문에, 프로젝트에 비효율성이 발생하기도 한다.
	
	/**
	 * StringBuilder / StringBuffer 클래스
	 * - String의 불변성 문제를 해결한 클래스
	 * -> 가변성 (mutable)
	 * 
	 * - 기본 16글자 저장할 크기로 생성
	 * 		저장되는 문자열의 길이에 따라 크기가 증가/감소
	 * 		-> 마음대로 문자열 수정, 삭제 가능!
	 * 		-> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율 좋음!
	 * 
	 * - StringBuilder : Thread Safe(쓰레드 안정성) 미제공 (비동기)
	 * - StringBuffer : Thread Safe 제공 (동기)
	 * 
	 *  동기란 무엇인가? 카페에서 어떤 점원이 주문부터 음료를 다 만들고 나서야 다른 손님을 받는 것
	 *  비동기는, 내가 카페 일했을 때를 떠올리면됨. 
	 *  
	 *  내가 일했던 방식(비동기) 가 성능(효율)이 좋음. 근데, 멀티쓰레드 환경에서는 안쓰는게 좋아. 
	 *  왜냐하면, 일하다가 부딪혀서 다치면 애플리케이션 죽어버림
	 *  
	 *  다시 말하자면, 
	 *  여러 쓰레드가 StringBuilder 를 쓸 경우, 부딪힐 가능성이 있음. 대신 속도 빠름.
	 *  그러나, 여러 쓰레드가 StringBuffer 를 쓸 경우, 부딪히지 않도록 설계되어 있음. 대신 속도 느림.
	 *  
	 * 
	 * - StringBuilder 
	 * : 속도면에서는 StringBuffer 보다 성능 좋음
	 * -> 멀티쓰레드 환경에서는 StringBuilder 보다 성능 좋음.
	 * -> 멀티쓰레드 환경에서는 StringBuilder 사용 시
	 * 		쓰레드 충돌 가능성 있음. -> 글자가 깨지거나 오류가 발생..
	 * -> 단일 쓰레드 환경에서 유리
	 * 
	 * -StringBuffer
	 * : 속도면에서는 StringBuilder 보다 성능 떨어짐.
	 * -> 멀티쓰레드 환경에서 안전하게 동작할 수 있음
	 * -> 멀티쓰레드 환경에서 유리
	 * 
	 * 그래서 뭐쓰라고?
	 * 자바는 멀티쓰레드 환경을 제공하긴 하지만, 
	 * 웹 프로젝트에서 멀티쓰레드를 쓸 일이 ..?
	 * 보통 main 메서드 하나 있잖아. 즉, 쓰레드 충돌날 가능성이 없다 이말이야.
	 * 따라서, StringBuilder 써라.
	 * 
	 * 
	 * 
	 */
	public void method6() {
		
		//StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		//StringBuilder 객체에 문자열을 쌓아 나가는 방식으로 사용
		// -> 뒤에 추가(append), 앞에 추가(insert)
		sb.append("오늘 점심은 "); //"오늘 점심은"
		System.out.println(System.identityHashCode(sb)); //1865127310
		
		sb.append("무엇을 먹을까요?"); // "오늘 점심은 무엇을 먹을까요?"
		System.out.println(System.identityHashCode(sb)); //1865127310
		// 문자열이 변했음에도, 기존객체가 그대로 유지됨.
		
		sb.insert(0,  "2월 21일 "); //0번 인덱스에 삽입 == 제일 앞에 추가
		System.out.println(System.identityHashCode(sb)); //1865127310
		
		System.out.println(sb);
		
		// identityHashCode 값이 일정함
		// == 참조하는 객체가 변하지 않음을 의미.
		// == 객체 내에 값만 수정되고 있다. == 가변성
		
		// StringBuilder -> String 변환
		String temp = sb.toString(); //객체에 저장된 필드를 문자열로 반환해주는 게 toString 이었잖아.
						//여기서도 마찬가지임. sb라는 StringBuilder 타입 객체 안에 있는
						//필드(여기서는 문자열)가 반환됨.
		
		// String[] 문자열.split("구분자") :  
		// 문자열을 "구분자"를 기준으로 쪼개어 String[] 로 반환
		// "2월 21일 오늘 점심은 무엇을 먹을까요?"
		String[] arr = temp.split(" ");
		for(String str : arr) {
			System.out.println(str);
		}
		
		System.out.println("------------------");
		
		// equalsIgnoreCase() : 문자열을 비교할 때 대소문자를 무시하고 비교하는 메서드.
		
		String str1 = "hello";
		String str2 = "HELLO";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("두 문자열은 동일합니다.");
		}else {
			System.out.println("두 문자열은 다릅니다.");
		}

	}
	
	
	
	
	
	
	
}
