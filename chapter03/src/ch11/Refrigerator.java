package ch11;

public class Refrigerator extends HomeAppliances {

	@Override
	public void turnOn() {
		System.out.println("냉장고의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("냉장고의 전원을 끕니다.");

	}

}
