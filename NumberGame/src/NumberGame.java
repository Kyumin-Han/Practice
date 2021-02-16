import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num = generator.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int guess;
		int tries = 0;
		
		do
		{
			System.out.print("정답을 입력하세요 : ");
			guess = input.nextInt();
			
			if(guess < num)
			{
				System.out.println("정답보다 작습니다.");
			}
			if(guess > num)
			{
				System.out.println("정답보다 큽니다.");
			}
			
			tries++;
		}while(guess != num);
		
		System.out.println("축하합니다 정답입니다. \n 시도횟수 = " + tries);
		
		input.close();
	}

}
