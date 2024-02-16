package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	
	private String operatingSystem;
	private int storageCapacity;

	//메서드
	public void printInfo() {}
	
	//생성자
	public SmartPhone () {}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}


	//getter setter
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

		
	

}
