package effrectiveJavaStudy.cahpter12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ElvisTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		byte[] serializedMember;
		Elvis e = Elvis.I;
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				oos.writeObject(e);
				serializedMember = baos.toByteArray();
			}
		}
		try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
			try (ObjectInputStream ois = new ObjectInputStream(bais)) {
				Elvis objectMember = (Elvis) ois.readObject();
				Elvis es = ElvisStealer.staticE;
				System.out.println(objectMember);
				System.out.println(es);
			}
		}
		
//		ElvisStealer e2 = new ElvisStealer();
//		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
//			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
//				oos.writeObject(e2);
//				serializedMember = baos.toByteArray();
//			}
//		}
//		
//		try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
//			try (ObjectInputStream ois = new ObjectInputStream(bais)) {
//				ElvisStealer objectMember = (ElvisStealer) ois.readObject();
//				System.out.println(objectMember);
//			}
//		}
	}
}
