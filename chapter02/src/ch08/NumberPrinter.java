package ch08;

public class NumberPrinter {

	private int id;
	private static int waitNumber = 1; //선언과 동시에 초기화
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	//번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println(id + "번 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	}
	
}//end of class
