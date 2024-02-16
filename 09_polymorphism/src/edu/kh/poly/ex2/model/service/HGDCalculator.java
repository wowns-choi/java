package edu.kh.poly.ex2.model.service;

public class HGDCalculator implements Calculator{
	//extends : 확장하다.
	//implements : 구현하다.
	// (부모)클래스 - (자식)클래스 : extends 사용(추상클래스 포함)
	// (부모)인터페이스 - (자식)클래스 : implements 사용
	
	@Override
	public int plus(int num1, int num2) {
		return num1 * num2 + MAX_NUM;
	}

	@Override
	public int minus(int num1, int num2) {
		return num2 - num1 ;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 + num2 * 10;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1++;
	}

}
