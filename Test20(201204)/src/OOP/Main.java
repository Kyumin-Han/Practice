package OOP;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("ȫ�浿");
		std1.study();
		std1.study();
		std1.play();
		std1.setSid("2000123");
		System.out.println(std1.getName() + "�� �й�:" + std1.getSid());
//		System.out.println(std1.FEMALE);
//		System.out.println(std1.MALE);
		
		std1.setGender("����");
		System.out.println(std1.getName() + "�� ����: " + std1.getGender());
		
		std1.addGrade(100);
		std1.addGrade(90);
		std1.addGrade(80);
		std1.addGrade(95);
		std1.addGrade(88);
//		System.out.println(std1.getAllGrades());
		
		System.out.println(std1.add(10, 20));
		System.out.println(std1.add(10.5, 20.4));
		
		
		System.out.println(std1.getName() +"�� �ְ�����: " + std1.getMaxGrade());
		System.out.println(std1.getName() +"�� ��������: " + std1.getMinGrade());
		System.out.println(std1.getName() +"�� �������: " + std1.getAverage());
		
		
		Student std2 = new Student();
		std2.setName("������");
		std2.setGender(std2.FEMALE);
		System.out.println(std2.getName() + "�� ����: " + std2.getGender());
	}

}