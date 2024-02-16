package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	
	@Override
	public void displayInfo() {
		System.out.println("[소설] 제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor()  + " / 장르 : " +genre);
	}

	public Novel() {
	}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;

	}

	//getter setter
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
