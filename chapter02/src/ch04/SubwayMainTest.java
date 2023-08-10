package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {
		
		//사용자 정의 생성자를 하나만 설계한다면
		//Subway를 인스턴스화 시키는 방법은 오직 하나만 존재
		
		Subway subway2 = new Subway(2, 500, 10);
		subway2.showInfo();

		Subway subway3 = new Subway() ;
		subway3.trainNum = 3;
		subway3.subWayFee = 1300;
		subway3.count = 100;
		subway3.showInfo();
	}

}
