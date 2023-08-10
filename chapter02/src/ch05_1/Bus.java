package ch05_1;

public class Bus {

	// 버스 호선
	// 승객수
	// 수익금
	int busNum;
	int count;
	int money;

	// 생성자 - 버스호선만 받도록 설계
	public Bus(int busNum) {
		this.busNum = busNum;
	}

	// 승객을 태우다 (버스 요금)
	public void take(int money) {
		System.out.println("버스 요금은" + money + "입니다.");
		this.money += money;
		count++;

	}

	// 승객을 하차시키다.
	public void takeOff(int count) {
		System.out.println("승객이 " + count + "명 내립니다.");
		if (this.count - count < 0) {
			System.out.println("승객수가 이상합니다.");
		} else {
			this.count -= count;
			System.out.println("남은 승객수" + this.count);
		}

	}
}
