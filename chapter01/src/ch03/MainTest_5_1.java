package ch03;

public class MainTest_5_1 {
	public static void main(String[] args) {
		//증감 연산자 표시를 앞에다가 작성해서 연습해보자
		//감소 연산자 표시를 앞에다가 작성해서 연습해보자
		
		// -- ++
		int num1 = 10; 
		int num2 = 0;
		
		//문제 1.  num1에 더하기 1하는 코드를 4가지 방식으로 작성해주세요
		++num1;
		num1++;
		num1 += 1;
		num1 = num1 + 1;
		//문제 2. num2에 빼기 1하는 코드를 4가지 방식으로 작성해주세요
		--num2;
		num2--;
		num2 -= 1;
		num2 = num2 - 1;
		System.out.println(num1);
		System.out.println(num2);
		
		
		
	
		
	}
}
