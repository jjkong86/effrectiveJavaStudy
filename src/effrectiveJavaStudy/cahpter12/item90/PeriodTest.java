package effrectiveJavaStudy.cahpter12.item90;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class PeriodTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		
		byte[] serializedMember;
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				System.out.println(p.toString());
				oos.writeObject(p);
				serializedMember = baos.toByteArray();
			}
		}
		
		try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
			try (ObjectInputStream ois = new ObjectInputStream(bais)) {
				Period objectMember = (Period) ois.readObject();
				System.out.println(objectMember);
			}
		}
	}
}
