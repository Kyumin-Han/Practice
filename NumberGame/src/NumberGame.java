import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num = generator.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int guess;
		int tries = 0;
		
		do
		{
			System.out.print("������ �Է��ϼ��� : ");
			guess = input.nextInt();
			
			if(guess < num)
			{
				System.out.println("���亸�� �۽��ϴ�.");
			}
			if(guess > num)
			{
				System.out.println("���亸�� Ů�ϴ�.");
			}
			
			tries++;
		}while(guess != num);
		
		System.out.println("�����մϴ� �����Դϴ�. \n �õ�Ƚ�� = " + tries);
		
		input.close();
	}

}
