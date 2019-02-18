package effrectiveJavaStudy.chapter2.item3;

public class Singlton2 {
	private static final Singlton2 INSTANCE = new Singlton2();
	private Singlton2() {}
	public static Singlton2 getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		Singlton2 sg = Singlton2.getInstance();
		Singlton2 sg2 = Singlton2.getInstance();
		System.out.println(sg == sg2);
	}
}
