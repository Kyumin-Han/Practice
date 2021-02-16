import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하세요 : ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		
		System.out.printf("%d! = %d",n,fact);
		
		input.close();
	}

}
