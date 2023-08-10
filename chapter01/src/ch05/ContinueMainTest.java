package ch05;

public class ContinueMainTest {

	public static void main(String[] args) {

		// 1부터 10까지 화면에 결과를 출력하시오 ~ for
		// 만약 3에 배수라면 화면에 값을 출력하지 마시오 if && continue
		int i;
		int k = 0;
		for (i = 1; i <= 50; ++i) {

			if (i % 3 == 0) {
				k++;
				continue;
			}
			System.out.println("i :  " + i);

		} // end of for

		// 3에 배수에 개수를 출력 해주세요
		System.out.println("3에 배수에 개수는 " + k + "개 입니다.");
	}// end of main

}// end of class
