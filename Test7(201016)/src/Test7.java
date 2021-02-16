import java.util.*;
public class Test7 {
// 초기식, 조건식, 증감식
// 초기식은 최초에 한번만 수행된다.
// 반복문 안의 문장을 수행하면 증감식 수행된다.
// while문은 초기식, 조건식, 증감식이 흩어져 있는데 이를 한데 모아 놓은 것이 for문이다
// for문의 형태 = for(초기식; 조건식; 증감식)
// execution flow : 실행의 흐름
// for문에서 증감식을 수행 후 조건식을 검사하는 과정을 통해 반복을 한다
// for문이나 while문이나 초기식은 딱 한번만 수행된다
// for문 안에서 선언된 i 는 for블록 내에서만 유효한 값이다 - JAVA에서는
	
	public static void main(String[] args) {
//		testFor();
//		testFor2();
//		testFor3();
//		testSum();
		testFactorial();

	}
	
	public static void testFor() {
		/*
		 * int i = 0;
		 * for(; i <5; i++)
		 * {
		 *     System.out.print(i + " ");
		 * }
		 * 
		 * 위와 같이 i를 먼저 선언해 주고 for문 안에 초기식을 생략해 줄 수 있다
		 */
		int i;
		
		for(i = 0; i < 5; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("반복문이 끝난 후 : " + i);
		
	}
	
	public static void testFor2() {
		/*
		 * 사용자로부터 시작과 끝 숫자를 입력받는다
		 * 시작~끝 사이의 짝수를 출력한다
		 */
		
		Scanner input = new Scanner(System.in);
		
		int start;
		int end;
		
		System.out.print("시작 숫자를 입력하세요 : ");
		start = input.nextInt();
		
		System.out.print("끝 숫자를 입력하세요 : " );
		end = input.nextInt();
		
		System.out.print(start + "와 " + end + "사이의 짝수는 : ");
		
		for(int i = start; i <= end; i++) {
			if(i %2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		input.close();
		
	}
	
	public static void testFor3() {
		
		for(int i = 10; i > 0; i--)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void testSum() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("시작과 끝 숫자를 입력하세요.");
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		int sum = 0;
		
		System.out.print(start + "부터 " + end + "까지의 합 ");
		
		for(int i = start; i <= end; i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
		input.close();
	}
	
	public static void testFactorial() {
		/*
		 * 5! = 5*4*3*2*1
		 */
		Scanner input = new Scanner(System.in);
		
		long num;
		System.out.print("숫자를 입력하세요 : ");
		num = input.nextInt();
		
		long factorial = 1;
		
		for(long i = 1; i <= num; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println(num + "!의 값은 " + factorial);
		
		input.close();
	}
	

}
