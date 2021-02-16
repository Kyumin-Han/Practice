import java.util.*;
public class Test6 {

	public static void main(String[] args) {
//		testDoWhile();
//		testDoWhile2();
//		testDoWhile3();
//		testLoop();
		testLoop2();
	}
	
	public static void testDoWhile() {
		int n = 10;
		
//		while(n < 3)
//		{
//			System.out.print(n++ + " ");
//			n++;
//		}
		
		do
		{
			System.out.print(n++ + " ");
		}while(n < 3);
		
		System.out.println(n);
		System.out.println("반복 종료합니다...");
	}
	
	public static void testDoWhile2() {
		/*
		 * 성적을 입력받는다.
		 * 성적에 따라
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~69 : D
		 * 그 이하는 F
		 * 
		 * 입력받은 성적이 0보다 작거나 100보다 크면
		 * 다시 입력받는다. <= 반복
		 */
		
		int score;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("성적을 입력하세요: ");
			score = input.nextInt();
		}while(score < 0 || score > 100);
		
//		반복문
//		조건식이 참(true) 일때만 문장들을 반복하고 조건식이 거짓(false)이 되면 반복문을 종료한다
		
		if(score >= 90)
		{
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70)
		{
			System.out.println("C");
		}
		else if(score >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
		
		input.close();
	}
	
	public static void testDoWhile3() {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : " );
		y = input.nextInt();
		
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print(x + "와 " + y + "의 최대 공약수는 ");
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println(x + "입니다.");
		
		input.close();
	}
	
	public static void testLoop() {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print(x + "와(과) " + y + "의 최소 공배수는 ");
		
		int z = x * y;
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		 int LCM = z / x;
		 
		 System.out.println(LCM + "입니다.");
		 
		 input.close();
		
	}
	
	public static void testLoop2() {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		int gcd = gcd(x,y);
		int gcm = x*y/gcd;
		
		System.out.println("최대 공약수 : " + x);
		System.out.println("최소 공배수 : " + gcm);
		
		input.close();
	}
	
	public static int gcd(int x, int y) {
		if(y > x)
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		while(y !=0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		return x;
	}
}
