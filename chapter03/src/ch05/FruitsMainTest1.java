package ch05;

public class FruitsMainTest1 {

	public static void main(String[] args) {

		// 다형성
		// ! 용어 - 업캐스팅

		Fruits fruits1 = new Banana("델몬트", 2_000);
		Fruits fruits2 = new Peach("천도복숭아", 3_000);
		
		fruits1.showInfo();
		
		// 업캐스팅 된 상태에서는 컴파일 시점만 확인을 한다.
		// System.out.println(fruits1.origin);
		// ?? 컴파일 시점에 어떻게 origin 변수를 출력할까
		// 1단계 - 다운 캐스팅
		Banana banana1 = ((Banana)(fruits1));
		System.out.println(banana1.origin);
		
		// 2단계 - 다운 캐스팅
		String checkOrigin = ((Banana)(fruits1)).origin;

	} // end of main

} // end of class
