package chapter7_statepattern.practice;

// 돈을 조금이라도 넣은 상태.
public class NORMAL implements State {
	private static NORMAL normal = new NORMAL();

	public static NORMAL getInstace() {
		return normal;
	}

	@Override
	public void putMoney(VendingMachine vm, int money) {
		vm.addInputMoney(money);
	}

	@Override
	public void pushDrinkButton(VendingMachine vm) {
		if (vm.getDrinkPrice() > vm.getInputMoney()) {
			System.out.println("돈이 모자라요.");
			return;
		}
		if (vm.getDrinkCount() > 0) {
			vm.setInputMoney(vm.getInputMoney() - vm.getDrinkPrice());
			vm.setDrinkCount(vm.getDrinkCount() - 1);
			System.out.println("음료를 뽑았습니다. good.남은돈 : " + vm.getInputMoney());
		}

		if (vm.getDrinkCount() == 0) {
			vm.setState(SOLDOUT.getInstace());
			System.out.println("재고 부족으로 거스름돈 반환 : " + vm.getInputMoney());
		}

		if (vm.getInputMoney() == 0)
			vm.setState(NOMONEY.getInstace());

	}

	@Override
	public void pushReturnButton(VendingMachine vm) {
		System.out.println(vm.getInputMoney() + "반환");
		vm.setInputMoney(0);
		vm.setState(NOMONEY.getInstace());
	}

}
