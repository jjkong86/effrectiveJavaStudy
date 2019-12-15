package effrectiveJavaStudy.chapter2.item3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiTest {
	public static void main(String[] args) {
		int num = 10;
		ExecutorService e = Executors.newFixedThreadPool(num);
		List<Run> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(new Run());
		}
		for (Run run : list) {
			e.execute(run);
		}
		e.shutdown();
	}
}
