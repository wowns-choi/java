package com.hw1.run;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		Book[] bookArr = new Book[3];
		//String title, String author, String genre
		
		bookArr[0] = new Novel("해리포터", "J.K 롤링", "판타지");
		bookArr[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		bookArr[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
		for(Book book : bookArr) {
			book.displayInfo();
		}
	}

}
