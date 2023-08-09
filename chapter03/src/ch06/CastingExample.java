package ch06;

public class CastingExample {

	public static void main(String[] args) {
		
		// 다형성, 업캐스팅(Upcasting)
		// 업캐스팅은 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것
		// 이 경우 데이터 손실이 없음
		// 업캐스팅은 자동으로 이루어지므로 별도의 형 변환 연산자가 필요없음
		
		Animal animal = new Bird();
		
		// 다운 캐스팅이란
		// 업캐스팅된 객체를 다시 원래의 하위클래스 타입으로 변환하는 것
		// 수동적으로 형 변환 연산자를 사용하여 이루어짐
		// 업캐스팅된 객체를 하위 클래스의 메서드나 속성을 사용하기 위해 필요함
		Bird bird = (Bird)animal;
		bird.fly();
		
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();
		
//		for (int i = 0; i < animals.length; i++) {
//			
//		}
//		
		// 0 -- Animal
		// 1 -- Bird -> if -> true
		// 2 -- Animal -> if -> false
		System.out.println("====================");
		
		
		for (Animal a : animals) {
			a.makeSound();
//			a.fly(); 데이터 타입을 확인하고 싶다면 instanceof 활용
			if(a instanceof Bird){
				Bird targetBird = (Bird)a;
				targetBird.fly();
			}
			System.out.println("----------------------");
		}
		
	} // end of main

} // end of class
