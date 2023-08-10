package ch08;

public class Company {
	
	//싱글톤 패턴으로 설계하는 방법
	//heap 메모리에 오직 객체가 하나만 존재해야 될 경우 사용 가능하다.
	
	//1. 생성자는 private으로 선언 해야 한다.
	private Company() {}
		
	//클래스 내부에 유일한 private 인스턴스 객체를 생성
	private static Company instance = new Company();	 //선언과 동시에 초기화
	
	//3. 외부에서 유일한 instance변수에 접근할 수 있는 메서드를 제공해야 한다.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}//end of main
