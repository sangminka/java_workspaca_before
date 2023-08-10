package ch06;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank();
	//	System.out.println(bank.balance);
		bank.showInfo();

		bank.deposit(10_000);
		bank.withdraw(5_000);
		bank.showInfo();

		// 신입이 실수를 한 코드
		//bank.balance = 100_000; <-- private추가
		bank.deposit(100_000);
		bank.showInfo();
	}// end of main

}// end of class
