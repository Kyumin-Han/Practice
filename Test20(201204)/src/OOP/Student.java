package OOP;

import java.util.Arrays;

public class Student {
	final public int FEMALE = 0;
	final public int MALE = 1;
	
	private String name;
	private String sid;
	private String phone;
	private String gender;
	private String dept;
	private int slevel;
	private int[] grades = new int[10];
	private int count = 0;
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public double add(double n1, double n2)
	{
		return n1+n2;
	}
	
	public void addGrade(int jumsu) {
		grades[count++] = jumsu;
	}
	
	public int getMaxGrade() {
		int max = -1;
		for(int i = 0; i < count; i++)
		{
			if(max < grades[i])
			{
				max = grades[i];
			}
		}
		
		return max;
	}
	
	public int getMinGrade() {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < count; i++)
		{
			if(min > grades[i])
			{
				min = grades[i];
			}
		}
		
		return min;
	}
	
	public double getAverage() {
		int sum = 0;
		
		for(int i = 0; i < count; i++)
		{
			sum += grades[i];
		}
		
		return (double)sum/count;
	}
	
	public int[] getGrades() {
//		return grades;
		int[] copy = Arrays.copyOf(grades, count);
		return copy;
	}
	
	public String getAllGrades() {
		String result = "[";
		
		for(int i = 0; i < count; i++)
		{
			result += grades[i] + " ";
		}
		
		result += "]";
		return result;
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		if(sid.length() != 7)
		{
			System.out.println("학번은 7자리이어야 합니다.");
			return;
		}
		
		if(isNumeric(sid) == true)
		{
			this.sid = sid;	
		}
		else 
		{
			System.out.println("학번은 숫자로만 구성되어야 합니다.");
		}
		
	}
	
	private boolean isNumeric(String sid) {
		
		for(int i = 0; i < sid.length(); i++)
		{
			char c = sid.charAt(i);
			if(c < '0' || c > '9')
			{
				return false;
			}
			
		}
		
		return true;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
			this.gender = "여자";
		}
		else if(gender == MALE)
		{
			this.gender = "남자";
		}
		else
		{
			System.out.println("잘못된 값입니다. 0:여자, 1:남자");
		}
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSlevel() {
		return slevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() < 2)
		{
			System.out.println("이름은 2자 이상이어야 합니다.");
		}
		else
		{
			this.name = name;
		}
	}
	
	public void study() {
		slevel++;
		System.out.println(name+"이(가) 공부를 합니다.");
	}
	
	public void play() {
		slevel--;
		System.out.println(name+"이(가) 놉니다.");
	}
}
