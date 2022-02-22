package chapter5_strategy.practice3;

public class Book {
	private String sign;
	private int year;
	private int price;

	public Book(String sing, int year, int price) {
		this.sign = sing;
		this.year = year;
		this.price = price;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
