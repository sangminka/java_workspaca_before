package ex04;

import java.util.Scanner;

public class BankMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		while (true) {
			System.out.print("번호를 선택해 주세요 : 1. 입급 , 2. 출금 3. 잔액 확인 4.종료");
			int input1 = sc.nextInt();
			if (input1 == 1) {
				System.out.println("입금을 선택하셨습니다.");
				System.out.println("입금 금액을 입력해 주세요");
				input1 = sc.nextInt();
				bank.deposit(input1);
			} else if (input1 == 2) {
				System.out.println("출금을 선택 하셨습니다.");
				System.out.println("출금 금액을 입력해주세요");
				input1 = sc.nextInt();
				bank.withdraw(input1);
			} else if (input1 == 3) {
				System.out.println("잔액 확인");
				bank.showInfo();
			} else if (input1 == 4) {
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}

		}

	}// end of main

}// end of class
