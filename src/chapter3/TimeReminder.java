package chapter3;

// p115 üũ����Ʈ. ���� �ڵ�� ���� 10�ð� �Ǹ� MP3�� �۵����� ������ �����Ѵ�. �׷��� �� �ڵ尡 ����� �����ϴ� �� Ȯ���ϴ� �� �׽�Ʈ�Ϸ���
// ���� 10�ñ��� ��ٷ��� �Ѵ�. OCP�� ������ �� ������ �ذ��ϴ� �ڵ带 �ۼ��϶�.

//������ OCP������ ��Ȯ�� ���� ���°� �ƴϴ� ����, ���������� �� ���� ���� �ô�. TimeProvider, FakeTimeProvider��� �� ���� ó���ϴ� ���� ���Ҵ�... Awesome. 
public class TimeReminder {
	private MP3 m;
	private TimeProvider tProv;

	public TimeReminder() {
		m = new MP3();
	}
// //������.
//	public void reminder() {
//		Calendar cal = Calendar.getInstance();
//		m = new MP3();
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
//
//		if (hour >= 22) {
//			m.playSong();
//		}
//	}

	// ���� ��
	public void reminder() {
		int hours = tProv.getTime();
		if (hours >= 22) {
			m.playSong();
		}
	}

	public void setTimeProvider(TimeProvider tProv) {
		this.tProv = tProv;
	}
}
