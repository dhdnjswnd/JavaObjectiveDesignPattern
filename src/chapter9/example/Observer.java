package chapter9.example;

public interface Observer {// 추상화된 통보 대상
	public abstract void update(); // 데이터 변경을 통보했을 때 처리하는 메서드.
}
