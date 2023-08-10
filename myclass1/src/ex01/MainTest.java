package ex01;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		// 화면에 원하는 단을 입력 하세요
		// 2보다 작거나 9보다 큰 숫자를 입력하면 잘 못 입력 했습니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		if ( i >= 2 && i < 10) {
			for (int a = 1; a < 10; a++) {
				System.out.println(i + "*" + a + "=" + (i * a));
			}
		} else {
			System.out.println("숫자를 잘못 입력 했습니다.");
		}
		

	}

}
