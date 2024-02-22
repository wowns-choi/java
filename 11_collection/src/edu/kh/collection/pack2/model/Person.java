package edu.kh.collection.pack2.model;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	
	
	//기본 생성자
	public Person() {
		super();
	}

	//매개변수 생성자
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	// "객체가 같다" : 동일? 동등?
	// 동일하다 : 가리키고 있는 것이 같다. 즉, 참조값이 같다.
	// 동등하다 : 값이 같다. 즉, 참조값이 다른데, 실질적으로 같다.
	
	//동일 비교 : Object.hashCode() 메서드 오버라이딩
	
	// hash 함수란? 어떤 값을 넣으면, 항상 똑같은 길이의 문자열이 반환되는 함수
	// ex) 123 -> qwerty 
	//     adgadgaadgda -> asdfgh
	// 암호화에 많이 사용
	
	// hashCode() : 객체별 식별 코드(객체를 구분하는 정수 값)를 반환
	// ex) 주민등록번호, 학번, 은행번호표 ..
	
//	@Override //오버라이딩 잘하고 있는지 검사해준다.
//	public int hashCode() {
//		// 필드에 저장된 값을 이용해서 hashCode 생성
//		
//		//Objects : Object 관련된 유용한 기능 모음
//		return Objects.hash(name, age, gender); // 전달받은 파라미터를 활용해서 해시코드를 반환해준다.
//	}
//	
//	//동등 비교 : Object.equals() 메서드 오버라이딩
//	@Override
//	public boolean equals(Object obj) {
//		// 현재 객체의 필드와
//		// 전달받은 obj의 필드가
//		// 모두 같을 경우 true, 아니면 false 반환
//		
//		if(obj == null) {
//			return false; // null 은 비교 불가
//		}
//		
//		if(obj == this) {
//			return true; // 비교 대상이 현재 객체
//		}
//
//		// 같은 타입이 아니라면 비교 불가
//		if(!(obj instanceof Person)) {
//			return false;
//		}
//		
//		//다운캐스팅
//		Person other = (Person) obj;
//		
//		return name.equals(other.name) &&
//				age ==other.age &&
//				gender == other.gender ;
//		
//	}
	
	
	
	//alt + shift + s -> Generate hashCode() and equals() ... 자동완성 써라.
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
