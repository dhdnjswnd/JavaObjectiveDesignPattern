package chapter7_statepattern.practice;

public interface State {
	public void putMoney(VendingMachine vm, int money);

	public void pushDrinkButton(VendingMachine vm);

	public void pushReturnButton(VendingMachine vm);
}
