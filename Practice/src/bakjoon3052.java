import java.util.*;
public class bakjoon3052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			nums[i] = input.nextInt();
		}
		
		int[] lefts = new int[42];
		
		int count = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			lefts[nums[i]%42]++;
		}

		for(int i = 0; i < lefts.length; i++)
		{
			if(lefts[i] != 0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		input.close();
		
	}

}
