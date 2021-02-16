package ch09Prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("AAA");
		list.add("bbb");
		list.add("CCC");
		list.add("ddd");
		list.add("EEE");
		
		// ��ҹ��ڸ� �����ϴ� ����
		Collections.sort(list);
		
		System.out.println("��ҹ��ڸ� ������ ����:");
		System.out.println(list);
		
		// ���ٽ��� �̿��Ͽ� ��ҹ��ڸ� �����ϴ� �񱳸޼ҵ带 �ۼ�, ����
		Collections.sort(list, (o1, o2) -> o1.compareToIgnoreCase(o2));
		
		System.out.println("��ҹ��ڸ� �������� ���� ����: ");
		System.out.println(list);

	}

}