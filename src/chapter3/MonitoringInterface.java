package chapter3;

public abstract class MonitoringInterface {
	protected boolean checkFuelTank() {
		System.out.println("������ũ �˻���...");
		int i = ((int) (Math.random() * 10)) % 2;
		if (i == 0)
			return false;
		return true;
	};

	protected void giveWarningSignal() {
		System.out.println("��� ��ȣ �۽� �Ϸ�.");
	}

}
