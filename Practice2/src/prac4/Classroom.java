package prac4;

public class Classroom {

	public static void main(String[] args) {
		Student kim = new Student(12, "������", 3);
		
		kim.test[0].setPointNSubject(95, "����");
		kim.test[1].setPointNSubject(83, "����");
		kim.test[2].setPointNSubject(76, "����");
		kim.printScroe();
		
		Student lee = new Student(7, "�� ��", 3);
		
		lee.test[0].setPointNSubject(66, "����");
		lee.test[1].setPointNSubject(97, "����");
		lee.test[2].setPointNSubject(72, "����");
		lee.printScroe();

	}

}
