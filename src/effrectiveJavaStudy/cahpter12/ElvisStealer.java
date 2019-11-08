package effrectiveJavaStudy.cahpter12;

import java.io.Serializable;

public class ElvisStealer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Elvis staticE;
	private Elvis instance;
	
	private Object readResolve() {
		staticE = instance;
		return new String[] {"ElvisStealer", "ElvisStealer"};
	}
	
}
