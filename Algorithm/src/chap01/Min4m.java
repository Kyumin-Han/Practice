package chap01;

import java.util.Scanner;

public class Min4m {
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		
		System.out.print("a�� �Է��ϼ���: ");
		a = input.nextInt();
		System.out.print("b�� �Է��ϼ���: ");
		b = input.nextInt();
		System.out.print("c�� �Է��ϼ���: ");
		c = input.nextInt();
		System.out.print("d�� �Է��ϼ���: ");
		d = input.nextInt();
		
		System.out.println("�� ������ �ּڰ��� " + min4(a, b, c, d) + "�Դϴ�.");
	}

}