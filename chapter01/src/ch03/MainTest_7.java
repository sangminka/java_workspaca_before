package ch03;

public class MainTest_7 {

	public static void main(String[] args) {

		// 논리 연산자 (&&, ||) 엔퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용한다.
		// 연산에 결과는 true,false로 반환 된다.

		int num1 = 10;
		int num2 = 20;

		// 논리 곱
		// 논리 곱은 모든 결과값이 참이어야 참이 나온다. true
		// 하나라도 거짓이 나오면 무조건 거짓이 나온다. false
		boolean flag1 = (num1 > 0) && (num2 > 0); // true && true 결과: true
		boolean flag2 = (num1 > 0) && (num2 < 0); // true && false 결과: false
		boolean flag3 = (num1 < 0) && (num2 < 0); // false && false 결과: false
		boolean flag4 = (num1 < 0) && (num2 > 0); // false && true 결과: false

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);

		// 결론
		// 논리 곱에서 하나라도 거짓이 있으면 연산에 결과는 false 이다.

		System.out.println("----------------------------------------");

		// 논리 합(||)
		// 논리합에서는 하나라도 참이 있으면 연산을 결과는 true 이다.

		flag1 = (num1 < 0) || (num2 > 0); // false || true 결과 true
		flag2 = (num1 > 0) || (num2 > 0);// true || true 결과 true
		flag3 = (num1 > 0) || (num2 < 0);// true || false 결과 true
		flag4 = (num1 < 0) || (num2 < 0);// false || false 결과 false

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);

	}// end of main

}// end of class
