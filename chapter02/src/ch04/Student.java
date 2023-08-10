package ch04;

public class Student {
	// 기본생성자는 자동으로 컴파일러가
	// .class 생성할 때 만들어 준다.
	// 단, 사용자 정의 생성자가 없는 경우에만
	// 자동으로 만들어 준다.

	String name;

	public Student(String name) {
		this.name = name;
	}
	// 생성자 오버로딩이란
	// 여러가지 생성자를 만들어 둔 형태를 의미 한다

	public Student() {

	}
	public void showInfo() {
		System.out.println("학생이름: "  + name);
		System.out.println("===================");
	}
}
