package chapter5_strategy.practice3;

public class MemberDiscount implements PriceStrategy {

	@Override
	public double getDiscountRatio(Book book, Member member) {

		if (member.getTotMoney() > 10000) {
			System.out.println("만원이상으로 10% 할인되었습니다.");
			return 0.9;
		}
		return 1;
	}

}
