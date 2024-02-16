package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController{

	public int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[10];
	
	public int getMemberCount() {
		return this.memberCount;
	}
	
	public Member[] getMem() {
		return this.mem;
	}
	
	public Member checkId(String userId) {
		boolean flag = false;
		for(int i =0; i<mem.length; i++) {
			if(mem[i] !=null) {
				if(mem[i].getUserId().equals(userId)) {
					flag = true;
					return mem[i]; 
				}

			}
		}
		return null;
		
	}
	
	public void insertMember(Member m) {
		
		int nullIndex = 0;
		//어떻게 하면, mem 안에 비어있는 공간을 찾을 수 있을까? 
		for(int i=0; i<mem.length; i++) {
			if(mem[i] == null) {
				nullIndex = i;
				break;
			}
		}
		
		mem[nullIndex] = m;
	}
	
	public Member searchMember (int menu, String search) {
		
		if(menu == 1) {
			
			for(int i =0; i<mem.length; i++) {
				if(mem[i].getUserId().equals(search)) {
					return mem[i];

				}
			}
			
			
		} else if (menu == 2) {
			for(int i =0; i<mem.length; i++) {
				if(mem[i].getName().equals(search)) {
					return mem[i];

				}
			}
			
		} else if (menu == 3) {
			for(int i =0; i<mem.length; i++) {
				if(mem[i].getEmail().equals(search)) {
					return mem[i];

				}
			}
		}
		return null;
		
		
		

		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		String userId = m.getUserId();
		String userPw = m.getUserPwd();
		
		//비밀번호 수정인 경우
		if(menu == 1) {			
			for(int i =0; i<mem.length; i++) {
				if(mem[i].getUserId().equals(userId) && mem[i].getUserPwd().equals(userPw)) {
					mem[i].setUserPwd(update);
					System.out.println("비밀번호가 변경되었습니다.");
				}
			}
		}
		
		//이름 수정인 경우
		if(menu == 2) {
			for(int i =0; i<mem.length; i++) {
				if(mem[i] !=null) {
					if(mem[i].getUserId().equals(userId) && mem[i].getUserPwd().equals(userPw)) {
						mem[i].setName(update);
						System.out.println("이름이 변경되었습니다.");
					}

				}
			}
		}
		
		//이메일 수정인 경우
		if(menu == 3) {
			for(int i =0; i<mem.length; i++) {
				if(mem[i].getUserId().equals(userId) && mem[i].getUserPwd().equals(userPw)) {
					mem[i].setEmail(update);
					System.out.println("이메일이 변경되었습니다.");
				}
			}
		}
		
		
		
	}
	
	public void deleteMember(String userId) {
		for(int i = 0; i<mem.length; i++) {
			if(mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				System.out.println("회원의 정보가 삭제되었습니다.");
				return;
			}
		}
		
		
		
	}
	
	public Member[] sortIdAsc() {
		//아이디를 기준으로 오름차순이라고?
		Member[] copy = mem.clone();
		for(int i = 0; i<copy.length; i++) {
			if(copy[i] !=null && copy[i+1] !=null) {
				char ch1 = copy[i].getUserId().charAt(0);
				char ch2 = copy[i+1].getUserId().charAt(0);
				if((int)ch1 > (int)ch2) {
					Member a = copy[i+1]; 
					copy[i+1] = copy[i];
					copy[i] = a;
				}

			}
		}
		return copy;
	}
	
	public Member[] sortIdDesc() {
		//아이디를 기준으로 내림차순
		Member[] copy = mem.clone();
		for(int i = 0; i<copy.length; i++) {
			if(copy[i] !=null && copy[i+1] !=null) {
				char ch1 = copy[i].getUserId().charAt(0);
				char ch2 = copy[i+1].getUserId().charAt(0);
				if((int)ch1 < (int)ch2) {
					Member a = copy[i+1]; 
					copy[i+1] = copy[i];
					copy[i] = a;
				}

			}
		}
		return copy;
	}
	
	
	
	
	
	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();
		
		
		return copy;
		
	}
	
	public Member[] sortAgeDesc() {
		Member[] copy = mem.clone();
		
		
		return copy;
		
	}
	
	public Member[] sortGenderDesc() {
		Member[] copy = mem.clone();
		
		
		return copy;
		
	}
	
	
	
	

}
