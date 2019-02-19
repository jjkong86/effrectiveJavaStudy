package effrectiveJavaStudy.chapter2.item1;

class Character {

    int intelligence, strength, hitPoint, magicPoint;

    public Character(int intelligence, int strength, int hitPoint, int magicPoint) {
        this.intelligence = intelligence;   // 지능
        this.strength = strength;           // 힘
        this.hitPoint = hitPoint;           // HP
        this.magicPoint = magicPoint;       // MP
    }

    // 정적 팩토리 메소드
    public static Character newWarrior() {
        return new Character(5, 15, 20, 3);     // 전사는 힘과 HP가 높다
    }

    // 정적 팩토리 메소드
    public static Character newMage() {
        return new Character(15, 5, 10, 15);    // 마법사는 지능과 MP가 높다
    }
    
    public static void main(String[] args) {
    	Character mage = new Character(15, 5, 10, 15);
    	Character mage1 = Character.newMage();
    	
    	Character warrior = new Character(5, 15, 20, 3);
		Character warrior1 = Character.newWarrior();
	}
}
