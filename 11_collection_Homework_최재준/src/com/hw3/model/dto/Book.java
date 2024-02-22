package com.hw3.model.dto;

public class Book {
	
	private int bookNum;
	private String bookTitle;
	private String author;
	private int price;
	private String publisher;
	
	//기본 생성자
	public Book() {
	}
	
	//매개변수 생성자
	public Book(int bookNum, String bookTitle, String author, int price, String publisher) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	//getter setter
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}
	
	
	
}
