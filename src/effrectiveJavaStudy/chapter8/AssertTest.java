package effrectiveJavaStudy.chapter8;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Objects;

import org.junit.Test;

public class AssertTest {
	public static boolean assertTest(String[] str) {
		String a = str[0];
		assert a != null;
		String b = str[1];
		assert b != null;
		String c = str[2];
		assert Objects.requireNonNull(c) != "";
		
		return true;
	}
	
	public static class TestClass {
		
		@Test
		public void test1() {
			assertThat(true, is(assertTest(new String[] {"a", "b", ""})));
		}
	}
}
