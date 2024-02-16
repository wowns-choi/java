package edu.kh.poly.ex1.model.vo;

public class Spark extends Car { // 경차
	
	private double discountOffer; //할인혜택
	
	//기본생성자
	public Spark() {}
	
	

	//매개변수 생성자
	public Spark(String engine, String fuel, int wheel,double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}


	//setter getter
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	//Car 클래스(Object클래스 아님)의 toString메서드를 override
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
	
}
