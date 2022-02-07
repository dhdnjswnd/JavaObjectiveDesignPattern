package chapter3;

public class FuelTankMonitoring extends MonitoringInterface {
	public void checkAndWarn() {
		if (checkFuelTank()) {
			giveWarningSignal();
		}
	}
}
