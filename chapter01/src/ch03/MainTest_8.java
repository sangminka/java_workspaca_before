package ch03;

import java.util.Scanner;

public class MainTest_8 {

	// 코드에 시작함
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2

		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1); // 결과값 : 10

		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);// 결과값 : 20

		System.out.println("---------------------------------");
		System.err.println((5 < 3) ? 10 : 20);

		// JDK가 만들어 놓은 도구
		int max = 0;
		System.out.println("입력 받은 두 수중 큰 수를 출력 하세요");

		// 데이터타입 이름 ---> 단 대문자로 시작 했다.
		// 변수에 종류에는 가장 크게 딱 2가지만 존재한다.
		// 1.기본 데이터 타입
		// 2.참조 타입
		// Scanner sc;

		// 문제
		// 두수를 비교해서 어떤 사용자가 입력한 값 중에 큰 수를 화면에 출력 하시오

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1  : ");
		int x = sc.nextInt();
		System.out.print("입력 2 : ");
		int y = sc.nextInt();

		int big;
		// 삼항 연산자 - 조건 연산자
		// 메모리 공간 호출 = 식을 만들어서 담을 예정
		// x 나 y 값 중에 큰 값이 big에 닮기게 된다

		big = (x > y) ? x : y;
		// 문자열 + 정수 + 문자열 --> 문자열
		System.out.println("큰 숫자는 " + big + "입니다.");

	}// end of main

}// end of class
