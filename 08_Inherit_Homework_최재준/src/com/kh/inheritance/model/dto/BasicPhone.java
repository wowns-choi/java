package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{

	private boolean hasPhysicalKeyboard;
	

	//메서드
	public void checkKeyboard() {}
	
	
	//생성자
	public BasicPhone() {
		super();
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	//setter getter
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}


	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
		
	
	
}
