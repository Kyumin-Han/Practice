import java.util.*;
public class Test6 {

	public static void main(String[] args) {
//		testDoWhile();
//		testDoWhile2();
//		testDoWhile3();
//		testLoop();
		testLoop2();
	}
	
	public static void testDoWhile() {
		int n = 10;
		
//		while(n < 3)
//		{
//			System.out.print(n++ + " ");
//			n++;
//		}
		
		do
		{
			System.out.print(n++ + " ");
		}while(n < 3);
		
		System.out.println(n);
		System.out.println("�ݺ� �����մϴ�...");
	}
	
	public static void testDoWhile2() {
		/*
		 * ������ �Է¹޴´�.
		 * ������ ����
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~69 : D
		 * �� ���ϴ� F
		 * 
		 * �Է¹��� ������ 0���� �۰ų� 100���� ũ��
		 * �ٽ� �Է¹޴´�. <= �ݺ�
		 */
		
		int score;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("������ �Է��ϼ���: ");
			score = input.nextInt();
		}while(score < 0 || score > 100);
		
//		�ݺ���
//		���ǽ��� ��(true) �϶��� ������� �ݺ��ϰ� ���ǽ��� ����(false)�� �Ǹ� �ݺ����� �����Ѵ�
		
		if(score >= 90)
		{
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70)
		{
			System.out.println("C");
		}
		else if(score >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
		
		input.close();
	}
	
	public static void testDoWhile3() {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : " );
		y = input.nextInt();
		
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print(x + "�� " + y + "�� �ִ� ������� ");
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println(x + "�Դϴ�.");
		
		input.close();
	}
	
	public static void testLoop() {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		y = input.nextInt();
		
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print(x + "��(��) " + y + "�� �ּ� ������� ");
		
		int z = x * y;
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		 int LCM = z / x;
		 
		 System.out.println(LCM + "�Դϴ�.");
		 
		 input.close();
		
	}
	
	public static void testLoop2() {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		y = input.nextInt();
		
		int gcd = gcd(x,y);
		int gcm = x*y/gcd;
		
		System.out.println("�ִ� ����� : " + x);
		System.out.println("�ּ� ����� : " + gcm);
		
		input.close();
	}
	
	public static int gcd(int x, int y) {
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		return x;
	}
}
