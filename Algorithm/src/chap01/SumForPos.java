package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.print("n�� ��: ");
			n = input.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + " �Դϴ�.");

	}

}