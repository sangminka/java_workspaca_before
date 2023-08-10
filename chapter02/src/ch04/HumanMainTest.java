package ch04;

public class HumanMainTest {
	
	//메인함수
	public static void main(String[] args) {
		
		Human human1 = new Human("야스오");
		Human human2 = new Human("소나" , false);
		
		System.out.println("야스오 생성 완료");
		human1.height  = 178;
		human1.weight = 75.2;

	}//end of main

}//end of class
