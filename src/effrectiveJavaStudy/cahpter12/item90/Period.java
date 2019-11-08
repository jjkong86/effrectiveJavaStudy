package effrectiveJavaStudy.cahpter12.item90;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class Period implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date start;
	private Date end;

	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (start.compareTo(end) > 0) {
			throw new IllegalArgumentException(start + "가 " + end + "보다 늦다.");
		}
	}

	public Date getStart() {
		return new Date(start.getTime());
	}

	public Date getEnd() {
		return new Date(end.getTime());
	}

	private Object writeReplace() {
		return new SerializationProxy(this);
	}

	private void readObject(ObjectInputStream stream) throws InvalidObjectException {
		throw new InvalidObjectException("프록시가 필요합니다.");
	}

	@Override
	public String toString() {
		return start.toString() + "\n" + end.toString();
	}

	private static class SerializationProxy implements Serializable {
		private static final long serialVersionUID = 1L;

		private final Date start;
		private final Date end;

		SerializationProxy(Period p) {
			this.start = p.start;
			this.end = p.end;
		}

		private Object readReslove() {
			return new Period(start, end);
		}
	}
}
