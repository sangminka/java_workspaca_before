package ex01;

import java.util.Scanner;

public class ExDoWhile {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("숫자를 입력해 주세요 : ");
			a = sc.nextInt();
			System.out.println("시스템을 실행합니다.: 종료 0");
		} while (a != 0);
		System.out.println("시스템 종료");

		// do {
//
//	}while()

	}
}