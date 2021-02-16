package OOPv2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("홍길동");
		std1.setDept("컴정");
		std1.setPhone("010-1111-2222");
//		std1.setGender(std1.MALE);
		std1.addGrade(100);
		std1.addGrade(92);
		std1.setSid("2000123");
		System.out.println(std1.getAverage());
		std1.print();
		
		Professor p1 = new Professor();
		p1.setName("톰크루즈");
		p1.setGender("남자");
		p1.setPhone("010-2222-3333");
		p1.setSid("P123456");
		p1.setLectures(new String[] {"프로그래밍기초","웹프로그래밍(I)"});
		System.out.println(Arrays.toString(p1.getLectures()));
		p1.print();

	}

}
