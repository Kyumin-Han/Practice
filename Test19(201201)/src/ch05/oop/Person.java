package ch05.oop;

import java.util.Arrays;

public class Person {
	int sid;
	String name;
	int age;
	String gender;
	private String dept;
	
	private String[] dpts = {"컴정", "컴기", "전기", "디자인", "유아", "관광", "사복"};
	
	String getDept() {
		return dept;
	}
	
	void setDept(String dept) {
		int i = 0;
		for(; i < dpts.length; i++)
		{
			if(dept.equals(dpts[i])) break;
		}
		
		if(i == dpts.length)
		{
			System.out.println("소속 학과는 " + Arrays.toString(dpts) + " 중에 하나이어야 합니다.");
		}
		else
		{
//			dept = dept;
//			위와 같이 선언하면 안되고 this 라는 키워드로 자기가 가진 멤버 데이터의 변수라는 것을 지정해 줄 수 있다
			
			this.dept = dept;
		}
	
	}
}
