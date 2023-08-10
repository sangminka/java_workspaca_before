package ch02;

public class FuctionMainTest_2 {

	// 메인 함수
	public static void main(String[] args) {

		sayHello("안녕 좋은 아침이야");
		sayHello("반가워~");
		int result = calcSum();
		System.out.println(result);

	}// end of main

	// 함수에는 여러가지 종류가 있다. - 정수값을 반환 하는 함수
	public static int add(int n1, int n2, int n3) {
		// 함수안에 사용하는 변수는 지역 변수라고 한다.
		// return 키워드 뒤에 바로 식을 사용할 수도 있다.

		return n1 + n2 + n3;
	}

	// 아무것도 반환하지 않는 함수도 있다.
	// void -> 텅빈
	public static void sayHello(String greeting) {

		System.out.println("** " + greeting + " ** !");

	}

	// 매개 변수는 반드시 없어도 된다.
	public static int calcSum() {

		int sum = 0;
		int i = 1;

		for (i = 1; i < 101; i++) {
			// sum = sum +i
			sum += i;

		}

		return sum;
	}

}// end of class
