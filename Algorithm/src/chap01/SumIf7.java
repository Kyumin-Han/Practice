package chap01;

import java.util.Scanner;

public class SumIf7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값을 입력하세요: ");
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
//		if(n != 7) System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

		
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
