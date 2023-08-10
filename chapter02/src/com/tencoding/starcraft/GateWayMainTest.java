package com.tencoding.starcraft;

public class GateWayMainTest {
	public static void main(String[] args) {
		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();
		Zealot zealot1 = gateWay1.createZealot();
		Zealot zealot2 = gateWay2.createZealot();
		
		zealot1.showInfo();
		zealot2.showInfo();

	}// end of main

	// 연습문제
	// 게이트웨이 2개 이상 생성
	// 각각 질럿을 뽑아주세요
	// 최종 게이트웨이간에 뽑아낸 질럿 마리수를 합쳐주세요
	// 출력 하시오
} // end of class
