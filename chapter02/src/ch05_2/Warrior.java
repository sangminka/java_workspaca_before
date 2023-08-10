package ch05_2;

//클래그슬 설계한 쪽
public class Warrior {
	// 참조타입
	String name;
	// 기본 데이터 타입
	int power;
	int hp;

	public Warrior(String name) {
		this.name = name;
		this.power = 14;
		this.hp = 100;
	}

	public void attackAcher(Acher acher) {
		// acher라는 주소값을 넘겨 받은 상태이다.
		// 궁수에 접근해서 그 기능인 공격 공격함
		System.out.println("궁수를 공격합니다.");
		acher.beAttacked(this.power);

	}

	public void attackWizard(Wizard wizard) {
		// 마법사를 공격함
		System.out.println("마법사를 공격합니다.");
		wizard.beAttacked(this.power);
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

}// end of class
