package chapter5_strategy.practice3;

public class MemberDiscount implements PriceStrategy {

	@Override
	public double getDiscountRatio(Book book, Member member) {

		if (member.getTotMoney() > 10000) {
			System.out.println("�����̻����� 10% ���εǾ����ϴ�.");
			return 0.9;
		}
		return 1;
	}

}
