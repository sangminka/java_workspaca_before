package ch03;

public class MainTest_3 {

	// 메인 함수 -코드의 시작점:메인 쓰레드
	public static void main(String[] args) {
		// 산술 연산자 연습
		
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;	
		int number4 = 5 / 4;		
		int number5 = 5 % 3;
			
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		
		
		System.out.println("---------------------------------");
		
		//문제
		//1. (12+3) / 3 값을 화면에 출력하시오
		
		System.out.println((12+ 3) / 3);
		
		//2.(25 % 2) 값을 화면에 출력하시오
		System.out.println(25 % 2);
		
		int number11 = (int)(5.0/ 4.0);
		System.out.println("--------------------------");
		System.out.println(number11);
	}// end of main

}// end of class
