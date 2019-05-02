package effrectiveJavaStudy.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SortToLanbda {
	
	@Test
	public void sortToComparator() {
		List<String> words = new ArrayList<>();
		words.add("str");
		words.add("2");
		words.add("str22");
		words.add("str2");
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			};
		});
		System.out.println(words.toString());
	}
	@Test
	public void sortToLambda() {
		List<String> words = new ArrayList<>();
		words.add("str");
		words.add("2");
		words.add("str22");
		words.add("str2");
		Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
		System.out.println(words.toString());
	}
	
	public static void main(String[] args) {
		
	}
}
