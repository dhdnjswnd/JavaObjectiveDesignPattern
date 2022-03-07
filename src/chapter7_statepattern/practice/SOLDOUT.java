package chapter7_statepattern.practice;

public class SOLDOUT implements State {
	private static SOLDOUT soldout = new SOLDOUT();

	public static SOLDOUT getInstace() {
		return soldout;
	}

	@Override
	public void putMoney(VendingMachine vm, int money) {
		System.out.println(money + "��ȯ");
		System.out.println("��� ����");
	}

	@Override
	public void pushDrinkButton(VendingMachine vm) {
		System.out.println("��� ����");
	}

	@Override
	public void pushReturnButton(VendingMachine vm) {
		System.out.println("��� ����");
	}

}
