package chapter3;

// p115 체크포인트. 다음 코드는 오후 10시가 되면 MP3를 작동시켜 음악을 연주한다. 그러나 이 코드가 제대로 동작하는 지 확인하는 지 테스트하려면
// 저녁 10시까지 기다려야 한다. OCP를 적용해 이 문제를 해결하는 코드를 작성하라.

//솔직히 OCP개념이 명확히 잡은 상태가 아니다 보니, 무슨말인지 잘 몰라서 답을 봤다. TimeProvider, FakeTimeProvider라는 걸 만들어서 처리하는 것을 보았다... Awesome. 
public class TimeReminder {
	private MP3 m;
	private TimeProvider tProv;

	public TimeReminder() {
		m = new MP3();
	}
// //변경전.
//	public void reminder() {
//		Calendar cal = Calendar.getInstance();
//		m = new MP3();
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
//
//		if (hour >= 22) {
//			m.playSong();
//		}
//	}

	// 변경 후
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
