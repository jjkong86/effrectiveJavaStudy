package effrectiveJavaStudy.chapter5;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal<T> {
	abstract T extexdClass();
	abstract void go();
	public static <T extends Animal<? extends T>> void doAction(List<T> animal) {
		animal.add((T) new AnimalCat()); // 제네릭(Generics)은 항상 형 안정성을 제공하는 것이 아니다. 컴파일 시점에만 제공하고, 런타임 시점에는 형 안정성을 제공하지 못한다.
		for (T t : animal) {
			t.go();
		}
	}

	public static void main(String[] args) {
		List<AnimalDog> animals = new ArrayList<>();
		animals.add(new AnimalDog());
		animals.add(new AnimalDog());
		// animals.add(new AnimalCat()); // error
		Animal.doAction(animals);

		System.out.println("====================");
		List<Animal> animals2 = new ArrayList<>();
		animals2.add(new AnimalDog());
		animals2.add(new AnimalCat());
		Animal.doAction(animals2);
		
		System.out.println("====================");
		List<AnimalCat> animals3 = new ArrayList<>();
		animals3.add(new AnimalCat());
		Animal.doAction(animals3);
		
	}
}
