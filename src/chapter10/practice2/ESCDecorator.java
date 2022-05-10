package chapter10.practice2;

public class ESCDecorator extends CarOptionDecorator {
	int escPrice;

	public ESCDecorator(CarComponent emailContent, int escPrice) {
		super(emailContent);
		this.escPrice = escPrice;
	}

	public int getPrice() {
		return super.getPrice() + escPrice;

	}

	public String getCarInfo() {
		return super.getCarInfo() + " ESC Ãß°¡.";
	}
}
