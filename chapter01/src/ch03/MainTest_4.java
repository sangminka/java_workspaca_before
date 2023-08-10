package ch03;

public class MainTest_4 {
	
	public static void main(String[] args) {
	
		//복합 대입 연산자
		//대입연산자와 다른 연산자랑 함께 쓰인다.
		
		int num1 =1;
		
		//num1 = num1+ 10;
		num1 += 10;
		
		System.out.println(num1);
		
		int num2 = 1;
		
		num2 = 10;
		
		//num2 = num2 + 100;
		
		num2 += 100; // 위에 내용을 간소화 한것
		
		int num3 = 1;
		//num3  -= 10;
		//반대로 풀어서 코드를 작성해주세요
		num3 = num3 - 10;
		System.out.println(num3);
		
		//num1 = num1 *2;
		//위내용을 복합 대입 연산자로 변경해주세요
		num1 *= 2;
		System.out.println(num1);
		
		//num2 = num2 / 2; 
		//위내용을 복합 대입 연산자로 변경해주세요
		num2 /= 2;
		System.out.println(num2);
		
		//num2 = num2%2;
		//위 내용을 복합 대입 연산자로 변경해주세요
		num2 %= num2;
		System.out.println(num2);
	}//end of main

}//end of class
