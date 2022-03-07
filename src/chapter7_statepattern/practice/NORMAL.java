package chapter7_statepattern.practice;

// ���� �����̶� ���� ����.
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
			System.out.println("���� ���ڶ��.");
			return;
		}
		if (vm.getDrinkCount() > 0) {
			vm.setInputMoney(vm.getInputMoney() - vm.getDrinkPrice());
			vm.setDrinkCount(vm.getDrinkCount() - 1);
			System.out.println("���Ḧ �̾ҽ��ϴ�. good.������ : " + vm.getInputMoney());
		}

		if (vm.getDrinkCount() == 0) {
			vm.setState(SOLDOUT.getInstace());
			System.out.println("��� �������� �Ž����� ��ȯ : " + vm.getInputMoney());
		}

		if (vm.getInputMoney() == 0)
			vm.setState(NOMONEY.getInstace());

	}

	@Override
	public void pushReturnButton(VendingMachine vm) {
		System.out.println(vm.getInputMoney() + "��ȯ");
		vm.setInputMoney(0);
		vm.setState(NOMONEY.getInstace());
	}

}
