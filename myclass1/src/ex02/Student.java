package ex02;

public class Student {

	int StudentAge;
	String stuName;
	String stuGender;
	String stuSchool;

	public void goSchool() {
		System.out.println(stuName + "학생이  " + stuSchool + " 를 갑니다.");
	}

	public void goToilet() {
		System.out.println(stuGender + "화장실을 갑니다.");
	}

	public void showInfo(){
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("학생에 이름:" + stuName);
		System.out.println("학생에 성별:" + stuGender);
		System.out.println("학생에 학교:" + stuSchool);
		System.out.println("++++++++++++++++++++++++++");
		
	}


	

}
