package chapter9.example;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new ArrayList<>();

	public void addScore(int score) {
		scores.add(score);

		// �����Ͱ� ����Ǹ� Subject Ŭ������ notifyObservers �޼��带 ȣ����
		// �� �ɼ������� �������� ������ �뺸��.
		notifyObservers();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
