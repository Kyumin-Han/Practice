import java.util.*;
public class Programmers1 {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};

		for(int n : solution(numbers))
		{
			System.out.print(n + " ");
		}
	}

	public static int[] solution(int[] numbers)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = i + 1; j < numbers.length; j++)
			{
				int sum = numbers[i] + numbers[j];
				
				if(list.indexOf(sum) < 0)
				{
					list.add(sum);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++)
		{
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
}
