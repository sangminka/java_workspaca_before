package ex03;

public class Subway {

	//지하철 속성
	int subNum ;
	int money;
	int totalMoney;
	int count;
	
	public void take() {
		totalMoney = totalMoney +  money;
		count++;
	}
	

	public void SubwayInfo() {
		System.out.println("============================");
		System.out.println("지하철 번호: " + subNum);
		System.out.println("승객 수" + count);
		System.out.println("총 요금: " + totalMoney);
	}
	
	//지하철 기능
	
	
	
}
