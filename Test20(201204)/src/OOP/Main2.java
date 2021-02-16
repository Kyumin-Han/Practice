package OOP;

public class Main2 {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setName("톰크루즈");
		p1.setSid("P1234");
		p1.setPhone("010-123-4567");
		p1.setLectures(new String[] {"프로그래밍기초", "웹프로그래밍(I)"});
		p1.print();
//		System.out.println(p1);
		
		Professor p2 = new Professor();
		p2.setName("조디포스터");
		p2.setSid("P2341");
		p2.setPhone("010-234-1223");
		p2.setLectures(new String[] {"컴퓨터네트워크" , "데이터베이스기초"});
		p2.print();
//		System.out.println(p2);
	}

}
