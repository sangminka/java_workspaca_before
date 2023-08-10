package ch01;

public class Datatype_1 {

	public static void main(String[] args) {
		
		//데이터 타입 종류는 크게 두가지가 있다.
		//1. 기본 데이터 타입(primitive type)
		//2. 참조 타입 (Reference type)
		
		//기본 데이터 타입에 종류 - 정수형
		byte b;  //1바이트
		short s; //2바이트
		int i;       //4바이트
		long l;    //8바이트
		b = 127;
		b = - 128;
		
		//R 벨류 기준으로 4바이트로 받아 들인다.
	    //접미사를 작성해주어야 한다
		//정수형에 기본 연산 단위는 4바이트 이다.
		//long 단위를 작성을 할 때는 접미사를 넣어 주어야 인식을 한다.
		l = 21000000000L;
		
		//실수형을 표현할 때 사용되는 데이터 타입 (float,double) - 기본 연산 단위 double 이다.
		
		double dou = 10.0;
		float fot = 11.7f;    // 접미사 f,F를 작성해야 한다
		
		// 정수형 - int (4byte)
		// 실수형 - double ( 8byte )
		
		
		
	}//end of main			
}//end of class
