package effrectiveJavaStudy.chapter2.item3;

public enum SingletonEnum {
	INSTANCE;

	public static void main(String[] args) {
		SingletonEnum s = SingletonEnum.INSTANCE;
		SingletonEnum s2 = SingletonEnum.INSTANCE;
		System.out.println(s == s2);
	}
}
