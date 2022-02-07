package chapter3;

public abstract class MonitoringInterface {
	protected boolean checkFuelTank() {
		System.out.println("연료탱크 검사중...");
		int i = ((int) (Math.random() * 10)) % 2;
		if (i == 0)
			return false;
		return true;
	};

	protected void giveWarningSignal() {
		System.out.println("경고 신호 송신 완료.");
	}

}
