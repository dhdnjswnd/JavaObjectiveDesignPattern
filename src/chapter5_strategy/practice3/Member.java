package chapter5_strategy.practice3;

import java.util.ArrayList;

public class Member {
	private String name;
	private int totMoney = 0;
	private ArrayList<PriceStrategy> discountList = new ArrayList<>();

	public Member(String name) {
		this.name = name;
	}

	public void buyBook(int bookCnt, int price) {
		totMoney += bookCnt * price;
		System.out.println("buyBook : total구매금액 : " + bookCnt * price + " total구매금액 : " + totMoney);
	}

	public int getTotMoney() {
		return totMoney;
	}

}
