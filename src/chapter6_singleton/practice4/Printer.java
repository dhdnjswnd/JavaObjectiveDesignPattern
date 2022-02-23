package chapter6_singleton.practice4;

import java.util.Random;

public class Printer {
	private boolean available = true;

	public boolean isAvailable() {
		return available;
	}

	public void print(String name) {
		try {
			setAvailable(false);
			Thread.sleep(new Random().nextInt(100));
			System.out.println(name + " is using " + this.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setAvailable(true);
	}

	public void setAvailable(boolean b) {
		available = b;
	}
}
