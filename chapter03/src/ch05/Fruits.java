package ch05;

public class Fruits {

	String name;
	int price;

	public Fruits(String name, int price) {

		this.name = name;
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}

}
