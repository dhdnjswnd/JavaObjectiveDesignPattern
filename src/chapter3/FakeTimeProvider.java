package chapter3;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {
	private Calendar cal;

	public FakeTimeProvider() {
		cal = Calendar.getInstance();
	}

	public FakeTimeProvider(int hours) {
		cal = Calendar.getInstance();
		setHours(hours);
	}

	// RealTimeProvider에서 사용된다.
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours); // 주어진 시간으로 설정.(calendar를)...오...?
	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return cal.get(Calendar.HOUR_OF_DAY);
	}
}
