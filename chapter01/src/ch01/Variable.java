package ch01;

public class Variable {
	
	
	// <-- 주석 - 컴파일러가 무시 하는 코드
	//1. 자바에서 중괄호는(블록)에 범위는 절대적이다.
	
	//main이란 :프로그램에 시작 점 
	public static void main(String[] args) {
		
		
		//변수를 사용하는 방법**
		int age; //문장에 끝은 세미클론을 통해서 컴파일러에게 알려 주어야 한다.
		int count; // <-- 변수 선언 -- 메모리 공간만 일단 활당 해둔 상태 !!
		
		age = 1; // 초기화 한다 (값을 넣다)
		//age = 10; 메모리 공간을 할당 해야 사용할 수 있다. age2는 공간은 없는 상태
		count = 100; //100으로 초기화
		
		//화면에 xxx를 출력하라 !
		System.out.println(age); //개발자 도구에서 만들어둔 명령어
		//ctrl + F11 (실행)
		System.out.println(count);
		
		//변수란 메모리 공간도 의미 하지만 변하는 수 이기도 하다.
		age = 500;
		//int age; 먼저 할당한 변수 이름을 똑 같이 하나더 만들 수 없다. (공간 할당 의미)
		System.out.println(age);
		
		//변수에 선언과 초기화 (한번에 사용)
		int myAge = 30;
		
		System.out.println(myAge);
		
		System.out.println("=====================");
		//화면에 바로 숫자도 입력, 문자도 바로 입력 할 수 있다.
		System.out.println(700);
		System.out.println("문자열");
		
		
	}//end of main

}//end of class
