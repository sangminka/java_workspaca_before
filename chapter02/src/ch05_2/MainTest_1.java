package ch05_2;

public class MainTest_1 {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("전사1");
		Acher acher1 = new Acher("궁수1");
		Wizard wizard1 = new Wizard("마법사");

		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		warrior1.attackAcher(acher1);
		// 궁수에 상태값을 확인해 보자
		acher1.showInfo();
	}// end of main

}// end of class
