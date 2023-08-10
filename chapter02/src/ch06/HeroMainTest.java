package ch06;

public class HeroMainTest {

	public static void main(String[] args) {
		Hero hero1 = new Hero("홍길동");
		hero1.setPower(100);
		hero1.setName("스파이더맨123456");
		hero1.setHp(300);
		hero1.setLevel(10);
		hero1.setDefense(73.5);

		int returnPower = hero1.getpower();
		String returnName = hero1.getName();
		int returnHp = hero1.getHp();
		int returnLevel = hero1.getLevel();
		double returnDefense = hero1.getDefense();

		System.out.println(returnPower);
		System.out.println(returnName);
		System.out.println(returnHp);
		System.out.println(returnLevel);
		System.out.println(returnDefense);

	}

}
