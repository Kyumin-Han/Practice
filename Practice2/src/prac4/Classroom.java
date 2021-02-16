package prac4;

public class Classroom {

	public static void main(String[] args) {
		Student kim = new Student(12, "김주현", 3);
		
		kim.test[0].setPointNSubject(95, "국어");
		kim.test[1].setPointNSubject(83, "영어");
		kim.test[2].setPointNSubject(76, "수학");
		kim.printScroe();
		
		Student lee = new Student(7, "이 진", 3);
		
		lee.test[0].setPointNSubject(66, "국어");
		lee.test[1].setPointNSubject(97, "영어");
		lee.test[2].setPointNSubject(72, "수학");
		lee.printScroe();

	}

}
