package chapter10.practice2;

public class NaviDecorator extends CarOptionDecorator {
	int naviPrice;

	public NaviDecorator(CarComponent emailContent, int naviPrice) {
		super(emailContent);
		this.naviPrice = naviPrice;
	}

	public int getPrice() {
		return super.getPrice() + naviPrice;

	}

	public String getCarInfo() {
		return super.getCarInfo() + " NAVI Ãß°¡.";
	}
}
