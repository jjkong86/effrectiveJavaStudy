package effrectiveJavaStudy.chapter2.item3;

public class Singlton {
	public static final Singlton ISTANCE = new Singlton();
	private Singlton() {
		
	}
	
	public void leaveTheBuilding() {
		
	}
	public static void main(String[] args) {
		Singlton singlton = Singlton.ISTANCE;
		Singlton singlton2 = Singlton.ISTANCE;
		
		System.out.println(singlton == singlton2);
	}
}
