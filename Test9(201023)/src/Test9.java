import java.util.*;
public class Test9 {

	public static void main(String[] args) {
//		testStar();
		testStar2();
//		testStar3();

	}
	
	public static void testStar() {
		/*
		 * ������ �Է� �޾� ���� n�� ����
		 * n ���� �࿡ ������ ���� ���
		 * 
		 * ù�� * n��:		 *****
		 * ��° �� * n-1�� :	 ****
		 * ...
		 * n�� * 1��
		 * 
		 */
		
		/*
		 * ���� n�� �ݺ��ϰ�
		 * ���� n-i�� �ﵵ�� �ݺ��Ѵ�
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
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
		 * ����ڷκ��� ���� ������ �Է¹޾� n�� ����
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 * ���� ���� ���
		 * 
		 * ���� n�� �ݺ�
		 * ������ i��
		 * ���� n-i��
		 * 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("���� ������ �Է��ϼ���: ");
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
		 * ���� ������Ű�鼭 ���� ����
		 * 
		 * ����ڷκ��� ���� ������ �Է¹޾� n�� ����
		 * ������ ���� ���
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * ��ǥ i����ŭ??
		 * ���� n-i��
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
				/*
				 * i = 0
				 * 		j = 0, 1, 2, 3, 4 <-- j�� 0~3���� ����, 4�� ��
				 * i = 1
				 * 		j = 0, 1, 2, 3, 4 <-- j�� 0~2���� ����, 3~4�� ��
				 * i = 2
				 * 		j = 0, 1, 2, 3, 4 <-- j�� 0~1���� ����, 2~4�� ��
				 * i = 3
				 * 		j = 0, 1, 2, 3, 4 <-- j�� 0�϶� ����, 1~4�� ��
				 * i = 4
				 * 		j = 0, 1, 2, 3, 4 <-- 0~4���� ��
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
