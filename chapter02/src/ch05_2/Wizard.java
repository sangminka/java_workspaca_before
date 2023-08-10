package ch05_2;

public class Wizard {
	String name;
	int power;
	int hp;

	public void attackWarrior(Warrior warrior) {
		// 전사를 공격합니다
		System.out.println("전사를 공격합니다.");
		warrior.beAttacked(this.power);
		
	}
	public Wizard(String name) {
		this.name = name;
		this.power = 20;
		this.hp = 50;
	}

	public void attackAcher(Acher acher) {
		// acher라는 주소값을 넘겨 받은 상태이다.
		// 궁수에 접근해서 그 기능인 공격 공격함
		System.out.println("궁수를 공격합니다.");
		acher.beAttacked(this.power);
		
	}

	public void beAttacked(int power) {
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
