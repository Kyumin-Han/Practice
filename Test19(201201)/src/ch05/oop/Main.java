package ch05.oop;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.age = 19;
//		std1.dept = "����";
		std1.setDept("����");
		std1.gender = "��";
		std1.name = "ȫ�浿";
		std1.sid = 1234;
//		std1.slevel = 0;
		std1.study();
		std1.study();
		std1.study();
//		std1.slevel = 100;
//		System.out.println(std1.name + "�� �н� ������ " + std1.slevel);
//		Student Class���� slevel�� private���� ���� �� �־��� ������ �ܺ� Ŭ������ Main������ slevel�� ������ �� ��� ������ ������ �ȴ�
		
		int level = std1.getSlevel();
		System.out.println(std1.name + "�� �н� ����: " + level);
		System.out.println(std1.name + "�� �Ҽ��� : " + std1.getDept());
		
		
		Student std2 = new Student();
		std2.age = 18;
//		std2.dept = "����";
		std2.setDept("��ȸ����");
		std2.gender = "��";
		std2.name = "������";
		std2.sid = 1235;
//		std2.slevel = 0;
		std2.study();
//		System.out.println(std2.name + "�� �н� ������ " + std2.slevel);
//		����� ���� Ÿ��
		
		std2.getSlevel();
		level = std2.getSlevel();
		System.out.println(std2.name + "�� �н� ����: " + level);
		System.out.println(std2.name + "�� �Ҽ���: " + std2.getDept());
		
		System.out.println("*************************************");
		
		Professor pf1 = new Professor();
		pf1.name = "�ڹ���";
		pf1.setDept("����");
		pf1.lecture();
		System.out.println(pf1.name + "������ �Ҽ��� " + pf1.getDept());
		
		Professor pf2 = new Professor();
		pf2.name = "�̸���";
		pf2.setDept("��ǻ������");
		pf2.lecture();
		System.out.println(pf2.name + "������ �Ҽ��� " + pf2.getDept());
		
	}

}
