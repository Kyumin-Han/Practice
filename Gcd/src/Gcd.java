import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, r;
		
		System.out.print("������ �Է��ϼ��� : ");
		x = input.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		y = input.nextInt();
		
		if(x > y)
		{
			while(y != 0)
			{
				r = x % y;
				x = y;
				y = r;
			}
			System.out.println("�ִ� ������� : " + x);
		}
		else
		{
			while(x != 0)
			{
				r = y % x;
				y = x;
				x = r;
			}
			System.out.println("�ִ� ������� : " + y);
		}
		
		input.close();
		
	}

}
