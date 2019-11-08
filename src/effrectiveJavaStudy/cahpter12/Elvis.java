package effrectiveJavaStudy.cahpter12;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable{
	public static final Elvis I = new Elvis();
	private Elvis() {}
	private String[] array = new String[] {"Elvis", "Elvis"};

	public void print() {
		System.out.println("Elvis");
	}
	
	private Object readResolve() {
		return I;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
