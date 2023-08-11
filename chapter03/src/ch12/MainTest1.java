package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		// 결론
		// 코드를 좀 더 유연하고 확장성 있게
		// 설계할 때 표준, 규약, 규칙을 지켜서 설계하고 싶다면
		// 인터페이스를 활용하자

		HomeAppliances appliances = new Television();
		HomeAppliances appliances2 = new Refrigerator();
		RemoteController controller1 = new Television();
		RemoteController controller2 = new Refrigerator();
		RemoteController controller3 = new ToyRobot();

		RemoteController[] remoteControllers = new RemoteController[3];

		remoteControllers[0] = new Television();
		remoteControllers[1] = new Refrigerator();
		remoteControllers[2] = new ToyRobot();

		System.out.println("-------------------------------");
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn();
		}

	}

}
