package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems;
	
	@Override
	public void displayInfo() {		
		System.out.println("[시집] 제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor()  + " / 시 수 : " +numberOfPoems);

	}
	
	//생성자
	public Poetry() {
	}
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;

	}

	//getter setter
	public int getNumberOfPoems() {
		return numberOfPoems;
	}


	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	

}
