package chapter7_statepattern.practice;

public class VendingMachine {
	private State state;
	private int drinkPrice;
	private int drinkCount;
	private int inputMoney = 0;

	public VendingMachine() {
		state = NOMONEY.getInstace();
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}

	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}

	public int getDrinkCount() {
		return drinkCount;
	}

	public void setDrinkCount(int drinkCount) {
		this.drinkCount = drinkCount;
	}

	public void addInputMoney(int money) {
		inputMoney += money;
		System.out.println(inputMoney);
	}

	public void putMoney(int money) {
		state.putMoney(this, money);
	}

	public void pushDrinkButton() {
		state.pushDrinkButton(this);
	}

	public void pushReturnButton() {
		state.pushReturnButton(this);
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getInputMoney() {
		return inputMoney;
	}

	public void setInputMoney(int money) {
		inputMoney = money;
	}
}
