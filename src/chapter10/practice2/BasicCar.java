package chapter10.practice2;

public class BasicCar extends CarComponent {
	int price;
	String content;

	public BasicCar(int price, String content) {
		this.price = price;
		this.content = content;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getCarInfo() {
		return content;
	}

}
