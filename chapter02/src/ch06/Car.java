package ch06;

public class Car {
	private String carName;
	private int price;
	private int makeYear;

	// set ------------------------------
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setPrice(int price) {
		if(price < 0) {
			System.out.println("잘못 입력 하였습니다.");
		}else {
			this.price = price;
		}
		 
	}

	public void setMakeYear(int makeYear) {
		if (makeYear <1900 || makeYear >2023 ) {
			System.out.println("잘못 입력 하였습니다.");
		}else {
			this.makeYear = makeYear;
		}
		
	}

	// get -------------------------------
	public String getCarName() {
		return this.carName;
	}

	public int getPrice() {
		return this.price;
	}

	public int getMakeYear() {
		return this.makeYear;
	}

	// 기능 -----------------------------

	public void showInfo() {
		System.out.println("==========================");
		System.out.println("자동차 이름 : " + carName);
		System.out.println("자동차 가격 : " + price);
		System.out.println("제조년도 : " + makeYear);
	}

}
