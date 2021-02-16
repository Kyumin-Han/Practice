package ch09Prac;

interface Employable {
	String getName();
	
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Employee implements Employable {
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name) == true) {
			throw new RuntimeException("이름을 반드시 입력하여야 함!");
		}
		
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		Employable employee1 = new Employee("홍길동");

	}

}
