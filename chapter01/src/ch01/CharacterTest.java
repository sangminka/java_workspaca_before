package ch01;

public class CharacterTest {
	public static void main(String[]args) {
		
		char ch1 = '가';
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println((int)'가');
	//문재
		//대문자 A는 정수값 얼마 인지 출력하시오
		System.out.println((int)'A');
		
		//소문자 a는 정수값 얼마 인지 출력하시오
		System.out.println((int)'a');
		
		//주의 char 데이터 타입에는 음수값을 대입 할 수 없다.(양수만 사용)
		char ch2 = 97;
		System.out.println(ch2);
		
		//문제2
		//개발자 라는 단어는 한글자 한글자 정수값 얼마,얼마,얼마 알아보자
		System.out.println((int)'개');
		System.out.println((int)'발');
		System.out.println((int)'자');
		
		System.out.println((int)'사');
		System.out.println((int)'랑');
		System.out.println((int)'해');
		
		
	}
}
