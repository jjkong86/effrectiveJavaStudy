package effrectiveJavaStudy.cahpter12.item90;

import java.io.Serializable;
import java.util.Date;

public class PeriodNotSafe implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date start;
	private Date end;

	public PeriodNotSafe(Date start, Date end) {
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

	@Override
	public String toString() {
		return start.toString() + "\n" + end.toString();
	}
}
