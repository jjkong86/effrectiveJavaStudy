package effrectiveJavaStudy.chapter2.item2;

import effrectiveJavaStudy.chapter2.item2.NyPizza.Size;
import effrectiveJavaStudy.chapter2.item2.Pizza.Topping;

public class Test {
	
	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addtopping(Topping.SAUSAGE).addtopping(Topping.ONION).build();
		System.out.println(pizza.toppings.size());
		Calzone calzone = new Calzone.Builder().addtopping(Topping.HAM).sauseInside().build();
		System.out.println(calzone.toppings.size());
		System.out.println(calzone.toppings.contains(Topping.HAM));
		
	}
}
