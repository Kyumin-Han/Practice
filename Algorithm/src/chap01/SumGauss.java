package chap01;

import java.util.Scanner;

public class SumGauss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ���� �Է��ϼ���: ");
		n = input.nextInt();
		
//		int sum = (1+n) * (n/2) + (n %2 == 1 ? (n+1) / 2 : 0);
		int sum = (1+n) * n/2;
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");

	}

}