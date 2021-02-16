import java.util.*;
public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("양의 정수를 입력하시오 : ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; ++i)
		{
			if(n % i == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		input.close();
	}

}
