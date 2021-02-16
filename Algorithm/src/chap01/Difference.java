package chap01;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int result = 0;
		
		System.out.print("a의 값: ");
		a = input.nextInt();
//		System.out.print("b의 값: ");
//		b = input.nextInt();
//		
//		if(a >= b)
//		{
//			do {
//				System.out.println("a보다 큰 값을 입력하세요!");
//				System.out.print("b의 값: ");
//				b = input.nextInt();
//			} while(b <= a);
//		}
		
		b = 0;
		
		while(true)
		{
			System.out.print("b의 값: ");
			b = input.nextInt();
			
			if(b > a)
			{
				break;
			}
			else
			{
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		}
		
		result = b - a;
		
		System.out.println("b - a는 " + result + "입니다.");
	}

}
