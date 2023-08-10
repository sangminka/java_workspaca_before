package ch02;

public class FunctionMainTest_1 {

	public static int addNumber(int n1, int n2) {

		// 결과를 담을 변수를 선언
		int result;
		
		result = n1 + n2;

		return result;

	}

	public static double minusNumber(int n1, int n2) {

		double result;

//		if (n1 > n2) {
		result = n1 - n2;
//		}else {
//			result = n2 -n1;
//		}

		return result;
	}

	public static void main(String[] args) {

		int returnValue = addNumber(10, 5); // 함수를 호출하는 문법
		System.out.println(returnValue);

		int returnValue1 = addNumber(100, 7595);
		System.out.println(returnValue1);

		// 함수호출은 모양 맞추기다.
		int returnValue3 = (int)minusNumber(5, 100); // double을 강제 형변환 가능 한가?
		System.out.println(returnValue3);

	}

}// end of class
