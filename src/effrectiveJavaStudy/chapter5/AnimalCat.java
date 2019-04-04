package effrectiveJavaStudy.chapter5;

class  AnimalCat extends Animal {
	public void go() {
		System.out.println("Cat");
	}

	@Override
	AnimalCat extexdClass() {
		return new AnimalCat();
	}
}
