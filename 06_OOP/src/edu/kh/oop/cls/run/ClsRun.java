package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.clsService;

public class ClsRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clsService service = new clsService();
		//매개변수 없는 생성자 -> 기본생성자라고 한다. 
		//ClsService의 기본생성자가 작성되어있지 않지만
		//문제 없이 사용 가능하다. 
		//왜? 컴파일러가 코드를 번역할 때, 클래스 내부에 생성자가 하나도 없다면
		//자동으로 기본생성자를 추가해준다. (우리 눈에는 안 보인다)
		
//		service.ex1();
//		service.ex2();
//		service.ex3();
		
		service.ex4();
		
		

	}

}
