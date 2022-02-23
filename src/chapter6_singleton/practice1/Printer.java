package chapter6_singleton.practice1;

public class Printer {
	private static Printer instance = null;

	public static synchronized Printer getInstance() {
		if (instance == null)
			instance = new Printer();
		return instance;
	}

	public void doSomething() {

	}
}
