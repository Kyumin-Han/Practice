import java.util.*;
public class Test8 {

	public static void main(String[] args) {
//		testFor();
//		testRandomNum();
//		testNestedFor();
//		testNestedFor2();
//		testNestedFor3();
		testPrimeNum();
	}
	
	
	public static void testFor() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		System.out.print(num + "�� ���� ����� : ");
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				if(i == num)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i + ", ");
				}
			}
			
		}
		
		
//		if�� 1���� ,�� ���� �����ϱ�
//		System.out.print("1");
//		for(int i = 2; i <= num; i++)
//		{
//			if(num % 1 == 0)
//			{
//				System.out.print(", " + i);
//			}
//		}
		
		input.close();
		
	}
	
	public static void testRandomNum() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		int num = input.nextInt();
		
		int sum = 0;
		
		/*
		 * n���� ������ �߻����Ѽ� ������ ���ϱ�
		 * 1~n���� �ݺ�
		 * ������ �߻���Ű�� ������ �����ش�
		 */
		
		Random ranNum = new Random();
		int temp = 0;
		for(int i = 0; i < num; i++)
		{
			temp = ranNum.nextInt(100);
			sum += temp;
			
			System.out.print(temp + " ");
		}
		
		System.out.println("\n������ ��: " + sum);
		
		input.close();
	}
	
	public static void testNestedFor(){
		
//		\t = tap
		for(int i = 0; i < 5; i++)
		{
			System.out.println("i : " + i);
			System.out.print("\t");
			for(int j = 0; j < 5; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void testNestedFor2() {
		/*
		 * for ���� �̿��ؼ�
		 * "*****"�� 5������ ���
		 * 
		 * ��ø for���� �̿��ؼ�
		 */
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void testNestedFor3() {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 *
		 * 
		 * ���� ���� �ϴ� �� �� ��ŭ �ݺ�
		 * ���� ��´ٸ� �ݺ�(���� ��ȣ��ŭ)
		 * 
		 */
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public static void testPrimeNum() {
		 /*
		  * ����ڷκ��� �Է¹��� ������ ���� �Ҽ�
		  */
		
		/*
		 * 1�� ��� ���� ����̹Ƿ� ������� �ʾƵ� �ȴ�
		 * ���� ����ϸ� � ���� �Ҽ����� �˾ƺ��� ���ؼ��� �ڽ��� ���θ� 1�� ���������� Ȯ���� �ָ� �ȴ�
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = input.nextInt();
		
		int count = 0;
		
		for(int i = 2; i <= num; i++)
		{
			for(int j = 2; j <= i; j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			
			if(count == 1)
			{
				System.out.print(i + " ");
			}
			
			// count ���� �ʱ�ȭ ���־�� ���� ���ڵ��� �������� Ƚ���� �� �� �ִ�
			count = 0;
			
		}
		
		input.close();
	}

}
