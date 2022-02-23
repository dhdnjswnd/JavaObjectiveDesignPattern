package chapter6_singleton.practice2;

public class TicketMachine {
	private static TicketMachine instance = null;
	private static final int MAX_COUNT = 5;
	private static int SerialNumber = 1;

	public static synchronized TicketMachine getInstance() {
		if (instance == null)
			instance = new TicketMachine();
		return instance;
	}

	public Ticket getTicket() {

		// try {
		// Thread.sleep(new Random().nextInt(100));
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		if (SerialNumber > MAX_COUNT)
			return new NullTicket();
		return new Ticket(SerialNumber++);
	}
}
