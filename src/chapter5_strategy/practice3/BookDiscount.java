package chapter5_strategy.practice3;

import java.time.LocalDate;

public class BookDiscount implements PriceStrategy {

	@Override
	public double getDiscountRatio(Book book, Member member) {
		LocalDate now = LocalDate.now();

		if (book.getYear() + 10 <= now.getYear()) {
			System.out.println("10�� �̻�� å���� 10%���εǾ����ϴ�.");
			return 0.9;
		}
		return 1;
	}

}
