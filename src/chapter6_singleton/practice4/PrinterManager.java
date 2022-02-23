package chapter6_singleton.practice4;

import java.util.ArrayList;

public class PrinterManager {
	private static PrinterManager instance = new PrinterManager();

	private ArrayList<Printer> printerList = new ArrayList<>();

	private PrinterManager() {
		printerList.add(new Printer());
		printerList.add(new Printer());
		printerList.add(new Printer());
	}

	public static synchronized PrinterManager getInstance() {
		if (instance == null) {
			instance = new PrinterManager();
		}
		return instance;
	}

	public synchronized Printer getPrinter() {
		while (true) {
			for (int i = 0; i < printerList.size(); i++) {
				if (printerList.get(i).isAvailable())
					return printerList.get(i);
			}
		}
	}

}
