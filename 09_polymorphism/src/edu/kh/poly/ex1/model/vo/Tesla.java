package edu.kh.poly.ex1.model.vo;

public class Tesla extends Car { //전기차
	
	private int batteryCapacity; // 배터리 용량

	public Tesla() {	
	}

	//매개변수 생성자 + 상속받은 것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		// TODO Auto-generated constructor stub
		this.batteryCapacity = batteryCapacity;
	}

	//getter setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	//Car의 toString override
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	
	
}
