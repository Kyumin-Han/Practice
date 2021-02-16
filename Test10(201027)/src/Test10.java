import java.util.*;
public class Test10 {

	public static void main(String[] args) {
//		testPrimeNum();
		getAverage();

	}
	
	public static void testPrimeNum() {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("기준 수를 입력하세요 : ");
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
		
		System.out.println("\n경과 시간 : " + (end-start) + "ms");
		
		
		input.close();
		
	}
	
	public static void getAverage() {
		/*
		 * 점수를 입력받아서, 그 점수의 평균을 구하라.
		 * 음수값 입력하면 종료
		 */
		
		Scanner input = new Scanner(System.in);
		
		int score;
		int sum = 0;
		int count = 0;
		
		while(true) //무한 루프
		{
			System.out.print("점수를 입력하세요 : ");
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
		
		System.out.print("평균 성적은 " + avg + "입니다.");
		
		input.close();
		
		
	}

}
