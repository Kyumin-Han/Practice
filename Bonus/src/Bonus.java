import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int std = 1000;
		int mysale, bonus;
		
		System.out.print("������ �Է��ϼ���(����: ����) : ");
		mysale = input.nextInt();
		
		if(mysale >= std)
		{
			System.out.println("������ �޼��Ͽ����ϴ�.");
			bonus = (mysale - std) / 10;
		}
		else
		{
			System.out.println("������ �޼����� ���߽��ϴ�.");
			bonus = 0;
		}
		
		System.out.println("���ʽ� : " + bonus);
		
		input.close();
	}

}
