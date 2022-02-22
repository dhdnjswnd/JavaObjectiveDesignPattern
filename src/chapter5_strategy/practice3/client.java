package chapter5_strategy.practice3;

public class client {

	public static void main(String[] args) {

		Member member = new Member("Pearl");
		Book book = new Book("focusrite", 2020, 20000);
		Deal deal = new Deal(book, member, 10);
		deal.addStratey(new MemberDiscount());
		deal.addStratey(new BookDiscount());
		deal.deal();
		book = new Book("fusrite", 2010, 20000);
		deal.setDeal(book, member, 10);
		deal.deal();
	}

}
