package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	
	
	/* ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체 ( Instance == Object ) 를 입/출력 할 때
	 * 사용하는 바이트 기반 "보조" 스트림이다. (기반 스트림 아님을 주의)
	 * 보조스트림이기 때문에, 단독 사용 불가능! 
	 * 기반스트림에 끼워서 사용해야함.
	 * 
	 * 
	 * *** 직렬화 (Serializable) ***
	 * - 객체를 직렬(직선) 형태로 변환
	 * 
	 * 
	 * */

	/**
	 * 프로그램 내부객체를 -> 프로그램 외부 파일로 출력
	 */
	public void objectOutput() {
		
		// 스트림 참조 변수 선언한 것.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// .dat 확장자 : data 를 담고 있는 파일을 나타내는 확장자. 
			fos = new FileOutputStream("/io_test/20240222/Member.dat");
			
			oos = new ObjectOutputStream(fos); // 객체 보조 스트림 생성한 것
			
			Member member = new Member("member01", "pass01!", "김회원", 30);
			
			//ObjectOutputStream 을 이용해서 Member 객체를 /io_test/20240222/Member.dat 이 경로에 출력하기
			oos.writeObject(member); //객체를 출력하는 것
			
			// close() 구문에 flush() 가 내장되어 있음. 그래서 flush() 안씀
			
			System.out.println("회원 출력 완료");			
			
			//위 단계까지 하면, java.io.NotSerializableException: edu.kh.io.pack3.model.dto.Member 라는 예외가 터짐.
			// Member 클래스가 직렬화가 안되었다는 뜻.
			// Member 클래스로 가서 직렬화 해줘야 함. 직렬화 하는 방법은? public class Member implements Serializable
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(oos != null) {
					oos.close();
				}
			}catch(IOException e ) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	/**
	 * 프로그램 외부 파일 -> 프로그램 내부로 불러오기
	 */
	public void objectInput() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240222/Member.dat");
			
			// 객체 입력 보조 스트림 생성
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된 
			// 직렬화된 Member 객체를 읽어와
			// 역직렬화를 수행하여 정상적인 Member 객체로 변경
			
			// ois.readObject() : 직렬화된 객체를 읽어와 역직렬화 해줌. 근데 반환형이 Object 임.
			// 그래서, Member객체로 다운캐스팅 해줘야함.
			
			Member jajun = (Member) ois.readObject();
			
			//읽어온 내용 확인
			System.out.println(jajun); //Member [id=member01, pw=pass01!, name=김회원, age=30] 출력됨.
			
			
		}catch(Exception e) {
			
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}
			}
			catch(IOException e) {
				
			}
		}
		
	}
	
	
	
	
	
	
	
}
