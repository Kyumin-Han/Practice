package OOPv2;

public class Main2 {
	
//	private static void nameNphoneOnly(Student std) {
//		System.out.println("�̸��� " + std.getName() +"�̰� ��ȭ��ȣ�� " + std.getPhone() + "�Դϴ�.");
//	}
//	
//	// method overloading
//	// ���� �̸��� �޼ҵ忩�� ������ ����, Ÿ���� �ٸ��� �����Ͽ� ����� �� �ִ�
//	private static void nameNphoneOnly(Professor p) {
//		System.out.println("�̸��� " + p.getName() +"�̰� ��ȭ��ȣ�� " + p.getPhone() + "�Դϴ�.");
//	}
	
	private static void nameNphoneOnly(Person p) {
		System.out.println("�̸��� " + p.getName() + "�̰� ��ȭ��ȣ�� " + p.getPhone() + "�Դϴ�.");
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setDept("����");
		person.setGender("����");
		person.setName("���̾��");
		person.setPhone("010-1111-2222");
		person.setSid("2001234");
		
//		person.print();
		
		
		Student std = new Student();
		std.setDept("����");
		std.setGender("����");
		std.setName("��Į�����ѽ�");
		std.setPhone("010-1234-1111");
		std.setSid("2001112");
		std.addGrade(98);
		std.addGrade(97);
		
//		std.print();
//		person = std;
//		�޼ҵ� �������̵��� ����� �̿��� ������
//		person.print();
//		nameNphoneOnly(std);
		
		Professor prof = new Professor();
		prof.setDept("����");
		prof.setGender("����");
		prof.setName("ȫ�浿");
		prof.setLectures(new String[] {"���α׷�����", "�����α׷���(I)"});
		prof.setPhone("010-1234-5678");
		prof.setSid("1012345");
		
//		prof.print();
//		person = prof;
//		person.print();
//		nameNphoneOnly(prof);
		
//		std = prof;
//		prof = std;
		
		
		Person[] parr = new Person[3];
		Student[] stdarr = new Student[3];
		Professor[] profarr = new Professor[3];
		
		stdarr[0] = std;
//		stdarr[1] = prof;
//		stdarr[2] = person;
		
		profarr[0] = prof;
//		profarr[1] = std;
//		profarr[2] = person;
		
		parr[0] = person;
		parr[1] = std;
		parr[2] = prof;
		
		printAll(parr);
	}
	
	private static void printAll(Person[] parr) {
		for(int i = 0; i < parr.length; i++)
		{
			System.out.println("Instance of Person?" + (parr[i] instanceof Person));
			System.out.println("Instance of Student?" + (parr[i] instanceof Student));
			System.out.println("Instance of Professor?" + (parr[i] instanceof Professor));
			parr[i].print();
		}
		
	}

}