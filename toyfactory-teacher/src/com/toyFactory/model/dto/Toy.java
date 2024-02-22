package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	
	private String name;
	private int age;
	private int price;
	private String color;
	private String manufactureDate;
	private Set<String> materials;
	
	public Toy() {
		super();
	}
	
	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 %d / 제조년월일 : %s / 재료 : %s", 
							name, price, color, age, manufactureDate, getMaterialsAsString());
	}
	
	// materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	private String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		
		for(String material : materials) {
			sb.append(material).append(", ");
		}
		
		// 마지막 쉼표와 공백 제거하기
		// 만약, sb에 담긴 문자열의 길이가 0보다 크다면, sb의 길이를 set 할거다. 
		// 어떻게? sb 의 길이를 -2 만큼 삭제할것이다.
		// 
		if(sb.length() > 0) {
			sb.setLength(sb.length() -2);
		}
		
		// StringBuilder 안에 들어있는 필드에는 쌓아둔 문자열이 있는데, 
		// toString 은 원래, 필드의 값을 꺼내오는 거잖아.
		return sb.toString();
		

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
	
	
}
