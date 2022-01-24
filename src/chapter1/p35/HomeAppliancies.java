package chapter1.p35;

// 추상 클래스. abstract로 선언한 함수는 자식 클래스에서 반드시 구현해야한다.
public abstract class HomeAppliancies {
	private int serialNo;
	private String manufacturer;
	private int year;

	public abstract void turnOn();

	public abstract void turnOff();
}
