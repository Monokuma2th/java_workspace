package GotchaMachine;

import java.util.Random;

public class GotchaMain {

	public static void main(String[] args) {

		Gotcha[] gotcha1 = new Gotcha[5];

		gotcha1[0] = new TeddyBear("곰인형1");
		gotcha1[1] = new CellPhone("핸드폰1");
		gotcha1[2] = new Liqour("양주1");

		Random ran = new Random();
		int selected = ran.nextInt(4);

		if (gotcha1[selected] != null) {
			gotcha1[selected].showInfo();
			if (gotcha1[selected] instanceof TeddyBear) {
				String checkKind = ((TeddyBear) (gotcha1[selected])).kind;
				System.out.println("종류 : " + checkKind);
			} else if (gotcha1[selected] instanceof CellPhone) {
				String checkKind = ((CellPhone) (gotcha1[selected])).kind;
				System.out.println("종류 : " + checkKind);
			}
			if (gotcha1[selected] instanceof Liqour) {
				String checkKind = ((Liqour) (gotcha1[selected])).kind;
				System.out.println("종류 : " + checkKind);
				System.out.println("신분증을 제시하십시오");
			}

		} else {
			System.out.println("꽝");
		}

//		for (int i = 0; i < gotcha1.length; i++) {
//			if (gotcha1[i] != null) {
//				gotcha1[i].showInfo();
//				if (gotcha1[i] instanceof TeddyBear) {
//					String checkKind = ((TeddyBear)(gotcha1[i])).kind;
//					System.out.println("종류 : " + checkKind);
//				} else if(gotcha1[i] instanceof CellPhone) {
//					String checkKind = ((CellPhone)(gotcha1[i])).kind;
//					System.out.println("종류 : " + checkKind);
//				} if(gotcha1[i] instanceof Liqour) {
//					String checkKind = ((Liqour)(gotcha1[i])).kind;
//					System.out.println("종류 : " + checkKind);
//					System.out.println("신분증을 제시하십시오");
//				}
//
//			}
//		}

	} // end of main

} // end of class
