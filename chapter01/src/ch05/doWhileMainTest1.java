package ch05;

import java.util.Scanner;

public class doWhileMainTest1 {
	public static void main(String[] args) {

//		do {
//			//한번은 반드시 수행되는 구문
//		}while(조건식);

		Scanner sc = new Scanner(System.in);
		int userInput;

		do {
			System.out.println("==================================");
			System.out.println("메뉴를 입력해 주세요");
			System.out.println("0 번 종료, 1 번 메인 화면 출력 ");
			userInput = sc.nextInt();// 사용자 한테 정수값을 입력 받는 기능

		} while (userInput != 0); // end of do while
		
		System.out.println(" 프로그램을 종료 하였습니다. ");
		
		
		
	}// end of main
}// end of class
