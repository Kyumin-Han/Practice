import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		}
		else
		{
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
		
		input.close();
	}

}
