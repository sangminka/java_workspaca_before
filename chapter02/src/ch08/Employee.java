package ch08;

public class Employee {

	// 잠시 공간을 빌려서 코드를 작성한다.
	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee(String employeeName) {
		this.employeeName = employeeName;
		this.employeeId = serialNum;
		serialNum++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// serialNum 상태값을 반환하는 기능을 만들어보자.
	public static int getSerialNum() {
		// 고민! - 객체 메모리에 올라간 상태
		// serialNum++;
		//static 메서드안에서는 멤버 변수를 사용할 수 없다.
		return serialNum;
	}
	//1.멤버변수
	//2.지역변수
	//3.static 변수
	//결론 : 어느 메모리 위치에 있느냐에 따라 이름을 구분지어 말할 수 있다.
	
}
