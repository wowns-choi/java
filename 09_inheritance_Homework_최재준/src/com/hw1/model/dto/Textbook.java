package com.hw1.model.dto;

public class Textbook extends Book{
	
	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] 제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor()  + " / 과목 : " +subject);
	}
	private String subject;
	

	public Textbook() {
	}
	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	//getter setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	
}
