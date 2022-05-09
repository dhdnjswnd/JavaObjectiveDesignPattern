package chapter9.example;

import java.util.List;

public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();// ���� ��ȸ
		displayScores(record, viewCount);// ��ȸ�� ������ ViewCount��ŭ ���.
	}

	private void displayScores(List<Integer> record, int viewCnt) {
		System.out.println("List of " + viewCnt + " entries : ");
		for (int i = 0; i < viewCnt && i < record.size(); i++) {
			System.out.println(record.get(i));
		}
		System.out.println();
	}

}
