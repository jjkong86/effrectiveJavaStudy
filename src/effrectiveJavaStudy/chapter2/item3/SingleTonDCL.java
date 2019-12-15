package effrectiveJavaStudy.chapter2.item3;

public class SingleTonDCL {
	private volatile static SingleTonDCL INSTANCE;

	private SingleTonDCL() {}

	public static SingleTonDCL getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingleTonDCL();
		}
		return INSTANCE;
	}
}
