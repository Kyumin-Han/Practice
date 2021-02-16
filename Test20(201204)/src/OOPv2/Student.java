package OOPv2;

import java.util.Arrays;

public class Student extends Person{
	private int slevel;
	private int[] grades = new int[10];
	private int count = 0;
	
	@Override
	public void print() {
		System.out.println("name: " + getName() + ", sid : " + getSid() + ", phone:" + getPhone() + ", gender : " + getGender() + ", dept: " + getDept() + ", average: " + getAverage());
	}
	
	@Override
	public void setSid(String sid) {
		if(sid.length() != 7)
		{
			System.out.println("학번은 7자리이어야 합니다.");
			return;
		}

		if(isNumeric(sid) == true)
		{
			super.setSid(sid);
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

	public void study() {
		slevel++;
		System.out.println(getName()+"이(가) 공부를 합니다.");
	}

	public void play() {
		slevel--;
		System.out.println(getName()+"이(가) 놉니다.");
	}

}
