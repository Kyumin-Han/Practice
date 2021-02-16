import java.util.*;
public class Test2 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int num;
//		System.out.print("정수를 입력하세요 : ");
//		num = input.nextInt();
//		
//		if(num % 2 == 0)
//		{
//			System.out.println("입력한 정수 " + num + "은 짝수입니다");
//		}
//		else
//		{
//			System.out.println("입력한 정수 " + num + "은 0 또는 홀수입니다.");
//		}
//		
//		input.close();
		larger();
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

}
