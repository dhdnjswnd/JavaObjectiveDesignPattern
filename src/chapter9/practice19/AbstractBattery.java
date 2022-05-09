package chapter9.practice19;

import java.util.ArrayList;

public class AbstractBattery {
	ArrayList<BatteryLevelObserver> observers = new ArrayList<>();

	public void attach(BatteryLevelObserver observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	public void detach(BatteryLevelObserver observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	public void notifyObservers() {
		observers.forEach(observer -> observer.update());
	}
}
