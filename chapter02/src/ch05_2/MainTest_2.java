package ch05_2;

import java.util.Scanner;

public class MainTest_2 {

	public static void main(String[] args) {
		// Scanner sc
		// 1.위자드 생성, 2워리어 생성 , 3마법사 생성 , 4.게임종료
		// 1 - 1(누구를 공격 하겠습니까)
		// 1.1 궁

		Wizard wizard = new Wizard("마법사");
		Acher acher = new Acher("궁수");
		Warrior warrior = new Warrior("전사");

		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력 하세요 : 1.워리어 생성, 2위자드 생성 , 3아처 생성 , 4.게임종료");
		int inputNum = sc.nextInt();
		;
		while (true) {
			if (inputNum == 1) {
				Warrior warrior1 = new Warrior("전사");
				System.out.println("누구를 공격하시겠습니까? : 1번: 마법사 ,2번:궁수");
				int inputNum2 = sc.nextInt();
				if (inputNum2 == 1) {
					// 마법사 공격
					warrior1.attackWizard(wizard);
					wizard.showInfo();
				} else if (inputNum2 == 2) {
					warrior1.attackAcher(acher);
					acher.showInfo();
				}
			} else if (inputNum == 2) {
				Wizard wizard1 = new Wizard("마법사");
			} else if (inputNum == 3) {
				Acher acher1 = new Acher("궁수");
			} else if (inputNum == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 잘못 입력 하였습니다.");
			}

		}

	}// end of main

}// end of class
