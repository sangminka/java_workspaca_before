package ch03;

public class MainTest_7_1 {

	public static void main(String[] args) {
		
		//논리 연산자(논리곱,논리합)
		
		int num1 = 5;
		int i = 0;
		
		boolean value= ( (num1 = 1 + 10) < 10 ) && ( ( i = i + 2 ) < 10 );
		System.out.println( value );
		System.out.println( num1 );
		System.out.println( i );
		
		boolean value2 = ( ( num1 = num1 + 1 ) > 0  ) || ( ( i = 100) < 2000 );
		System.out.println(value2);
	
		// 부정 ---> !
		// value2 = true 
		System.out.println(!value2);
		System.out.println(value2);
		
	}//end of main

}//end of class
