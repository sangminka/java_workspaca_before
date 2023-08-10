package ch03;

public class MainTest_2 {

	public static void main(String[] args) {
		//부호 연산자 ( + . - )
		//단항 연산자 이다.
		int number = 10;
		
		//부호 연산자는 메모리 공간에 접근해서 값을 변경하는 것은 아니다
		System.out.println(-number);
		
		System.out.println(number);
		// 실제 값을 변경 하려면 대입 연산자를 사용하면 된다.
		
		//문제 
		// number 변수에 접근해서 현재 값 양수 10을 -10으로 변경하는 코드를 작성해보세요
		number = -number;
		System.out.println(number);
	}//end of main

}//end of class
