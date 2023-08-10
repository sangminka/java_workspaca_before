package ch07;

public class Company {
	// 속성, 기능, 생성자, this 3가지 용법을 설계 해주세요
	// showInfo()메서드도 추가 해주세여
	// 속성
	private String name;
	private int personnel;
	private String location;
	private int value;

	// 생성자
	public Company(String name, int personnel) {
		this.name = name;
		this.personnel = personnel;
	}

	public Company(String name, int personnel, String location) {
		this(name, personnel);
		this.location = location;

	}

	public Company(String name, int personnel, String location, int value) {
		this(name, personnel, location);
		this.value = value;
	}

	// 기능
	public Company getCompany() {
		return this;
	}

	public void showInfo() {
		System.out.println("회사명 : " + name);
		System.out.println("사원수 : " + personnel);
		System.out.println("위치 : " + location);
		System.out.println("시장 가치  : " + value);
	}

}
