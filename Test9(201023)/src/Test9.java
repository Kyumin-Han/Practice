import java.util.*;
public class Test9 {

	public static void main(String[] args) {
//		testStar();
		testStar2();
//		testStar3();

	}
	
	public static void testStar() {
		/*
		 * 정수를 입력 받아 변수 n에 저장
		 * n 개의 행에 다음과 같이 출력
		 * 
		 * 첫행 * n개:		 *****
		 * 둘째 행 * n-1개 :	 ****
		 * ...
		 * n행 * 1개
		 * 
		 */
		
		/*
		 * 행을 n번 반복하고
		 * 별을 n-i개 찍도록 반복한다
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("행의 개수를 입력하세요 : ");
		n = input.nextInt();
		
		for(int i = 0; i < n ; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		input.close();
		
	}
	
	public static void testStar2() {
		/*
		 * 사용자로부터 행의 개술르 입력받아 n에 저장
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 * 위와 같이 출력
		 * 
		 * 행은 n번 반복
		 * 공백은 i번
		 * 별은 n-i번
		 * 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("행의 개수를 입력하세요: ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) 
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < n-i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		input.close();
		
	}
	
	public static void testStar3() {
		/*
		 * 별을 증가시키면서 우측 정렬
		 * 
		 * 사용자로부터 행의 개수를 입력받아 n에 저장
		 * 다음과 같이 출력
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * 별표 i개만큼??
		 * 공백 n-i개
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("행의 개수를 입력하세요 : ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
				/*
				 * i = 0
				 * 		j = 0, 1, 2, 3, 4 <-- j가 0~3까지 공백, 4는 별
				 * i = 1
				 * 		j = 0, 1, 2, 3, 4 <-- j가 0~2까지 공백, 3~4는 별
				 * i = 2
				 * 		j = 0, 1, 2, 3, 4 <-- j가 0~1까지 공백, 2~4는 별
				 * i = 3
				 * 		j = 0, 1, 2, 3, 4 <-- j가 0일때 공백, 1~4는 별
				 * i = 4
				 * 		j = 0, 1, 2, 3, 4 <-- 0~4까지 별
				 */
			
			
//			for(int j = 0; j < n; j++)
//			{
//				if(j < n-1-i)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
			
//			for(int j = 0; j < i; j++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j < n-i; j++)
//			{
//				System.out.print("*");
//			}
			
			for(int j = 1; j < n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < i+1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		input.close();
		
	}

}
