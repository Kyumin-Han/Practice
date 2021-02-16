package prac4;

public class Test {
	String subject;
	int point;
	
	public void setPointNSubject(int point, String subject) {
		this.point = point;
		this.subject = subject;
	}
	
	public String getPoint() {
		return subject + ": " + point;
	}
}
