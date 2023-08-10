package com.tencoding.starcraft;

import java.util.Scanner;

public class StarCreaftGame1 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;

		Zealot zealot1 = new Zealot("질럿");
		Zealot zealot2 = new Zealot("발업 질럿");
		Marine marine1 = new Marine("마린");
		Marine marine2 = new Marine("스팀팩");
		Zergling zergling1 = new Zergling("저글링");
		Zergling zergling2 = new Zergling(" 발업 저글링");
//===============================================
		Zealot choZealot = new Zealot("선택 질럿");
		Marine choMarine = new Marine("선택 마린");
		Zergling choZergling = new Zergling("선택 저글링");
		//========================================
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택 하세요");
			System.err.println("1.질럿\t,2.마린\t,3.저글링\t, 4 종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {
				System.out.println("질럿 선택: 1번.질럿, 2.발업 질럿");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("질럿 선택");
					choZealot = zealot1;
				} else if (unitChoice == 2) {
					System.out.println("발업 질럿 선택");
					choZealot = zealot2;
				} else {
					System.out.println("잘못 선택하셨습니다.");
					break;
				}

				System.out.println("공격할 유닛을 선택 하세요");
				System.err.println("1.마린\t,2.저글링\t");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("공격할 마린을 선택하세요: 1. 마린 2. 스팀팩 ");
					unitChoice = sc.nextInt();

					if (unitChoice == 1) {
						System.out.println("마린 선택");
						choMarine = marine1;

					} else if (unitChoice == 2) {
						System.out.println("스팀팩 선택");
						choMarine = marine2;

					} else {
						System.out.println("잘못 입력하였습니다");
						break;
					}
					choZealot.attackMarine(choMarine);

				} else if (unitChoice == 2) {
					System.out.println("공격할 저글링을 선택하세요: 1.저글링 2. 발업 저글링");
					unitChoice = sc.nextInt();
					if (unitChoice == 1) {
						choZergling = zergling1;
					} else if (unitChoice == 2) {
						choZergling = zergling2;
					} else {
						System.out.println("잘못 입력하셧습니다.");
						break;
					}
					choZealot.attackZergling(choZergling);
				}

			} else if (unitChoice == MARINE) {
				System.out.println("마린 선택 :1번 마린 , 2.스팀팩");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("마린 선택");
					choMarine = marine1;
				} else if (unitChoice == 2) {
					System.out.println("스팀팩 선택");
					choMarine = marine2;
				} else {
					System.out.println("잘못 선택하셨습니다.");
					break;
				}

				System.out.println("공격할 유닛을 선택 하세요");
				System.err.println("1.질럿\t,2.저글링\t");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("공격할 질럿을 선택하세요: 1. 질럿 2. 발업 질럿 ");
					unitChoice = sc.nextInt();
					if (unitChoice == 1) {
						choZealot = zealot1;
					} else if (unitChoice == 2) {
						choZealot = zealot2;
					} else {
						System.out.println("잘못 입력하셧습니다.");
						break;
					}
					choMarine.attackZealot(choZealot);

				} else if (unitChoice == 2) {
					System.out.println("공격할 저글링을 선택하세요: 1.저글링 2. 발업 저글링");
					System.out.println("질럿 선택: 1번.저글링, 2.발업 저글링");
					unitChoice = sc.nextInt();
					if (unitChoice == 1) {
						System.out.println("저글링 선택");
						choZergling = zergling1;
					} else if (unitChoice == 2) {
						System.out.println("발업 저글링 선택");
						choZergling = zergling2;
					} else {
						System.out.println("잘못 선택하셨습니다.");
						break;
					}
					choMarine.attackZergling(choZergling);
				}
			} else if (unitChoice == ZERGLING) {
				System.out.println("저글링 선택1. 저글링 2. 발업 저글링");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("저글링 선택");
					choZergling = zergling1;
				} else if (unitChoice == 2) {
					System.out.println("발업 저글링 선택");
					choZergling = zergling2;
				} else {
					System.out.println("잘못 선택하셨습니다.");
					break;
				}

				System.out.println("공격할 유닛을 선택 하세요");
				System.err.println("1.질럿\t,2.마린\t");
				unitChoice = sc.nextInt();
				if (unitChoice == 1) {
					System.out.println("공격할 질럿을 선택하세요: 1. 질럿 2. 발업 질럿 ");
					unitChoice = sc.nextInt();
					if (unitChoice == 1) {
						System.out.println("질럿 선택");
						choZealot = zealot1;
					} else if (unitChoice == 2) {
						System.out.println("발업 질럿 선택");
						choZealot = zealot2;
					} else {
						System.out.println("잘못 선택하셨습니다.");
						break;
					}
					choZergling.attackZealot(choZealot);

				} else if (unitChoice == 2) {

					System.out.println("공격할 마린을 선택하세요: 1. 마린 2. 스팀팩 ");
					unitChoice = sc.nextInt();

					if (unitChoice == 1) {
						System.out.println("마린 선택");
						choMarine = marine1;

					} else if (unitChoice == 2) {
						System.out.println("스팀팩 선택");
						choMarine = marine2;

					} else {
						System.out.println("잘못 입력하였습니다");
						break;
					}
					choZergling.attackMarine(choMarine);

				}
			}
		} while (unitChoice != 4);

	}// end of main

}// end of class
