package ex03;

import java.util.Scanner;

public class SubwayMainTest {

	public static void main(String[] args) {
		Subway train1 = new Subway();
		train1.subNum = 1;

		train1.totalMoney = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.println("손님 나이를 입력하세요");
			int age = sc.nextInt();
			if (age > 70) {
				train1.money = 0;
				train1.take();
			} else if (age > 20) {
				train1.money = 2100;
				train1.take();
			} else if (age > 15) {
				train1.money = 1500;
				train1.take();
			} else {
				train1.money = 0;
				train1.take();
			}
		}
		
		train1.SubwayInfo();

	}

}
