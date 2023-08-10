package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {
		// static은 먼저 메모리에 올라가는 녀석이다
		// 클래스 이름으로 접근할 수 있다.
//		int number = Employee.serialNum;

		// 만약 객체가 생성되기 전에 serialNum이라는 값을 알고 싶다면 가능할까?
		System.out.println(Employee.getSerialNum());

		Employee employeeKim = new Employee("김길동");

//		employeeKim.setEmployeeId(1000);
		Employee employeeLee = new Employee("이순신");
//		employeeLee.setEmployeeId(1001);

		System.out.println(employeeKim.getEmployeeId());
		System.out.println(employeeLee.getEmployeeId());

		// 외부에서 static 변수에 접근해서 값을 변경할수 있는 상태이다.
		// Employee.serialNum = 100;
	}

}
