package edu.kh.variable.ex2;

public class PrintExample {
	
	//main 작성 ctrl + space + enter
	public static void main (String args[]) {
		
		//System.out.print() : 단순 출력(출력 후 줄바꿈 X)
		//System.out.println() : 한 줄 출력(출력 후 줄바꿈 수행)
		//줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 출력된다는 것은 똑같음
		
		//System.out.println(); 자동완성 syso ctrl+space
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		
		System.out.println(); //내용없는 println() : 단순 줄바꿈
		
		System.out.print("테스트4");
		
		
		//System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		System.out.println(); //위에 print 구문썻으니 줄바꿈 해줌
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15;
		System.out.println(iNum1 + "+" + iNum2 + "=" + (iNum1 + iNum2));
		//중간에 오타날 가능성이 높다.
		//이때 printf 를 이용하면 된다.
		
		/* printf 사용하는 패턴
		 * %d : 정수형 
		 * %o : 8진수
		 * %x : 16진수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수
		 * %e : 지수형태표현
		 * %g : 대입 값 그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 * 
		 *\n : 개행을 뜻함.
		 * 
		 * */
		
		
		// System.out.printf("패턴", 패턴에 들어갈 값);
		
		//10 + 5 =15 //여기서 \n 이 의미하는 바는 줄바꿈하라는 뜻임.
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, iNum1+iNum2);
		System.out.println("다른거");
		
		// 10 + 10 * 5 / 2 = 35
		System.out.printf("%d + %d * %d / %d = %d \n", iNum1, iNum1, iNum2, 2, iNum1 + iNum1 * iNum2 / 2);
		
		//패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3); //3
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		
		// 소수점 자리 제어 (반올림 처리가 됨)
		System.out.printf("%f\n", 10 / 4.0); //2.500000
		System.out.printf("%.2f\n", 10 / 4.0); // .2 를 붙이면, 소수점 둘째자리까지만 나타내도록 하는것
		System.out.printf("%.0f\n", 10 / 4.0); //소수점 아래를 표현하지 않겠다.
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '조'; //char 는 홑따옴표
		String str = "안녕하세요"; //String 은 쌍따옴표 //String 은 참조형
		
		// false / 조 / 안녕하세요
		System.out.printf("%b / %c / %s \n", isTrue, ch, str);
		
		//escape 문자(탈출 문자 : 일반 문자가 아닌 특수문자로 표현한것)
		
		//                    \
		System.out.println("\\"); //백슬래시(역슬래시) 출력방법
		//                    \o/
		System.out.println("\\o/"); 
		
		System.out.println("a\tb\tc\td"); //tab 출력 -> a            b             c             d
		//한공간씩 표현X, 한번에 공간차지
		
		//유니코드 이스케이프
		System.out.println("\u0041"); //A 
		//유니코드(16진수)
		//65를 16진수로 표현
		//65 나누기 16 하면 몫 4, 나머지 1
		
		
		
		
	}
}
