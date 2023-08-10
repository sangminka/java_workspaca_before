package ch04;

import java.util.Scanner;

public class Maintest_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너 도구 준비 완료
		
		System.out.print(" 성적을 입력해 주세요:");
		//문제1 스캐너를 사용해서 성적을 입력받아주세요
		//문제2 만약 90점 이상이면 A 출력
		//문제3 만약 80점 이상이면 B 출력
		//문제4 만약 70점 이상이면 C 출력
		//문제5 만약 70점 이하면 F 출력		
		
		//R value --> 정수값을 키보드에서 입력 받는다. (연산)
		int score = 99;
		if(score >= 90) {
			System.out.println("당신에 학점은 A 입니다.");
		}else if(score >= 80) {
			System.out.println("당신에 학점은 B 입니다.");
		}else if(score >= 70) {
			System.out.println("당신에 학점은 C 입니다.");
		}else {
			System.out.println("당신에 학점은 F 입니다.");
		}

		
	}//end of main

}//end of class
