package effrectiveJavaStudy.chapter2.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

	/*
	 * 빌더 패턴
	 *  - 필수 매개변수만으로 생성자(혹은 정적 팩토리)를 호출해 빌더 객체를 얻음
	 *  - 그런 다음 빌더 객체가 제공하는 일종의 세터 메소드들로 원하는 선택 매개변수들을 설정
	 *  - 매개변수가 없는 build 매소드를 호출해 필요한 객체(보통 불변)를 얻는다. 
	 * */

public abstract class Pizza {
	public enum Topping {HAM, MUSHROOM, ONION, PERPPER, SAUSAGE}
	final Set<Topping> toppings;
	
	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		public T addtopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		
		abstract Pizza build();
		
		protected abstract T self();
	}
	
	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}
}
