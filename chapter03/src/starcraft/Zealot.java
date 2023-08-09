package starcraft;

public class Zealot extends Unit {

	public Zealot(String name) {
		super(name);
		super.power = 5; 
		super.hp = 80;
	}
	// getter, setter - 부모에서 생성 함 
	
	// 기능 --> 메서드 오버로딩 활용하기  
	public void attack(Marine marine) {
		marine.beAttacked(power);
		System.out.println(name + "가 " + marine.getName() + "을 공격 합니다");
	}
	
	public void attack(Zergling zergling) {
		zergling.beAttacked(power);
		System.out.println(name + "가 " + zergling.getName() + "을 공격 합니다.");
	}
	
}