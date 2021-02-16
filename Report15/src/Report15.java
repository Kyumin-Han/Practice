import java.util.*;
public class Report15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("몇번째 항 까지 출력할지 입력하세요 : ");
		n = input.nextInt();
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i = 0 ; i < n; ++i)
		{
			System.out.print(a + ", ");
			
			sum = a + b;
			a = b;
			b = sum;
		}
		
		input.close();
	}

}
