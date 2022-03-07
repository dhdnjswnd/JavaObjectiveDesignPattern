package chapter7_statepattern.practice;

public class client {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.setDrinkCount(3);
		vm.setDrinkPrice(1000);

		vm.putMoney(500);
		vm.putMoney(300);
		vm.pushDrinkButton();
		vm.pushReturnButton();
		vm.putMoney(500);
		vm.putMoney(300);
		vm.putMoney(500);
		vm.putMoney(300);
		vm.putMoney(1500);
		vm.pushDrinkButton();
		vm.pushDrinkButton();
		vm.pushDrinkButton();
		vm.pushDrinkButton();
		vm.putMoney(100);
		
	}

}
