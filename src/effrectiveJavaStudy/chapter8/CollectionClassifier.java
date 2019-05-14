package effrectiveJavaStudy.chapter8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
	public static String classify(Set<?> s) {
		return "set";
	}
	
	public static String classify(List<?> lst) {
		return "list";
	}
	
	public static String classify(Collection<?> c) {
		return c instanceof Set ? "set" : c instanceof List ? "list" : "etc";
	}
	
	public static void main(String[] args) {
		Collection<?>[] collections = {new HashSet<String>(), 
				new ArrayList<BigInteger>(), 
				new HashMap<String, String>().values()};
		for (Collection<?> c : collections) {
			if (c instanceof Collection) {
				System.out.println("Collection");
			}
			System.out.println(classify(c));
		}
	}
}
