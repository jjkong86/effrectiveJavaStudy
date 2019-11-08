package effrectiveJavaStudy.cahpter12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Base64;


public class MemberTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchFieldException, SecurityException {
		byte[] serializedMember;
//		Member member = new Member();
		Member member = new Member("정재공", "jj@naver.com");
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				System.out.println(member.toString());
				oos.writeObject(member);
				serializedMember = baos.toByteArray();
			}
		}
		// 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
		 System.out.println(Base64.getEncoder().encodeToString(serializedMember));
		 serializedMember = new byte[] {-84, -19, 0, 5, 115, 114, 0, 36, 101, 102, 102, 114, 101, 99, 116, 105, 118, 101, 74, 97, 118, 97, 83, 116, 117, 100, 121, 46, 99, 97, 104, 112, 116, 101, 114, 49, 50, 46, 77, 101, 109, 98, 101, 114, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 2, 76, 0, 5, 101, 109, 97, 105, 108, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 76, 0, 4, 110, 97, 109, 101, 113, 0, 126, 0, 1, 120, 112, 116, 0, 12, 106, 106, 64, 110, 97, 118, 101, 114, 46, 99, 111, 109, 116, 0, 9, -20, -96, -107, -20, -98, -84, -22, -77, -75};
		try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
			try (ObjectInputStream ois = new ObjectInputStream(bais)) {
				// 역직렬화된 Member 객체를 읽어온다.
				Member objectMember = (Member) ois.readObject();
//				objectMember.hp = "010";
				System.out.println(objectMember);
			}
		}
		Class<?> cls = member.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getName().equals("hp")) {
				field.set(member, "010");
			}
			print(field, member);
		}
	}
	
	public static <C> void print(Field field, C clazz) throws IllegalArgumentException, IllegalAccessException {
		System.out.println(field.getName()+" : "+field.get(clazz));
	}
}
