package ch02;

public class TypeConversionTest {

	public static void main(String[] args) {
		float fNumber1;
		int iNumber1;
		long lNumber1;
		
		// 형 변환에 관련한 문제를 직접 만들어 보기
		
		//1번 문제 fNumber1 에 10.123을 넣고 iNumber1에 형변환을 해서 넣어주세요 그후 iNumber1을 프린트 해주세요
		//float -> int (강제 형변환 발생)
		fNumber1 = 10.123f;
		iNumber1 = (int)fNumber1;
		System.out.println(iNumber1);
		System.out.println("--------------------------------------");
		//2번 문제 fNumber1을 lNumber1에 넣어주세요 그후 lNumber1을 프린트 해주세요
		//float --> long (강제 형변환 발생)
		lNumber1 =  (long)fNumber1; 
		System.out.println(lNumber1);
		System.out.println("--------------------------------------");
		//3번문제 iNumber1에 13을 넣고 lNumber1에 iNumber1를넣어주세요 그후 lNumber1을 프린트 해주세요
		//int -->long (자유 형변환 발생)
		iNumber1 =13;
		lNumber1 = iNumber1;
		System.out.println(lNumber1);
		System.out.println("--------------------------------------");
		//4번문제 fNumber1에 lNumber1을  넣어주세요 그후 fNumber1을 프린트 해주세요
		//long --> float (자유형변환 발생)
		fNumber1 =lNumber1;
		System.out.println(fNumber1);	
		System.out.println("--------------------------------------");
		//5번문제 데이터 타입 double을 생성하고 double에 lNumber1을 넣고 프린트 후,iNumber를 넣고 프린트,fNumber를 넣고 프린트 해주세요
		//long --> double (자유형변환 발생)
		//int --> double (자유형변환 발생)
		//float --> double (자유형변환 발생)
		double douNumber1;
		douNumber1 = lNumber1;
		System.out.println(douNumber1);
		douNumber1 = iNumber1;
		System.out.println(douNumber1);
		douNumber1 = fNumber1;
		System.out.println(douNumber1);
		
		
	}//end of main

}//end of class
