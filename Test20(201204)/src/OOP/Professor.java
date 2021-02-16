package OOP;

import java.util.Arrays;

public class Professor {
	private String name;
	private String sid;
	private String dept;
	private String phone;
	private String[] lectures = new String[5];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String[] getLectures() {
		return lectures;
	}
	public void setLectures(String[] lectures) {
		for(int i = 0; i < lectures.length && i < 5; i++)
		{
			this.lectures[i] = lectures[i];
		}
	}
	
	public void print() {
		System.out.println("name : " + name + ", sid : " + sid + ", phone : " + phone + 
				 ", lectures: " + Arrays.toString(lectures));
	}
	
	
}
