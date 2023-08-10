package ch04;

public class Subway {
	// 1. 필요한 변수를 설계
	// 2.생성자 2개 이상 설계
	// 3. 지하철에 맞는 메소드를 설계
	int trainNum;
	int subWayFee;
	int count;

	public Subway() {

	}

	public Subway(int trainNum, int subWayFee, int count) {
		this.trainNum = trainNum;
		this.subWayFee = subWayFee;
		this.count = count;

	}

	public void showInfo() {
		System.out.println("지하철 번호:" + trainNum);
		System.out.println("지하철 요금:" + subWayFee);
		System.out.println("지하철 승객 수:" + count);
		System.out.println("======================");

	}
}
