import java.util.*;
public class Test2 {

	public static void main(String[] args) {
//		input();
//		larger();
//		onetoten();
		outof();
	}
	
	public static void input() {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("입력한 정수 " + num + "은 짝수입니다");
		}
		else
		{
			System.out.println("입력한 정수 " + num + "은 0 또는 홀수입니다.");
		}
		
		input.close();
	}
	
	public static void larger() {
		Scanner input = new Scanner(System.in);
		
		int x, y, larger;
		
		System.out.print("정수 1을 입력하세요 : ");
		x = input.nextInt();
		
		System.out.print("정수 2를 입력하세요 : ");
		y = input.nextInt();
		
		
		if(x > y)
		{
			larger = x;
			System.out.println("입력받은 두 수 중 더 큰수는 " + larger + "입니다.");
		}
		else if(x < y)
		{
			larger = y;
			System.out.println("입력받은 두 수 중 더 큰수는 " + larger + "입니다.");
		}
		else
		{
			System.out.println("입력받은 두 수가 같습니다.");
		}
		
		input.close();
	}
	
	public static void onetoten() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
		if(num >= 1 && num <= 10)
		{
			System.out.println("입력한 정수 " + num + "은 1에서 10 사이의 정수입니다.");
		}
		else
		{
			System.out.println("입력한 정수 " + num + "은 1에서 10 사이의 정수가 아닙니다.");
		}
		input.close();
	}
	
	public static void outof() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
//		if(!(num >= 1 && num <= 10))
//		{
//			System.out.println("올바른 입력입니다.");
//		}
//		else
//		{
//			System.out.println("올바르지 않은 입력입니다.");
//		}
		
		if(num < 1 || num > 10)
		{
			System.out.println("올바른 입력입니다.");
			if(num < 1)
			{
				System.out.println("1보다 작은 값입니다.");
			}
			else //10 이상의 수
			{
				System.out.println("10보다 큰 값입니다.");
			}
		}
		else
		{
			System.out.println("올바르지 않은 입력입니다.");
		}

		input.close();
	}

}
