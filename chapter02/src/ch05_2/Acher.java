package ch05_2;

public class Acher {
	String name;
	int power;
	int hp;

	public Acher(String name) {
		this.name = name;
		this.power = 1;
		this.hp = 80;
	}

	public void attackWarrior(Warrior warrior) {
		// 전사를 공격합니다
		System.out.println("전사를 공격합니다.");
		warrior.beAttacked(this.power);
		
	}

	public void attackWizard(Wizard wizard) {
		// 마법사를 공격합니다
		System.out.println("마법사를 공격합니다.");
		wizard.beAttacked(this.power);
	}

	public void beAttacked(int power) {

		// 만약 hp가 0이하라면
		if (this.hp <= 0) {
			System.out.println("이미 사망하였습니다.");
			this.hp = 0;
		} else {
			this.hp -= power;
		}

	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("닉네임: " + name);
		System.out.println("공격력: " + power);
		System.out.println("체력: " + hp);
	}

}
