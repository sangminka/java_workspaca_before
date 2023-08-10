package ch06;

public class Book {
	private String bookName;
	private String author;
	private int price;

	public Book(String bookName) {
		this.bookName = bookName;
	}

	// set =================================
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			this.price = price;
		}

	}

	// get ==================================
	public String getBookName() {
		return this.bookName;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPrice() {
		return this.price;
	}

	public void showInfo() {
		System.out.println("==========================");
		System.out.println("책 이름: " + bookName);
		System.out.println("작가 : " + author);
		System.out.println("가격: " + price);
	}

}
