package ch02;

public class FunctionMainTest_4 {
	// 메인함수
	public static void main(String[] args) {

		// 정수를 호출해서 실행 하지오 -- int
		int pNum = plus(3, 5);
		int mNum = minus(10, 7);
		int mpcNum = mpc(5, 5);
		double diviNum = divi(4564, 7);

		System.out.println(pNum);
		System.out.println(mNum);
		System.out.println(mpcNum);
		System.out.println(diviNum);

	}// end of main

	public static int plus(int n1, int n2) {

		return n1 + n2;

	}

	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

	public static int mpc(int n1, int n2) {
		return n1 * n2;
	}

	public static double divi(double n1, double n2) {
		return n1 / n2;
	}

}// end of class
