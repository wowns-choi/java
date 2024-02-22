package com.hw3.model.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	Scanner sc = new Scanner(System.in);
	
	List<Book> bookList = new ArrayList<Book>();
	
	
	public void loop1() {
		
		int check = 1;
		
		do {

			System.out.println("== 도서 목록 프로그램 ==");
			System.out.println();
			System.out.println("1. 도서 등록");
			System.out.println();
			System.out.println("2. 도서 조회");
			System.out.println();
			System.out.println("3. 도서 수정");
			System.out.println();
			System.out.println("4. 도서 석재");
			System.out.println();
			System.out.println("5. 즐겨찾기 추가");
			System.out.println();
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println();
			System.out.println("7. 즐겨찾기 조회");
			System.out.println();
			System.out.println("8. 추천도서 뽑기");
			System.out.println();
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.println("메뉴를 입력하세요 : ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : register(); break;
			case 2 : selectAllBook(); break;
			case 3 : updateBook(); break;
			case 4 : removeBook(); break;
			case 5 : favoritesAdd(); break;
			case 6 : favoritesRemove(); break;
			case 7 : favoritesSelectAll(); break;
			case 8 : recommendBook(); break;
			case 0 : System.out.println("프로그램 종료하겠습니다.");
					check = 0;
			}
		}while(check != 0);
		
		
	}
	
	public void register() {
		System.out.println("도서 번호 : ");
		int bookNum = sc.nextInt();
		
		sc.nextLine();
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();

		System.out.println("도서 저자 : ");
		String author= sc.nextLine();
		
		System.out.println("도서 가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		System.out.println("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		System.out.println("도서번호 " + bookNum + ", 도서 제목 : " + title + ", 도서 저자 :" + author + ", 도서 가격 : " + price + ",  출판사 : " + publisher + "가 등록되었습니다.");
		
		bookList.add(new Book(bookNum, title, author, price, publisher));
	}
	
	public void selectAllBook() {
		if(bookList.isEmpty()) {
			System.out.println("아무런 책도 등록되지 않았어요");
		}
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		
	}

	public void updateBook() {
		System.out.println("수정할 도서 번호를 입력하세요");
		int bookNum = sc.nextInt();
		int findIndex = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getBookNum() == bookNum) {
				findIndex = i;
			}
		}
		
		// 이제, findIndex 는 수정할 도서의 인덱스 번호가 됨.
		
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서저자");
		System.out.println("3. 도서가격");
		System.out.println("4. 도서출판사");
		System.out.println("0. 수정 종료");
		
		System.out.println("어떤 정보를 수정하시겠습니까?");
		int input = sc.nextInt();
		sc.nextLine();
		switch(input) {
		case 1 : System.out.println("도서명 뭐로 바꾸시겠어요?");
				String bookTitle = sc.nextLine();
				bookList.get(findIndex).setBookTitle(bookTitle);
				break;
		case 2 : System.out.println("저자를 누구로 바꾸시려구요?");
				String author = sc.nextLine();
				bookList.get(findIndex).setAuthor(author);
				break;
		case 3 : System.out.println("도서 가격을 어떻게 바꿀까요?");
				int price = sc.nextInt();
				bookList.get(findIndex).setPrice(price);
				break;
		case 4 : System.out.println("출판사를 어디로 바꿀까요?");
				String publisher = sc.nextLine();
				bookList.get(findIndex).setPublisher(publisher);
				break;
		case 0 : System.out.println("수정을 종료합니다.");
				return;
		}
		
		System.out.println("수정완료");
		return;
	}
	
	public void removeBook() {
		System.out.println("삭제하시고자 하는 도서의 번호를 입력해주세요");
		int bookNum = sc.nextInt();
		
		System.out.println("정말 삭제하시겠습니까? (Y/N)");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch == 'N') {
			System.out.println("삭제하지 않았습니다.");
			return;
		} 
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getBookNum() == bookNum) {
				System.out.println(bookList.get(i).getBookTitle()+ "삭제되었습니다.");
				bookList.remove(i);
				break;
			}
		}		
	}
	
	List<Book> favoritesList = new ArrayList<Book>();
	
	public void favoritesAdd() {
		System.out.println("즐겨찾기에 추가할 도서의 번호를 입력해주세요");
		int bookNum = sc.nextInt();
		boolean flag = false;
		
		for(Book book : bookList) {
			if(book.getBookNum() == bookNum) {
				flag = true;
				favoritesList.add(book);
				System.out.println(book.getBookTitle() + " 이 즐겨찾기에 추가되었습니다.");
			}
		}
		
		if(flag==false) {
			System.out.println("그런 도서는 존재하지 않습니다.");
		}
		
	}
	
	
	public void favoritesRemove() {
		System.out.println("즐겨찾기에서 삭제하고 싶은 도서의 번호를 입력해주세요");
		int bookNum = sc.nextInt();
		boolean flag = false;
		
		for(Book book : bookList) {
			if(book.getBookNum() == bookNum) {
				flag = true;
				favoritesList.remove(book);
				System.out.println(book.getBookTitle() + " 이 즐겨찾기에서 삭제되었습니다.");

			}
		}
		
		if(flag==false) {
			System.out.println("그런 도서는 존재하지 않습니다.");
		}
		
		
	}
	
	public void favoritesSelectAll() {
		if(bookList.isEmpty()) {
			System.out.println("현재 즐겨찾기 목록에는 아무것도 없습니다.");
			return;
		}
		
		for(Book book : bookList) {
			System.out.println(book);
		}

		
	}
	
	public void recommendBook() {
		
		int bookListSize = bookList.size();
		int randomNum = (int)(Math.random()*bookListSize);
		
		System.out.println("randomNum 으로 뭐가 나오는지 보자 = " + randomNum);
		
		System.out.println(bookList.get(randomNum) + "가 추천되었습니다.");
		
	}
	
	public BookService() {
		Book book1 = new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원");
		Book book2 = new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베게");
		Book book3 = new Book(3333, "역행자", "자청", 17550, "웅진지식하우스");
		Book book4 = new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들");
		Book book5 = new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
	}
	
	public BookService(Scanner sc, List<Book> bookList, List<Book> favoritesList) {
		this.sc = sc;
		this.bookList = bookList;
		this.favoritesList = favoritesList;
	}

	
	
	
	
	
}
