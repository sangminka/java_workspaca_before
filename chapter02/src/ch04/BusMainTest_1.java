package ch04;

public class BusMainTest_1 {

	public static void main(String[] args) {
		// bus100 < -- stack
		// 객체 < -- heap 메모리 영역에 올라간다.

		Bus bus100 = new Bus();
		bus100.busNumber = 100;
		bus100.count = 0;
		bus100.money = 0;

		bus100.take(300);
		bus100.showInfo();

		// 생성자 사용해 보기(사용자 정의 생성자)
		Bus bus200 = new Bus(200);
		bus200.showInfo();

		// 매개변수 순서대로 값을 입력 해 주어야 한다.
		Bus bus300 = new Bus(300, 1);
		bus300.showInfo();
		
		Bus bus400 = new Bus(400,1,1300); 
		bus400.showInfo();
	}

}
