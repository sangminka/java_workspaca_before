package ch05;

public class forMaintest2 {

	public static void main(String[] args) {
		int num = 2;
//		System.out.println(num + " * 1 = " + (num * 1));
//		System.out.println(num + " * 2 = " + (num * 2));
//		System.out.println(num + " * 3 = " + (num * 3));
//		System.out.println(num + " * 4 = " + (num * 4));
//		System.out.println(num + " * 5 = " + (num * 5));
//		System.out.println(num + " * 6 = " + (num * 6));
//		System.out.println(num + " * 7 = " + (num * 7));
//		System.out.println(num + " * 8 = " + (num * 8));
//		System.out.println(num + " * 9 = " + (num * 9));

		// 구구단 2단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		System.out.println("--------------------------------");
		// 구구단 3단 출력
		num++;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		System.out.println("--------------------------------");
		// 구구단 4단 출력
		num++;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		System.out.println("--------------------------------");
		// 구구단 5단 출력
		num++;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		System.out.println("--------------------------------");
	}// end of main

}// end of class
