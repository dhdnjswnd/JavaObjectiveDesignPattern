package chapter6_singleton.practice4;

public class UserThread extends Thread {
	private Printer myPrinter;
	
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		PrinterManager mgr = PrinterManager.getInstance();
		myPrinter = mgr.getPrinter();
		myPrinter.print(getName());
	}
}
