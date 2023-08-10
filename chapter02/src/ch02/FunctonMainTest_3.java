package ch02;

import ch01.User;

public class FunctonMainTest_3 {

	// 코드에 시작점
	public static void main(String[] args) {

		// total < -- 기본 데이터 타입, (지역 변수)
		int total  = (int)minus(10.0,5.0);
		System.out.println(total);
		
		//Kim <- 참조 타입 (지역 변수)
		User Kim = new User();
		System.out.println(Kim);
		
	}// end of main

	// 함수를 만들어 주세요
	// 리턴 값이 실수 형인 minus 라는 이름 가진 함수를 선언
	// 매개변수는 실수형 2개를 받는 녀석을 선언해 주세요
	// n1에서 n2를 빼는 기능
	public static double minus(double n1, double n2) {
		//지역 변수 : 스택 메모리에 올라간 녀석을 지역 변수라고 한다.
		double result = n1 - n2;
		return result;
	}

}// end of class
