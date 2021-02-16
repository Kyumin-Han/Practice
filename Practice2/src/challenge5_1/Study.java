package challenge5_1;

public class Study {
	private String subName;
	private String teacher;
	
	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public void printmsg() {
		System.out.println("과목 이름 : " + subName + "\n과목 담임 : " + teacher);
	}
}
