package chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ���� �Է��ϼ���: ");
		n = input.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n)
		{
			sum += i;
			
			i++;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");

	}

}
