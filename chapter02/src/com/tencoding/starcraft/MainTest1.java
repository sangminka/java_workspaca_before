package com.tencoding.starcraft;

public class MainTest1 {

	public static void main(String[] args) {
		
		//질럿 10개를 배열에다가 담고 기능을 호출해서 사용해 보시오
		//마린 10개
		//저글링 10개
		
		Zealot[] arrZealots = new Zealot[10];
		Marine[] arrMarine = new Marine[10];
		Zergling [] arrZergling  = new Zergling[10];
		
		
		for(int i = 0; i < arrZealots.length; i++) {
			arrZealots[i] = new Zealot("질럿" + i  + "번" );
			arrMarine[i] = new Marine("마린" + i  + "번" );
			arrZergling[i] = new Zergling("저글링" + i  + "번" );
			
		}
		for(int i = 0; i < arrZealots.length; i++) {
			arrZealots[i].showInfo();
			
		}

	}//end of main

}//end of class
