package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterService {
	
	/* 문자 기반 스트림
	 * 
	 * - 2byte 문자(char) 단위로 입/출력 하는 스트림
	 * 
	 * - Reader(입력), Writer(출력) 최상위 인터페이스
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 * 
	 * 
	 * */
	
	/*
	 * 문자 기반 파일 입력(파일 읽어오기)
	 *  + 보조 스트림 Buffered 사용
	 * 
	 * 
	 * */
	public void fileInput() {
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null; //문자 기반 보조 스트림
		
		try {
			
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/20240222/노래가사.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			
			String line = null; // 한줄을 읽어와 저장할 변수
			
			while(true) {
				line = br.readLine();
				
				if(line == null) {
					// 더 이상 읽어올 내용이 없을 때
					break;
				}
				
				System.out.println(line);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	/**
	 * 문자 기반 파일 출력
	 * + 보조 스트림 Buffered 사용
	 * 
	 * 
	 */
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("오늘은 2월 23일 금요일입니다");
		sb.append("벌써 금요일이라니! 기분이 좋군요! \n");
		sb.append("다들 힘내서 공부합시다! \n");
		sb.append("그리고 이거 끝나고 쪽지시험입니다 ^0^");
		
		String content = sb.toString();
		
		// content에 저장된 문자열을 
		// /io_test/20240222/출력테스트.txt 파일로 출력하기
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//파일과 출력 스트림 연결(파일이 없으면 생성함)
			fw = new FileWriter("/io_test/20240222/출력테스트.txt");
			
			bw = new BufferedWriter(fw); // 버퍼를 이용해서 성능을 향상
			
			bw.write(content); // content 에 저장된 내용을 연결된 파일에 출력
			
			//bw.flush(); 안해도 됨 close()에 포함되어 있음.
			
			System.out.println("출력 완료");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(bw != null) {
					// close() 구문에 flush() 가 내장되어 있음. 그래서 flush() 안씀
					bw.close();
				}
					
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
		
	}
	
}	
