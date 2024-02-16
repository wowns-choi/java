package com.hw4.view;

import java.util.Arrays;
import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		int aa = 0;
		do {
			System.out.println("======회원 관리 메뉴=====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			aa =sc.nextInt();
			switch(aa){
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : break;
			case 5 : break;
			case 6 : sortMember(); break;
			case 0 : break;
			}
		}while(aa!=0);
		
	}
	public void insertMember() {
		//1. 현재 회원 수(memberCount)가 최대 회원수(SIZE)를 넘어설 경우 return 처리
		if(mc.getMemberCount() > mc.SIZE) {
			System.out.println("어우~ 회원이 10명이 넘어서 더 이상 추가회원을 받을 수 없어요");
			return;
		}
		//2. 아이디를 입력받아 MemberController checkId() 메서드로 전달 >> 결과 값
		System.out.println("아이디를 입력해주세요");
		
		String inputId = sc.next();
		System.out.println("-----------" + inputId);
		
		Member findMember = mc.checkId(inputId);
		
		//2.1 결과 값이 null 이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		if(findMember != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			return;
		}
		//2.2 결과 값이 null 인 경우. 즉, 동일한 아이디가 존재하지 않는 경우
		System.out.println("비밀번호는 뭐로 하시겠어요?");
		String pw =	sc.next();
		System.out.println("이름이 어떻게 되세요?");
		String name = sc.next();
		System.out.println("나이는?");
		int age = sc.nextInt();
		System.out.println("성별은? 남? 여?");
		String gender = sc.next();
		System.out.println("이메일을 입력해주세요");
		String email = sc.next();
		
		//String userId, String userPwd, String name, int age, char gender, String emil
		
		Member member = new Member(inputId, pw, name, age, gender.charAt(0), email);
		
		mc.insertMember(member);
		System.out.println("성공적으로 회원 등록이 되었습니다.");
		
	}
	public void searchMember() {
		System.out.println("====회원 정보 검색=====");
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전 메뉴로");
		int menu = sc.nextInt();
		if(menu == 9) {
			return;
		}
		
		System.out.println("검색 내용(키워드) : ");
		String search = sc.next();
		
		Member findMember = mc.searchMember(menu, search);
		if(findMember == null) {
			System.out.println("그런 회원 없는데요?");
		}
		if(findMember != null) {
			System.out.println("아이디 : " + findMember.getUserId());
			System.out.println("이름 : " + findMember.getName());
			System.out.println("나이 : " + findMember.getAge());
			System.out.println("성별 : " + findMember.getGender());
			System.out.println("이메일 : " + findMember.getEmail());
		}
		
		return;
	}
	public void updateMember() {
		System.out.println("=======회원 정보 수정 ========");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 이메일 수정");
		System.out.println("9. 이전 메뉴로");
		int menu = sc.nextInt();
		
		if(menu ==9) {
			return;
		}
		
		System.out.println("변경할 회원 아이디 : ");
		String userId = sc.next();
		
		Member findMember = mc.checkId(userId);
		
		if(findMember == null) {
			System.out.println("변경할 회원이 존재하지 않습니다.");
			return;
		} 
		
		System.out.println("아이디 : " + findMember.getUserId());
		System.out.println("이름 : " + findMember.getName());
		System.out.println("나이 : " + findMember.getAge());
		System.out.println("성별 : " + findMember.getGender());
		System.out.println("이메일 : " + findMember.getEmail());
		
		System.out.println("===========================");
		System.out.println("뭐로 변경하시겠어요?");
		String update = sc.next();
		mc.updateMember(findMember, menu, update);
	}
	public void deleteMember() {
		System.out.println("삭제할 회원 아이디가 무엇인가요?");
		String userId = sc.next();
		Member member = mc.checkId(userId);
		if(member == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다");
			return;
		}
		
		System.out.println("정말 삭제하시겠습니까? (y/n)");
		String yesOrNO = sc.next();
		char ch = yesOrNO.charAt(0);
		if(ch == 'n' || ch == 'N') {
			return;
		} else if (ch == 'y' || ch == 'Y') {
			//진짜로 삭제하려는 경우
			mc.deleteMember(userId);
		}
		
		
	}
	public void printAllMember() {
		Member[] mem = mc.getMem();
		for(int i=0; i<mem.length; i++) {
			System.out.println(i + "번째 멤버입니다. 아이디 : " + mem[i].getUserId() + ", 이름 :" + mem[i].getName() + ", 성별 : " + mem[i].getGender() + ", 나이 : " + mem[i].getAge() + ", 이메일 : " + mem[i].getEmail());
		}
	}
	
	public void sortMember() {
		//정렬 결과를 받아줄 객체배열 초기화
		Member[] sortMem = null;
		int input = 0;
		
		do {
			System.out.println("========회원 정보 정렬=========");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로 ");
			input =sc.nextInt();
			
			switch(input) {
			case 1 :  sortMem = mc.sortIdAsc();
					for(int i=0; i<sortMem.length; i++) {
						if(sortMem[i] != null) {
							System.out.println("userId : " +sortMem[i].getUserId() +", name :"+ sortMem[i].getName()+ ", gender : " + sortMem[i].getGender()+ ", age :" + sortMem[i].getAge()+", email:" + sortMem[i].getEmail() );
						}
					}
				break;
			case 2 :  sortMem = mc.sortIdDesc();
					for(int i=0; i<sortMem.length; i++) {
						if(sortMem[i] != null) {
							System.out.println("userId : " +sortMem[i].getUserId() +", name :"+ sortMem[i].getName()+ ", gender : " + sortMem[i].getGender()+ ", age :" + sortMem[i].getAge()+", email:" + sortMem[i].getEmail() );
						}
					}
				break;
			case 3 : 
				break;
			case 4 : 
				break;
			case 5 : 
				break;
			case 9 : System.out.println("이전 메뉴로 돌아갈게요");
				return;

			}
			
		}while(input != 9);
		
		

		
		
		
	}
	
}
