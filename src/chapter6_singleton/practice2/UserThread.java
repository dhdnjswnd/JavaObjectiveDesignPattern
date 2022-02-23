package chapter6_singleton.practice2;

public class UserThread extends Thread {
	private Ticket myTicket;

	public UserThread(String name) {
		super(name);
	}

	public void run() {
		
		TicketMachine machine = TicketMachine.getInstance();
		myTicket = machine.getTicket();
	}

	public Ticket getMyTicket() {
		return myTicket;
	}
}
