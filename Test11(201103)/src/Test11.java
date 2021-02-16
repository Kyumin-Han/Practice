import java.util.*;
public class Test11 {

	public static void main(String[] args) {
//		countChar();
//		guessNumber();
		lotto();
	}
	
	public static void countChar() {
		
		String s = new String("no news is good news");
		
		int countn = 0; 
		int counti = 0; 
		int counto = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'o')
			{
				counto++;
			}
			
			if(s.charAt(i) == 'n')
			{
				countn++;
			}
			
			if(s.charAt(i) == 'i')
			{
				counti++;
			}
		}
		
		
		System.out.println(s + " �� ���̴� : " + s.length());
		System.out.println("o�� ���� : " + counto);
		System.out.println("n�� ���� : " + countn);
		System.out.println("i�� ���� : " + counti);
	}
	
	public static void guessNumber() {
		/*
		 * ���� �߻� ���Ѽ� ����ڰ� ���ڸ� �Է��ؼ�
		 * �� ���� ������ ���ٸ� "�¾ҽ��ϴ�" ��� �� ������� �¾Ҵ��� �� Ƚ���� ���
		 * �� ���� �������� ũ�� "�Է��� ������ �۽��ϴ�" ���
		 * �� ���� �������� ������ "�Է��� ������ Ů�ϴ�" ���
		 */
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(1000)+1;
		int count = 0;
		int userInput;
		
		do 
		{
			System.out.print("1~1000 ������ ���� �Է��ϼ��� : ");
			userInput = input.nextInt();
			count++;
			
			if(userInput > num)
			{
				System.out.println("�Է��� ���ں��� �۽��ϴ�");
			}
			else if(userInput < num)
			{
				System.out.println("�Է��� ���ں��� Ů�ϴ�");
			}
			else
			{
				System.out.println("������ : " + num);
				System.out.println("�����Դϴ�! " + count + "�� ���� ������ϴ�!");
				break;
			}
			
		}while(true);
		
		
		input.close();
	}
	
	public static void lotto() {
		
		double result = 1.0;
		double dividend = 45.0;
		
		for(int i = 1; i <= 6; i++)
		{
			result = result * (dividend - i + 1) / i;
		}
		
		System.out.print("1/" + (int)result);
	}

}
