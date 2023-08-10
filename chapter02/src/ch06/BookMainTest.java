package ch06;

public class BookMainTest {

	public static void main(String[] args) {
		Book book1 = new Book("죄와 벌");
		String book1_Name = book1.getBookName();
		System.out.println(book1_Name);
		Car car1 = new Car();

		car1.setMakeYear(2020);
		int car1_makeYear = car1.getMakeYear();
		System.out.println(car1_makeYear);

		car1.showInfo();
		book1.showInfo();
	}

}
 