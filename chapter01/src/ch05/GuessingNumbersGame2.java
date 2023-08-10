package ch05;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbersGame2 {

	public static void main(String[] args) {

		// 1. 랜덤 숫자 발생 1 ~ 5 하나 생성 - Random +1
		// 사용자에 키보스 입력값을 받아주세요 - Scanner
		// 만약 램덤숫자와 사용자 입력 값이 맞으면 성공 - if
		// 기회는 3번만 주어집니다. - while

		// 랜덤 도구 사용 Random
		// 스캐너 도구 사용Scanner
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		int ranNum =random.nextInt(5)+1;
//		int input = sc.nextInt();
		int i = 1;
		while (i < 4) {
			int ranNum = random.nextInt(5) + 1;
			System.out.println("번호를 입력해주세요");
			int input = sc.nextInt();
			if (ranNum == input) {
				System.out.println("성공입니다.");
				break;
			} else {
				System.out.println("실패 정답은 :" + ranNum + "입니다. 남은기회" + (3 - i) + "번입니다.");
			}

			i++;
		}
		System.out.println("시스템 종료");

	}// end of main

}// end of class
