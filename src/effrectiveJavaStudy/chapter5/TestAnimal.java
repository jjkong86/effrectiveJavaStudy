package effrectiveJavaStudy.chapter5;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
	public static void main(String[] args) {
		List<AnimalDog> animals = new ArrayList<>();
		animals.add(new AnimalDog());
		animals.add(new AnimalDog());
//		animals.add(new AnimalCat()); // error
		Animal.doAction(animals);
		
		System.out.println("====================");
		List<Animal> animals2 = new ArrayList<>();
		animals2.add(new AnimalCat());
		Animal.doAction(animals2);
	}
}
