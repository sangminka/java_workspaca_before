package ex02;

public class StudentMainTest {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.stuName = "철수";
		stu1.stuGender = "남자";
		stu1.stuSchool = "철철 고등학교";

		Student stu2 = new Student();
		stu2.stuName = "영희";
		stu2.stuGender = "여자";
		stu2.stuSchool = "영영 고등학교";

		stu1.goSchool();
		stu1.goToilet();
		stu1.showInfo();

		stu2.goSchool();
		stu2.goToilet();
		stu2.showInfo();
	}

}
