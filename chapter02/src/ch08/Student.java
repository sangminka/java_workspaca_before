package ch08;

public class Student {
	private static int studentId;
	private String name;
	private String major;
	
	
	
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	public void takeStudentId() {
		System.out.println("당신을 학번은 " + studentId + "입니다.");
		studentId++;
		
	}
	public void showInfo() {
		System.out.println("이름 : " +  name);
		System.out.println("학번 : " +  studentId);
		System.out.println("전공 : " +  major);
		
	}
		
	
}
