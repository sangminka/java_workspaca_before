package ch03;

public class MainTest_1 {

	public static void main(String[] args) {
		 
		char myA = 'A';
		char youerA = 'a';
		
		//변수를 활용해서 연산의 한다고 실제 변수안에 들어가 있는 값이 변경 되는 것은 아닌다.
		System.out.println((int)myA);
		System.out.println((short)myA);
		System.out.println("-------------------");
		System.out.println(myA);
		System.out.println("-------------------");
		//즉 값을 변경 하려면 대입 연산자를 활용 할 수 있다.		
		myA = 'B';
		System.out.println(myA);
		
		//대입 연산자에 우선 순위는 가장 낮다.
		//연산에 방향은 반드시 오른쪽에서 왼쪾으로 간다라고 생각하자
		//<------

	}//end of main

}//end of class
