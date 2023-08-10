package ch05;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1부터 10까지 화면에 결과를 출력하시오 ~ for
		// 만약 3에 배수라면 화면에 값을 출력하지 마시오 if && continue
		int i;
		int count = 0;
		final int A = sc.nextInt();
		int start = 1;
		int end = 1000;
		for (i = start; i <= end; ++i) {

			if (i % A == 0) {
				count++;
				continue;
			}
//			System.out.println("i :  " + i);

		} // end of for

		// 3에 배수에 개수를 출력 해주세요
		System.out.println(A + "에 배수에 개수는 " + count + "개 입니다.");
	}// end of main

}// end of class
