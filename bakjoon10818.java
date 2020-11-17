import java.util.Scanner;
public class bakjoon10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int size;
        
        System.out.print("입력할 정수의 개수를 입력하세요: ");
        size = input.nextInt();
        
        int[] nums = new int[size];
        
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        
        int max = nums[0];
        int min = nums[0];
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
            else if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        
        System.out.print(min);
        System.out.print(" " + max);
        
        input.close();

	}

}
