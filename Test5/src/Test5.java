import java.util.*;
public class Test5 {

	public static void main(String[] args) {
//		testSwitch();
//		testLoop();
//		testLoop2();
//		testGugudan();
//		testLoop3();
		testLoop4();
	}
	
	public static void testSwitch() {
		Scanner input = new Scanner(System.in);
		
		int month;
		
		System.out.print("일수를 알고 싶은 월을 입력하시오 : ");
		month = input.nextInt();
		
		switch(month)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월의 일수는 : 30일");
				break;
			case 2:
//				윤년인지 확인해보기
//				윤년 = 4로 나누어 지면서 100으로는 나누어 지지 않는 년도, 또는 400으로 나누어 떨어지는 년도.
				boolean lunarYear;
				
				
				int year;
				Date date = new Date();
				year = date.getYear();
				
				lunarYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				if(lunarYear)
				{
					System.out.println(month + "월의 일수는 : 29일");
				}
				else
				{
					System.out.println(month + "월의 일수는 : 28일");
				}
				
				
				break;
			default:
				System.out.println(month + "월의 일수는 : 31일");
		}
		
		input.close();
	}
	
	public static void testLoop() {
		int i = 0;
		
		while(i < 5)
		{
			System.out.println("환영합니다.");
			i++;
		}
		
		System.out.println("총 반복 횟수 : " + i);
	}
	
	public static void testLoop2() {
		int i = 0;
		
		while(i < 10) {
			System.out.print((i+1) + " ");
			i++;
		}
	}
	
	public static void testGugudan() {
		Scanner input = new Scanner(System.in);
		
		int dan;
		
		System.out.print("출력할 단을 입력하시오 : ");
		dan = input.nextInt();
		
		int i = 1;
		
		while(i <= 9)
		{
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		input.close();
	}
	
	public static void testLoop3() {
		int i = 1;
		int sum = 0;
		
		while(i <= 10)
		{
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum);
	}
	
	public static void testLoop4() {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		int sum = 0;
		
		System.out.print("시작 숫자를 입력하세요 : ");
		num1 = input.nextInt();
		
		System.out.print("마지막 숫자를 입력하세요 : ");
		num2 = input.nextInt();
		
		if(num1 >= num2) 
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int i = num1;
		
		while(i <= num2)
		{
			sum += i;
			i++;
		}
		
		System.out.println(num1 + "부터 " + num2 +"까지의 합은 " + sum + "입니다.");
		input.close();
	}

}
