import java.util.*;
public class Test10 {

	public static void main(String[] args) {
//		testPrimeNum();
		getAverage();

	}
	
	public static void testPrimeNum() {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		n = input.nextInt();
		
		long start = System.currentTimeMillis();
		
//		int count = 0;
//		
//		for(int i = 2; i <= n; i++)
//		{
//			for(int j = 2; j <= i; j++)
//			{
//				if(i % j == 0)
//				{
//					count++;
//				}
//			}
//			
//			if(count == 1)
//			{
//				System.out.print(i + " ");
//			}
//			
//			count = 0;
//		}
		
		for(int i = 2; i <= n; i++)
		{
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.print(i + " ");
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("\n��� �ð� : " + (end-start) + "ms");
		
		
		input.close();
		
	}
	
	public static void getAverage() {
		/*
		 * ������ �Է¹޾Ƽ�, �� ������ ����� ���϶�.
		 * ������ �Է��ϸ� ����
		 */
		
		Scanner input = new Scanner(System.in);
		
		int score;
		int sum = 0;
		int count = 0;
		
		while(true) //���� ����
		{
			System.out.print("������ �Է��ϼ��� : ");
			score = input.nextInt();
			
			if(score >= 0)
			{
				sum += score;
				
				count++;
			}
			else 
			{
				break;
			}
			
		}
		
		double avg = (double)sum / count;
		
		System.out.print("��� ������ " + avg + "�Դϴ�.");
		
		input.close();
		
		
	}

}
