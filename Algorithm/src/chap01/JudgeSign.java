package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("������ �Է��ϼ���: ");
		n = input.nextInt();
		
		if(n > 0)
		{
			System.out.println("�� ���� ����Դϴ�.");
		}
		else if(n < 0)
		{
			System.out.println("�� ���� �����Դϴ�.");
		}
		else
		{
			System.out.println("�� ���� 0�Դϴ�.");
		}

	}

}
