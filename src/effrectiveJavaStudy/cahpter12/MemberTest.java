package effrectiveJavaStudy.cahpter12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class MemberTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		byte[] serializedMember;
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				Member member = new Member("김배민", "deliverykim@baemin.com", 25);
				System.out.println(member.toString());
				oos.writeObject(member);
				// serializedMember -> 직렬화된 member 객체
				serializedMember = baos.toByteArray();
			}
		}
		// 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
//		System.out.println(Base64.getEncoder().encodeToString(serializedMember));
		
		try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
	        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
	            // 역직렬화된 Member 객체를 읽어온다.
	            Object objectMember = ois.readObject();
	            Member member = (Member) objectMember;
	            System.out.println(member);
	        }
	    }
	}
}
