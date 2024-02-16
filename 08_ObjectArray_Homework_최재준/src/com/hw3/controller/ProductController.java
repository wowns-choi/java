package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	Product[] pro = new Product[10];
	
	//왜 static이어야 하는가? 
	//static이 아닌 경우, Product라는 클래스의 생성자를 호출하면서 매개변수로 넘겨줘서
	//그 생성자에서 +1 을 해주더라도 그 Product생성자를 호출한 이 객체에서의 count필드값은 +1증가하지 않더라.
	//왜 그럴까? 글쎄? 질문이 필요
	//해답: 생성자든 메서드든 매개변수로 값을 넘길 때, 
	//기본타입인 경우에는 복사본이 넘어간다. 
	//참조타입인 경우에는 참조값(주소값)이 복사되어 넘어간다. 
	//따라서, 여기서 int타입(기본타입)이기 때문에, 새로운 count 변수가 복사되어
	//Product 객체에 생성된다고 생각하면 된다. 
	//따라서, Product 클래스의 생성자에서 아무리 +1 을 한다고 해봤자,
	//즉, 복사본의 값을 +1 증가시켜봤자,
	//원본값은 변하지 않고, 그대로 0이다.
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);

	
	//메서드
	public void mainMenu() {
		int inputValue = 0;
		do {
			System.out.println("===========제품 관리 메뉴===========");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			inputValue = sc.nextInt();
			
			switch(inputValue) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			}
		} while(inputValue != 0);
		
	}
	
	public void productInput() {
		System.out.println("도서 아이디를 입력해주세요");
		int pId = sc.nextInt();
		System.out.println("도서 이름을 입력해주세요");
		String pName = sc.next();
		System.out.println("도서 가격을 입력해주세요");
		int price = sc.nextInt();
		System.out.println("세금을 입력해주세요");
		double tax = sc.nextDouble();
		
		Product product = new Product(pId, pName, price, tax);
		
		pro[ProductController.count] = product;

		
		
	}
	
	public void productPrint() {
		for(int i =0; i<pro.length; i++) {
			if(pro[i] != null) {
				System.out.println(pro[i].information());

			}
		}
	}
	
}
