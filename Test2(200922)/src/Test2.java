import java.util.*;
public class Test2 {

	public static void main(String[] args) {
//		input();
//		larger();
//		onetoten();
		outof();
	}
	
	public static void input() {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("�Է��� ���� " + num + "�� ¦���Դϴ�");
		}
		else
		{
			System.out.println("�Է��� ���� " + num + "�� 0 �Ǵ� Ȧ���Դϴ�.");
		}
		
		input.close();
	}
	
	public static void larger() {
		Scanner input = new Scanner(System.in);
		
		int x, y, larger;
		
		System.out.print("���� 1�� �Է��ϼ��� : ");
		x = input.nextInt();
		
		System.out.print("���� 2�� �Է��ϼ��� : ");
		y = input.nextInt();
		
		
		if(x > y)
		{
			larger = x;
			System.out.println("�Է¹��� �� �� �� �� ū���� " + larger + "�Դϴ�.");
		}
		else if(x < y)
		{
			larger = y;
			System.out.println("�Է¹��� �� �� �� �� ū���� " + larger + "�Դϴ�.");
		}
		else
		{
			System.out.println("�Է¹��� �� ���� �����ϴ�.");
		}
		
		input.close();
	}
	
	public static void onetoten() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		if(num >= 1 && num <= 10)
		{
			System.out.println("�Է��� ���� " + num + "�� 1���� 10 ������ �����Դϴ�.");
		}
		else
		{
			System.out.println("�Է��� ���� " + num + "�� 1���� 10 ������ ������ �ƴմϴ�.");
		}
		input.close();
	}
	
	public static void outof() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt();
		
//		if(!(num >= 1 && num <= 10))
//		{
//			System.out.println("�ùٸ� �Է��Դϴ�.");
//		}
//		else
//		{
//			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
//		}
		
		if(num < 1 || num > 10)
		{
			System.out.println("�ùٸ� �Է��Դϴ�.");
			if(num < 1)
			{
				System.out.println("1���� ���� ���Դϴ�.");
			}
			else //10 �̻��� ��
			{
				System.out.println("10���� ū ���Դϴ�.");
			}
		}
		else
		{
			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
		}

		input.close();
	}

}
