package chapter7_statepattern.practice;

public class NOMONEY implements State {
	private static NOMONEY nomoney = new NOMONEY();

	public static NOMONEY getInstace() {
		return nomoney;
	}

	@Override
	public void putMoney(VendingMachine vm, int money) {
		vm.addInputMoney(money);
		vm.setState(NORMAL.getInstace());
	}

	@Override
	public void pushDrinkButton(VendingMachine vm) {
		System.out.println("돈을 넣어주세요.");
	}

	@Override
	public void pushReturnButton(VendingMachine vm) {
		System.out.println("돈을 넣어주세요.");
	}

}
