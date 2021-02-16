package SPL;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("±èÃ¶¼ö", 35000);
		Employee e2 = new Employee("ÃÖ¼öÃ¶", 50000);
		Employee e3 = new Employee("±èÃ¶È£", 20000);
		
		int n = Employee.getCount();
		System.out.println("ÇöÀçÀÇ Á÷¿ø¼ö = " + n);
	}

}
