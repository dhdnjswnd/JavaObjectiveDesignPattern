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

	// RealTimeProvider���� ���ȴ�.
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours); // �־��� �ð����� ����.(calendar��)...��...?
	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return cal.get(Calendar.HOUR_OF_DAY);
	}
}