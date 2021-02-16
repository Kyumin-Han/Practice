package SPL2;

public class Manager extends Employee {
	private int bonus;

	public Manager() {
		this("홍길동", "대구", 200, -1, 0);
	}
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn); 
		// 부모 클래스의 생성자 호출한다
		this.bonus = bonus;
	}
	
	void test() {
		System.out.println("name= " + name); // public String name
		System.out.println("address= " + address); // String name
		System.out.println("salary= " + salary); // protected int salary
//		System.out.println("rrn= " + rrn); // private int rrn
	}

	@Override
	public String toString() {
		return super.toString() + ", Manager [bonus=" + bonus + "]";
	}
	
	
	
	
}
