package ch08;

public class CalculatorMainTest {

	public static void main(String[] args) {
		//Calculator를 인스턴스하지말고 여러 기능을 호출에서 결과를 확인 하세요
		
		//static을 활욜할 때 클래스이름.xx를 사용할 수 있다.
		System.out.println(Calculator.add(5, 5));
		System.out.println(Calculator.subtract(5, 3));
		System.out.println(Calculator.multiply(6, 5));
		System.out.println(Calculator.divide(30, 6));
		
		
	}//end of main

}//end of class
