package chapter6_singleton.practice2;

public class Main {
	private static final int THREAD_NUM = 15;

	public static void main(String[] args) {

		UserThread[] user = new UserThread[THREAD_NUM];

		for (int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i + 1) + "-thread");
			user[i].start();
		}
		for (int i = 0; i < THREAD_NUM; i++) {
			try {
				user[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < THREAD_NUM; i++) {
			if (user[i].getMyTicket().getTicketNum() != 0) {
				System.out.println("User" + i + "-th Thread get Ticket" + user[i].getMyTicket().getTicketNum());
			}
		}

	}

}
