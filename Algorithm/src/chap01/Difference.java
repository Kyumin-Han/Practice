package chap01;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int result = 0;
		
		System.out.print("a�� ��: ");
		a = input.nextInt();
//		System.out.print("b�� ��: ");
//		b = input.nextInt();
//		
//		if(a >= b)
//		{
//			do {
//				System.out.println("a���� ū ���� �Է��ϼ���!");
//				System.out.print("b�� ��: ");
//				b = input.nextInt();
//			} while(b <= a);
//		}
		
		b = 0;
		
		while(true)
		{
			System.out.print("b�� ��: ");
			b = input.nextInt();
			
			if(b > a)
			{
				break;
			}
			else
			{
				System.out.println("a���� ū ���� �Է��ϼ���!");
			}
		}
		
		result = b - a;
		
		System.out.println("b - a�� " + result + "�Դϴ�.");
	}

}
