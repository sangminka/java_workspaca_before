package ch05_1;

public class Student {
	// 학생 이름 용돈
	String name;
	int money;

	// 생성자 - 이름 용돈을 받을수 있도록 설계
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	// 기능

	// 학생이 버스를탄다
	public void takeBus(Bus bus) {
		System.out.println("학생" + name + "가 " + "버스" + bus.busNum + "을 탑니다.");
		bus.take(1_300);
		money -= 1_300;
		System.out.println("남은 용돈은" + money + " 원 입니다");
	}

	// 학생이 버스를 내린다
	public void takeOffBus(Bus bus) {
		
	}

	// 상태창
	public void studentInfo() {
		System.out.println("=====상태창=====");
		System.out.println("학생 이름: " + name);
		System.out.println("학생 남은 용돈: " + money);

	}
}
