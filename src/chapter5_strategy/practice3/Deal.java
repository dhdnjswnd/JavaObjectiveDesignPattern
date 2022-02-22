package chapter5_strategy.practice3;

import java.util.ArrayList;

public class Deal {
	Book book;
	Member member;
	int bookCnt;
	ArrayList<PriceStrategy> policyList = new ArrayList<>();

	public Deal(Book book, Member member, int bookCnt) {
		this.book = book;
		this.member = member;
		this.bookCnt = bookCnt;
	}

	public void setDeal(Book book, Member member, int bookCnt) {
		this.book = book;
		this.member = member;
		this.bookCnt = bookCnt;
	}

	public void deal() {
		int price = book.getPrice();
		for (int i = 0; i < policyList.size(); i++) {
			price = (int) (price * policyList.get(i).getDiscountRatio(book, member));
		}
		// �ŷ��� ����Ǿ����ϴ�.
		System.out.println("�ŷ� �Ϸ�");
		member.buyBook(price, bookCnt);
	}

	public void addStratey(PriceStrategy policy) {
		policyList.add(policy);
	}
}
