package ch11;

public class Television extends HomeAppliances {

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");

	}

}
