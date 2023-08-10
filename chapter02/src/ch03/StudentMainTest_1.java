package ch03;

public class StudentMainTest_1 {

	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.studentId = 1;
		studentKim.studentName = "티모";
		studentKim.address = "블루 진영";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		Student studentLee = new Student();
		studentLee.studentId = 2;
		studentLee.studentName = "야스오";
		studentLee.address = " 레드진영";
		
		studentLee.showInfo();
		//멤버 변수는 값을 초기화 하지 않으면 기본값으로 
		//컴파일러가 값을 넣어서 만들어 준다.
		
	}

}
