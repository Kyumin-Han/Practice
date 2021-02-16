import java.util.*;
public class Test7 {
// �ʱ��, ���ǽ�, ������
// �ʱ���� ���ʿ� �ѹ��� ����ȴ�.
// �ݺ��� ���� ������ �����ϸ� ������ ����ȴ�.
// while���� �ʱ��, ���ǽ�, �������� ����� �ִµ� �̸� �ѵ� ��� ���� ���� for���̴�
// for���� ���� = for(�ʱ��; ���ǽ�; ������)
// execution flow : ������ �帧
// for������ �������� ���� �� ���ǽ��� �˻��ϴ� ������ ���� �ݺ��� �Ѵ�
// for���̳� while���̳� �ʱ���� �� �ѹ��� ����ȴ�
// for�� �ȿ��� ����� i �� for��� �������� ��ȿ�� ���̴� - JAVA������
	
	public static void main(String[] args) {
//		testFor();
//		testFor2();
//		testFor3();
//		testSum();
		testFactorial();

	}
	
	public static void testFor() {
		/*
		 * int i = 0;
		 * for(; i <5; i++)
		 * {
		 *     System.out.print(i + " ");
		 * }
		 * 
		 * ���� ���� i�� ���� ������ �ְ� for�� �ȿ� �ʱ���� ������ �� �� �ִ�
		 */
		int i;
		
		for(i = 0; i < 5; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("�ݺ����� ���� �� : " + i);
		
	}
	
	public static void testFor2() {
		/*
		 * ����ڷκ��� ���۰� �� ���ڸ� �Է¹޴´�
		 * ����~�� ������ ¦���� ����Ѵ�
		 */
		
		Scanner input = new Scanner(System.in);
		
		int start;
		int end;
		
		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		start = input.nextInt();
		
		System.out.print("�� ���ڸ� �Է��ϼ��� : " );
		end = input.nextInt();
		
		System.out.print(start + "�� " + end + "������ ¦���� : ");
		
		for(int i = start; i <= end; i++) {
			if(i %2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		input.close();
		
	}
	
	public static void testFor3() {
		
		for(int i = 10; i > 0; i--)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void testSum() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���۰� �� ���ڸ� �Է��ϼ���.");
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		int sum = 0;
		
		System.out.print(start + "���� " + end + "������ �� ");
		
		for(int i = start; i <= end; i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
		input.close();
	}
	
	public static void testFactorial() {
		/*
		 * 5! = 5*4*3*2*1
		 */
		Scanner input = new Scanner(System.in);
		
		long num;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = input.nextInt();
		
		long factorial = 1;
		
		for(long i = 1; i <= num; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println(num + "!�� ���� " + factorial);
		
		input.close();
	}
	

}
