package ch12;

public class Television extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");

	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub

	}

}
