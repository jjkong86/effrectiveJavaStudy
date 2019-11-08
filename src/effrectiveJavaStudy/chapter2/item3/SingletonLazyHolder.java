package effrectiveJavaStudy.chapter2.item3;

/*
 * 객체가 필요할 때로 초기화를 미룸
 * SingletonLazyHolder는 LazyHolder의 INSTANCE 변수가 없기 때문에 클래스 로딩 시 LazyHolder를 초기화 하지 않는다.
 * getInstance method를 참조하는 순간 LazyHolder가 로딩되고 초기화되고 thread-safe함
 * */

public class SingletonLazyHolder {
	private SingletonLazyHolder() {
	}

	public static SingletonLazyHolder getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
	}
}
