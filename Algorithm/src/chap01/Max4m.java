package chap01;

import java.util.Scanner;

public class Max4m {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);
 		
 		int a, b, c, d;
 		
 		System.out.println("�� ������ �ִ��� ���մϴ�.");
 		
 		System.out.print("a�� �Է��ϼ���: ");
 		a = input.nextInt();
 		System.out.print("b�� �Է��ϼ���: ");
 		b = input.nextInt();
 		System.out.print("c�� �Է��ϼ���: ");
 		c = input.nextInt();
 		System.out.print("d�� �Է��ϼ���: ");
 		d = input.nextInt();
 		
 		System.out.println("�� ������ �ִ��� " + max4(a, b, c, d) + "�Դϴ�.");
	}

}