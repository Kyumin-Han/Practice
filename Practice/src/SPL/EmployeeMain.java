package SPL;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("��ö��", 35000);
		Employee e2 = new Employee("�ּ�ö", 50000);
		Employee e3 = new Employee("��öȣ", 20000);
		
		int n = Employee.getCount();
		System.out.println("������ ������ = " + n);
	}

}
