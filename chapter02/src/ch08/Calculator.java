package ch08;

public class Calculator {
	//멤버변수
	int sum = 0;
	
	
	//두수를 더하는 메서드
	public static int add(int a, int b) {
		return a+b;
	}
	//두수를 빼는 메서드
	public static int subtract(int a, int b) {
		//멤버 변수를 활용할 수 없는 이유는 뭘까
//		sum = a+b
		return a+b ;
	}
	//두수를 곱허눈 메서두
	public static int multiply(int a, int b) {
		return a*b;
	}
	//두정수를 나누는 static 메서드
	public static int divide(int a, int b) {
		if(b == 0) {
			System.out.println("Error: Division by zero is not allowed");
			return 0;
		}
		return a/b;
		
		
			
		}
	//잠시 자리를 빌려서 static 함수를 작성할 수 있다.
		public static void main(String[] args) {
			//과제 calculator를 인스턴화 시키지 말고
			//동작들을 실행 시켜 보세요
		
			add(1,3);
			subtract(5,3);
			multiply(6,5)
;			divide(30,5);
			}
}
