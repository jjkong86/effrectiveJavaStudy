# Singleton

### 싱글톤

* 일반적으로 하나의 인스턴스만 존재해야 할 경우 Singleton 패턴을 사용하게 된다.

### 일반적인 싱글톤 패턴

	public class Singleton {
		public static final Singleton INSTANCE = new Singleton();
		private Singleton() {}
	}
	
* reflection을 사용하여 생성자를 호출 할 수 있기 때문에 공격을 방어하려면 생성자를 수정하여 두 번째 객체가 생성되려 할 때 예외를 던지게 해야한다.
* 직렬화를 제공할 경우 모든 인스턴스 필드를 일시적(transient)이라고 선언하고 readResolve 메서드를 제공해야 한다.

	private Object readReslove() {
		return INSTANCE
	}

* Single Thread 환경에서는 문제가 없지만 Multi Thread 환경에서 Singleton 객체에 접근 시 초기화 관련하여 문제가 있다. 
()
단순히 synchronized 키워드만 추가해도 무방하지만 효율적이지 않다.

### Double Checked Locking

* DCL은 현재 broken 이디엄이고 사용을 권고 하지 않는다.

	public class SingleTonDCL {
		private volatile static SingleTonDCL INSTANCE;
	
		private SingleTonDCL() {}
	
		public static SingleTonDCL getInstance() {
			if (INSTANCE == null) {
				synchronized (SingleTonDCL.class) {
					if (INSTANCE == null) {
						INSTANCE = new SingleTonDCL();
					}
				}
			}
			return INSTANCE;
		}
	}
	
* 인스턴스가 null일 경우 동기화 블럭에 진입 하기 때문에 단순 동기화보다 효율적이다.
* Thread A와 Thread B가 있다고 하고 Thread A가 생얼을 완료 하기전에 메모리 공간에 instance를 할당 중일 때 Thread B가 instance를 사용하려고 하면 오작동 발생 가능하다.