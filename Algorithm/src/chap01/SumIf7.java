package chap01;

import java.util.Scanner;

public class SumIf7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ���� �Է��ϼ���: ");
		n = input.nextInt();
		
		int sum = 0;
//		int i = 1;
//		
//		while(i <= n)
//		{
//			if(n == 7)
//			{
//				while(i <= n)
//				{
//					sum += i;
//					
//					if(i < n)
//					{
//						System.out.print(i + " + ");
//					}
//					else if(i == n)
//					{
//						System.out.print(i + " = " + sum);
//					}
//					
//					i++;
//				}
//			}
//			else
//			{
//				sum += i;
//				i++;
//			}
//		}
//		
//		if(n != 7) System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");

		
		for(int i = 1; i <= n; i++)
		{
			sum += i;
			
			if(i < n)
			{
				System.out.print(i + " + ");
			}
			else
			{
				System.out.print(i + " = " + sum);
			}
		}
	}

}