package ch06;

public class Bank {

	// 정보 은닉
	// 접근제어 지시자 private - 자기 자신에서만 사용 가능
	private String name;// 계좌 번호
	private int balance; /// 계좌 잔액

	public void setBalance(int balance) {
		if (balance < 0) {
			System.out.println("잘못 입력하였습니다.");
		}else {
			this.balance = balance;
		}
	}
	
	public String getName() {
		return this.name;
	}
	// 입금
	public void deposit(int money) {
		this.balance += money;

	}

	// 출금 - 도전 (잔액 0원인데 출금 요청
	public int withdraw(int money) {
		// 메서드 영역 안에 사용하는 변수는 지역 변수라고 한다.
		int result;
		if(this.balance - money < 0)
		this.balance -= money;
		result = money;
		return result;
	}

	// 잔액 확인
	public void showInfo() {
		System.out.println("현제 계좌 잔액은" + balance + "입니다");
	}

}// end of class
