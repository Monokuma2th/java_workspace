package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
		
		
		Animal animal = new Bird();
		
		
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
