package chapter9.practice2;

import java.util.ArrayList;

public class Subject {
	ArrayList<Observer> observers = new ArrayList<>();

	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	public void notifyObservers() {
		observers.forEach(observer -> observer.update());
	}
}
