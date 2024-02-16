package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {
	
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	
	//메서드
	public String information() {
		return "도서 아이디 : "+this.pId +", 도서 이름 : " + this.pName +", 도서 가격 : "+ this.price +", 세금 :" +this.tax;
		
	}
	
	
	//생성자들
	public Product() {
		ProductController.count++;

	}
	public Product(int pId, String pName, int price, double tax) {
	
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		ProductController.count++;		
	}


	
	//getter setter
	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
}
