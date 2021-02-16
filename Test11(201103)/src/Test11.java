import java.util.*;
public class Test11 {

	public static void main(String[] args) {
//		countChar();
//		guessNumber();
		lotto();
	}
	
	public static void countChar() {
		
		String s = new String("no news is good news");
		
		int countn = 0; 
		int counti = 0; 
		int counto = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'o')
			{
				counto++;
			}
			
			if(s.charAt(i) == 'n')
			{
				countn++;
			}
			
			if(s.charAt(i) == 'i')
			{
				counti++;
			}
		}
		
		
		System.out.println(s + " 의 길이는 : " + s.length());
		System.out.println("o의 개수 : " + counto);
		System.out.println("n의 개수 : " + countn);
		System.out.println("i의 개수 : " + counti);
	}
	
	public static void guessNumber() {
		/*
		 * 난수 발생 시켜서 사용자가 숫자를 입력해서
		 * 그 값이 난수와 같다면 "맞았습니다" 출력 후 몇번만에 맞았는지 그 횟수도 출력
		 * 그 값이 난수보다 크면 "입력한 수보다 작습니다" 출력
		 * 그 값이 난수보다 작으면 "입력한 수보다 큽니다" 출력
		 */
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(1000)+1;
		int count = 0;
		int userInput;
		
		do 
		{
			System.out.print("1~1000 사이의 값을 입력하세요 : ");
			userInput = input.nextInt();
			count++;
			
			if(userInput > num)
			{
				System.out.println("입력한 숫자보다 작습니다");
			}
			else if(userInput < num)
			{
				System.out.println("입력한 숫자보다 큽니다");
			}
			else
			{
				System.out.println("정답은 : " + num);
				System.out.println("정답입니다! " + count + "번 만에 맞췄습니다!");
				break;
			}
			
		}while(true);
		
		
		input.close();
	}
	
	public static void lotto() {
		
		double result = 1.0;
		double dividend = 45.0;
		
		for(int i = 1; i <= 6; i++)
		{
			result = result * (dividend - i + 1) / i;
		}
		
		System.out.print("1/" + (int)result);
	}

}
