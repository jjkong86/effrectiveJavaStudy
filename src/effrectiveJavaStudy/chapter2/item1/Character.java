package effrectiveJavaStudy.chapter2.item1;

class Character {

	/*
	 * 1. 이름을 가질 수 있다.
	 * 2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
	 * 3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
	 * 4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
	 * 5. 정적 팩토리 메소드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
	 * 
	 * 단점) 
	 * 1. 정적 팩토리만 제공하면 하위 클래스를 만들 수 없다.
	 * 2. 정적 팩토리 매소드는 프로그래머가 찾기 어렵다 -> 문서화 필요
	 * 
	 * 
	 * */
	
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
