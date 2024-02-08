package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1 이상의 숫자를 입력해주세요");
		int inputNum = sc.nextInt();
			while(true) {
				if(inputNum>1) {
					break;
				}
				System.out.println("1 이상의 숫자를 입력해주세요");
				inputNum = sc.nextInt();
			}
	
			for(int i =1; i<=inputNum; i++) {
				System.out.print(i + " ");
			}
	}
	
	
	public void practice2() {
		
		System.out.println("1 이상의 숫자를 작성해주세요.");
		int inputNum = sc.nextInt();
		while(true) {
			if(inputNum>=1) {
				break;
			}
			System.out.println("1 이상의 숫자를 작성해주세요.");
			inputNum = sc.nextInt();
		}
		
		for(int i=inputNum; i>=1; i--) {
			System.out.println(i + " ");
		}
		
		
	}

}
