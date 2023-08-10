package ch05;

public class MainTest_1 {

	public static void main(String[] args) {

		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);

		// 학생을 메모리에 올린다
		Student studentKim = new Student("김길동", 10_000);
		// bus = 100 -> 주소값이 들어간다
		studentKim.takeBus(bus100);

		bus100.showInfo();
		System.out.println("--------------------");
		bus200.showInfo();

		studentKim.takeBus(bus200);
		System.out.println("====================");
		System.out.println(studentKim.money);
		bus200.showInfo();

	}// end of main

}// end of class
