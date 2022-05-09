package chapter9.practice19;

public class Battery extends AbstractBattery {
	private int level = 100;

	public void consume(int amount) {
		level -= amount;
		notifyObservers();
	}

	public int getLevel() {
		return level;
	}
}
