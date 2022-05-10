package chapter10.practice2;

public class AirBagDecorator extends CarOptionDecorator {
	int airBagPrice;

	public AirBagDecorator(CarComponent emailContent, int airBagPrice) {
		super(emailContent);
		this.airBagPrice = airBagPrice;
	}

	public int getPrice() {
		return super.getPrice() + airBagPrice;

	}

	public String getCarInfo() {
		return super.getCarInfo() + " 에어백 추가.";
	}
}
