package OOPv2;

public class Person {
	final private int MALE = 0;
	final private int FEMALE = 1;
	private String name;
	private String sid;
	private String phone;
	private String gender;
	private String dept;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;

	}

		
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setGender(int gender) {
		if(gender == FEMALE)
		{
			this.gender = "����";
		}
		else if(gender == MALE)
		{
			this.gender = "����";
		}
		else
		{
			System.out.println("�߸��� ���Դϴ�. 0:����, 1:����");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() < 2)
		{
			System.out.println("�̸��� 2�� �̻��̾�� �մϴ�.");
		}
		else
		{
			this.name = name;
		}
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("name: " + name + ", sid : " + sid + ", phone:" + phone + ", gender : " + gender + ", dept: " + dept);
	}

}
