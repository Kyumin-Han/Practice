package chap01;

import java.util.Scanner;

public class Min3m {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		
		System.out.print("a�� �Է��ϼ���: ");
		a = input.nextInt();
		System.out.print("b�� �Է��ϼ���: ");
		b = input.nextInt();
		System.out.print("c�� �Է��ϼ���: ");
		c = input.nextInt();
		
		System.out.println("�� ������ �ּڰ��� " + min3(a, b, c) + "�Դϴ�.");
	}

}
