package ch05.oop;

public class Student extends Person {
//	int sid;
//	String name;
//	int age;
//	String gender;
//	private String dept;
	private int slevel;
//	��� ������
//	private String[] dpts = {"����", "�ı�", "����", "������", "����", "����", "�纹"};
	
//	String getDept() {
//		return dept;
//	}
	
//	private, public...
//	Access Modifier = ��ü�� ����ϴ� ����ڰ� ������ ���� �� �� �ִ����� ����
//	private = Ŭ���� �ܺο����� ����� �� ���� �Ѵ�
	
	void study() {
		slevel++;
		System.out.println(name + "��(��) �����մϴ�.");
	}
	
	void play() {
		slevel--;
		System.out.println(name + "��(��) ��ϴ�.");
	}
//	��� �޼ҵ�
	
//	��� �޼ҵ忡�� ��� �����Ϳ� ���� �����ϴ�
	
	int getSlevel() {
		return slevel;
	}
	
//	void setDept(String dept) {
//		int i = 0;
//		for(; i < dpts.length; i++)
//		{
//			if(dept.equals(dpts[i])) break;
//		}
//		
//		if(i == dpts.length)
//		{
//			System.out.println("�Ҽ� �а��� " + Arrays.toString(dpts) + " �߿� �ϳ��̾�� �մϴ�.");
//		}
//		else
//		{
////			dept = dept;
////			���� ���� �����ϸ� �ȵǰ� this ��� Ű����� �ڱⰡ ���� ��� �������� ������� ���� ������ �� �� �ִ�
//			
//			this.dept = dept;
//		}
//	}
}
