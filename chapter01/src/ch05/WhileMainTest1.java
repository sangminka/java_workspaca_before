package ch05;

public class WhileMainTest1 {
	// 메인 함수 - 메인 쓰레드 (작업자)
	public static void main(String[] args) {

//		while(조건식) { 수행구문}
		// 1부터 10까지 덧셈하는 연산을 while문으로 만들어 보자
		int start = 1;
		int sum = 0;

//		sum = start + 1;
//		sum = start +2; ...10
		// 무한 반복을 조심하자
		while (start < 11) {
			sum = sum + start;
			System.err.println(start);
			start++;
			System.out.println("한번 수행 완료");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // end of while
		System.out.println("sum : " + sum);
	}// end of main

}// end of class
