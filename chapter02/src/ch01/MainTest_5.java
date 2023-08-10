package ch01;

public class MainTest_5 {

	public static void main(String[] args) {

		// 기본 데이터 타입 vs 참조 타입

		// 기본 데이터 이름이 a 이다
		int a = 10;

		// 참조 타입 이름은 user1 이다.
		User user1 = new User();
		User user2 = new User();

		System.out.println(a); // 리터럴 값 출력
		System.out.println(user1); // 주소값
		System.out.println(user2); // 주소값

		user1.name = "홍길동";
		System.out.println(user1.name);
		user2.name = "이순신";
		System.out.println(user2.name);
		
		//메인 함수에 쓰는 변수 지역 변수
	}

}
