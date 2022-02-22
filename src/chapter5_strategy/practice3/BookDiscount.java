package chapter5_strategy.practice3;

import java.time.LocalDate;

public class BookDiscount implements PriceStrategy {

	@Override
	public double getDiscountRatio(Book book, Member member) {
		LocalDate now = LocalDate.now();

		if (book.getYear() + 10 <= now.getYear()) {
			System.out.println("10년 이상된 책으로 10%할인되었습니다.");
			return 0.9;
		}
		return 1;
	}

}
