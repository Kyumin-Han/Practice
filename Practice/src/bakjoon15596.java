import java.util.*;
public class bakjoon15596 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int length = random.nextInt(1000000)+1;
		
		int[] nums = new int[length];
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = random.nextInt(3000000)+1;
		}
		
		sum(nums);
		
	}
	
	public static long sum(int[] a)
	{
		long sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		
		return sum;
	}
}
