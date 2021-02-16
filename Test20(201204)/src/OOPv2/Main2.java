package OOPv2;

public class Main2 {
	
//	private static void nameNphoneOnly(Student std) {
//		System.out.println("이름은 " + std.getName() +"이고 전화번호는 " + std.getPhone() + "입니다.");
//	}
//	
//	// method overloading
//	// 같은 이름의 메소드여도 변수의 개수, 타입이 다르면 정의하여 사용할 수 있다
//	private static void nameNphoneOnly(Professor p) {
//		System.out.println("이름은 " + p.getName() +"이고 전화번호는 " + p.getPhone() + "입니다.");
//	}
	
	private static void nameNphoneOnly(Person p) {
		System.out.println("이름은 " + p.getName() + "이고 전화번호는 " + p.getPhone() + "입니다.");
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setDept("컴정");
		person.setGender("남자");
		person.setName("아이언맨");
		person.setPhone("010-1111-2222");
		person.setSid("2001234");
		
//		person.print();
		
		
		Student std = new Student();
		std.setDept("컴정");
		std.setGender("여자");
		std.setName("스칼렛요한슨");
		std.setPhone("010-1234-1111");
		std.setSid("2001112");
		std.addGrade(98);
		std.addGrade(97);
		
//		std.print();
//		person = std;
//		메소드 오버라이딩과 상속을 이용한 다형성
//		person.print();
//		nameNphoneOnly(std);
		
		Professor prof = new Professor();
		prof.setDept("컴정");
		prof.setGender("남자");
		prof.setName("홍길동");
		prof.setLectures(new String[] {"프로그래기초", "웹프로그래밍(I)"});
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
