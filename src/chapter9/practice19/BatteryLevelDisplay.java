package chapter9.practice19;

public class BatteryLevelDisplay implements BatteryLevelObserver {
	private Battery battery;

	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}

	public void update() {
		int level = battery.getLevel();
		System.out.println("Level : " + level);
	}
}
