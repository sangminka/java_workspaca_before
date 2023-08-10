package com.tencoding.starcraft;

import java.util.Scanner;

public class StarCreaftGame_1_1 {

	// 문법 모양
	public static Zealot choiceZealot() {
		Zealot zealot1 = new Zealot("질럿");
		Zealot zealot2 = new Zealot("발업 질럿");
		Zealot choZealot = new Zealot("선택 질럿");

		Scanner sc = new Scanner(System.in);

		System.out.println("질럿 선택: 1번.[질럿], 2.[발업 질럿]");
		int unitChoice = sc.nextInt();

		if (unitChoice == 1) {
			System.out.println("[질럿] 선택");
			choZealot = zealot1;
		} else if (unitChoice == 2) {
			System.out.println("[발업 질럿] 선택");
			choZealot = zealot2;
		}

		return choZealot;
	}// 질럿 선택 함수

	public static Marine choiceMarine() {
		Marine marine1 = new Marine("마린");
		Marine marine2 = new Marine("스팀팩");
		Marine choMarine = new Marine("선택 마린");

		Scanner sc = new Scanner(System.in);
		System.out.println("마린 선택 :1번 마린 , 2.스팀팩");
		int unitChoice = sc.nextInt();
		if (unitChoice == 1) {
			System.out.println("마린 선택");
			choMarine = marine1;
		} else if (unitChoice == 2) {
			System.out.println("스팀팩 선택");
			choMarine = marine2;
		}

		return choMarine;
	}// 마린 선택 함수

	public static Zergling choiceZergling() {
		Zergling zergling1 = new Zergling("저글링");
		Zergling zergling2 = new Zergling(" 발업 저글링");
		Zergling choZergling = new Zergling("선택 저글링");

		Scanner sc = new Scanner(System.in);
		System.out.println("저글링 선택1. 저글링 2. 발업 저글링");
		int unitChoice = sc.nextInt();
		if (unitChoice == 1) {
			System.out.println("저글링 선택");
			choZergling = zergling1;
		} else if (unitChoice == 2) {
			System.out.println("발업 저글링 선택");
			choZergling = zergling2;
		}

		return choZergling;
	}// 저글링 선택 함수

	// main 시작
	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;

		Scanner sc = new Scanner(System.in);
		int unitChoice = 0;
		// 1. 종족 선택
		// 2. 공격할 종족 선택
		// 3/ 종족 종류 선택
		while(unitChoice !=GAME_END ) {
			System.out.println("사용할 유닛을 선택해주세요");
			System.err.println("1.질럿\t,2.마린\t,3.저글링\t, 4 종료");
			unitChoice = sc.nextInt();
			//질럿
			if(unitChoice == ZEALOT) {			
				Zealot selZealot = choiceZealot();
				System.out.println("공격할 유닛을 선택해 주세요: 1번 마린 2번 저글링");
				unitChoice = sc.nextInt();
				if(unitChoice ==1) {
					Marine selMarine = choiceMarine();	
					selZealot.attackMarine(selMarine);
				}else if(unitChoice ==2 ){
					Zergling selZelgling = choiceZergling();
					selZealot.attackZergling(selZelgling);
				}
				
			//마린
			}else if(unitChoice == MARINE) {
			Marine selMarine = choiceMarine();	
			System.out.println("공격할 유닛을 선택해 주세요: 1번 질럿 2번 저글링");
			unitChoice = sc.nextInt();
			if(unitChoice ==1) {
				Zealot selZealot = choiceZealot();	
				selMarine.attackZealot(selZealot);
			}else if(unitChoice ==2 ){
				Zergling selZergling = choiceZergling();
				selMarine.attackZergling(selZergling);
			}
			////////////저글링
			}else if(unitChoice == ZERGLING) {		
			Zergling selZergling = choiceZergling();
			System.out.println("공격할 유닛을 선택해 주세요: 1번 마린 2번 질럿");
			unitChoice = sc.nextInt();
			if(unitChoice ==1) {
				Marine selMarine = choiceMarine();	
				selZergling.attackMarine(selMarine);
			}else if(unitChoice ==2 ){
				Zealot selZealot = choiceZealot();
				selZergling.attackZealot(selZealot);
			}
			// 잘못입력
			}else {
				System.out.println("잘못 입력 하였습니다.");
			}
			
		} 

	}// end of main

}// end of class
