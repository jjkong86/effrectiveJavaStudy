package effrectiveJavaStudy.chapter5;

import java.util.List;

public class ProducerExtendsAndConsumerSuper {
	
	public static class MyClass{}
	
	
	// Producer-extends는 읽기만 가능하고 Consumer-super는 쓰기만 가능함
	/*
	 * ex)
	 * copy(src, dest)
	 * src는 데이터를 복사할 데이터를 제공하므로(생산) In 인자가 되고 
	 * dest는 다른 곳에서 사용할 데이터를 받아들이므로(소비) Out 인자가 됨
	 * In의 경우 extends 키워드를 사용하고 Out의 경우는 super를 사용
	 * */
	public void doSomething1(List<? extends MyClass> list) {
		for (MyClass e : list) { // Ok
			System.out.println(e);
		}
	}

	public void doSomething2(List<? extends MyClass> list) {
//		list.add(new MyClass()); // Compile Error
	}

	public void doSomething3(List<? super MyClass> list) {
//		for (MyClass e : list) { // Compile Error
//			System.out.println(e);
//		}
	}

	public void doSomething4(List<? super MyClass> list) {
		list.add(new MyClass()); // Ok
	}
}
