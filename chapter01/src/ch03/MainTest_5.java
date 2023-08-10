package ch03;

public class MainTest_5 {
	public static void main(String[] args) {
		//증감 , 감소 연산자
		// ++ , --
		int num1 =1;
		//++num1;
		//num1++;
		//변수에 접근해서 값을 오직 더하기 1 한다.
		System.out.println(num1);
		//num1++
		num1 += 1;
		//주의 할 점 - 증감 연산자는 오직 1을 더해준다. 2도 아니고 3도 아니고 4도 아니다.
		
		//감소 연산자
		int num2 = 1;
		// num2 라는 메모리 공간 안에 0될 수 있는 코드 방식을 4가지로 다 작성해 보세요
		//num2--;
		//--num2;
		//num2 -= 1;
		num2 = num2 -1;
		System.out.println("-------------------------------------------------");
		int num3 = 5; //변수 num3 선언과 5로 초기화
		num3 *= 2;
		num3--;
		--num3;
		
		System.out.println(num3);
		
	}
}
