package OOPv2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("ȫ�浿");
		std1.setDept("����");
		std1.setPhone("010-1111-2222");
//		std1.setGender(std1.MALE);
		std1.addGrade(100);
		std1.addGrade(92);
		std1.setSid("2000123");
		System.out.println(std1.getAverage());
		std1.print();
		
		Professor p1 = new Professor();
		p1.setName("��ũ����");
		p1.setGender("����");
		p1.setPhone("010-2222-3333");
		p1.setSid("P123456");
		p1.setLectures(new String[] {"���α׷��ֱ���","�����α׷���(I)"});
		System.out.println(Arrays.toString(p1.getLectures()));
		p1.print();

	}

}