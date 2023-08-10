package com.tencoding.starcraft;

public class Zealot {
	static private int num = 1;
	private String name;
	private int power;
	private int hp;
	private int monNum;

	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
		this.monNum = num;
		num++;
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
	public void attackMarine(Marine targetMarine) {
		// 마린공격

		System.out.println(this.name + "가" + targetMarine.getName() + "를 공격합니다");
		targetMarine.beAttacked(this.power);
	}

	public void attackZergling(Zergling targetZergling) {
		// 저글링 공격
		System.out.println(this.name + "가" + targetZergling.getName() + "를 공격합니다");
		targetZergling.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		if (this.hp <= power) {
			System.out.println(this.name + "이미 사망 하였습니다.");
			hp = 0;
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
		System.out.println("번호" + monNum);
	}

}// end of class
