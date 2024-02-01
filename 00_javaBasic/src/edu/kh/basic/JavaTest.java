package edu.kh.basic;

// 한 줄 주석 : 컴파일러가 해석하지 않는 부분을 주석이라고 한다고 했음. 

/* 범위 주석
 * 
 * 
 * */

public class JavaTest {
	
	public static void main(String[] args) {
	
		System.out.println("Hello world!!!");
		//ctrl + alt + 방향키 : 작성한 방향으로 해당 줄 복사
		
		System.out.println("점심 뭐먹지?");
		System.out.println("12345");	
		
		//syso + ctrl + space
		System.out.println();
		
		//숫자 연산
		System.out.println("1+2"); //1+2
		System.out.println(1+2); //3
		
		//"" 안에 작성된 코드는 단순 문자열로 인식
		//"" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(327/3);
		System.out.println(12%2);
		
		//""(문자열) + 숫자 함께 작성
		
		System.out.println("14* 19 = " + 266);
		System.out.println("14* 19 = " + 14*19);
		
		System.out.println("90+70+65=" + 90 +70 +65);
		System.out.println("90+70+65=" + (90 +70 +65));
		
		
	}
}
