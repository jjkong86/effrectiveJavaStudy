package effrectiveJavaStudy.chapter5;

class AnimalDog extends Animal {
	public void go() {
		System.out.println("Dog");
	}

	@Override
	AnimalDog extexdClass() {
		return new AnimalDog();
	}
}
