package ch06;

public class Hero {
	// 변수+++++++++++++++++++++++++++++++++++++++++++
	private String name;
	private int hp;
	private int power;
	private int level;
	private double defense;

//+++++++++++++++++++++++++++++++++++++++++
	public Hero(String name) {
		this.name = name;
	}

	// getter,get 메서드 ++++++++++++++++++++++++++++++++++++
	public int getpower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getLevel() {
		return this.level;
	}

	public double getDefense() {
		return this.defense;
	}

	// setter ++++++++++++++++++++++++++++++++++++
	public void setPower(int power) {
		// 방어적 코드를 작성한다.
		if (power <= 0) {
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.power = power;
		}
	}

	public void setName(String name) {
		if (name.length() > 10) {
			System.out.println("잘못 입력 하였습니다.");
			System.out.println("이름은 10글자 이내로 입력 해주세요");
		} else {
			this.name = name;
		}

	}

	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.hp = hp;
		}

	}

	public void setLevel(int level) {
		if (level <= 0) {
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.level = level;
		}

	}

	public void setDefense(double defense) {
		if (defense < 0) {
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.defense = defense;
		}

	}

	// 기능+++++++++++++++++++++++++++++++++++++++++++++
	public void attack() {
		System.out.println("공격을 합니다");
	}

	public void beAttacked(int damage) {
		this.hp -= damage;
	}
}
