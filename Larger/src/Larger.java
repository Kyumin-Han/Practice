import java.util.*;
public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		int max;
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		num1 = input.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		num2 = input.nextInt();
		
		if(num1 > num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}
		
		System.out.println("�� ū ������ " + max + "�Դϴ�.");
		
		input.close();
	}

}
