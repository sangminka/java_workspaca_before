package ch01;

public class Maintest_2 {

	// 메인 함수
	public static void main(String[] args) {

		// 메인 함수 안에 선언하는 변수는 -- 지역 변수

		Warrior w1; // 변수에 선언 --> 참조 타입
		// new 라는 키워드를 만나면 메모리에 올려둔다.
		// 메모리에 올라가면 프로그램 세상에 존재 하게 된다.

		w1 = new Warrior();
		w1.name = "작은 오크";
		w1.color = " 초록색";
		w1.height = 50;
		w1.damege = 100;

		Warrior w2;
		w2 = new Warrior();
		w2.name = "큰 오크";
		w2.color = "파란색";
		w2.height = 200;
		w2.damege = 500;

	}

}
