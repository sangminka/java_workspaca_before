package ch05;

public class forMaintest_3 {
	public static void main(String[] args) {
		// 1부터 10까지 더하는 결과를 화면에 출력 하시오
		int num = 0;

//		num = num + 1;
//		num = num + 2;
//		num = num + 3;
//		num = num + 4;
//		num = num + 5;
//		num = num + 6;
//		num = num + 7;
//		num = num + 8;
//		num = num + 9;
//		num = num + 10;

		System.out.println("결과 : " + num);
		// 11부터 반대로
//		for (int i = 1; i < 11; i++) {
//			num = num + i;
//		}
//		System.out.println("결과 : " + num);
		// -------------------------------------------------------
		for (int i = 10; i > 0; --i) {
			num =  num+ i;
		}

		System.out.println("결과 : " + num);

	}// end of main

}// end of class
