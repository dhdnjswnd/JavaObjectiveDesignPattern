package chapter3;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider {
	private Calendar cal;

	public RealTimeProvider() {
		cal = Calendar.getInstance();
	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub

	}
}
