package ch05.oop;

import java.util.Arrays;

public class Person {
	int sid;
	String name;
	int age;
	String gender;
	private String dept;
	
	private String[] dpts = {"����", "�ı�", "����", "������", "����", "����", "�纹"};
	
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
			System.out.println("�Ҽ� �а��� " + Arrays.toString(dpts) + " �߿� �ϳ��̾�� �մϴ�.");
		}
		else
		{
//			dept = dept;
//			���� ���� �����ϸ� �ȵǰ� this ��� Ű����� �ڱⰡ ���� ��� �������� ������� ���� ������ �� �� �ִ�
			
			this.dept = dept;
		}
	
	}
}
