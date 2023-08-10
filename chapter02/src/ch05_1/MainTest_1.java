package ch05_1;

public class MainTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 버스객체 3개를 만들어 주세요
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		// 학생 객체 2개를 만들어 주세요
		Student stu1 = new Student("김남자", 15_000);
		Student stu2 = new Student("김여자", 30_000);

		// 학생이 버스를 선택해서 승차 및 하차를 시켜 보세요
		stu1.takeBus(bus100);
		stu1.takeOffBus(bus100);
	}

}
