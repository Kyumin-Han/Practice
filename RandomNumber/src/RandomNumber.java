import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int n;
		int sum = 0;
		
		System.out.print("������ ���� : ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int rm = generator.nextInt(100);
			sum = sum + rm;
		}
		
		System.out.println("���� " + n + "���� ���� " + sum);
		input.close();
	}

}
