package ch07;

public class Person {

	// this란
	// 1.인스턴스(객체) 자신의 메모리를 가리킨다.
	// 2.생성자에서 또 다른 생성자를 호출할 때 사용 가능 하다.
	// 3.자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.

	String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1.자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
		System.out.println("사용자 정의 생성자 기능 종료======1");
	}

	public Person(String name, int age, String phone) {
		// 2.생성자에서 다른 생성자를 호출할 때 this를 사용할 수 있다
		// ()<--괄호를 사용한다. tip

		this(name, age);
		this.phone = phone;
		System.out.println("사용자 정의 생성자 기능 종료=====2");
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
		System.out.println("사용자 정의 생성자 기능 종료=====3");
	}

	// 3.this는 자기 자신을 반환(수소값)시킬 수 있다.
	public Person getPerson() {
		return this;
	}

}// end of class
