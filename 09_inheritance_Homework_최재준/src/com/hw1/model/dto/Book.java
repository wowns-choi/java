package com.hw1.model.dto;

public abstract class Book {
	
	private String title;
	private String author;
	
	public abstract void displayInfo();
	
	public Book() {
		super();
	}

	public Book(String title, String author) {
		this.title = title;
		 this.author = author;
	}
	
	//getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}
