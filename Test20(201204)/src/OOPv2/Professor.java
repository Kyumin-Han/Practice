package OOPv2;

import java.util.*;
public class Professor extends Person{
	private String[] lectures = new String[5];

	@Override
	public void print() {
		System.out.println("name: " + getName() + ", sid : " + getSid() + ", phone:" + getPhone() + ", gender : " + getGender() + ", dept: " + getDept() + ", lectures: " + lectures2str());
	}

	private String lectures2str() {
		String result = "[";

		if(lectures[0] != null)
		{
			result += lectures[0];
		}
		for(int i = 1; i < lectures.length; i++)
		{
			if(lectures[i] != null)
			{
				result += (", " + lectures[i]);
			}
		}

		result += "]";

		return result;
	}

	public String[] getLectures() {
		return lectures;
	}
	public void setLectures(String[] lectures) {
		for(int i = 0; i < lectures.length && i < 5; i++)
		{
			this.lectures[i] = lectures[i];
		}
	}

	@Override
	public void setSid(String sid) {
		if(sid.length() != 7)
		{
			System.out.println("����� 7�ڸ��̾�� �մϴ�.");
			return;
		}

		super.setSid(sid);
	}

}