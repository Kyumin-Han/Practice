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
		
		System.out.println("�� �� ������ ���� ���մϴ�.");
		System.out.print("ù��° ���� �Է��ϼ���: ");
		int a = input.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		int b = input.nextInt();
		
		System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�.");

	}

}
