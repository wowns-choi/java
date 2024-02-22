package toyfactory.prac.dto;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Toy {

	private String toyName;
	private int availableAge;
	private int price;
	private String color;
	private int makeDate;
	private Set<String> ingredient;
	
	//toString
	@Override
	public String toString() {
		return "[이름=" + toyName + ", 사용가능연령=" + availableAge + ", 가격=" + price + ", 색상=" + color
				+ ", 제조년월일=" + makeDate + ", 재료=" + ingredient + "]";
	}

	
	//생성자
	
	public Toy() {
		super();
	}	
	
	public Toy(String toyName, int availableAge, int price, String color, int makeDate) {
		super();
		this.toyName = toyName;
		this.availableAge = availableAge;
		this.price = price;
		this.color = color;
		this.makeDate = makeDate;
		this.ingredient = new HashSet<String>();
	}

	//getter setter
	public String getToyName() {
		return toyName;
	}


	public void setToyName(String toyName) {
		this.toyName = toyName;
	}


	public int getAvailableAge() {
		return availableAge;
	}


	public void setAvailableAge(int availableAge) {
		this.availableAge = availableAge;
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


	public int getMakeDate() {
		return makeDate;
	}


	public void setMakeDate(int makeDate) {
		this.makeDate = makeDate;
	}


	public Set<String> getIngredient() {
		return ingredient;
	}


	public void setIngredient(Set<String> ingredient) {
		this.ingredient = ingredient;
	}


	//hashCode, equals 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(availableAge, color, ingredient, makeDate, price, toyName);
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
		return availableAge == other.availableAge && Objects.equals(color, other.color)
				&& Objects.equals(ingredient, other.ingredient) && makeDate == other.makeDate && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}
		
	
	
	
}
 