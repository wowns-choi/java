package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		
		
		BasicPhone basicPhone = new BasicPhone("Nokia1", "33101", 20001, 1000001, false);
		BasicPhone basicPhone2 = new BasicPhone("Nokia2", "33102", 20002, 1000002, true);

		
		System.out.println("Brand : " + smartPhone.getBrand());
		System.out.println("Model : " + smartPhone.getModel());
		System.out.println("Year : " + smartPhone.getYear());
		System.out.println("Price : " + smartPhone.getPrice());
		System.out.println("Operating System : " + smartPhone.getOperatingSystem());
		System.out.println("Storage Capacity : " + smartPhone.getStorageCapacity());
		
		System.out.println("=================================");
		
		System.out.println("Brand : " + basicPhone.getBrand());
		System.out.println("Model : " + basicPhone.getBrand());
		System.out.println("Year : " + basicPhone.getBrand());
		System.out.println("Price : " + basicPhone.getBrand());
		if(basicPhone.isHasPhysicalKeyboard() == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
		
		System.out.println("=================================");
		
		System.out.println("Brand : " + basicPhone2.getBrand());
		System.out.println("Model : " + basicPhone2.getBrand());
		System.out.println("Year : " + basicPhone2.getBrand());
		System.out.println("Price : " + basicPhone2.getBrand());
		if(basicPhone2.isHasPhysicalKeyboard() == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
		
		
		
		
	}

}
