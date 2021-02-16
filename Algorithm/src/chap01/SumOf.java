package chap01;

import java.util.Scanner;

public class SumOf {

	static int sumof(int a, int b) {
		
		int temp;
		
		if(a >= b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		int sum = 0;
		
		for(int i = a; i <= b; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 수 사이의 합을 구합니다.");
		System.out.print("첫번째 수를 입력하세요: ");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int b = input.nextInt();
		
		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");

	}

}
