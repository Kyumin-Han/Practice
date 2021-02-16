import java.util.*;
public class Test14 {

	public static void main(String[] args) {
//		testArray();
//		rollDice();
		reservation();

	}
	
	public static void testArray() {
		Scanner input = new Scanner(System.in);
		
		int [] nums = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = random.nextInt(100)+1;
		}
		
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		int findNum = input.nextInt();
		
		int i = 0;
				
		for(; i < nums.length; i++)
		{
			if(nums[i] == findNum)
			{
				break;
			}
		}
		
		if(i < nums.length)
		{
			System.out.println("�� ���� " + (i+1) + "��°�� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("�ش� ���ڸ� ã�� �� �����ϴ�");
		}
		
		for(i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		
		input.close();
	}
	
	public static void rollDice() {
		final int SIZE = 6;
		
		int [] dice = new int[SIZE];
//		�迭�� �����ϸ� �⺻������ �ش� �ڸ��� 0�� �� �ִ�.
		Random random = new Random();
		
		int sum = 0;
		
		for(int i = 0; i < 10000; i++)
		{
//			++dice[(int)Math.random()*6];
			++dice[random.nextInt(6)];
		}
		
		for(int i = 0; i < dice.length; i++)
		{
			System.out.println((i+1) + ": " + dice[i] + " ");
			sum += dice[i];
		}
		
		System.out.println("�� ���� Ƚ��: " + sum);
	}
	
	public static void reservation() {
		/*
		 * ������ ���� �ݺ��Ѵ�
		 * ���� ���� �¼� ���¸� ����Ѵ�
		 * ����ڷκ��� ���� �¼� ��ȣ�� �Է¹޾� �����Ѵ�(����� �ڸ��� 1�� �����Ѵ�.)
		 * �̹� ����� �¼��̶�� '�̹� ����� �¼��Դϴ�.'�� ����Ѵ�
		 * ����ڰ� �¼� ��ȣ�� �������� �Է��ϸ� ���� �ݺ��� �����Ѵ�
		 */
		
		final int SIZE = 10;
		Scanner input = new Scanner(System.in);
		
		int [] seats = new int[10];
		
		while(true)
		{
			System.out.println("##############################");
			for(int i = 1; i <= seats.length; i++)
			{
				System.out.print(i + "  ");
			}
			System.out.println("\n##############################");
			for(int i = 0; i < SIZE; i++)
			{
				System.out.print(seats[i] + "  ");
			}
			
			System.out.print("\n������ �¼� ��ȣ�� �Է��ϼ��� : ");
			int getSeatNum = input.nextInt();
			
			if(getSeatNum <= 0)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			if(getSeatNum > seats.length)
			{
				System.out.println("�¼� ��ȣ�� 1���� " + seats.length + "������ �Դϴ�.");
				continue;
			}
			
			if(seats[getSeatNum-1] == 1) 
			{
				System.out.println("�̹� ����� �¼��Դϴ�.");
			}
			else
			{
				System.out.println("���� �Ǿ����ϴ�.");
				seats[getSeatNum-1] = 1;
			}
			
//			�¼��� �ڸ��� ��� 1�̶�� "�����Ǿ����ϴ�."�� ����ϱ�
			
			int count = 0;
			
			for(int i = 0; i < seats.length; i++)
			{
				if(seats[i] == 1)
				{
					count++;
				}
				
				if(count == 10) 
				{
					System.out.println("�����Ǿ����ϴ�.");
					System.out.println("������ �����մϴ�.");
					getSeatNum = -1;
					break;
				}
			}
			
			
		}
	}

}
