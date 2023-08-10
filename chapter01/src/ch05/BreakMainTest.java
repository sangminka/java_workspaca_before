package ch05;

public class BreakMainTest {

	public static void main(String[] args) {

		// 예약어 break;
		// 중간에 멈추는 break;
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			// 만약 i값이 소수 7이라면 멈추어라

			if (i % 7 == 0) {
				// 수행됨
				continue;
			}
			
			System.out.println("i: " + i);
		}
		
	}// end of main

}// end of class
