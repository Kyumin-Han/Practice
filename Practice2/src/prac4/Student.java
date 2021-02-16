package prac4;

public class Student {
	int sid;
	String name;
	int subNum;
	Test[] test;
	
	public Student(int sid, String name, int subNum)
	{
		this.sid = sid;
		this.name = name;
		this.subNum = subNum;
		
		test = new Test[subNum];
		for(int i = 0; i < test.length; i++)
		{
			test[i] = new Test();
		}
	}
	
	public String getName() {
		return sid + ": " + name;
	}
	
	public int getGrade() {
		int sum = 0;
		
		for(int i = 0; i < test.length; i++)
		{
			sum += test[i].point;
		}
		
		return sum;
	}
	
	public int getGrade(int a) {
		int base = 100 * subNum / a;
		int rank = getGrade() / base + 1;
		return rank;
	}
	
	public void printScroe() {
		System.out.println(getName());
		
		for(int i = 0; i < subNum; i++)
		{
			System.out.println(test[i].getPoint());
		}
		
		System.out.println();
		
		System.out.println("총점 " + getGrade());
		int rank = 5;
		
		System.out.println(rank + "단계평가 " + getGrade(rank));
		System.out.println();
	}
}
