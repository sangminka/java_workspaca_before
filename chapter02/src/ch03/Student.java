package ch03;

public class Student {
	// 멤버 변수

	int studentId; // 기본 데이터 타입
	String studentName; // 참조 타입
	String address; // 참조 타입
	double weight;

	// 기능 정의 공부를 한다

	public void study() {
		System.out.println(studentName + " 공부를 합니다.");
	}

	public void breakTime() {
		System.out.println(studentName + "휴식을 합니다.");
	}

	public void showInfo() {

		System.out.println("=====상태창=====");
		System.out.println(studentName + "에 ID:" + studentId);
		System.out.println(studentName + "에 이름:" + studentName);
		System.out.println(studentName + "에 주소: " + address);
		System.out.println(studentName + "에 몸무게: " + weight);
		System.out.println("===============");
	}

	// 함수와 메서드의 차이점
	// 메서드는 멤버변수를 활용해서 그 객체에 이름에 맞는 기능을 정의 하는 것이다.
	// 함수는 하나의 기능을 수행하는 일련에 코드 묶음 이다.
}
