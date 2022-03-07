package chapter7_statepattern.practice;

public class SOLDOUT implements State {
	private static SOLDOUT soldout = new SOLDOUT();

	public static SOLDOUT getInstace() {
		return soldout;
	}

	@Override
	public void putMoney(VendingMachine vm, int money) {
		System.out.println(money + "반환");
		System.out.println("재고 부족");
	}

	@Override
	public void pushDrinkButton(VendingMachine vm) {
		System.out.println("재고 부족");
	}

	@Override
	public void pushReturnButton(VendingMachine vm) {
		System.out.println("재고 부족");
	}

}
