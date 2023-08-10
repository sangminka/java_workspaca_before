package ch01;

public class DataTypeTest {

	public static void main(String[] args) {
		// 1. 정수 550을 name1 이름으로 변수에 담아 보세요. 
		int name1 = 550;
		System.out.println(name1);
		// 2. 정수 22억을 name2 이름으로 변수에 담아 보세요 
		long name2 = 2200000000l;
		System.out.println(name2);
		// 3. 문자 A를 name3 이름으로 담아 보세요 
		char name3 = 'A';
		System.out.println(name3);
		// 4. 실수 float 타입으로 0.12345678 을 name4 이름으로 담아 보세요 
		// --> 접미사를 알고 있는가? (연산단위) 
		float name4 = 0.12345679F;  //  강제형변환 
		System.out.println(name4);		
		// 5. 실수 double 타입으로 200.0012을 name5 이름으로 담아 보세요
		double name5 = 200.0012;
		System.out.println(name5);
		// 6. 논리 자료형 isOk 라는 이름으로 변수를 선언해 보세요. 
		boolean isOk; 
		
		// 7. isOk 변수에 리터럴 값 false 로 초기화 해보세요. 
		isOk = false;
		System.out.println(isOk);
		// 8. isOk 변수 값을 true로 변경해 보세요 
		isOk = true;
		System.out.println(isOk);
		// 9. 변수란 무엇인지 서술해 보세요 
		// 변하는 수 입니다. 값(주소값)을 자장할 수 있는 메모리 공간을 의미한다. 
		
		// 10. 기본 데이터 타입 종류 8가지와 크기를 서술해 주세요.
		//
		// 정수형 (byte, short, int, long) 1, 2, 4, 8 
		// 실수형 (float, double) 4byte, 8byte 
		// 문자형 (char)   - 2
		// 논리형 (boolean)  - 1		

	}//end of main

}//end of class
