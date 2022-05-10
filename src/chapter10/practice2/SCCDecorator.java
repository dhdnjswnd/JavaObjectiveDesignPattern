package chapter10.practice2;

public class SCCDecorator extends CarOptionDecorator {
	int sccPrice;

	public SCCDecorator(CarComponent emailContent, int sccPrice) {
		super(emailContent);
		this.sccPrice = sccPrice;
	}

	public int getPrice() {
		return super.getPrice() + sccPrice;

	}

	public String getCarInfo() {
		return super.getCarInfo() + " SCC Ãß°¡.";
	}
}
