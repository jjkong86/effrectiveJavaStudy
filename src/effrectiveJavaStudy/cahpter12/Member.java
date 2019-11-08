package effrectiveJavaStudy.cahpter12;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name = "jj";
    private String email;
//    public transient String hp;
    String temp;
    String str;
    
    public Member() {}
    
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter 생략

    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s'}", name, email);
    }
}
