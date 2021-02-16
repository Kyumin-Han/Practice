import java.util.*;
public class Test5 {

	public static void main(String[] args) {
//		testSwitch();
//		testLoop();
//		testLoop2();
//		testGugudan();
//		testLoop3();
		testLoop4();
	}
	
	public static void testSwitch() {
		Scanner input = new Scanner(System.in);
		
		int month;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		
		switch(month)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "���� �ϼ��� : 30��");
				break;
			case 2:
//				�������� Ȯ���غ���
//				���� = 4�� ������ ���鼭 100���δ� ������ ���� �ʴ� �⵵, �Ǵ� 400���� ������ �������� �⵵.
				boolean lunarYear;
				
				
				int year;
				Date date = new Date();
				year = date.getYear();
				
				lunarYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				if(lunarYear)
				{
					System.out.println(month + "���� �ϼ��� : 29��");
				}
				else
				{
					System.out.println(month + "���� �ϼ��� : 28��");
				}
				
				
				break;
			default:
				System.out.println(month + "���� �ϼ��� : 31��");
		}
		
		input.close();
	}
	
	public static void testLoop() {
		int i = 0;
		
		while(i < 5)
		{
			System.out.println("ȯ���մϴ�.");
			i++;
		}
		
		System.out.println("�� �ݺ� Ƚ�� : " + i);
	}
	
	public static void testLoop2() {
		int i = 0;
		
		while(i < 10) {
			System.out.print((i+1) + " ");
			i++;
		}
	}
	
	public static void testGugudan() {
		Scanner input = new Scanner(System.in);
		
		int dan;
		
		System.out.print("����� ���� �Է��Ͻÿ� : ");
		dan = input.nextInt();
		
		int i = 1;
		
		while(i <= 9)
		{
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		input.close();
	}
	
	public static void testLoop3() {
		int i = 1;
		int sum = 0;
		
		while(i <= 10)
		{
			sum += i;
			i++;
		}
		
		System.out.println("1���� 10������ ���� " + sum);
	}
	
	public static void testLoop4() {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		int sum = 0;
		
		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		num1 = input.nextInt();
		
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		num2 = input.nextInt();
		
		if(num1 >= num2) 
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int i = num1;
		
		while(i <= num2)
		{
			sum += i;
			i++;
		}
		
		System.out.println(num1 + "���� " + num2 +"������ ���� " + sum + "�Դϴ�.");
		input.close();
	}

}
