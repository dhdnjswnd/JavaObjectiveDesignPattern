package chapter9.example;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinMax(record); // 최소값과 최대 값을 출력함.
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min : " + min + " Max : " + max);
	}

}
