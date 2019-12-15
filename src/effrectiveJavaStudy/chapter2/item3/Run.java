package effrectiveJavaStudy.chapter2.item3;

public class Run implements Runnable{
	@Override
	public void run() {
		System.out.println(SingleTonDCL.getInstance());
	}
}
