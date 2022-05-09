package chapter9.practice19;

public class LowBatteryWarning implements BatteryLevelObserver {
	private static final int LOW_BATTERY = 30;
	private Battery battery;

	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}

	public void update() {
		int level = battery.getLevel();
		if (level < LOW_BATTERY) {
			System.out.println("<Warning> LowBattery : " + level + " Compared with " + LOW_BATTERY);
		}

	}
}
