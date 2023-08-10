package com.tencoding.starcraft;

public class Marine {
	private String name;
	private int power;
	private int hp;

	public Marine(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	// getter 메서드 만들기
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 기능
	public void attackZealot(Zealot targetZealot) {
		// 질럿 공격
		System.out.println(this.name + "가" + targetZealot.getName() + "를 공격합니다");
		targetZealot.beAttacked(this.power);
	}

	public void attackZergling(Zergling targetZergling) {
		// 저글링 공격
		System.out.println(this.name + "가" + targetZergling.getName() + "를 공격합니다");
		targetZergling.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		if (this.hp <= power) {
			hp = 0;
			System.out.println(this.name + "이미 사망 하였습니다.");
			return; // 실행에 제어권을 반환 한다.
		} else {
			this.hp -= power;
		}
	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
	}
}
