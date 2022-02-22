package chapter5_strategy.practice3;

import java.lang.reflect.Member;

public interface PriceStrategy {

	public double getDiscountRatio(Book book, chapter5_strategy.practice3.Member member);
}
