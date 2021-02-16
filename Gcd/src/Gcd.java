import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, r;
		
		System.out.print("정수를 입력하세요 : ");
		x = input.nextInt();
		System.out.print("정수를 입력하세요 : ");
		y = input.nextInt();
		
		if(x > y)
		{
			while(y != 0)
			{
				r = x % y;
				x = y;
				y = r;
			}
			System.out.println("최대 공약수는 : " + x);
		}
		else
		{
			while(x != 0)
			{
				r = y % x;
				y = x;
				x = r;
			}
			System.out.println("최대 공약수는 : " + y);
		}
		
		input.close();
		
	}

}
