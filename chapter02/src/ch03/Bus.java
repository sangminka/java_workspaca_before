package ch03;

public class Bus {

	//속성 버스번호, 
	int busNumber;
	int count;
	int money;// 수익금
	
	//기능  사람을 태운
	
	public void take(int n) {
		//0 =	0 	+ 1300
		//1300 = 1300 + 1300
//		money = money + n ;
		money += n;
		count = count + 1;
		
	}
	
	public void showInfo() {
		System.out.println("==============상태창==============");
		System.out.println("버스 번호: " + busNumber );
		System.out.println("승객 수 :" + count);
		System.out.println("현재 수익금: " + money);
		System.out.println("==============상태창==============");
	}
	
}
