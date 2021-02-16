import java.util.*;
public class bakjoon2562 {

	public static void main(String[] args) {
		final int SIZE = 9;
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[SIZE];
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = input.nextInt();
			System.out.println(nums[i]);
		}
		
		int max = nums[0];
		int maxCount = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] >= max)
			{
				max = nums[i];
				maxCount = i + 1;
			}
		}
		System.out.println("***********************");
		System.out.println(max);
		System.out.println(maxCount);
		
		input.close();
	}

}
