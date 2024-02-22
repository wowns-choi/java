package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteService {
	
	/* 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름(단 방향)
	 * 
	 * Byte 기반 스트림
	 * 
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * 
	 * - 최상위 인터페이스 : InputStream, OutputStream
	 * 
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 		모든 것을 입/출력 할 수 있음.
	 * 		(단, 통로가 좁다보니, 속도가 조금 느리다.)
	 * 
	 * 
	 * */
	
	/**********************************************************/
	// IO 관련된 코드는 IOException 이 발생될 가능성이 높다. 
	// -> 거의 모든 메서드가 throws IOException
	// -> IOException 예외 처리 구문을 작성하는 것이 필수!
	/**********************************************************/
	
	
	/**
	 *  바이트 기반 파일 출력
	 */
	public void fileByteOutput() {
		
		//FileOutputStream : OutputStream 인터페이스를 상속한 인터페이스
		
		//FileOutputStream fos = new FileOutputStream("");  
		//FileNotFoundException 은 IOException 은 자식임.
		
		FileOutputStream fos = null;
		try {
			//new FileOutputStream("경로");
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// (단, 폴더는 생성되지 않음)
			// -> 기존 파일이 존재하면 내용을 덮어쓰기 함.(기존에 내용이 있었던 경우에는, 기존 것이 삭제된다는 의미)
			
			// new FileOutputStream("경로", true)
			// -> 기존 파일이 존재하면 내용을 이어쓰기함.
			
			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트.txt"); 
			// new FileOutputStream 객체가 데이터가 전송될 스트림(통로)라는 것
			
			// String 불변성 문제를 해결한 객체(가변성)
			StringBuilder sb = new StringBuilder();
			sb.append("안\n").append("12345").append("~!@#$%^");
			sb.append("가나다라마바사");
			sb.append("와 자바 너무 재밌다 ~! \n");
			sb.append("선생님 저 공부 열심히 할게요!!!");
			sb.append("진짜로.");
			sb.append("뻥입니다 하하");
			
			//StringBuilder -> String 변환
			String content = sb.toString();
			
			//내 프로그램 내부에서 String 을 쓴거고, 이 String 을 바이트기반_테스트.txt 로 보내줘야함.
			//그리고, 그 보내는 통로가? fos 라는 변수에 담긴 new FileOutpuStream 객체라는 거임.
			
			//출력 방법 1 : 한 글자(2byte) 씩 파일로 출력하는 방법
			// -> 2byte 범주의 문자(한자, 한글 를 말함. 영어 숫자 특수문자는 1byte 라서 제외) 1byte 기반 스트림 통과 시
			// 데이터 손실이 발생해서 글자가 깨지는 문제가 발생
			
//			for(int i =0; i<content.length(); i++) {
//				char ch = content.charAt(i); // i 번째 글자 반환
//				fos.write(ch); //1byte 출력 스트림이 연결된 파일에 ch 를 쓰기.
//			}
			
			// 출력 방법 1 실행결과 한글이 다 깨져버림을 확인
			
			//System.nanoTime() : 1970.01.01 09:00:00 부터
			//현재 시간까지의 차이를 ns(나노 세컨드) 단위로 반환
			// 1ms(밀리) == 1/1000초
			// 1us(마이크로) == 1/1000ms 
			// 1ns(나노) == 1/1000us (1/10억 초)
			long startTime = System.nanoTime();
			
			//출력 방법 2 : String 을 byte[] 변환 후 출력
			// 문자열.getBytes() 라고 하면, 그 문자열을 1바이트씩 잘라서 넣은 바이트배열이 반환됨.
			//바이트타입 배열에다가 2바이트인 한글을 1바이트씩 잘라서 넣어놓고, 
			// 잘라놓은 바이트배열 요소하나하나를 스트림을 통해 넣은것.
			
			fos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			System.out.println("endTime - startTime =" + (endTime-startTime) + "ns");
			
			// 위에까지 했던 것이, 스트림이라는 통로에 한글자한글자를 쌓아두는 것.
			// 그럼, 스트림이라는 통로에 쌓여있는 걸 바이트기반_테스트.txt 파일에 
			// 밀어넣어야 겠지? 그게 fos.flush() 임
			fos.flush();
			
			System.out.println("출력 완료!");
			
			
			
		} catch(IOException e) {
			e.printStackTrace(); //예외가 발생한 메서드까지 추적해 출력해주는 역할
		} finally {
			//try 에서 예외 발생여부 관계없이 무조건 실행되는 게 finally 본문
			
			// 스트림 도 다 썻으면 닫아줘야함. 그래야, 메모리 누수 안생김.
			// 즉, 사용완료한 스트림을 제거(메모리반환)하는 코드 작성
			//fos.close(); // 근데, close() 라는 메서드도 IOException 을 발생시킬 수 있는 메서드라는 걸 알 수 있어.
			
			try {
				//스트림이 어떤 예기치못한 문제로 생성되지 않았을 경우를 가정해서,
				// null 이 아닌 경우, 즉, 스트림이 생성되었을 경우에만 스트림을 
				// 닫도록 하기 위해 if 문으로 아래와 같이 작성한 것.
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
				
		}
		
		
		
		
		
		
		
	}
	
	/**
	 * 버퍼를 이용한 파일 출력
	 * 
	 * - BufferedOutputStream 보조 스트림 이용
	 * 
	 */
	public void bufferedFileByteOutput() {
		/* 버퍼(Buffer) 란?
		 *  - 데이터를 모아두는 박스, 장바구니 같은 메모리 공간
		 *  
		 *  * 버퍼링
		 *  - 인터넷 속도 낮음 + 스트리밍 코드가 효율이 안좋음
		 *  -> 동영상 재생 중에 미리
		 *  앞에 재생될 부분을 다운 받아놔서
		 *  영상을 끊김없이 볼 수 있게 함.
		 * 	-> 미리 다운 받아서 저장해 놓는 공간을 "버퍼" 라고 한다.
		 * 
		 * 
		 * 
		 * */
		
		
		/* BufferedOutputStream / BufferedInputStream
		 * 
		 * - FileOutputStream 은 1바이트씩 데이터를 입출력
		 * 
		 * - BufferedOutputStream / BufferedInputStream 은 
		 * -> 버퍼에 입출력할 내용을 모아서 한 번에 입출력
		 * 
		 * --> 스트림을 이용하는 횟수가 현저히 적어짐.
		 * 	-> 성능, 시간 효율 UP!
		 * 
		 * 
		 * 
		 * */
		
		
		FileOutputStream fos = null;
		
		BufferedOutputStream bos = null; // BufferedOutputStream 은 "보조" 스트림이라서 단독으로 사용 불가능.
		
		try {
			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트_Buffered.txt"); 
			
			// 기반 스트림인 new FileOutputStream 객체를 이용해서,
			// 보조 스트림인 bos 를 생성할것.
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("안\n").append("12345").append("~!@#$%^");
			sb.append("가나다라마바사");
			sb.append("와 자바 너무 재밌다 ~! \n");
			sb.append("선생님 저 공부 열심히 할게요!!!");
			sb.append("진짜로.");
			sb.append("뻥입니다 하하");
			
			String content = sb.toString();
		
			long startTime = System.nanoTime();
			
			bos.write(content.getBytes()); 
			
			long endTime = System.nanoTime();
			System.out.println("endTime - startTime =" + (endTime-startTime) + "ns");

			bos.flush(); //스트림에 남아있는 데이터 밀어내기(쏟아내기)
			
			System.out.println("출력 완료!");
			
		} catch(IOException e) {
			e.printStackTrace(); 
		} finally {
			
			
			try {
				if(bos != null) {
					bos.close();
					// 보조 스트림 close() 시
					// 보조스트림 생성에 사용된 기반스트림도 같이 close() 되도록 설계되어 있음.
				}
			} catch(IOException e) {
				e.printStackTrace();
			}		
		}
	}
	
	
	/**
	 * 바이트 기반 파일 "입력"스트림(내 프로젝트 외부에서 내부로)
	 * 
	 */
	public void fileByteInput() {
		//파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			
			//방법 1. 파일 내부 내용을 1byte 씩 끊어서 가져오기
			// -> 2byte 범주의 글자들이 깨지는 문제가 발생.
			// 실제로 해보니, 한글은 2바이트라 다 깨져버림. ë ëë ê¸¸ì ëê° ë´ê² ë§íì§ 이런식으로
			
			//자바에서 byte 는 정수형 
			// -> 다루기 힘들기 때문에, 정수 기본형인 int로 변환해서 사용하려고 함.
			
			int value = 0; // FileInputStream(스트림=통로)를 통해서 읽어온 바이트값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); //1바이트씩 읽어오기
				// 단, 더 이상 읽어올 값이 없으면 -1 반환
				
				if(value == -1) {break;} //다 읽어왔으면 break 해라.
				
				//읽어온 값을 StringBuilder에 추가
				sb.append( (char) value ); //char로 강제 형변환해서 글자 형태로 추가
				
			}
			
			System.out.println(sb.toString()); // 읽어온 내용 콘솔에 출력
			
			//InputStream 은 flush() 없음
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//사용완료된 Stream 메모리 반환
			try {
				if(fis != null) {fis.close();}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void fileByteInput2() {
		//파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;
		
		try {  
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			
			// 방법 2. 파일에 저장된 모든 byte 값을 다 읽어와
			// byte[] 형태로 반환 받기
			// -> 이후 byte[] 배열을 이용해서 String 객체 생성
			// -> String 생성시 배열 요소 2개씩 묶어 한 글자로 해석해
			// 	  깨지는 글자 없이 문자열로 변환
			
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes); // new String(바이트배열); 라고 하면, 
												// 바이트배열을 문자열로 변환해줌.
			
			System.out.println(content);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//사용완료된 Stream 메모리 반환
			try {
				if(fis != null) {fis.close();}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 */
	public void bufferedFileByteInput() {
		
		// 스트림 참조 변수 선언
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			//기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			
			//보조 스트림 생성
			bis = new BufferedInputStream(fis); //기반스트림을 매개변수로 전달해주면 됨.
			
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//보조스트림만 close() 해도 기반스트림도 같이 close() 됨.
			try {
				if(bis != null) {bis.close();}
			}catch(IOException e) {
				e.printStackTrace();
			}	
		}	
	}
	
	
	/**
	 * 파일복사
	 * 
	 *  파일 경로를 입력 받아 
	 *  지정된 파일과 같은 경로에 복사된 파일 출력하기
	 *  
	 *  [실행화면]
	 *  파일 경로 입력 : /io_test/20240222/노래가사.txt
	 *  복사 완료 : /io_test/20240222/노래가사_copy.txt
	 *  
	 *  1) 입력된 경로에 파일이 있는지 검사
	 *  
	 *  2) 있다면, 파일 내용을 모두 읽어오기 : FileInputStream + BufferedInputStream
	 *  
	 *  3) 읽어온 내용을 같은 위치에 "파일명_copy" 라는 이름으로 출력
	 *  	: FileOutputStream + BufferedOutputStream
	 *  
	 *  + Scanner 대신 BufferedReader 이용
	 *  
	 */
	public void fileCopy() {
		// 스트림 참조 변수 선언
		BufferedReader br = null; // 문자열 입력용 스트림
		FileInputStream fis = null; // 파일 입력
		BufferedInputStream bis = null; //입력 보조
		
		FileOutputStream fos = null; //파일 출력
		BufferedOutputStream bos = null; //출력 보조
		
		try {
			//키보드 입력을 받기 위한 스트림 객체 생성
			br = new BufferedReader(new InputStreamReader(System.in));

			//경로 입력 받기
			System.out.println("파일 경로 입력 : ");
			String target = br.readLine(); //입력된 한 줄 읽어오기
			
			//해당 경로에 파일이 존재하는지 확인
			File file = new File(target);
			
			if(!file.exists()) { //해당 경로에 파일이 존재하지 않으면
				System.out.println("[해당 경로에 파일이 존재하지 않습니다]");
				return;
			}
			//-----------------------------
			
			// target 이 가리키는 파일을 입력받을 수 있도록
			// 입력용 스트림 생성
			
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			//입력용 스트림을 이용해서 target 입력 받기
			byte[] bytes = bis.readAllBytes();
			
			//------------------------------
			
			// 출력할 파일의 경로 + _copy 가 붙은 파일이름
			
			// target : /io_test/20240222/노래가사.txt
			// copy : /io_test/20240222/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); //"/io_test/20240222/노래가사.txt"
			
			// int String.lastIndexOf("문자열") 
			// - String 뒤에서부터 검색해서
			// "문자열" 과 일치하는 부분의 인덱스를 반환
			// 없으면 -1 반환
			
			int insertPoint = target.lastIndexOf(".");
			sb.insert(insertPoint, "_copy");
			//"/io_test/20240222/노래가사_copy.txt"
			
			String copy = sb.toString(); // 복사할 파일의 경로
			
			// 출력용 스트림 생성
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			// 읽어왔던 내용 byte를 bos를 이용해서 출력한다.
			bos.write(bytes);
			bos.flush(); //스트림에 남아있는 데이터 모두 밀어내기
			System.out.println("복사완료 : " + copy);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				//사용한 스트림 메모리 모두 반환
				if(br != null) {br.close();}
				
				if(bis != null) {bis.close();} // fis 도 닫힘
				
				if(bos != null) {bos.close();} // fos 도 닫힘
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	
	
}
