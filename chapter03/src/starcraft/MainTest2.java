package starcraft;

public class MainTest2 {

	public static void main(String[] args) {

		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아보세요
		// 실행도 시켜봅시다.

		Zealot zealot1 = new Zealot("딱딱이");
		Zergling zergling1 = new Zergling("저글링");
		Marine marine1 = new Marine("마린");
		Unit zealot2 = new Zealot("발업딱딱이");

		Unit[] arrayUnit1 = new Unit[10];
		arrayUnit1[0] = zealot1;
		arrayUnit1[1] = zergling1;
		arrayUnit1[2] = marine1;
		arrayUnit1[3] = zealot2;

		zealot1.attack(marine1);
		marine1.showInfo();

	}

}
