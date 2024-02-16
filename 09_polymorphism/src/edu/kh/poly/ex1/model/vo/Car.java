package edu.kh.poly.ex1.model.vo;

public class Car {
	
	// 속성
	private String engine; //엔진
	private String fuel; //연료
	private int wheel; //바퀴개수
	
	// 기본생성자
	public Car() {
		super();
	}

	//매개변수 생성자 (alt + shift + s  -> o -> enter)
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	//getter setter
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	//Object 의 메서드인 toString 을 override
	@Override // 오버라이딩했다는 걸 컴파일러에게 알려주는 Override 어노테이션(컴파일러 인식용 주석)
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
	
	
	
}
