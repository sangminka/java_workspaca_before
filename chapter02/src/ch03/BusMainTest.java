package ch03;

public class BusMainTest {

	public static void main(String[] args) {
		// System.out.println(bus100);
		Bus bus100 = new Bus();
		Bus bus200 = new Bus();

		bus200.busNumber = 200;
		bus200.take(1300); // 1번 사람

		for (int i = 1; i < 10; ++i) {
			bus200.take(1300);
		}

		bus200.showInfo();

	}

}
