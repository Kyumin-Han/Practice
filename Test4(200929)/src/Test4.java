import java.util.*;
public class Test4 {

	public static void main(String[] args) {
//		testIf();
//		testSwitch();
//		testSwitch2();
//		testSwitch3();
		testSwitch4();
	}
	public static void testIf() {
		/*
		 * 현재 시각에 따라서
		 * 		Good Morning! (06~12시 전까지)
		 * 		Good Afternoon! (12~17시 전까지)
		 * 		Good Evening! (17~21시 전까지)
		 * 		Good Night! (21~06)
		 */
		
		Date date = new Date();
		int hour = date.getHours();
		//hour에는 시간값인 0~23사이의 24개의 숫자가 저장된다
		
		System.out.println("현재 시각 : " + date);
		if(hour >= 6 && hour < 12)
		{
			System.out.println("Good Morning");
		}
		else if(hour >= 12 && hour < 17)
		{
			System.out.println("Good Afternoon!");
		}
		else if(hour >= 17 && hour < 21)
		{
			System.out.println("Good evening!");
		}
		else
		{
			System.out.println("Good Night!");
		}
		
		
	}
	
	public static void testSwitch() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = input.nextInt();
		//정수형 변수 중에서 int만 사용할 수 있다
		//byte나 short는 int로 자동 형 변환이 일어나기때문에 사용 가능
		//long은 int로 자동 형 변환을 할 수 없기 때문에 사용하지 못한다
		switch(n)
		{
			case 1:
				System.out.println("1을 선택했습니다.");
				break;
			case 2:
				System.out.println("2를 선택했습니다.");
				break;
			case 3:
				System.out.println("3을 선택했습니다.");
				break;
			case 4:
				System.out.println("4를 선택했습니다.");
				break;
			case 5:
				System.out.println("5를 선택했습니다.");
				break;
			default:
				System.out.println("잘못 선택했습니다.");
		}
		
		input.close();
	}
	
	public static void testSwitch2() {
		/*
		 * 1을 입력하면 "하나"를 출력
		 * 2를 입력하면 "둘"을 출력
		 * 3을 입력하면 "셋"을 출력
		 * 그외의 경우는 "잘못입력"을 출력
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int n = input.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
				default:
					System.out.println("잘못 입력");
		}
		
		input.close();
	}
	
	public static void testSwitch3() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("하나, 둘 또는 셋을 입력: ");
		String s = input.nextLine();
		
		switch(s)
		{
			case "하나":
				System.out.println(1);
				break;
			case "둘":
				System.out.println(2);
				break;
			case "셋":
				System.out.println(3);
				break;
			default:
				System.out.println("잘못 입력");
				
		}
		
		System.out.println("----------------------------------");
		
		if(s.equals("하나"))
		{
			System.out.println(1);
		}
		else if(s.equals("둘"))
		{
			System.out.println(2);
		}
		else if(s.equals("셋"))
		{
			System.out.println(3);
		}
		else
		{
			System.out.println("잘못 입력");
		}
		
		input.close();
	}
	
	public static void testSwitch4() {
		/*
		 * 점수를 입력받아서
		 * 만약에 90~100이면 A 출력
		 * 80~89이면 B출력
		 * 70~79이면 C출력
		 * 60~60이면 D출력
		 * 그렇지 않으면 F출력
		 */
		
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("성적을 입력하세요: ");
		score = input.nextInt();
		
		int num = score / 10;
		switch(num)
		{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
				default:
					System.out.println("F");
		}
		
		input.close();
	}
}
