package SPL2;

public class Manager extends Employee {
	private int bonus;

	public Manager() {
		this("ȫ�浿", "�뱸", 200, -1, 0);
	}
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn); 
		// �θ� Ŭ������ ������ ȣ���Ѵ�
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
