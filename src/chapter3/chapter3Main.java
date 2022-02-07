package chapter3;

public class chapter3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelTankMonitoring fTM = new FuelTankMonitoring();
		fTM.checkAndWarn();

		TimeReminder tr = new TimeReminder();
		TimeProvider fake = new FakeTimeProvider(22);
		tr.setTimeProvider(fake);
		TimeProvider real = new RealTimeProvider();
		tr.setTimeProvider(real);

		tr.reminder();

	}

}
