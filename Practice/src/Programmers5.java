import java.util.*;
public class Programmers5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = input.nextInt();
		
		input.close();
		
		solution(num);

	}
	
	public static int solution(int num) {
		int answer = 0;
		
		while(num != 1)
		{
			if(num %2 == 0)
			{
				num = num/2;
			}
			else if(num %2 == 1)
			{
				num = num*3 + 1;
			}
			
			answer++;
			if(answer == 500)
			{
				answer = -1;
				break;
			}
		}
		
		return answer;
	}

}
