package chapter9.example;

public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		// 3개 목록 DataSheetView를 ScoreRecord에 Observer로 추가
		scoreRecord.attach(dataSheetView3);
		scoreRecord.attach(dataSheetView5);
		scoreRecord.attach(minMaxView);

		for (int i = 1; i < 6; i++) {
			int score = i * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}

	}

}
