package effrectiveJavaStudy.cahpter12;

import java.io.Serializable;

public class User implements Serializable {
    private final static long serialVersionUID = 1L;
    private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}