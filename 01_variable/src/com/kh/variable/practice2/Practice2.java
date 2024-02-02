package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {
	
	public void ex1 () {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 하나를 입력해주세요");
		String str = sc.next();
		char ch = str.charAt(0);
		int abc = (int) ch;
		System.out.println(abc);
	}

}
