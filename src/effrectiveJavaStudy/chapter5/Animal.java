package effrectiveJavaStudy.chapter5;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	abstract void go();

	public static <T extends Animal> void doAction(List<T> animal) {
		animal.add((T) new AnimalCat());
		System.out.println(animal.size());
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
	}
}
