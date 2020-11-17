import java.util.*;
public class bakjoon2577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		num1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = input.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요 : ");
		num3 = input.nextInt();
		
		int total = num1 * num2 * num3;
		
		String t = Integer.toString(total);
		
		char[] nums = new char[t.length()];
		int[] count = new int[10];
		
		for(int i = 0; i < t.length(); i++)
		{
			nums[i] = t.charAt(i);
		}
		
		for(int i = 0; i < t.length(); i++)
		{
			if(t.charAt(i) == '0')
			{
				count[0]++;
			}
			if(t.charAt(i) == '1')
			{
				count[1]++;
			}
			if(t.charAt(i) == '2')
			{
				count[2]++;
			}
			if(t.charAt(i) == '3')
			{
				count[3]++;
			}
			if(t.charAt(i) == '4')
			{
				count[4]++;
			}
			if(t.charAt(i) == '5')
			{
				count[5]++;
			}
			if(t.charAt(i) == '6')
			{
				count[6]++;
			}
			if(t.charAt(i) == '7')
			{
				count[7]++;
			}
			if(t.charAt(i) == '8')
			{
				count[8]++;
			}
			if(t.charAt(i) == '9')
			{
				count[9]++;
			}
		}
		
		for(int i = 0; i < count.length; i++)
		{
			System.out.println(count[i]);
		}

		input.close();
	}

}
