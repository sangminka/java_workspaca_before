package ch01;

public class TypeConversion {

	public static void main(String[] args) {
		
		//형 변환: 데이터 타입을 변환 하는 것을 말한다.
		//1.강제 형 변환
		//2.자동 형 변환
		
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		double dNumber1;
		
		dNumber1 = iNumber1; //자동 형 변환 이라고 한다.
		System.out.println(dNumber1);
		
		System.out.println("---------------");
		
		double dNumber2 = 1.12345;
		int iNumber2 = (int)dNumber2; 
		//강제 형 변환 - 원래는 오류가 발생 되지만 컴파일러 한테 괜찮아 그냥 넣어,버려지는거 무시
		System.out.println(iNumber2);
		
		
		//연습
		double a;
		int b;
		
		//1. a에 값 (리터럴) 0.5를 담아 보세요
		a = 0.5;
		//2. b에 값을 10.5를 담아 보세요
		b = (int)10.5;
		//3. b를 출력해 보세요
		System.out.println(b);
	}//end of class

}//end of main
