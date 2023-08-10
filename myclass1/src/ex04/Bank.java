package ex04;

public class Bank {
	private String name;
	private int balance; // 계좌 잔액

	public void deposit(int money) {
		this.balance += money;

	}

	public int withdraw(int money) {
		int result = 0;

		if (this.balance < money) {
			System.out.println("금액이 충분하지 않습니다");
			System.out.println("현재 계좌 잔액 : " + this.balance);
		} else {
			this.balance -= money;
			result = money;
		}

		return result;
	}

	public void showInfo() {
		System.out.println("계좌 잔액 : " + balance);
	}

}// end of class
