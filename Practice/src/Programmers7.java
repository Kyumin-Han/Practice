
public class Programmers7 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		solution(num1, num2);
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		int temp;
		
		if(a > b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++)
		{
			if(a == b)
			{
				answer = a;
				break;
			}
			else
			{
				answer += i;
			}
		}
		
		System.out.println(answer);
		
		return answer;
	}

}