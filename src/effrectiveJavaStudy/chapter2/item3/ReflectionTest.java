package effrectiveJavaStudy.chapter2.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton instance = Singleton.ISTANCE;
		Class<?> cls = Singleton.class;
		Constructor<?> con = cls.getDeclaredConstructor();
		con.setAccessible(true);
		Singleton newInstance = (Singleton) con.newInstance();
		System.out.println(instance);
		System.out.println(newInstance);
		Singleton newInstance2 = (Singleton) cls.newInstance();
		System.out.println(newInstance2);
		
		
	}

}
