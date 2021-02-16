import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int n;
		int sum = 0;
		
		System.out.print("난수의 개수 : ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int rm = generator.nextInt(100);
			sum = sum + rm;
		}
		
		System.out.println("난수 " + n + "개의 합은 " + sum);
		input.close();
	}

}
