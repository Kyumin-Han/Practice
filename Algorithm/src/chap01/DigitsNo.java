package chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		while(true) 
		{
			System.out.print("���� ������ �Է��ϼ���: ");
			n = input.nextInt();
			if(n > 0)
			{
				break;
			}
			System.out.println("����� �Է��� �� �ֽ��ϴ�.");
		}
		
		int count = 0;
		for(int i = 1; ;i *= 10)
		{
			if(n / i == 0) break;

			count++;
		}
		System.out.println("�� ���� " + count + "�ڸ� �Դϴ�.");
	}

}