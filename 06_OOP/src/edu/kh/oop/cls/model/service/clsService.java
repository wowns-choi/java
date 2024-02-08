package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class clsService /*extends Student*/{
	public void ex1() {
		//클래스 접근 제한자 확인하기
		//public class인 Student 는 import 가능
		Student std = new Student();
		
//default 접근제한자가 붙은 클래스인 TestVO는 다른 패키지에서 import 불가능
//		TestVO test = new TestVO();
		
		
		System.out.println(std.v1);	
		//다른 패키지에서도 접근 가능한 public 만 에러가 나지 않는다.
		
		
//		System.out.println(std.v2); 
//		System.out.println(std.v3);
//		System.out.println(std.v4);
		
		// 상속 관계에서 직접 접근 가능 범위
		// 주의: 상속을 받았기 때문에, std.필드명으로 접근하면 안됨. 
//		System.out.println(v1);		o
//		System.out.println(v2); 	
//		System.out.println(v3);		x
//		System.out.println(v4);		x
	}
	
	public void ex2() {
		//static 필드 확인 예제
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		//학생 객체에 name 세팅
		std1.setName("홍길동");
		std2.setName("김영희");
		
		// *** static 이 붙은 필드(변수) 는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH정보교육원";
		
		System.out.println(Student.schoolName);
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		/*static
		 * 1) 공유 메모리 영역( 또는 정적 메모리 영역) 이라고 함.
		 *
		 * -> 프로그램 시작시 static 이 붙은 코드들이 모두
		 * static 영역에 생성되고, 
		 * 프로그램이 종료될 때 까지 사라지지 않음(정적)
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유가능(공유)
		 * 
		 * 2) 사용방법 : 클래스명.변수명(Student.schollName)
		 * 
		 *
		 * */
	
	}
	
	public void ex3() {
		//생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		System.out.println("--------------------------------");
		
		User u2 = new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());

		// 문제점 : u1이 참조하고 있는 User 객체와 
		//			u2가 참조하고 있는 User 객체의 필드값이 모두 동일함
		//			왜? 같은 기본 생성자로 User 객체를 생성했기 때문에
		
		System.out.println("--------------------------------");
		
		//해결 방법 1 : setter 를 이용해서 새로운 값 대입
		u2.setUserId("asd12345");
		u2.setUserPw("1w2e2e");
		u2.setUserName("김영희");
		u2.setUserAge(19);
		u2.setUserGender('여');

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		System.out.println("-------------------------------");
		
		//해결 방법 2 : 매개변수 생성자를 이용해서 
		//객체가 생성될 때부터 다른값으로 필드를 초기화
		User u3 = new User("test3", "password333"); //매개변수 생성자
		//생성자 수행시 전달할 값을 작성하면 됨(순서 꼭 지켜야됨!)
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
		
	}
	
	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User();  //기본생성자
		User u2 = new User("user02", "pass02");  //매개변수 2개 생성자
		User u3 = new User("user03", "pass03", "김길동", 30, '남'); //매개변수 5개 생성자
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
					u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender()
				);
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender()
				);
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender()
				);
		
		
		
	}
	
}
