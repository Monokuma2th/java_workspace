package ch01;

public class Hero {
	
	String name;
	int hp;
	int mana;
	int atk;
	int am;
	
	
	public static void main(String[] args) {
		Warrior war1 = new Warrior();
		war1.name = "가로쉬";
		war1.hp = 35;
		war1.mana = 5;
		war1.atk = 4;
		war1.am = 20;
		war1.warriorSkill1 = "방패 밀쳐내기";
		war1.warriorSkill2 = "방패 올리기";
		war1.warriorSkill3 = "난투";
		
		Archer arc1 = new Archer();
		arc1.name = "렉사르";
		arc1.hp = 30;
		arc1.mana = 7;
		arc1.atk = 6;
		arc1.am = 0;
		arc1.archerSkill1 = "신비한 화살";
		arc1.archerSkill2 = "추적";
		arc1.archerSkill3 = "속사";
		
		Mage mag1 = new Mage();
		mag1.name = "제이나";
		mag1.hp = 30;
		mag1.mana = 9;
		mag1.atk = 1;
		mag1.am = 8;
		mag1.mageSkill1 = "비전 화살";
		mag1.mageSkill2 = "반향";
		mag1.mageSkill3 = "미제 사건";
		
		
	}

}

class Warrior extends Hero {
	
	String warriorSkill1;
	String warriorSkill2;
	String warriorSkill3;
	
}

class Archer extends Hero {
	
	String archerSkill1;
	String archerSkill2;
	String archerSkill3;
	
}

class Mage extends Hero {
	
	String mageSkill1;
	String mageSkill2;
	String mageSkill3;
	
}