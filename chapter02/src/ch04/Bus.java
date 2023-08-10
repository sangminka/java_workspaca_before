package ch04;

public class Bus {

	// 속성 (상태)
	int busNumber;
	int count;
	int money;

	double weight;

	// 생성자 만들어 보기
	// 생성자는 리턴 타입이 없다.메서드와 구분하세요!
	// 반드시 클래스 이름과 동일 해야 한다.

	// 1. 기본 생성자는 컴파일러가 자동으로 만들어 준다
	// 단 ( 사용자 정의 생성자가 없을 경우 )
	public Bus() {

	}

	// 개발자가 직접 생성자를 명시하는 것을
	// 사용자 정의 생성자라고 부른다.
	public Bus(double count) {
		this.weight = count;
		// this = 자기자신
	}

	public Bus(int count) {

	}

	public Bus(int busNumber, int count) {
		this.busNumber = busNumber;
		this.count = count;
	}    
	

	public Bus(int busNumber, int count, int money) {
		this.busNumber = busNumber;
		this.count = count;
		this.money = money;
	}

	public void take(int m) {
		money += m;
		count++;
	}

	public void showInfo() {
		System.out.println("버스번호:" + busNumber);
		System.out.println("승객수:" + count);
		System.out.println("금액:" + money);
		System.out.println("======================");
	}

}
