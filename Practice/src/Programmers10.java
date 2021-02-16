import java.util.*;

public class Programmers10 {

	public static void main(String[] args) {
		int[] nums = {4, 4, 4, 3, 3};
		
		solution(nums);

	}
	
	public static int[] solution(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					list.add(arr[i]);
					i++;
					break;
				}
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++)
		{
			answer[i] = list.get(i);
		}
		
		for(int n : answer)
		{
			System.out.print(n + " ");
		}
		
		
		return answer;
	}

}
