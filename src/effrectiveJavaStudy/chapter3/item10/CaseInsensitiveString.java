package effrectiveJavaStudy.chapter3.item10;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.Test;

public final class CaseInsensitiveString {
	private final String s;
	
	public CaseInsensitiveString(String s) {
		this.s = Objects.requireNonNull(s);
	}
	
	@Override
	public boolean equals(Object o) {
		
		/* 대칭성 위배
		 * if (o instanceof CaseInsensitiveString) {
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		}
		if (o instanceof String) {
			return s.equalsIgnoreCase((String) o);
		}
		*/
		
		return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
	}
	
	public static class TestClass {
		
		@Test
		public void equalsTest() {
			CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
			CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
			String s = "Polish";
			System.out.println(cis.equals(s)); // true -> false
			System.out.println(s.equals(cis)); // false
			System.out.println(cis.equals(cis2)); // true
			
			List<CaseInsensitiveString> list = new ArrayList<>();
			list.add(cis);
			System.out.println(list.contains(s)); // false
			
		}
	}
}
