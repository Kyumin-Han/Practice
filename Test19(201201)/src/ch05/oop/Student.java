package ch05.oop;

public class Student extends Person {
//	int sid;
//	String name;
//	int age;
//	String gender;
//	private String dept;
	private int slevel;
//	멤버 데이터
//	private String[] dpts = {"컴정", "컴기", "전기", "디자인", "유아", "관광", "사복"};
	
//	String getDept() {
//		return dept;
//	}
	
//	private, public...
//	Access Modifier = 객체를 사용하는 사용자가 어디까지 접근 할 수 있는지를 제어
//	private = 클래스 외부에서는 사용할 수 없게 한다
	
	void study() {
		slevel++;
		System.out.println(name + "이(는) 공부합니다.");
	}
	
	void play() {
		slevel--;
		System.out.println(name + "이(는) 놉니다.");
	}
//	멤버 메소드
	
//	멤버 메소드에서 멤버 데이터에 접근 가능하다
	
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
//			System.out.println("소속 학과는 " + Arrays.toString(dpts) + " 중에 하나이어야 합니다.");
//		}
//		else
//		{
////			dept = dept;
////			위와 같이 선언하면 안되고 this 라는 키워드로 자기가 가진 멤버 데이터의 변수라는 것을 지정해 줄 수 있다
//			
//			this.dept = dept;
//		}
//	}
}
