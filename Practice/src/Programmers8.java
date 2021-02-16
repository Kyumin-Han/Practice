import java.util.*;

public class Programmers8 {

	public static void main(String[] args) {
		int[] nums = {3, 2, 6};
		
		int div = 10;
		
		solution(nums,div);
	}

	public static int[] solution(int[] arr, int divisor) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % divisor == 0)
			{
				list.add(arr[i]);
				count++;
			}
		}
		
		if(count == 0)
		{
			list.add(-1);
		}
		
		
		int[] answer = new int[list.size()];
		
		for(int k = 0; k < list.size(); k++)
		{
			answer[k] = list.get(k);
		}
		
		Arrays.sort(answer);
		
		for(int n : answer)
		{
			System.out.print(n + " ");
		}
		
		
		return answer;
	}
}
