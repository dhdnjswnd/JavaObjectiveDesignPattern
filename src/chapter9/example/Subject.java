package chapter9.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // �߻�ȭ�� ���� ���� ��� ������.
	private List<Observer> observers = new ArrayList<>(); // �߻�ȭ�� �뺸 ��� ���

	public void attach(Observer observer) {// �ɼ���, �� �뺸 ����� �߰���.
		observers.add(observer);
	}

	public void detach(Observer observer) {// �ɼ���, ��, �뺸 ����� ������.
		observers.remove(observer);
	}

	// �뺸 ��� ���, �� observers�� �� �ɼ������� ������ �뺸��.
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}