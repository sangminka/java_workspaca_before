package ch07;

public class CompanyMainTsst {

	public static void main(String[] args) {
		Company company1 = new Company("다우", 300, "서울", 20);

		company1.showInfo();
		Company compnay2 = company1.getCompany();
		
	}// end of main

}// end of class
