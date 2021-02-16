import java.util.*;
public class Local2004HSlv_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		
		int tempGcd = x * y;
		int lcm;
		input.close();
		
		if(x < y)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		int r;
		
		while(y != 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		
		lcm = x;
		
		int gcd;
		gcd = tempGcd/lcm;
		
		System.out.println(lcm);
		System.out.println(gcd);
		
		
		

	}

}
