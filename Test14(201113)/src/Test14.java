import java.util.*;
public class Test14 {

	public static void main(String[] args) {
//		testArray();
//		rollDice();
		reservation();

	}
	
	public static void testArray() {
		Scanner input = new Scanner(System.in);
		
		int [] nums = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = random.nextInt(100)+1;
		}
		
		System.out.print("검색할 숫자를 입력하세요 : ");
		int findNum = input.nextInt();
		
		int i = 0;
				
		for(; i < nums.length; i++)
		{
			if(nums[i] == findNum)
			{
				break;
			}
		}
		
		if(i < nums.length)
		{
			System.out.println("그 값은 " + (i+1) + "번째에 있습니다.");
		}
		else
		{
			System.out.println("해당 숫자를 찾을 수 없습니다");
		}
		
		for(i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		
		input.close();
	}
	
	public static void rollDice() {
		final int SIZE = 6;
		
		int [] dice = new int[SIZE];
//		배열을 생성하면 기본적으로 해당 자리에 0이 들어가 있다.
		Random random = new Random();
		
		int sum = 0;
		
		for(int i = 0; i < 10000; i++)
		{
//			++dice[(int)Math.random()*6];
			++dice[random.nextInt(6)];
		}
		
		for(int i = 0; i < dice.length; i++)
		{
			System.out.println((i+1) + ": " + dice[i] + " ");
			sum += dice[i];
		}
		
		System.out.println("총 던진 횟수: " + sum);
	}
	
	public static void reservation() {
		/*
		 * 다음을 무한 반복한다
		 * 현재 극장 좌석 상태를 출력한다
		 * 사용자로부터 예약 좌석 번호를 입력받아 예약한다(예약된 자리는 1로 저장한다.)
		 * 이미 예약된 좌석이라면 '이미 예약된 좌석입니다.'를 출력한다
		 * 사용자가 좌석 번호에 음수값을 입력하면 무한 반복을 종료한다
		 */
		
		final int SIZE = 10;
		Scanner input = new Scanner(System.in);
		
		int [] seats = new int[10];
		
		while(true)
		{
			System.out.println("##############################");
			for(int i = 1; i <= seats.length; i++)
			{
				System.out.print(i + "  ");
			}
			System.out.println("\n##############################");
			for(int i = 0; i < SIZE; i++)
			{
				System.out.print(seats[i] + "  ");
			}
			
			System.out.print("\n예약할 좌석 번호를 입력하세요 : ");
			int getSeatNum = input.nextInt();
			
			if(getSeatNum <= 0)
			{
				System.out.println("예약을 종료합니다.");
				break;
			}
			
			if(getSeatNum > seats.length)
			{
				System.out.println("좌석 번호는 1에서 " + seats.length + "번까지 입니다.");
				continue;
			}
			
			if(seats[getSeatNum-1] == 1) 
			{
				System.out.println("이미 예약된 좌석입니다.");
			}
			else
			{
				System.out.println("예약 되었습니다.");
				seats[getSeatNum-1] = 1;
			}
			
//			좌석의 자리가 모두 1이라면 "매진되었습니다."를 출력하기
			
			int count = 0;
			
			for(int i = 0; i < seats.length; i++)
			{
				if(seats[i] == 1)
				{
					count++;
				}
				
				if(count == 10) 
				{
					System.out.println("매진되었습니다.");
					System.out.println("예약을 종료합니다.");
					getSeatNum = -1;
					break;
				}
			}
			
			
		}
	}

}
