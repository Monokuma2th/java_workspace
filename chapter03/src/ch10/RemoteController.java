package ch10;

public interface RemoteController {
	
	// 인터페이스란?
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본설계도
	
	// 특징
	// 멤버 변수, 일반 구현 메서드를 가질 수 없다.
	// 오직 추상 메서드와 상수만을 멤버로 가질 수 있다.
	// 인터페이스는 표준, 약속(강제성), 규약을 의미한다
	// 추상 클래스보다 추상화가 더 높다. - 기능적인 측면으로 많이 활용
	
	public static final int SERIAL_NUMBER = 100; // 상수만 가질 수 있다.
	// public int number; 멤버 변수 사용 불가
	
	public abstract void turnOn(); // 추상 메서드만 가질 수 있다.
	// public void turnOff() {} 인스턴스 메서드를 가질 수 없다.
	
	// 인터페이스 안에 선언하는 기능은 전부 public abstract 이다.
	// 그러므로 public abstract 생략 가능 (컴파일러가 처리해줌)
	void turnOff();
	// 같은 이유로 public static final 생략
	int PHONENUMBER = 1235;

} // end of interface
