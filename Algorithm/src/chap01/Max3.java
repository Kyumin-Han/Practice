package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� ��: " + a);
		System.out.println("b�� ��: " + b);
		System.out.println("c�� ��: " + c);
		
		int max = a;
		
		if(b > max)
		{
			max = b;
		}
		
		if(c > max) 
		{
			max = c;
		}
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

}