import java.util.*;
public class Programmers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		int day;
		
		System.out.print("월을 입력하세요 : ");
		month = input.nextInt();
		
		System.out.print("일을 입력하세요 : ");
		day = input.nextInt();
		
		System.out.print(solution(month,day));

	}
	
	public static String solution(int a, int b) {
		String answer = "";
		
		int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int totalDay = 0;
		
		for(int i = 0; i < a-1; i++)
		{
			totalDay += month[i];
		}
		
		totalDay += b - 1;
		
		String[] yoEil = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; 
		
		for(int i = 0; i < yoEil.length; i++)
		{
			if(totalDay % yoEil.length == i)
			{
				answer = yoEil[i];
			}
		}
		
		return answer;
	}

}
