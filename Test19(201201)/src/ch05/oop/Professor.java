package ch05.oop;

//import java.util.Arrays;

public class Professor extends Person{
//	String name;
//	int age;
//	String gender;
//	private String dept;
//	int pid;
	
//	private String[] dpts = {"컴정", "컴기", "전기", "디자인", "유아", "관광", "사복"};
	
	void lecture() {
		System.out.println(name + "교수가 수업을 합니다.");
	}
	
//	String getDept() {
//		return dept;
//	}
//	
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
	
//	Professor와 Student 클래스는 중복되는 것이 많다
//	프로그래머가 지양해야할것 = 중복되는 코드를 많이 쓰는 것
//	상속을 통해서 중복을 줄여 코딩 할 수 있다
//	클래스를 생성할때 extends 부모 클래스 이름을 써주면 부모 클래스로부터 상속을 받는다
	

}
