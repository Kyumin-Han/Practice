import java.util.*;
public class CalSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		int i = 1;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = input.nextInt();
		
		while(i <= num)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println("�հ� = " + sum);
		
		input.close();
	}

}
