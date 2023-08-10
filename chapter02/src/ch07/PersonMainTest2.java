package ch07;

public class PersonMainTest2 {

	public static void main(String[] args) {

		Person person1 = new Person("홍길동", 50);
		Person person2 = new Person("이순신", 60);

		System.out.println(person1);
		System.out.println(person2);

		if (person1 == person2) {
			System.out.println("주소값이 같습니다.");
		} else {
			System.out.println("주소값은 다릅니다");
		}
		System.out.println("===================");
		Person person3 = person1;

		if (person3 == person1) {
			System.out.println("주소값이 같습니다.");
		} else {
			System.out.println("주소값은 다릅니다");
		}
		Person person4 = person1.getPerson();
		if (person1 == person4) {
			System.out.println("주소값이 같습니다.");
		} else {
			System.out.println("주소값은 다릅니다");
		}

		System.out.println("------------------------");

		// 레퍼런스 (참조 변수) 변수 값은 같은 객체를 가리키고 있다면
		// 다른 참조변수에 접근해서 값을 변경하면 실제 객체인 멤버 변경된다.
		person3.name = "티모";
		person2.name = "야스오";
		System.out.println(person1.name);
		System.out.println(person3.name);
		System.out.println("------------------");
		System.out.println(person2.name);

	}// end of main

}// end of class
