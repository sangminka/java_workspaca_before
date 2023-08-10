package ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		Student student1 = new Student("김동현", "MMA");
		Student student2= new Student("박지성" ," 축구");
		Student student3 = new Student("김연아" , "피겨");
		
		student1.takeStudentId();
		student2.takeStudentId();
		student3.takeStudentId();

	}

}
