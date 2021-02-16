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
		
		
		System.out.print("양의 정수를 입력하세요 : ");
		num = input.nextInt();
		
		System.out.print(num + "의 양의 약수는 : ");
		
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
		
		
//		if문 1개로 ,로 숫자 구분하기
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
		
		System.out.print("난수의 개수 : ");
		int num = input.nextInt();
		
		int sum = 0;
		
		/*
		 * n개의 난수를 발생시켜서 총합을 구하기
		 * 1~n까지 반복
		 * 난수를 발생시키고 난수를 더해준다
		 */
		
		Random ranNum = new Random();
		int temp = 0;
		for(int i = 0; i < num; i++)
		{
			temp = ranNum.nextInt(100);
			sum += temp;
			
			System.out.print(temp + " ");
		}
		
		System.out.println("\n난수의 합: " + sum);
		
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
		 * for 문을 이용해서
		 * "*****"을 5라인을 출력
		 * 
		 * 중첩 for문을 이용해서
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
		 * 별을 찍어야 하는 행 수 만큼 반복
		 * 별을 찍는다를 반복(행의 번호만큼)
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
		  * 사용자로부터 입력받은 수보다 작은 소수
		  */
		
		/*
		 * 1은 모든 수의 약수이므로 고려하지 않아도 된다
		 * 위를 고려하면 어떤 수가 소수인지 알아보기 위해서는 자신의 수로만 1번 나눠지는지 확인해 주면 된다
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("기준 수를 입력하세요 : ");
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
			
			// count 값을 초기화 해주어야 뒤의 숫자들이 나눠지는 횟수를 알 수 있다
			count = 0;
			
		}
		
		input.close();
	}

}
